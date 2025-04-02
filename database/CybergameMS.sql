
-- Bảng Khách Hàng
CREATE TABLE KhachHang (
    MaKhachHang INT PRIMARY KEY IDENTITY,
    HoVaTen NVARCHAR(100) NOT NULL,
    Username NVARCHAR(50) UNIQUE NOT NULL,
    Password NVARCHAR(255) NOT NULL,
    Email NVARCHAR(100) UNIQUE NOT NULL,
    TrangThaiKH BIT NOT NULL
);

-- Bảng Nhân Viên
CREATE TABLE NhanVien (
    MaNhanVien INT PRIMARY KEY IDENTITY,
    MaViTri INT FOREIGN KEY REFERENCES ViTri(MaViTri),
    HoVaTen NVARCHAR(100) NOT NULL,
    Username NVARCHAR(50) UNIQUE NOT NULL,
    Password NVARCHAR(255) NOT NULL,
    Email NVARCHAR(100) UNIQUE NOT NULL,
    TrangThaiNV BIT NOT NULL,
    NgayVaoLam DATE NOT NULL
);

-- Bảng Vị Trí (Chức vụ nhân viên)
CREATE TABLE ViTri (
    MaViTri INT PRIMARY KEY IDENTITY,
    TenViTri NVARCHAR(50) NOT NULL,
    LuongMoiThang MONEY CHECK (LuongMoiThang >= 0)
);

-- Bảng Phòng
CREATE TABLE Phong (
    MaPhong INT PRIMARY KEY IDENTITY,
    TenPhong NVARCHAR(100) NOT NULL,
    GiaMoiGio MONEY CHECK (GiaMoiGio >= 0)
);

-- Bảng Máy Tính
CREATE TABLE MayTinh (
    MaMay INT PRIMARY KEY IDENTITY,
    MaPhong INT FOREIGN KEY REFERENCES Phong(MaPhong),
    TrangThaiMay NVARCHAR(50) NOT NULL
);

-- Bảng Phiên Chơi
CREATE TABLE PhienChoi (
    MaPhienChoi INT PRIMARY KEY IDENTITY,
    MaKhachHang INT FOREIGN KEY REFERENCES KhachHang(MaKhachHang),
    MaMay INT FOREIGN KEY REFERENCES MayTinh(MaMay),
    ThoiGianBatDau DATETIME NOT NULL,
    ThoiGianKetThuc DATETIME NULL
);

-- Bảng Dịch Vụ
CREATE TABLE DichVu (
    MaDichVu INT PRIMARY KEY IDENTITY,
    TenDichVu NVARCHAR(100) NOT NULL,
    GiaGoc MONEY CHECK (GiaGoc >= 0),
    LoaiDichVu NVARCHAR(50) NOT NULL
);

-- Bảng Hóa Đơn
CREATE TABLE HoaDon (
    MaHoaDon INT PRIMARY KEY IDENTITY,
    MaKhachHang INT FOREIGN KEY REFERENCES KhachHang(MaKhachHang),
    MaNhanVien INT FOREIGN KEY REFERENCES NhanVien(MaNhanVien),
    NgayLapHD DATETIME NOT NULL,
    TrangThaiHD BIT NOT NULL,
	TongTien MONEY DEFAULT 0 NOT NULL
);

-- Bảng Chi Tiết Hóa Đơn
CREATE TABLE ChiTietHoaDon (
    MaCTHD INT PRIMARY KEY IDENTITY,
    MaHoaDon INT FOREIGN KEY REFERENCES HoaDon(MaHoaDon),
    MaDichVu INT FOREIGN KEY REFERENCES DichVu(MaDichVu),
    SoLuong DECIMAL(10, 2) CHECK (SoLuong > 0) NOT NULL,
    DonGia MONEY CHECK (DonGia >= 0) NOT NULL,
    ThanhTien MONEY NOT NULL
);

