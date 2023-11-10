/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import model.*;
import dao.*;

/**
 *
 * @author A.M
 */
public class xl_login extends javax.swing.JFrame {

    /**
     * Creates new form xl_login
     */
    public xl_login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtx_username = new javax.swing.JTextField();
        jPasswordFields = new javax.swing.JPasswordField();
        jbtn_login = new javax.swing.JButton();
        jCheckBox_showpassword = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkEndColor(new java.awt.Color(32, 58, 67));
        kGradientPanel1.setkStartColor(new java.awt.Color(44, 83, 100));
        kGradientPanel1.setOpaque(isOpaque());
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkEndColor(new java.awt.Color(215, 221, 232));
        kGradientPanel2.setkStartColor(new java.awt.Color(117, 127, 154));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Phone Number:");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");

        jtxtx_username.setBackground(new java.awt.Color(215, 221, 232));
        jtxtx_username.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jtxtx_username.setForeground(new java.awt.Color(51, 51, 51));
        jtxtx_username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 102, 102)));
        jtxtx_username.setOpaque(isOpaque());

        jPasswordFields.setBackground(new java.awt.Color(215, 221, 232));
        jPasswordFields.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jPasswordFields.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordFields.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 102, 102)));

        jbtn_login.setBackground(new java.awt.Color(0, 102, 102));
        jbtn_login.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtn_login.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_login.setText("Login");
        jbtn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_loginActionPerformed(evt);
            }
        });

        jCheckBox_showpassword.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox_showpassword.setText("Show Password");
        jCheckBox_showpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_showpasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addGap(0, 39, Short.MAX_VALUE)
                .addComponent(jbtn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtx_username, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordFields, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox_showpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtx_username, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(jPasswordFields, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox_showpassword)
                .addGap(21, 21, 21)
                .addComponent(jbtn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        kGradientPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 350, 450));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\A.M\\Desktop\\AUCA UNDERGRADUATE\\COURSE NOTE\\YEAR TWO SEMESTER ONE\\JAVA PROGRAMMING\\jav mid term\\XLoungeMIS\\src\\images\\1.png")); // NOI18N
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 430, 130));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.png"))); // NOI18N
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox_showpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_showpasswordActionPerformed
        // TODO add your handling code here:
        if(jCheckBox_showpassword.isSelected())
        {
        jPasswordFields.setEchoChar((char)0);
        }
        else
        {
        jPasswordFields.setEchoChar('\u25cf');
        }
    }//GEN-LAST:event_jCheckBox_showpasswordActionPerformed

    
     public static String getMd5(String input)
    {
        try {
 
            // Static getInstance method is called with hashing MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
 
            // digest() method is called to calculate message digest
            // of an input digest() return array of byte
            byte[] messageDigest = md.digest(input.getBytes());
 
            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);
 
            // Convert message digest into hex value
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }
 
        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    
    private void jbtn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_loginActionPerformed
        // TODO add your handling code here:
        SessionHolder sHolder = new SessionHolder();
        String password =new String(jPasswordFields.getPassword());
        if(jtxtx_username.getText().trim().isEmpty() || password.length()== 0 )
        {
            JOptionPane.showMessageDialog(this,"Some Field are Empty ","Error",1);
        }
        else
        {
            Users userObj = new Users();
            Usersdao userObjDao = new Usersdao();
            
            userObj.setU_phone(jtxtx_username.getText());
            userObj.setU_password(getMd5(password));
            
            
            Users theUser = userObjDao.checkIfUserExits(userObj);
            
            if(theUser != null)
            {
                String role = theUser.getU_role();
                String usernames = theUser.getU_names();
                int id = theUser.getU_id();
                if(role.equalsIgnoreCase("Admin")|| role.equalsIgnoreCase("Manager"))
                {                
                JOptionPane.showMessageDialog(this,"Welcome to X-Lounge MIS");
                sHolder.setUserName(usernames);
                sHolder.setUserID(id);
                DashboardAdmin dshA = new DashboardAdmin();
                dshA.setVisible(true);
                this.setVisible(false);
                }
                else
                {
                 JOptionPane.showMessageDialog(this,"Welcome to X-Lounge MIS");
                 sHolder.setUserName(usernames);
                 sHolder.setUserID(id);
                 DashboardWaiter dshw = new DashboardWaiter();
                 dshw.setVisible(true);
                 this.setVisible(false);
                }
                
            }
            else
            {
                JOptionPane.showConfirmDialog(this,"WRONG CREDENTIAL","Error",1);
            }
            
            
            
            
        }
    }//GEN-LAST:event_jbtn_loginActionPerformed

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
            java.util.logging.Logger.getLogger(xl_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(xl_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(xl_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(xl_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new xl_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox_showpassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordFields;
    private javax.swing.JButton jbtn_login;
    private javax.swing.JTextField jtxtx_username;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
