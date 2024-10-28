/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.awt.Frame;
import javax.swing.ImageIcon;

/**
 *
 * @author mamet
 */
public class AppIcon {
    
    public static void setAppIcon(Frame window) {
        window.setIconImage(new ImageIcon(AppIcon.class.getResource("/resources/logo-white-64px.png")).getImage());
    }
    
}
