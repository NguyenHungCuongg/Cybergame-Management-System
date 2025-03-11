/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cybergamems.view.components;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author admin88
 */

//Class này dùng để chứa các danh sách các Menu Items
public class DashboardMenuList<E extends Object> extends JList<E> {
    private final DefaultListModel listModel;
    private int selectedIndex = -1;
    
    //Constructor
    public DashboardMenuList(){
        listModel = new DefaultListModel();
        setModel(listModel);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    int index = locationToIndex(me.getPoint());
                    Object o = listModel.getElementAt(index);
                    if (o instanceof DashboardMenuModel) {
                        DashboardMenuModel menu = (DashboardMenuModel) o;
                        if (menu.getType() == DashboardMenuModel.menuType.MENU) {
                            selectedIndex = index;
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
    public void addItem(DashboardMenuModel data){
        listModel.addElement(data);
    }

    
    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int index, boolean selected, boolean focus) {
                DashboardMenuModel data;
                if (o instanceof DashboardMenuModel) { //Kiểm tra giá trị hiện tại có trong model của menu không 
                    data = (DashboardMenuModel) o;      
                } else {
                    data = new DashboardMenuModel("", o + "", DashboardMenuModel.menuType.EMPTY);
                }
                DashboardMenuItem item = new DashboardMenuItem(data);
                item.setSelected(selectedIndex == index);
                return item;
            }

        };
    }
}
