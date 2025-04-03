package com.cybergamems.view.dialogs;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkFlatIJTheme;
import java.util.Properties;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import javax.mail.Session;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendCodeDialog extends javax.swing.JDialog {
    private int randomCode;
    
    public SendCodeDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        try {
            UIManager.setLookAndFeel(new FlatArcDarkOrangeIJTheme());
        } catch (Exception e) {
            System.err.println("Không thể thiết lập theme Orange Dark: " + e.getMessage());
        };
        initComponents();
        try {
            UIManager.setLookAndFeel(new FlatDarkFlatIJTheme());
        } catch (Exception e) {  
            System.err.println("Không thể thiết lập theme Dark Flat: " + e.getMessage());
        }
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        dialogHeader = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dialogInputSection = new javax.swing.JPanel();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();
        verifiedCodeLabel = new javax.swing.JLabel();
        verifiedCodeTextField = new javax.swing.JTextField();
        verifiedCodeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        dialogHeader.setBackground(new java.awt.Color(255, 140, 0));
        dialogHeader.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quên mật khẩu");
        dialogHeader.add(jLabel2, new java.awt.GridBagConstraints());

        dialogInputSection.setOpaque(false);
        dialogInputSection.setLayout(new java.awt.GridBagLayout());

        emailLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        emailLabel.setText("Nhập email của bạn");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        dialogInputSection.add(emailLabel, gridBagConstraints);

        emailTextField.setBackground(new java.awt.Color(41, 41, 41));
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        dialogInputSection.add(emailTextField, gridBagConstraints);

        sendButton.setBackground(new java.awt.Color(87, 87, 87));
        sendButton.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        sendButton.setText("Gửi mã");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 190;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        dialogInputSection.add(sendButton, gridBagConstraints);

        verifiedCodeLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        verifiedCodeLabel.setText("Nhập mã xác nhận");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        dialogInputSection.add(verifiedCodeLabel, gridBagConstraints);

        verifiedCodeTextField.setBackground(new java.awt.Color(41, 41, 41));
        verifiedCodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifiedCodeTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        dialogInputSection.add(verifiedCodeTextField, gridBagConstraints);

        verifiedCodeButton.setBackground(new java.awt.Color(255, 140, 0));
        verifiedCodeButton.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        verifiedCodeButton.setForeground(new java.awt.Color(255, 255, 255));
        verifiedCodeButton.setText("Xác nhận mã");
        verifiedCodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifiedCodeButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 160;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        dialogInputSection.add(verifiedCodeButton, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dialogHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dialogInputSection, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dialogHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dialogInputSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        try {
            Random rand = new Random();
            randomCode = rand.nextInt(999999);
            String host = "smtp.gmail.com";
            String user = "cuonghungnguyentop@gmail.com"; // Thay bằng email của bạn
            String pass = "geixegqidgunsibm"; // Thay bằng mật khẩu hoặc App Password
            String to = emailTextField.getText();
            String subject = "Xác nhận tài khoản đăng nhập CyberCore";
            String message = "Mã xác nhận của bạn là: " + randomCode;

            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");

            // Tạo session với authenticator
            Session mailSession = Session.getInstance(props, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(user, pass);
                }
            });

            // Tạo message
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(user));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            msg.setSubject(subject);
            msg.setText(message);

            // Gửi email
            Transport.send(msg);

            JOptionPane.showMessageDialog(null, "Mã xác nhận đã được gửi tới email của bạn");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi khi gửi email: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_sendButtonActionPerformed

    private void verifiedCodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifiedCodeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verifiedCodeTextFieldActionPerformed

    private void verifiedCodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifiedCodeButtonActionPerformed
        if(Integer.valueOf(verifiedCodeTextField.getText())==randomCode){
            System.out.println("Đúng mã rồi, đổi mật khẩu đi");
        }else{
            JOptionPane.showMessageDialog(null, "Mã xác nhận không hợp lệ");
        }
    }//GEN-LAST:event_verifiedCodeButtonActionPerformed

    public static void main(String args[]) {
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SendCodeDialog dialog = new SendCodeDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dialogHeader;
    private javax.swing.JPanel dialogInputSection;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton sendButton;
    private javax.swing.JButton verifiedCodeButton;
    private javax.swing.JLabel verifiedCodeLabel;
    private javax.swing.JTextField verifiedCodeTextField;
    // End of variables declaration//GEN-END:variables
}
