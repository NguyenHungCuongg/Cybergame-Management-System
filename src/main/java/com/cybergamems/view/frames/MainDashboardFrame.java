package com.cybergamems.view.frames;

import com.cybergamems.view.events.MenuItemSelectedEvent;
import com.cybergamems.view.forms.*;
import javax.swing.*;

public class MainDashboardFrame extends javax.swing.JFrame {
    public MainDashboardFrame() {
        initComponents();
        setSize(1130, 670);
        /*
        *Instance "dashboardMenu" đại diện cho một đối tượng của class "DashboardMenu.java"
        *Qua instance này, ta gọi phương thức "addMenuItemSelectedEvent()" của class "DashboardMenu.java" với đối số truyền vào là 
        *một đối tượng MenuItemSelectedEvent() với phương thức "menuItemSelected" đã được Override như bên dưới.
        */
        dashboardMenu2.addMenuItemSelectedEvent(new MenuItemSelectedEvent(){
            @Override
            public void menuItemSelected(int index){
                switch(index){
                    case 0:
                        setCurrentForm(new HomeForm());
                        System.out.println("index: " + index);
                        break;
                    case 1:
                        setCurrentForm(new ComputerRoomForm());
                        System.out.println("index: " + index);
                        break;
                    case 2:
                        setCurrentForm(new ClientManagementForm());
                        System.out.println("index: " + index);
                        break;
                    case 3:
                        setCurrentForm(new ServicesForm());
                        System.out.println("index: " + index);
                        break;
                    case 4:
                        setCurrentForm(new StaffManagementForm());
                        System.out.println("index: " + index);
                        break;
                    case 5:
                        setCurrentForm(new StatisticsForm());
                        System.out.println("index: " + index);
                        break;
                    case 6:
                        setCurrentForm(new BillForm());
                        System.out.println("index: " + index);
                        break;
                    case 7:
                        setCurrentForm(new AccountForm());
                        System.out.println("index: " + index);
                        break;
                    default:
                        System.out.println("Đăng xuất");
                }
            }
        });
    }
    
    private void setCurrentForm(JPanel currentForm){
        dashboardFormMainPanel.removeAll();
        dashboardFormMainPanel.add(currentForm);
        dashboardFormMainPanel.repaint();
        dashboardFormMainPanel.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainDashboardPanel1 = new com.cybergamems.view.panels.CustomizedBorderPanel();
        dashboardMenu2 = new com.cybergamems.view.components.DashboardMenu();
        dashboardFormMainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1200, 800));

        dashboardFormMainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout mainDashboardPanel1Layout = new javax.swing.GroupLayout(mainDashboardPanel1);
        mainDashboardPanel1.setLayout(mainDashboardPanel1Layout);
        mainDashboardPanel1Layout.setHorizontalGroup(
            mainDashboardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainDashboardPanel1Layout.createSequentialGroup()
                .addComponent(dashboardMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dashboardFormMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE))
        );
        mainDashboardPanel1Layout.setVerticalGroup(
            mainDashboardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 651, Short.MAX_VALUE)
            .addComponent(dashboardFormMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainDashboardPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainDashboardPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainDashboardFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainDashboardFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainDashboardFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainDashboardFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainDashboardFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dashboardFormMainPanel;
    private com.cybergamems.view.components.DashboardMenu dashboardMenu2;
    private com.cybergamems.view.panels.CustomizedBorderPanel mainDashboardPanel1;
    // End of variables declaration//GEN-END:variables
}
