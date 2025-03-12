package com.cybergamems.view.components;
import com.cybergamems.view.events.MenuItemSelectedEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Class này dùng để chứa các danh sách các Menu Items
public class DashboardMenuList<E extends Object> extends JList<E> {
    private final DefaultListModel listModel;
    private int selectedIndex = -1;
    private MenuItemSelectedEvent menuItemSelectedEvent;
    
    //Constructor
    public DashboardMenuList(){
        listModel = new DefaultListModel();
        setModel(listModel);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    int index = locationToIndex(me.getPoint());
                    Object currentMenuItemObject = listModel.getElementAt(index);
                    if (currentMenuItemObject instanceof DashboardMenuItemModel) {
                        DashboardMenuItemModel currentMenuItem = (DashboardMenuItemModel) currentMenuItemObject;
                        if (currentMenuItem.getType() == DashboardMenuItemModel.menuType.MENU) {
                            selectedIndex = index;
                            if(menuItemSelectedEvent!=null){ //menuItemSelectedEvent mặc định là null. Nó chỉ có giá trị khi phương thức updateMenuIndex() được gọi từ một nơi khác.
                                menuItemSelectedEvent.menuItemSelected(index);
                                /*
                                *Gọi phương thức menuItemSelectedEvent.menuItemSelected() với đối số là index của Menu Item được người dùng click vào
                                *Tuy nhiên, phương thức "menuItemSelected" vốn là phương thức trừu tượng (trong Interface menuItemSelectedEvent)
                                *Nếu ta có thể gọi phương thức này -> nghĩa là phương thức này đã được Override ở đâu đó -> chính là ở MainDashboardFrame.java
                                */
                            }
                        }
                    } else {
                        selectedIndex = index;
                    }
                    repaint();
                }
            }
        });
    }
    
    //Methods
    public void addItem(DashboardMenuItemModel data){
        listModel.addElement(data);
    }

    //Đây là phương thức duy nhất gán giá trị cho đối tượng "menuItemSelectedEvent" 
    //=> để giá trị this.menuItemSelectedEvent != null thì phương thức này phải được gọi ở đâu đó.
    public void updateMenuIndex(MenuItemSelectedEvent menuItemSelectedEvent){
        /*
        *Sau khi ta gọi phương thức này ở phía "DashboardMenu.java" thì tham số "menuItemSelectedEvent" đã chứa phương thức "menuItemSelected()"
        *đã được Override -> lúc này thì thuộc tính menuItemSelectedEvent của class này đã != null và ta cũng có thể sử dụng phương thức menuItemSelected(),
        *vì phương thức này đã được Override.
         */
        this.menuItemSelectedEvent = menuItemSelectedEvent;
    }
    
    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int index, boolean selected, boolean focus) {
                DashboardMenuItemModel data;
                if (o instanceof DashboardMenuItemModel) { //Kiểm tra giá trị hiện tại có trong model của menu không 
                    data = (DashboardMenuItemModel) o;      
                } else {
                    data = new DashboardMenuItemModel("", o + "", DashboardMenuItemModel.menuType.EMPTY);
                }
                DashboardMenuItem item = new DashboardMenuItem(data);
                item.setSelected(selectedIndex == index);
                return item;
            }

        };
    }
}
