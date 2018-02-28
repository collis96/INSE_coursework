/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportsfinderapplication;

import javax.swing.*;

/**
 *
 * @author Jack
 */
public class NavigateForm extends javax.swing.JFrame {

    /**
     * Creates new form NavigateForm
     */
    public NavigateForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHead = new javax.swing.JPanel();
        jLabelTitleMain = new javax.swing.JLabel();
        jLabelMinimise = new javax.swing.JLabel();
        jLabelExit = new javax.swing.JLabel();
        jLabelWelcome = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanelFind = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelMessage = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanelLogout = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanelProfile = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanelHead.setBackground(new java.awt.Color(38, 166, 91));

        jLabelTitleMain.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTitleMain.setText("Sports Application");

        jLabelMinimise.setBackground(new java.awt.Color(218, 223, 225));
        jLabelMinimise.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelMinimise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMinimise.setText("-");
        jLabelMinimise.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelMinimise.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimiseMouseClicked(evt);
            }
        });

        jLabelExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExit.setText("X");
        jLabelExit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelExitMouseClicked(evt);
            }
        });

        jLabelWelcome.setText("Welcome");

        javax.swing.GroupLayout jPanelHeadLayout = new javax.swing.GroupLayout(jPanelHead);
        jPanelHead.setLayout(jPanelHeadLayout);
        jPanelHeadLayout.setHorizontalGroup(
            jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeadLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitleMain)
                    .addComponent(jLabelWelcome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMinimise, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanelHeadLayout.setVerticalGroup(
            jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeadLayout.createSequentialGroup()
                .addGroup(jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHeadLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelMinimise)
                            .addComponent(jLabelExit)))
                    .addGroup(jPanelHeadLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTitleMain)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelWelcome)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(108, 122, 137));

        jPanelFind.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelFind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelFindMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Team/ player finder");

        javax.swing.GroupLayout jPanelFindLayout = new javax.swing.GroupLayout(jPanelFind);
        jPanelFind.setLayout(jPanelFindLayout);
        jPanelFindLayout.setHorizontalGroup(
            jPanelFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFindLayout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanelFindLayout.setVerticalGroup(
            jPanelFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFindLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelMessage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMessage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelMessageMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Messages");

        javax.swing.GroupLayout jPanelMessageLayout = new javax.swing.GroupLayout(jPanelMessage);
        jPanelMessage.setLayout(jPanelMessageLayout);
        jPanelMessageLayout.setHorizontalGroup(
            jPanelMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMessageLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMessageLayout.setVerticalGroup(
            jPanelMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMessageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelLogoutMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Logout");

        javax.swing.GroupLayout jPanelLogoutLayout = new javax.swing.GroupLayout(jPanelLogout);
        jPanelLogout.setLayout(jPanelLogoutLayout);
        jPanelLogoutLayout.setHorizontalGroup(
            jPanelLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLogoutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );
        jPanelLogoutLayout.setVerticalGroup(
            jPanelLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelProfileMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Profile");

        javax.swing.GroupLayout jPanelProfileLayout = new javax.swing.GroupLayout(jPanelProfile);
        jPanelProfile.setLayout(jPanelProfileLayout);
        jPanelProfileLayout.setHorizontalGroup(
            jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfileLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelProfileLayout.setVerticalGroup(
            jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelFind, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanelFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMinimiseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimiseMouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimiseMouseClicked

    private void jLabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabelExitMouseClicked

    private void jPanelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLogoutMouseClicked
        
        LoginForm logForm = new LoginForm();
        logForm.setVisible(true);
        logForm.pack();
        logForm.setLocationRelativeTo(null);
        logForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_jPanelLogoutMouseClicked

    private void jPanelProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelProfileMouseClicked
        
        profileForm proForm = new profileForm();
        proForm.setVisible(true);
        proForm.pack();
        proForm.setLocationRelativeTo(null);
        proForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_jPanelProfileMouseClicked

    private void jPanelFindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFindMouseClicked
        
        FindForm fForm = new FindForm();
        fForm.setVisible(true);
        fForm.pack();
        fForm.setLocationRelativeTo(null);
        fForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_jPanelFindMouseClicked

    private void jPanelMessageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMessageMouseClicked
        
        MessageForm mesForm = new MessageForm();
        mesForm.setVisible(true);
        mesForm.pack();
        mesForm.setLocationRelativeTo(null);
        mesForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
         
    }//GEN-LAST:event_jPanelMessageMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NavigateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NavigateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NavigateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NavigateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NavigateForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelMinimise;
    private javax.swing.JLabel jLabelTitleMain;
    private javax.swing.JLabel jLabelWelcome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFind;
    private javax.swing.JPanel jPanelHead;
    private javax.swing.JPanel jPanelLogout;
    private javax.swing.JPanel jPanelMessage;
    private javax.swing.JPanel jPanelProfile;
    // End of variables declaration//GEN-END:variables
}
