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
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Hishan Kavishka
 */
public class Report extends javax.swing.JFrame {

    /**
     * Creates new form Report
     */
    public Report() {
        initComponents();
        Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        
        
        
        //Update Table
        Connection con = null;
        SQlConnection a= new SQlConnection();
        try{
                con = a.connect();
                String sql="Select * from report";
                PreparedStatement pst=con.prepareStatement(sql);
                ResultSet rs=pst.executeQuery();
                if(rs.next()){
                    jTable_report.setModel(DbUtils.resultSetToTableModel(rs));
                }
                else{
                    JOptionPane.showMessageDialog(null,"Please Connect Database To Software");
                }
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
        }
        
        
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_report = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        txt_billno = new javax.swing.JTextField();
        lbl_username1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        Cancel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lbl_username2 = new javax.swing.JLabel();
        Objects = new javax.swing.JPanel();
        btn_user = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        btn_report = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        btn_home = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        btn_settings = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_username3 = new javax.swing.JLabel();
        txt_year = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(41, 39, 40));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setToolTipText("");
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTable_report.setAutoCreateRowSorter(true);
        jTable_report.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill No", "Date", "Item", "Quentity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_report.setGridColor(new java.awt.Color(255, 255, 255));
        jTable_report.setIntercellSpacing(new java.awt.Dimension(5, 5));
        jTable_report.setRowHeight(25);
        jTable_report.setSelectionBackground(new java.awt.Color(41, 39, 40));
        jScrollPane2.setViewportView(jTable_report);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 1220, 530));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 180, 10));

        txt_billno.setBackground(new java.awt.Color(41, 39, 40));
        txt_billno.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 20)); // NOI18N
        txt_billno.setForeground(new java.awt.Color(255, 255, 255));
        txt_billno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_billno.setText("Bill NO");
        txt_billno.setBorder(null);
        txt_billno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_billnoMouseClicked(evt);
            }
        });
        txt_billno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_billnoActionPerformed(evt);
            }
        });
        txt_billno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_billnoKeyReleased(evt);
            }
        });
        jPanel1.add(txt_billno, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 180, 20));

        lbl_username1.setFont(new java.awt.Font("Segoe Print", 1, 58)); // NOI18N
        lbl_username1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_username1.setText("Report");
        jPanel1.add(lbl_username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 210, 60));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 180, 10));

        Cancel1.setBackground(new java.awt.Color(41, 53, 65));
        Cancel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Cancel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Cancel1MousePressed(evt);
            }
        });
        Cancel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Search");
        Cancel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 20));

        jPanel1.add(Cancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, 130, 40));

        lbl_username2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_username2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_username2.setText("Bill No");
        jPanel1.add(lbl_username2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 195, 70, -1));

        Objects.setBackground(new java.awt.Color(41, 39, 40));
        Objects.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255))));

        btn_user.setBackground(new java.awt.Color(41, 39, 40));
        btn_user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_userMousePressed(evt);
            }
        });
        btn_user.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hishan\\Desktop\\java\\Icons\\User Account_60px.png")); // NOI18N
        btn_user.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 60, 64));

        jLabel41.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 20)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Account");
        btn_user.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel60.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 20)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("User");
        btn_user.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        btn_report.setBackground(new java.awt.Color(41, 53, 65));
        btn_report.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn_report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_reportMousePressed(evt);
            }
        });
        btn_report.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hishan\\Desktop\\java\\Icons\\Doughnut Chart_60px.png")); // NOI18N
        btn_report.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 60, 64));

        jLabel43.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 20)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Report");
        btn_report.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel63.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 20)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Daily");
        btn_report.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        btn_home.setBackground(new java.awt.Color(41, 39, 40));
        btn_home.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_homeMousePressed(evt);
            }
        });
        btn_home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hishan\\Desktop\\java\\Icons\\Home_48px.png")); // NOI18N
        btn_home.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 53, 64));

        jLabel55.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 20)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Home");
        btn_home.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        btn_settings.setBackground(new java.awt.Color(41, 39, 40));
        btn_settings.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn_settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_settingsMousePressed(evt);
            }
        });
        btn_settings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hishan\\Desktop\\java\\Icons\\settings_48px.png")); // NOI18N
        btn_settings.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 64));

        jLabel59.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 20)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText(" Settings");
        btn_settings.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        javax.swing.GroupLayout ObjectsLayout = new javax.swing.GroupLayout(Objects);
        Objects.setLayout(ObjectsLayout);
        ObjectsLayout.setHorizontalGroup(
            ObjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_report, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_settings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ObjectsLayout.setVerticalGroup(
            ObjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ObjectsLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_report, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_user, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_settings, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(Objects, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JavaApplication_final/Icons/Cancel_38px.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 10, 40, -1));

        lbl_username3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_username3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_username3.setText("Date");
        jPanel1.add(lbl_username3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 40, 20));

        txt_year.setBackground(new java.awt.Color(41, 39, 40));
        txt_year.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 20)); // NOI18N
        txt_year.setForeground(new java.awt.Color(255, 255, 255));
        txt_year.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_year.setText("YYYY/MM/DD");
        txt_year.setBorder(null);
        txt_year.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_yearMouseClicked(evt);
            }
        });
        txt_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_yearActionPerformed(evt);
            }
        });
        txt_year.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_yearKeyReleased(evt);
            }
        });
        jPanel1.add(txt_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1522, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_billnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_billnoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_billnoKeyReleased

    private void txt_billnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_billnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_billnoActionPerformed

    private void Cancel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cancel1MousePressed
        // TODO add your handling code here:
        if((txt_year.getText().equals("YYYY/MM/DD")&&txt_billno.getText().equals("Bill NO"))||(txt_year.getText().equals("")&&txt_billno.getText().equals(""))){
            JOptionPane.showMessageDialog(null,"Please Insert a Date or Bill Number");

        }
        else{
            Connection con = null;
            javax.swing.JTable Table= jTable_report;
            SQlConnection a= new SQlConnection();
            GetTableData Data=new GetTableData();
            
            if(txt_year.getText().equals("YYYY/MM/DD")||txt_year.getText().equals("")){
                
                try{
                    
                    con = a.connect();
                    String sql="Select * from report where bill_num=?";
                    PreparedStatement pst=con.prepareStatement(sql);
                    pst.setString(1, txt_billno.getText());

                    ResultSet rs=pst.executeQuery();
                    if(rs.next()){
                        Data.gatitem(rs, Table);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Please Connect Database To Software");
                    }
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null,e);
                }
            }
            else{
                if(txt_billno.getText().equals("Bill NO")||txt_billno.getText().equals("")){
                    try{
                            
                        
                            con = a.connect();
                            String sql="Select * from report where date='"+txt_year.getText()+"'";
                            PreparedStatement pst=con.prepareStatement(sql);
                            ResultSet rs=pst.executeQuery();
                            if(rs.next()){
                            
                            Data.gatitem(rs, Table);
                            
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"No Records For The Entered Date");
                            }
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null,e);
                    }
                }
                else{
                        try{
                            con = a.connect();
                            String sql="Select * from report where date='"+txt_year.getText()+"' AND bill_num='"+txt_billno.getText()+"'";
                            PreparedStatement pst=con.prepareStatement(sql);
                            ResultSet rs=pst.executeQuery();
                            if(rs.next()){
                            Data.gatitem(rs, Table);
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"No Records For The Entered DaTa");
                            }
                        }
                        catch(Exception e){
                            JOptionPane.showMessageDialog(null,e);
                        }

                }
           
            }
        }
        
        
        
    }//GEN-LAST:event_Cancel1MousePressed

    private void btn_userMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_userMousePressed
        // TODO add your handling code here:
        a.setColor(btn_user);
        a.resetColor(btn_report);
        a.resetColor(btn_home);
        a.resetColor(btn_settings);
        
        users users=new users();
        users.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_userMousePressed

    private void btn_reportMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportMousePressed
        // TODO add your handling code here:
        a.setColor(btn_report);
        a.resetColor(btn_home);
        a.resetColor(btn_user);
        a.resetColor(btn_settings);
    }//GEN-LAST:event_btn_reportMousePressed

    private void btn_homeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMousePressed
        // TODO add your handling code here:
        a.setColor(btn_home);
        a.resetColor(btn_report);
        a.resetColor(btn_user);
        a.resetColor(btn_settings);
        
        Mew_MainMenu a=new Mew_MainMenu();
        a.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_homeMousePressed

    private void btn_settingsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_settingsMousePressed
        // TODO add your handling code here:
        a.setColor(btn_settings);
        a.resetColor(btn_report);
        a.resetColor(btn_user);
        a.resetColor(btn_home);
        
        Settings settings=new Settings();
        settings.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_settingsMousePressed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MousePressed

    private void txt_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_yearActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_yearActionPerformed

    private void txt_yearKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_yearKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_yearKeyReleased

    private void txt_yearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_yearMouseClicked
        // TODO add your handling code here:
        txt_year.setText("");

    }//GEN-LAST:event_txt_yearMouseClicked

    private void txt_billnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_billnoMouseClicked
        // TODO add your handling code here:
        txt_billno.setText("");
        
    }//GEN-LAST:event_txt_billnoMouseClicked

    //##### Importing Color Changes to Side Panel Buttons
    ChangeButtonColor a=new ChangeButtonColor();
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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cancel1;
    private javax.swing.JPanel Objects;
    private javax.swing.JPanel btn_home;
    private javax.swing.JPanel btn_report;
    private javax.swing.JPanel btn_settings;
    private javax.swing.JPanel btn_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable_report;
    private javax.swing.JLabel lbl_username1;
    private javax.swing.JLabel lbl_username2;
    private javax.swing.JLabel lbl_username3;
    private javax.swing.JTextField txt_billno;
    private javax.swing.JTextField txt_year;
    // End of variables declaration//GEN-END:variables
}