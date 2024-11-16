/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import database.MySQL;
import entity.Admin;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import service.AppIcon;

/**
 *
 * @author mamet
 */
public class AdminLoginWindow extends javax.swing.JFrame {
    
    public static Admin loggedAdmin;

    /**
     * Creates new form loginWindow
     */
    public AdminLoginWindow() {
        initComponents();
        
        AppIcon.setAppIcon(this);
    }
    
    private void clearFields() {
        usernameField.setText("");
        passwordField.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        employeeToggle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin | Scorpex Clothing");
        setMinimumSize(new java.awt.Dimension(900, 570));
        setPreferredSize(new java.awt.Dimension(915, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginButton.setBackground(new java.awt.Color(204, 0, 0));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginButton.setText("Log In");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel2.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 293, 49));
        jPanel2.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 351, 293, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Password");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 325, -1, -1));
        jPanel2.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 267, 293, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Username");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 241, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Admin Login");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo-text-white-75px.png"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 59, -1, -1));

        jLabel6.setText("©Scorpex 2024 | Developed by Methmika Perera");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, -1, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 570));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        employeeToggle.setBackground(new java.awt.Color(204, 153, 0));
        employeeToggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/employee.png"))); // NOI18N
        employeeToggle.setAlignmentY(0.0F);
        employeeToggle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        employeeToggle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        employeeToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeToggleActionPerformed(evt);
            }
        });
        jPanel1.add(employeeToggle, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 10, 50, 50));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/admin-bg.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 510, 570));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String username = usernameField.getText();
        String password = String.valueOf(passwordField.getPassword());
        
        try {
            ResultSet adminResult = MySQL.executeSearch("SELECT * FROM `admin` WHERE `email` = '" + username + "' AND `password` = '" + password + "'");

            if (adminResult.next()) {
                loggedAdmin = new Admin();
                
                // User found, process the result
                loggedAdmin.setAdminID(adminResult.getInt("emp_id"));
                loggedAdmin.setUsername(adminResult.getString("username"));
                loggedAdmin.setEmail(adminResult.getString("email"));
                loggedAdmin.setPassword(adminResult.getString("password"));
                loggedAdmin.setContact(adminResult.getString("contact_no"));
                
                new AdminDashboardWindow().setVisible(true);
                this.dispose();
            } else {
                // No user found
                JOptionPane.showMessageDialog(this, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
                clearFields();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void employeeToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeToggleActionPerformed
        new EmployeeLoginWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_employeeToggleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMacDarkLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLoginWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton employeeToggle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
