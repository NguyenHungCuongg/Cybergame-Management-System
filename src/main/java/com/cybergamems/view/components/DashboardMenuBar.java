package com.cybergamems.view.components;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.cybergamems.view.events.MenuItemSelectedEvent;
import javax.swing.JLabel;

/*
*Note: menu ở đây là một panel(JPanel) chứa một list(JList) các items(là một JPanel khác tự định nghĩa) chứ không phải là một JMenuBar.
*/
public class DashboardMenuBar extends javax.swing.JPanel {    
    
    public void addMenuItemSelectedEvent(MenuItemSelectedEvent menuItemSelectedEvent){
        /*
        *Khi phương thức này được gọi ở phía "MainDashboardFrame.java", tham số "menuItemSelectedEvent" chính là đối tượng chứa 
        *phương thức "menuItemSelected()" đã được Override bên phía "MainDashboardFrame.java", lúc này ta sẽ gọi tiếp phương thức
        * "updateMenuIndex()" của "DashboardMenuList.java" với đối số cũng là đối tượng "menuItemSelectedEvent".
        */
        dashboardMenuList1.updateMenuIndex(menuItemSelectedEvent);
    }
    
    public DashboardMenuBar() {
        initComponents();
        setOpaque(false);
        dashboardMenuList1.setOpaque(false);
        initData();
    }
    
    private void initData(){
        dashboardMenuList1.addItem(new DashboardMenuItemModel("home-icon","Trang chủ",DashboardMenuItemModel.menuType.MENU));
        dashboardMenuList1.addItem(new DashboardMenuItemModel("computer-icon","Phòng máy",DashboardMenuItemModel.menuType.MENU));
        dashboardMenuList1.addItem(new DashboardMenuItemModel("client-icon","Khách hàng",DashboardMenuItemModel.menuType.MENU));
        dashboardMenuList1.addItem(new DashboardMenuItemModel("services-icon","Dịch vụ",DashboardMenuItemModel.menuType.MENU));
        dashboardMenuList1.addItem(new DashboardMenuItemModel("staff-icon","Nhân viên",DashboardMenuItemModel.menuType.MENU));
        dashboardMenuList1.addItem(new DashboardMenuItemModel("statistic-icon","Thống kê",DashboardMenuItemModel.menuType.MENU));
        dashboardMenuList1.addItem(new DashboardMenuItemModel("bill-icon","Hóa đơn",DashboardMenuItemModel.menuType.MENU));
        dashboardMenuList1.addItem(new DashboardMenuItemModel("account-icon","Tài khoản",DashboardMenuItemModel.menuType.MENU));
        dashboardMenuList1.addItem(new DashboardMenuItemModel("exit-icon","Đăng xuất",DashboardMenuItemModel.menuType.MENU));
        dashboardMenuList1.addItem(new DashboardMenuItemModel("","",DashboardMenuItemModel.menuType.EMPTY));
    }
    
    public JLabel getStaffName(){
        return staffName;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerOfMenuPanel = new javax.swing.JPanel();
        cyberLogo = new javax.swing.JLabel();
        cyberName = new javax.swing.JLabel();
        staffIcon = new javax.swing.JLabel();
        staffName = new javax.swing.JLabel();
        dashboardMenuList1 = new com.cybergamems.view.components.DashboardMenuList<>();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cyberLogo.setIcon(new FlatSVGIcon("svg/gamepad-solid.svg"));
        cyberLogo.setMaximumSize(new java.awt.Dimension(64, 64));
        cyberLogo.setMinimumSize(new java.awt.Dimension(64, 64));

        cyberName.setFont(new java.awt.Font("Roboto Bk", 1, 24)); // NOI18N
        cyberName.setForeground(new java.awt.Color(255, 140, 0));
        cyberName.setText("CYBER CORE");

        staffIcon.setIcon(new FlatSVGIcon("svg/user-icon.svg"));
        staffIcon.setMaximumSize(new java.awt.Dimension(25, 25));
        staffIcon.setMinimumSize(new java.awt.Dimension(25, 25));

        staffName.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        staffName.setText("Nguyễn Hùng Cường");

        javax.swing.GroupLayout headerOfMenuPanelLayout = new javax.swing.GroupLayout(headerOfMenuPanel);
        headerOfMenuPanel.setLayout(headerOfMenuPanelLayout);
        headerOfMenuPanelLayout.setHorizontalGroup(
            headerOfMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerOfMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerOfMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(staffIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cyberLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(headerOfMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cyberName)
                    .addGroup(headerOfMenuPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(staffName)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        headerOfMenuPanelLayout.setVerticalGroup(
            headerOfMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerOfMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerOfMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cyberName)
                    .addComponent(cyberLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(headerOfMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(staffIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staffName))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        dashboardMenuList1.setBorder(null);
        dashboardMenuList1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerOfMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dashboardMenuList1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerOfMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dashboardMenuList1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cyberLogo;
    private javax.swing.JLabel cyberName;
    private com.cybergamems.view.components.DashboardMenuList<String> dashboardMenuList1;
    private javax.swing.JPanel headerOfMenuPanel;
    private javax.swing.JLabel staffIcon;
    private javax.swing.JLabel staffName;
    // End of variables declaration//GEN-END:variables
}
