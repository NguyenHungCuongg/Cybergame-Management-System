/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cybergamems;

import javax.swing.*;
import com.cybergamems.view.*;
import com.formdev.flatlaf.intellijthemes.*;
import com.formdev.flatlaf.*;

public class CybergameMS {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatArcDarkOrangeIJTheme());
        } catch (Exception e) {
            System.err.println("Không thể thiết lập theme: " + e.getMessage());
        }
        SwingUtilities.invokeLater(()->{
            LoginFrame loginFrame = new LoginFrame();
            loginFrame.setVisible(true);
        });
        System.out.println("Hello World!");
    }
}

