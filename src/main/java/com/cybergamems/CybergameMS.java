package com.cybergamems;

import com.cybergamems.view.frames.*;
import javax.swing.*;
import com.formdev.flatlaf.intellijthemes.*;


public class CybergameMS {
    public static void main(String[] args) {    
        try {
            UIManager.setLookAndFeel(new FlatDarkFlatIJTheme());
        } catch (Exception e) {
            System.err.println("Không thể thiết lập theme: " + e.getMessage());
        }
//
//        try {
//            UIManager.setLookAndFeel(new FlatArcOrangeIJTheme());
//        } catch (Exception e) {
//            System.err.println("Không thể thiết lập theme: " + e.getMessage());
//        }
        
////        //Testing Login Frame
//        SwingUtilities.invokeLater(()->{
//            LoginFrame loginFrame = new LoginFrame();
//            loginFrame.setLocationRelativeTo(null);
//            loginFrame.setVisible(true);
//        });
        
//        Testing Dashboard Frame
        SwingUtilities.invokeLater(()->{
            MainDashboardFrame mainDashboardFrame = new MainDashboardFrame();
            mainDashboardFrame.setLocationRelativeTo(null);
            mainDashboardFrame.setVisible(true);
        });
        
        System.out.println("Testing...");
    }
}

