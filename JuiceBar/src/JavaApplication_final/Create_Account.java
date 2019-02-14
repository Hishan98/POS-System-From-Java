/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication_final;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/**
 *
 * @author Hishan Kavishka
 */
public class Create_Account extends javax.swing.JFrame {

    /**
     * Creates new form Create_Account
     */
    public Create_Account() {
        initComponents();
        Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_username = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        lbl_password2 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        txt_password_reenterd = new javax.swing.JPasswordField();
        wrn_usename = new javax.swing.JLabel();
        wrn_password = new javax.swing.JLabel();
        wrn_created = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_can = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btn_sub = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        wrn_password3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(41, 53, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_username.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(255, 255, 255));
        lbl_username.setText("Username");
        jPanel1.add(lbl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 171, -1));

        lbl_password.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(255, 255, 255));
        lbl_password.setText("Password");
        jPanel1.add(lbl_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 171, -1));

        lbl_password2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_password2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_password2.setText("Confirm Password");
        jPanel1.add(lbl_password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 171, -1));

        txt_username.setBackground(new java.awt.Color(41, 53, 65));
        txt_username.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        txt_username.setForeground(new java.awt.Color(255, 255, 255));
        txt_username.setBorder(null);
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        txt_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_usernameKeyReleased(evt);
            }
        });
        jPanel1.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 350, 20));

        txt_password.setBackground(new java.awt.Color(41, 53, 65));
        txt_password.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        txt_password.setForeground(new java.awt.Color(255, 255, 255));
        txt_password.setBorder(null);
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_passwordKeyReleased(evt);
            }
        });
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 350, 20));

        txt_password_reenterd.setBackground(new java.awt.Color(41, 53, 65));
        txt_password_reenterd.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        txt_password_reenterd.setForeground(new java.awt.Color(255, 255, 255));
        txt_password_reenterd.setBorder(null);
        txt_password_reenterd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_password_reenterdKeyReleased(evt);
            }
        });
        jPanel1.add(txt_password_reenterd, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 350, -1));

        wrn_usename.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        wrn_usename.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(wrn_usename, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 197, 25));

        wrn_password.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        wrn_password.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(wrn_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 197, 25));

        wrn_created.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        wrn_created.setForeground(new java.awt.Color(255, 255, 255));
        wrn_created.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(wrn_created, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, 260, 25));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 350, 10));

        jPanel2.setBackground(new java.awt.Color(0, 188, 121));
        jPanel2.setForeground(new java.awt.Color(102, 204, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JavaApplication_final/Icons/Male User_100px.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("WELCOME");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 190, 48));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JavaApplication_final/Icons/9-512.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 410, 430));

        jLabel6.setFont(new java.awt.Font("STLiti", 1, 52)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Juice Bar");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 590, 230, 70));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("To");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 50, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 660));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 350, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 350, 10));

        jLabel1.setFont(new java.awt.Font("Permanent Marker", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Account");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, -1, 40));

        jLabel2.setFont(new java.awt.Font("Permanent Marker", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Create Your");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        btn_can.setBackground(new java.awt.Color(41, 53, 65));
        btn_can.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn_can.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_canMousePressed(evt);
            }
        });
        btn_can.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cancel");
        btn_can.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 20));

        jPanel1.add(btn_can, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 550, 170, 60));

        btn_sub.setBackground(new java.awt.Color(41, 53, 65));
        btn_sub.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn_sub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_subMousePressed(evt);
            }
        });
        btn_sub.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Submit");
        btn_sub.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 20));

        jPanel1.add(btn_sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, 170, 60));

        wrn_password3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        wrn_password3.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(wrn_password3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 197, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-12, -4, 840, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_password_reenterdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_password_reenterdKeyReleased
        // TODO add your handling code here:
        wrn_password3.setText("");
    }//GEN-LAST:event_txt_password_reenterdKeyReleased

    private void txt_passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyReleased
        // TODO add your handling code here:
        wrn_password.setText("");
    }//GEN-LAST:event_txt_passwordKeyReleased

    private void txt_usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usernameKeyReleased
        // TODO add your handling code here:
        wrn_usename.setText("");
    }//GEN-LAST:event_txt_usernameKeyReleased

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void btn_subMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_subMousePressed
        // TODO add your handling code here:
       if(txt_username.getText().trim().isEmpty()&& txt_password.getText().trim().isEmpty()&&txt_password_reenterd.getText().trim().isEmpty()){
            wrn_usename.setText("Username is Emphty");
            wrn_password.setText("Password is Emphty");
            wrn_password3.setText("Re-enterd Password is Emphty");

        }
        else{
           Connection con = null;
           SQlConnection a= new SQlConnection();
            if(new String(txt_password.getText()).equals(txt_password_reenterd.getText())){
               
                try{
                con = a.connect();
                String sql="INSERT INTO `login`(`username`, `password`,`user_status`) VALUES (?,?,?)";
                PreparedStatement pst=con.prepareStatement(sql);
                pst.setString(1,txt_username.getText());
                pst.setString(2,txt_password.getText());
                pst.setString(3,"user");
                pst.executeUpdate();
                pst.executeQuery();
                pst.close();
                con.close();
                
                
            }

            catch(Exception e){
                //JOptionPane.showMessageDialog(null,e);
            }
            wrn_created.setText("Welcome "+txt_username.getText()+"!!!");    
            }
            else{
                wrn_password.setText("Passwords Mismatched");
                wrn_password3.setText("Passwords Mismatched");
            }
            
        }
        
    }//GEN-LAST:event_btn_subMousePressed

    private void btn_canMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_canMousePressed
        // TODO add your handling code here:
        Login lg=new Login();
        lg.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_canMousePressed

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
            java.util.logging.Logger.getLogger(Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_can;
    private javax.swing.JPanel btn_sub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_password2;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JPasswordField txt_password_reenterd;
    private javax.swing.JTextField txt_username;
    private javax.swing.JLabel wrn_created;
    private javax.swing.JLabel wrn_password;
    private javax.swing.JLabel wrn_password3;
    private javax.swing.JLabel wrn_usename;
    // End of variables declaration//GEN-END:variables
}