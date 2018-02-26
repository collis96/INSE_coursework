/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportsfinderapplication;

import javax.swing.*;

/**
 *
 * @author up782738
 */

public class SportsFinderApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LoginForm logForm = new LoginForm();
        logForm.setVisible(true);
        logForm.pack();
        logForm.setLocationRelativeTo(null);
        logForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}
