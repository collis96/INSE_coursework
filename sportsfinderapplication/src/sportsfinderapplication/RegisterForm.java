
package sportsfinderapplication;

import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JFrame;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 *
 * RegisterForm retrieves user input for registering an account.
 * 
 * @author up782738
 * @version 1.0
 * @since 13/03/2018
 * 
 */
public class RegisterForm extends javax.swing.JFrame {
    
    java.sql.Connection conn = null;
    ResultSet rs = null;
    Statement st;

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
        initComponents();
        this.setLocationRelativeTo(null); // centre the register form
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
        jLabelTitleReg = new javax.swing.JLabel();
        jLabelMinimise = new javax.swing.JLabel();
        jLabelExit = new javax.swing.JLabel();
        jPanelBody = new javax.swing.JPanel();
        jLabelFirstName = new javax.swing.JLabel();
        jLabelLastName = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelPassConfirm = new javax.swing.JLabel();
        jLabelAge = new javax.swing.JLabel();
        jLabelLoginPage = new javax.swing.JLabel();
        fName = new javax.swing.JTextField();
        lName = new javax.swing.JTextField();
        userName = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        passwordConfirmField = new javax.swing.JPasswordField();
        ageField = new javax.swing.JTextField();
        jButtonCreateAcc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanelHead.setBackground(new java.awt.Color(38, 166, 91));

        jLabelTitleReg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTitleReg.setText("Register");

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

        javax.swing.GroupLayout jPanelHeadLayout = new javax.swing.GroupLayout(jPanelHead);
        jPanelHead.setLayout(jPanelHeadLayout);
        jPanelHeadLayout.setHorizontalGroup(
            jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeadLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabelTitleReg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMinimise, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanelHeadLayout.setVerticalGroup(
            jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeadLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitleReg)
                    .addComponent(jLabelMinimise)
                    .addComponent(jLabelExit))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanelBody.setBackground(new java.awt.Color(108, 122, 137));

        jLabelFirstName.setBackground(new java.awt.Color(242, 241, 239));
        jLabelFirstName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelFirstName.setForeground(new java.awt.Color(242, 241, 239));
        jLabelFirstName.setText("First name:");

        jLabelLastName.setBackground(new java.awt.Color(242, 241, 239));
        jLabelLastName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelLastName.setForeground(new java.awt.Color(242, 241, 239));
        jLabelLastName.setText("Last name:");

        jLabelUsername.setBackground(new java.awt.Color(242, 241, 239));
        jLabelUsername.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelUsername.setForeground(new java.awt.Color(242, 241, 239));
        jLabelUsername.setText("Username:");

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(242, 241, 239));
        jLabelPassword.setText("Password:");

        jLabelPassConfirm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPassConfirm.setForeground(new java.awt.Color(242, 241, 239));
        jLabelPassConfirm.setText("Confirm:");

        jLabelAge.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelAge.setForeground(new java.awt.Color(242, 241, 239));
        jLabelAge.setText("Age:");

        jLabelLoginPage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelLoginPage.setForeground(new java.awt.Color(0, 0, 204));
        jLabelLoginPage.setText("Back to login page");
        jLabelLoginPage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLoginPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLoginPageMouseClicked(evt);
            }
        });

        fName.setBackground(new java.awt.Color(149, 165, 166));
        fName.setForeground(new java.awt.Color(242, 241, 239));
        fName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameActionPerformed(evt);
            }
        });

        lName.setBackground(new java.awt.Color(149, 165, 166));
        lName.setForeground(new java.awt.Color(242, 241, 239));
        lName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        userName.setBackground(new java.awt.Color(149, 165, 166));
        userName.setForeground(new java.awt.Color(242, 241, 239));
        userName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        passwordField.setBackground(new java.awt.Color(149, 165, 166));
        passwordField.setForeground(new java.awt.Color(242, 241, 239));
        passwordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        passwordConfirmField.setBackground(new java.awt.Color(149, 165, 166));
        passwordConfirmField.setForeground(new java.awt.Color(242, 241, 239));
        passwordConfirmField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ageField.setBackground(new java.awt.Color(149, 165, 166));
        ageField.setForeground(new java.awt.Color(242, 241, 239));
        ageField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonCreateAcc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCreateAcc.setText("Create Account");
        jButtonCreateAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateAccActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLoginPage)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPassConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(passwordConfirmField)
                                .addComponent(fName)
                                .addComponent(lName)
                                .addComponent(userName)
                                .addComponent(passwordField)
                                .addComponent(ageField, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                            .addComponent(jButtonCreateAcc))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFirstName)
                    .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLastName)
                    .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsername)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassConfirm)
                    .addComponent(passwordConfirmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAge)
                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonCreateAcc)
                .addGap(18, 18, 18)
                .addComponent(jLabelLoginPage)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMinimiseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimiseMouseClicked

        this.setState(JFrame.ICONIFIED);

    }//GEN-LAST:event_jLabelMinimiseMouseClicked

    private void jLabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseClicked

        System.exit(0);

    }//GEN-LAST:event_jLabelExitMouseClicked

    private void jButtonCreateAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateAccActionPerformed
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            String connectionurl = "jdbc:mysql://den1.mysql6.gear.host:3306/sportsapp?autoReconnect=true&useSSL=false";
            
            java.sql.Connection conn = DriverManager.getConnection(connectionurl, "sportsapp", "password!");
            java.sql.Statement stmt = conn.createStatement();
            
            int ageInt = Integer.parseInt(ageField.getText());
            
            String DBQ = "INSERT INTO SPORTSAPP.USERS (USERFNAME, USERLNAME, USERNAME, USERPASSWORD, AGE) VALUES ('"+fName.getText()+"','"+lName.getText()+"','"+userName.getText()+"','"+passwordField.getText()+"',"+ageInt+")";
            
            if(!passwordField.getText().equals(passwordConfirmField.getText())) {
                
                JOptionPane.showMessageDialog(null, "The passwords do not match");
                 
            } else if (controller.checkLength(userName.getText()) == false) {
                
                JOptionPane.showMessageDialog(null, "Incorrect username length");
                 
            } else if (controller.checkLength(fName.getText()) == false || controller.checkLength(lName.getText()) == false) {
                
                JOptionPane.showMessageDialog(null, "Incorrect name length");
                
            } else if (controller.checkLength(passwordField.getText()) == false) {
                
                JOptionPane.showMessageDialog(null, "Incorrect password length");
                
            } else {
                
                stmt.executeUpdate(DBQ);
                LoginForm logForm = new LoginForm();
                logForm.setVisible(true);
                logForm.pack();
                logForm.setLocationRelativeTo(null);
                logForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
                
            }
            
        }
        catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "Age must be numeric");
            
        }
        catch (SQLIntegrityConstraintViolationException e) {
            
            JOptionPane.showMessageDialog(null, "Username is already taken");
            
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            
            System.err.println(e);
            
        }   
    }//GEN-LAST:event_jButtonCreateAccActionPerformed

    private void jLabelLoginPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoginPageMouseClicked

        LoginForm logForm = new LoginForm();
        logForm.setVisible(true);
        logForm.pack();
        logForm.setLocationRelativeTo(null);
        logForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();

    }//GEN-LAST:event_jLabelLoginPageMouseClicked

    private void fNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JTextField fName;
    private javax.swing.JButton jButtonCreateAcc;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelLoginPage;
    private javax.swing.JLabel jLabelMinimise;
    private javax.swing.JLabel jLabelPassConfirm;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelTitleReg;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelHead;
    private javax.swing.JTextField lName;
    private javax.swing.JPasswordField passwordConfirmField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