-- Bảng Thanh Toán
CREATE TABLE ThanhToan (
    MaThanhToan INT PRIMARY KEY IDENTITY,
    MaHoaDon INT FOREIGN KEY REFERENCES HoaDon(MaHoaDon),
    SoTienTT MONEY CHECK (SoTienTT >= 0) NOT NULL,
    PhuongThucTT NVARCHAR(50) NOT NULL
);

-- Bảng Khuyến Mãi
CREATE TABLE KhuyenMai (
    MaKhuyenMai INT PRIMARY KEY IDENTITY,
    TenKhuyenMai NVARCHAR(100) NOT NULL,
    GiaTriKhuyenMai DECIMAL(5,2) CHECK (GiaTriKhuyenMai >= 0),
    NgayBatDau DATE NOT NULL,
    NgayKetThuc DATE NOT NULL
);

-- Bảng Khuyến Mãi Dịch Vụ
CREATE TABLE KhuyenMaiDichVu (
    MaKMDV INT PRIMARY KEY IDENTITY,
    MaKhuyenMai INT FOREIGN KEY REFERENCES KhuyenMai(MaKhuyenMai),
    MaDichVu INT FOREIGN KEY REFERENCES DichVu(MaDichVu)
);

-- Bảng Thu Chi (Báo cáo doanh thu)
CREATE TABLE ThuChi (
    MaThuChi INT PRIMARY KEY IDENTITY,
    Thang INT CHECK (Thang BETWEEN 1 AND 12) NOT NULL,
    Nam INT CHECK (Nam >= 2000) NOT NULL,
    TongDoanhThu MONEY CHECK (TongDoanhThu >= 0) NOT NULL,
    TongChiTieu MONEY CHECK (TongChiTieu >= 0) NOT NULL
);

--Bảng Chi Phi Hoạt Động (đây là bảng chi phí sẽ được nhập tay)
CREATE TABLE ChiPhiHoatDong(
	MaChiPhiHD INT PRIMARY KEY IDENTITY,
	Thang INT CHECK (Thang BETWEEN 1 AND 12) NOT NULL,
    Nam INT CHECK (Nam >= 2000) NOT NULL,
	TienDien MONEY CHECK (TienDien >= 0) NOT NULL,
	TienNuoc MONEY CHECK (TienNuoc >= 0) NOT NULL,
	TienTaiNguyen MONEY CHECK (TienTaiNguyen >= 0) NOT NULL,
	NgayNhap DATE DEFAULT GETDATE()  
);

-- Tạo trigger cập nhật TongTien bằng tổng các ThanhTien của các ChiTietHoaDon

CREATE TRIGGER trg_UpdateTongTien
ON ChiTietHoaDon
AFTER INSERT, UPDATE, DELETE
AS
BEGIN
    -- Cập nhật TongTien cho các hóa đơn bị ảnh hưởng
    UPDATE HoaDon
    SET TongTien = (
        SELECT COALESCE(SUM(ThanhTien), 0)
        FROM ChiTietHoaDon
        WHERE ChiTietHoaDon.MaHoaDon = HoaDon.MaHoaDon
    )
    WHERE MaHoaDon IN (
        SELECT DISTINCT MaHoaDon FROM inserted
        UNION
        SELECT DISTINCT MaHoaDon FROM deleted
    );
END;

-- Tạo trigger để cập nhật dữ liệu TongDoanhThu, Thang, Nam trong ThuChi dựa trên các HoaDon đã thanh toán

