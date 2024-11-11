/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import service.AppIcon;

/**
 *
 * @author user
 */
public class StockManagerDashboardWindow extends javax.swing.JFrame {
    
    Color btnBackground = new Color(204,204,204);
    Color btnForeground = new Color(0,0,0);
    Color btnActive = new Color(255,204,51);
    
    /**
     * Creates new form AdminDashboard
     */
    public StockManagerDashboardWindow() {
        initComponents();
        
        AppIcon.setAppIcon(this);
        
        updatePanel(new AdminHomePanel());
        setNavDefaultColor();
        homePanelButton.setBackground(btnActive);
    }
    
    private void moveRight() {
        Thread t = new Thread(
                () -> {
                    for (int i = 50; i <= 200; i += 10) {
                        navPanel.setPreferredSize(new Dimension(i, navPanel.getHeight()));
                        SwingUtilities.updateComponentTreeUI(navPanel);

                        try {
                            Thread.sleep(10);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
        );
        t.start();
        
        jLabel3.setText("\u00a9 Scorpex 2024");
        jLabel4.setText("Developed by Methmika Perera");
        
        homePanelButton.setText("Home");
        employeesPanelButton.setText("Employees");
        salesPanelButton.setText("Sales");
        reportsPanelButton.setText("Reports");
        productsPanelButton.setText("Products");
        purchasePanelButton.setText("Purchase");
        
        homePanelButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        employeesPanelButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        salesPanelButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        reportsPanelButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        productsPanelButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        purchasePanelButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    }
    
    private void moveLeft() {
        Thread t = new Thread(
                () -> {
                    for (int i = 200; i >= 70; i -= 10) {
                        navPanel.setPreferredSize(new Dimension(i, navPanel.getHeight()));
                        SwingUtilities.updateComponentTreeUI(navPanel);

                        try {
                            Thread.sleep(10);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
        );
        t.start();
        
        jLabel3.setText("");
        jLabel4.setText("");
        
        homePanelButton.setText("");
        employeesPanelButton.setText("");
        salesPanelButton.setText("");
        reportsPanelButton.setText("");
        productsPanelButton.setText("");
        purchasePanelButton.setText("");
        
        homePanelButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        employeesPanelButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salesPanelButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportsPanelButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productsPanelButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        purchasePanelButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    }
    
    private void setNavDefaultColor() {
        homePanelButton.setBackground(btnBackground);
        employeesPanelButton.setBackground(btnBackground);
        salesPanelButton.setBackground(btnBackground);
        reportsPanelButton.setBackground(btnBackground);
        productsPanelButton.setBackground(btnBackground);
        purchasePanelButton.setBackground(btnBackground);

        homePanelButton.setForeground(btnForeground);
        employeesPanelButton.setForeground(btnForeground);
        salesPanelButton.setForeground(btnForeground);
        reportsPanelButton.setForeground(btnForeground);
        productsPanelButton.setForeground(btnForeground);
        purchasePanelButton.setForeground(btnForeground);
    }
    
    private void updatePanel(JPanel panel) {
        contentPanel.removeAll();  // Clear all components from jPanel3
        contentPanel.setPreferredSize(new Dimension(0, 0));
        contentPanel.add(panel, BorderLayout.CENTER);  // Add the new panel
        SwingUtilities.updateComponentTreeUI(contentPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        menuToggleButton = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        navPanel = new javax.swing.JPanel();
        homePanelButton = new javax.swing.JButton();
        productsPanelButton = new javax.swing.JButton();
        purchasePanelButton = new javax.swing.JButton();
        reportsPanelButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Dashboard | Scorpex");

        headerPanel.setBackground(new java.awt.Color(102, 51, 0));
        headerPanel.setPreferredSize(new java.awt.Dimension(1280, 75));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo-text-white-50px.png"))); // NOI18N

        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logout.png"))); // NOI18N
        logoutButton.setBorderPainted(false);
        logoutButton.setContentAreaFilled(false);
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.setFocusPainted(false);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        menuToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/menu-expanded.png"))); // NOI18N
        menuToggleButton.setBorderPainted(false);
        menuToggleButton.setContentAreaFilled(false);
        menuToggleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuToggleButton.setFocusPainted(false);
        menuToggleButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/menu.png"))); // NOI18N
        menuToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuToggleButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/profile-user.png"))); // NOI18N
        jLabel5.setText("User Name");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel5.setIconTextGap(5);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Email");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 780, Short.MAX_VALUE)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(logoutButton)
                .addGap(21, 21, 21))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(headerPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addComponent(logoutButton))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(menuToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(headerPanel, java.awt.BorderLayout.PAGE_START);

        navPanel.setPreferredSize(new java.awt.Dimension(200, 655));
        navPanel.setLayout(new java.awt.GridLayout(10, 1));

        homePanelButton.setBackground(new java.awt.Color(255, 204, 51));
        homePanelButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        homePanelButton.setForeground(new java.awt.Color(0, 0, 0));
        homePanelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/home.png"))); // NOI18N
        homePanelButton.setText("Home");
        homePanelButton.setBorderPainted(false);
        homePanelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homePanelButton.setFocusPainted(false);
        homePanelButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        homePanelButton.setIconTextGap(10);
        homePanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homePanelButtonActionPerformed(evt);
            }
        });
        navPanel.add(homePanelButton);

        productsPanelButton.setBackground(new java.awt.Color(204, 204, 204));
        productsPanelButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        productsPanelButton.setForeground(new java.awt.Color(0, 0, 0));
        productsPanelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/product.png"))); // NOI18N
        productsPanelButton.setText("Products");
        productsPanelButton.setBorderPainted(false);
        productsPanelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productsPanelButton.setFocusPainted(false);
        productsPanelButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        productsPanelButton.setIconTextGap(10);
        productsPanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsPanelButtonActionPerformed(evt);
            }
        });
        navPanel.add(productsPanelButton);

        purchasePanelButton.setBackground(new java.awt.Color(204, 204, 204));
        purchasePanelButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        purchasePanelButton.setForeground(new java.awt.Color(0, 0, 0));
        purchasePanelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/grn.png"))); // NOI18N
        purchasePanelButton.setText("Purchase");
        purchasePanelButton.setBorderPainted(false);
        purchasePanelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        purchasePanelButton.setFocusPainted(false);
        purchasePanelButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        purchasePanelButton.setIconTextGap(10);
        purchasePanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchasePanelButtonActionPerformed(evt);
            }
        });
        navPanel.add(purchasePanelButton);

        reportsPanelButton.setBackground(new java.awt.Color(204, 204, 204));
        reportsPanelButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        reportsPanelButton.setForeground(new java.awt.Color(0, 0, 0));
        reportsPanelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/report.png"))); // NOI18N
        reportsPanelButton.setText("Reports");
        reportsPanelButton.setBorderPainted(false);
        reportsPanelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportsPanelButton.setFocusPainted(false);
        reportsPanelButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        reportsPanelButton.setIconTextGap(10);
        reportsPanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportsPanelButtonActionPerformed(evt);
            }
        });
        navPanel.add(reportsPanelButton);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        navPanel.add(jPanel3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        navPanel.add(jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        navPanel.add(jPanel1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        navPanel.add(jPanel6);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        navPanel.add(jPanel5);

        jPanel4.setLayout(new java.awt.GridLayout(3, 1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("© Scorpex 2024");
        jPanel4.add(jLabel3);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Developed by Methmika Perera");
        jPanel4.add(jLabel4);

        navPanel.add(jPanel4);

        getContentPane().add(navPanel, java.awt.BorderLayout.LINE_START);

        contentPanel.setOpaque(false);
        contentPanel.setLayout(new java.awt.BorderLayout());
        getContentPane().add(contentPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuToggleButtonActionPerformed
        if(menuToggleButton.isSelected()) {
            moveLeft();
        } else {
            moveRight();
        }
    }//GEN-LAST:event_menuToggleButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        new AdminLoginWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void homePanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homePanelButtonActionPerformed
        updatePanel(new AdminHomePanel());
        setNavDefaultColor();
        homePanelButton.setBackground(btnActive);
    }//GEN-LAST:event_homePanelButtonActionPerformed

    private void reportsPanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportsPanelButtonActionPerformed
        updatePanel(new AdminReportsPanel());
        setNavDefaultColor();
        reportsPanelButton.setBackground(btnActive);
    }//GEN-LAST:event_reportsPanelButtonActionPerformed

    private void productsPanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productsPanelButtonActionPerformed
        updatePanel(new AdminProductsPanel());
        setNavDefaultColor();
        productsPanelButton.setBackground(btnActive);
    }//GEN-LAST:event_productsPanelButtonActionPerformed

    private void purchasePanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchasePanelButtonActionPerformed
        updatePanel(new AdminPurchasePanel());
        setNavDefaultColor();
        purchasePanelButton.setBackground(btnActive);
    }//GEN-LAST:event_purchasePanelButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMacDarkLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StockManagerDashboardWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton homePanelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton logoutButton;
    private javax.swing.JToggleButton menuToggleButton;
    private javax.swing.JPanel navPanel;
    private javax.swing.JButton productsPanelButton;
    private javax.swing.JButton purchasePanelButton;
    private javax.swing.JButton reportsPanelButton;
    // End of variables declaration//GEN-END:variables
}
