package com.cybergamems;

import com.cybergamems.view.frames.*;
import javax.swing.*;
import com.formdev.flatlaf.intellijthemes.*;


public class CybergameMS {
    public static void main(String[] args) {    
        try {
            UIManager.setLookAndFeel(new FlatDarkFlatIJTheme());
        } catch (Exception e) {
            System.err.println("Không thể thiết lập theme Dark Flat: " + e.getMessage());
        }

        SwingUtilities.invokeLater(()->{
            LoginFrame loginFrame = new LoginFrame();
            loginFrame.setLocationRelativeTo(null);
            loginFrame.setVisible(true);
        });
        System.out.println("Testing...");
    }
}

    