CREATE TRIGGER trg_UpdateTongDoanhThu
ON HoaDon
AFTER INSERT, UPDATE
AS
BEGIN
    SET NOCOUNT ON;

    -- Thêm bản ghi mới vào ThuChi nếu chưa tồn tại cho tháng/năm của hóa đơn
    INSERT INTO ThuChi (Thang, Nam, TongDoanhThu, TongChiTieu)
    SELECT 
        MONTH(I.NgayLapHD) AS Thang,
        YEAR(I.NgayLapHD) AS Nam,
        0 AS TongDoanhThu,
        (SELECT COALESCE(SUM(VT.LuongMoiThang), 0) FROM NhanVien NV JOIN ViTri VT ON NV.MaViTri = VT.MaViTri) AS TongChiTieu
    FROM inserted I
    WHERE I.TrangThaiHD = 1
    AND NOT EXISTS (
        SELECT 1 FROM ThuChi TC 
        WHERE TC.Thang = MONTH(I.NgayLapHD) 
        AND TC.Nam = YEAR(I.NgayLapHD)
    );

    -- Cập nhật TongDoanhThu cho các bản ghi ThuChi
    UPDATE TC
    SET TC.TongDoanhThu = COALESCE((
        SELECT SUM(HD.TongTien)
        FROM HoaDon HD
        WHERE HD.TrangThaiHD = 1
        AND MONTH(HD.NgayLapHD) = TC.Thang
        AND YEAR(HD.NgayLapHD) = TC.Nam
    ), 0)
    FROM ThuChi TC
    WHERE EXISTS (
        SELECT 1 FROM inserted I
        WHERE MONTH(I.NgayLapHD) = TC.Thang 
        AND YEAR(I.NgayLapHD) = TC.Nam
    );
END;


-- Tạo trigger để cập nhật lại dữ liệu TongDoanhThu, Thang, Nam trong ThuChi khi HoaDon bị xóa

CREATE TRIGGER trg_DeleteHoaDon_UpdateTongDoanhThu
ON HoaDon
AFTER DELETE
AS
BEGIN
    SET NOCOUNT ON;

    -- Cập nhật TongDoanhThu, đảm bảo không bị NULL
    UPDATE TC
    SET TC.TongDoanhThu = COALESCE((
        SELECT SUM(HD.TongTien)
        FROM HoaDon HD
        WHERE HD.TrangThaiHD = 1
        AND MONTH(HD.NgayLapHD) = TC.Thang
        AND YEAR(HD.NgayLapHD) = TC.Nam
    ), 0)
    FROM ThuChi TC
    INNER JOIN deleted D 
    ON MONTH(D.NgayLapHD) = TC.Thang AND YEAR(D.NgayLapHD) = TC.Nam;

    -- Xóa dòng trong ThuChi nếu TongDoanhThu trở thành 0
    DELETE FROM ThuChi
    WHERE TongDoanhThu = 0;
END;

-- Tạo trigger để cập nhật dữ liệu TongThuChi, Thang, Nam trong ThuChi khi ChiPhiHoatDong được thêm xóa sửa.

CREATE TRIGGER trg_UpdateThuChi_ChiPhi
ON ChiPhiHoatDong
AFTER INSERT, UPDATE, DELETE
AS
BEGIN
    SET NOCOUNT ON;

    -- Cập nhật TongChiTieu nếu tháng/năm đã có trong ThuChi
    UPDATE TC
    SET TC.TongChiTieu = COALESCE((
        -- Tính tổng tiền điện, nước, tài nguyên
        SELECT SUM(CPH.TienDien + CPH.TienNuoc + CPH.TienTaiNguyen) 
        FROM ChiPhiHoatDong CPH
        WHERE CPH.Thang = TC.Thang AND CPH.Nam = TC.Nam
    ), 0) + COALESCE((
        -- Tổng tiền lương của tất cả nhân viên
        SELECT SUM(VT.LuongMoiThang) 
        FROM NhanVien NV 
        JOIN ViTri VT ON NV.MaViTri = VT.MaViTri
    ), 0)
    FROM ThuChi TC
    WHERE EXISTS (
        SELECT 1 FROM inserted I WHERE I.Thang = TC.Thang AND I.Nam = TC.Nam
        UNION
        SELECT 1 FROM deleted D WHERE D.Thang = TC.Thang AND D.Nam = TC.Nam
    );

    -- Chèn mới vào ThuChi nếu chưa có bản ghi (chỉ khi INSERT)
    INSERT INTO ThuChi (Thang, Nam, TongDoanhThu, TongChiTieu)
    SELECT I.Thang, I.Nam, 0, 
        (I.TienDien + I.TienNuoc + I.TienTaiNguyen) + 
        (SELECT COALESCE(SUM(VT.LuongMoiThang), 0) FROM NhanVien NV JOIN ViTri VT ON NV.MaViTri = VT.MaViTri)
    FROM inserted I
    WHERE NOT EXISTS (
        SELECT 1 FROM ThuChi TC WHERE TC.Thang = I.Thang AND TC.Nam = I.Nam
    );
