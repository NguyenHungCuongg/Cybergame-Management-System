package com.cybergamems.view.components;
import javax.swing.*;
import com.formdev.flatlaf.extras.FlatSVGIcon;


//Ở đây model của menu chỉ là dữ liệu của 1 items trong menu chứ không phải là model của toàn bộ các menu items
public class DashboardMenuItemModel {
    
    //Khởi tạo kiểu dữ liệu menuType với 3 dữ liệu: TITLE, MENU, EMPTY
    public static enum menuType {
        TITLE, MENU, EMPTY
        //TITLE không phải là menu nhưng vẫn được dùng làm Menu Item để làm tiêu đề cho các menu
        //MENU là một Menu Item thực sự (dùng để click và đổi qua trang khác nhau)
    }
    
    //Khởi tạo các thuộc tính
    private String icon;
    private String name;
    private menuType type;
    
    //Constructor
    public DashboardMenuItemModel(){
    };
    
    public DashboardMenuItemModel(String icon, String name, menuType type){
        this.icon = icon; //tên của file icon (không tính đuôi .svg)
        this.name = name; //tên của menu item.
        this.type = type;
    }
    
    //Getter
    public String getIcon() {
        return icon;
    }
    
    public String getName() {
        return name;
    }
    
    public menuType getType() {
        return type;
    }
    
    
    //Setter
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(menuType type) {
        this.type = type;
    }
    
    //Methods
    //Phương thức này sẽ trả về kiểu Icon từ path dẫn đến file SVG (sử dụng thư viện FlatLaf)
    public Icon pathToIcon(){
        return new FlatSVGIcon("svg/menuIcons/" + icon + ".svg");
    }
}
