/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.util.logging.*;
import service.AppIcon;

/**
 *
 * @author user
 */
public class SplashScreenWindow extends javax.swing.JFrame {

    private static SplashScreenWindow splashScreen;
    
    public static Logger logger = Logger.getLogger("BadgeSales");
    
    /**
     * Creates new form SplashScreenWindow
     */
    public SplashScreenWindow() {
        initComponents();
        
        AppIcon.setAppIcon(this);
        
        loadingAnimation();
    }
    
    private void loadingAnimation() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    loadingBar.setValue(i);
                    if (i == 36) {
                        loadingText.setText("Please wait...");
                    } else if (i == 74) {
                        loadingText.setText("Finishing...");
                    } else if (i == 98) {
                        loadingText.setText("Welcome...");
                    }

                    try {
                        Thread.sleep(25);
                    } catch (Exception e) {
                        e.printStackTrace();
                        logger.log(Level.SEVERE, "Exception Occured in SplashWindow", e);
                    }
                }

                splashScreen.dispose();
                new EmployeeLoginWindow().setVisible(true);
            }
        });
        t.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        loadingBar = new javax.swing.JProgressBar();
        loadingText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo-text-white-75px.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 322, 132));

        loadingBar.setForeground(new java.awt.Color(204, 153, 0));
        getContentPane().add(loadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 460, 10));

        loadingText.setText("Loading...");
        getContentPane().add(loadingText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMacDarkLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                splashScreen = new SplashScreenWindow();
                splashScreen.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar loadingBar;
    private javax.swing.JLabel loadingText;
    // End of variables declaration//GEN-END:variables
}