END;

-- Tạo trigger để cập nhật dữ liệu TongThuChi trong ThuChi khi bảng ThuChi được thêm dữ liệu mới(TongThuChi sẽ mặc định ban đầu là lương của toàn bộ nhân viên)

CREATE TRIGGER trg_SetDefaultTongChiTieu
ON ThuChi
AFTER INSERT
AS
BEGIN
    SET NOCOUNT ON;

    -- Cập nhật TongChiTieu cho các dòng mới
    UPDATE TC
    SET TC.TongChiTieu = COALESCE((
        -- Tính tổng lương toàn bộ nhân viên hiện tại
        SELECT SUM(VT.LuongMoiThang) 
        FROM NhanVien NV
        JOIN ViTri VT ON NV.MaViTri = VT.MaViTri
    ), 0)
    FROM ThuChi TC
    JOIN inserted I ON TC.MaThuChi = I.MaThuChi;
END;

-- Tạo trigger để cập nhật dữ liệu TongThuChi trong ThuChi khi LuongMoiThang của nhân viên được thêm xóa sửa.

CREATE TRIGGER trg_UpdateThuChi_NhanVien
ON NhanVien
AFTER INSERT, UPDATE, DELETE
AS
BEGIN
    SET NOCOUNT ON;

    -- Cập nhật tất cả các dòng trong ThuChi
    UPDATE TC
    SET TC.TongChiTieu = COALESCE((
        -- Tính tổng tiền điện, nước, tài nguyên
        SELECT SUM(CPH.TienDien + CPH.TienNuoc + CPH.TienTaiNguyen) 
        FROM ChiPhiHoatDong CPH
        WHERE CPH.Thang = TC.Thang AND CPH.Nam = TC.Nam
    ), 0) + COALESCE((
        -- Tính tổng lương nhân viên
        SELECT SUM(VT.LuongMoiThang) 
        FROM NhanVien NV 
        JOIN ViTri VT ON NV.MaViTri = VT.MaViTri
    ), 0)
    FROM ThuChi TC;
END;

-- Tạo trigger để cập nhật dữ liệu TongThuChi trong ThuChi khi nhân viên thay đổi vị trí

CREATE TRIGGER trg_UpdateThuChi_Luong
ON ViTri
AFTER UPDATE
AS
BEGIN
    SET NOCOUNT ON;

    -- Cập nhật tất cả các dòng trong ThuChi
    UPDATE TC
    SET TC.TongChiTieu = COALESCE((
        -- Tính tổng tiền điện, nước, tài nguyên
        SELECT SUM(CPH.TienDien + CPH.TienNuoc + CPH.TienTaiNguyen) 
        FROM ChiPhiHoatDong CPH
        WHERE CPH.Thang = TC.Thang AND CPH.Nam = TC.Nam
    ), 0) + COALESCE((
        -- Tính tổng lương nhân viên
        SELECT SUM(VT.LuongMoiThang) 
        FROM NhanVien NV 
        JOIN ViTri VT ON NV.MaViTri = VT.MaViTri
    ), 0)
    FROM ThuChi TC;
END;



-- Chèn dữ liệu vào các bảng mặc định

