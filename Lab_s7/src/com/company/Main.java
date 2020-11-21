package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }
        TabbedPane tabbedPane=new TabbedPane();

    }
}
