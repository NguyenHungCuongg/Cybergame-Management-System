package com.cybergamems.view.frames;

import com.cybergamems.model.entities.NhanVien;
import com.cybergamems.view.events.MenuItemSelectedEvent;
import com.cybergamems.view.forms.*;
import javax.swing.*;

public class MainDashboardFrame extends javax.swing.JFrame {
    private NhanVien loginedNhanVien;
    
    public MainDashboardFrame(NhanVien loginedNhanVien) {
        this.loginedNhanVien = loginedNhanVien;
        initComponents();
      
        dashboardMenu2.getStaffName().setText(loginedNhanVien.getHoVaTen());
        setSize(1600, 850);
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
                        break;
                    case 1:
                        setCurrentForm(new ComputerRoomForm(loginedNhanVien));                      
                        break;
                    case 2:
                        setCurrentForm(new ClientManagementForm(loginedNhanVien));
                        break;
                    case 3:
                        setCurrentForm(new ServicesForm(loginedNhanVien));
                        break;
                    case 4:
                        setCurrentForm(new StaffManagementForm(loginedNhanVien));
                        break;
                    case 5:
                        setCurrentForm(new StatisticsForm());
                        break;
                    case 6:
                        setCurrentForm(new BillForm(loginedNhanVien));
                        break;
                    case 7:
                        setCurrentForm(new AccountForm(loginedNhanVien));
                        break;
                    default:
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

        mainDashboardPanel1 = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        dashboardMenu2 = new com.cybergamems.view.components.DashboardMenuBar();
        dashboardFormMainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1600, 850));
        setSize(new java.awt.Dimension(1200, 800));

        mainDashboardPanel1.setLayout(new java.awt.BorderLayout());
        mainDashboardPanel1.add(dashboardMenu2, java.awt.BorderLayout.WEST);

        dashboardFormMainPanel.setLayout(new java.awt.BorderLayout());
        mainDashboardPanel1.add(dashboardFormMainPanel, java.awt.BorderLayout.CENTER);

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
                new MainDashboardFrame(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dashboardFormMainPanel;
    private com.cybergamems.view.components.DashboardMenuBar dashboardMenu2;
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel mainDashboardPanel1;
    // End of variables declaration//GEN-END:variables
}