INSERT INTO DichVu(TenDichVu,GiaGoc,LoaiDichVu)
VALUES
(N'Sử dụng máy',0,'GAME'),
(N'Mì xào bò',25000,'FOOD'),
(N'Mì xào trứng',18000,'FOOD'),
(N'Mì xào thập cẩm',30000,'FOOD'),
(N'Mì nước bò',25000,'FOOD'),
(N'Mì nước trứng',18000,'FOOD'),
(N'Mì nước thập cẩm',30000,'FOOD'),
(N'Burger bò phô mai',30000,'FOOD'),
(N'Burger gà phô mai',30000,'FOOD'),
(N'Pepsi',10000,'DRINK'),
(N'Coca Cola',10000,'DRINK'),
(N'Fanta',10000,'DRINK'),
(N'Sting dâu',10000,'DRINK'),
(N'Xá xị',10000,'DRINK'),
(N'Cà phê đen',15000,'DRINK'),
(N'Cà phê sữa',18000,'DRINK'),
(N'Cà phê muối',20000,'DRINK')

INSERT INTO ViTri (TenViTri,LuongMoiThang)
VALUES
('Quan li',20000000),
('Nhan vien',7000000),
('Dau bep',10000000)

INSERT INTO NhanVien (MaViTri,HoVaTen,Username,Password,Email,TrangThaiNV,NgayVaoLam)
VALUES
(1,'Nguyen Hung Cuong','Cuongg','123','cuonghungnguyentop@gmail.com',1,'2025-03-17'),
(1,'Dang Nguyen Hoang Thach','Thachh','123','thachhoangnguyendang@gmail.com',1,'2025-03-12'),
(2,'Ho Minh Dat','Datt','123','datminhho@gmail.com',2,'2025-03-10'),
(3,'Huynh Quang Minh Quan','Quann','123','quanminhquanghuynh@gmail.com',3,'2025-03-11');

INSERT INTO Phong (TenPhong,GiaMoiGio)
VALUES 
(N'Thường',7500),
(N'VIP',10000),
(N'Livestream',15000)

INSERT INTO MayTinh(MaPhong,TrangThaiMay)
VALUES
(1,N'Trống'),
(1,N'Trống'),
(1,N'Trống'),
(1,N'Trống'),
(1,N'Trống'),
(1,N'Trống'),
(1,N'Trống'),
(1,N'Trống'),
(1,N'Trống'),
(1,N'Trống'),
(1,N'Trống'),
(1,N'Trống'),
(1,N'Trống'),
(1,N'Trống'),
(1,N'Trống'),
(1,N'Trống'),
(1,N'Trống'),
(1,N'Trống'),
(1,N'Trống'),
(1,N'Trống'),
(1,N'Trống'),
(1,N'Trống'),
(1,N'Trống'),
(1,N'Trống'),
(1,N'Trống'),
(1,N'Trống'),
(1,N'Trống'),
(1,N'Trống'),
(1,N'Trống'),
(1,N'Trống'),
(2,N'Trống'),
(2,N'Trống'),
(2,N'Trống'),
(2,N'Trống'),
(2,N'Trống'),
(2,N'Trống'),
(2,N'Trống'),
(2,N'Trống'),
(2,N'Trống'),
(2,N'Trống'),
(2,N'Trống'),
(2,N'Trống'),
(2,N'Trống'),
(2,N'Trống'),
(2,N'Trống'),
(2,N'Trống'),
(2,N'Trống'),
(2,N'Trống'),
(2,N'Trống'),
(2,N'Trống'),
(3,N'Trống'),
(3,N'Trống'),
(3,N'Trống'),
(3,N'Trống'),
(3,N'Trống'),
(3,N'Trống'),
(3,N'Trống'),
(3,N'Trống'),
(3,N'Trống'),
(3,N'Trống')

Select * from ThuChi
Select * from ChiTietHoaDon
Select * from ChiPhiHoatDong
Select * from HoaDon

	

Delete from ChiTietHoaDon
Delete from ThanhToan
Delete from HoaDon
Delete from ThuChi
Delete from ChiPhiHoatDong
