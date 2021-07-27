/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginForm;

import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.PreparedStatement;
import java.io.File;  
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Acer Aspire 7
 */
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
   // File f = new File("C://Users//Acer Aspire 7//Documents//NetBeansProjects//QuizApp//Information.txt");
        File f = new File("C:\\Users\\Acer Aspire 7\\Documents\\NetBeansProjects\\QuizApp\\Registration");
        String Username,Password,Conpassword;
        int ln;
    public Registration() {
        initComponents();
    }
    public void createFolder(){
        if(!f.exists()){
            f.mkdirs();
        }
    }
    public void reset(){
        register_user.setText("");
        register_password.setText("");
        register_conpassword.setText("");
        
        register_user.grabFocus();
    }
    public void readFile(){
            try {
                FileReader fr = new FileReader(f+"\\logins.txt");
                        System.out.println("file exists");
            } catch (FileNotFoundException ex) {
                try {
                    FileWriter fw = new FileWriter(f+"\\logins.txt");
                    System.out.println("File created");
                } catch (IOException ex1) {
                    Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
        
    }
    public void addData(String usr,String pswd,String conpass){
            try {
                RandomAccessFile raf = new RandomAccessFile(f+"\\logins.txt","rw");
                for(int i=0;i<ln;i++){
                raf.readLine();
     
                }
                raf.writeBytes("\r\n");
                raf.writeBytes("\r\n");
                raf.writeBytes("Username:"+usr+"\r\n");
                raf.writeBytes("Password:"+pswd+"\r\n");
                raf.writeBytes("ConfirmPassword:"+conpass);
    
                 
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    public void CheckData(String usr,String pswd){
            try {
                RandomAccessFile raf = new RandomAccessFile(f+"\\logins.txt","rw");
                try {
                    String  line = raf.readLine();
                  Username=line.substring(9);
                  Password = raf.readLine().substring(9);
      
                  if(usr.equals(Username)& pswd.equals(Password))
                  {
                      JOptionPane.showMessageDialog(null, "password matched");
                  }
                  }
                 catch (IOException ex) {
                    //Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
                                          JOptionPane.showMessageDialog(null, "password error");

                }
               
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            }

    }
    public void logic(String usr,String pswd){
            try {
                RandomAccessFile raf = new RandomAccessFile(f+"\\logins.txt","rw");
                for(int i=0;i<ln;i++){
                    String fors = raf.readLine().substring(9);
                    String forPass = raf.readLine().substring(9);
                    if(usr.equals(fors) && pswd.equals(forPass)){
                        JOptionPane.showMessageDialog(null, "Matched");
                        break;
                    }
                    else if(i==(ln-1)){
                   JOptionPane.showMessageDialog(null, "NOt Matched");
                   break;

                    }
                    for(int k=1;k<=2;k++){
                        raf.readLine();
                    }

                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            }

    }
    public void countLines(){
            try {
                ln=1;
                RandomAccessFile raf = new RandomAccessFile(f+"\\logins.txt","rw");
                for(int i=0;raf.readLine()!=null;i++)
                {
                ln++;
                }
                System.out.println("number of lines "+ln );
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
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
        register_user = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        register_conpassword = new javax.swing.JPasswordField();
        register_password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        register_user.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(register_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 200, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel1.setText("Confirm Password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel2.setText("User");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 30, 20));

        register_conpassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        register_conpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                register_conpasswordFocusLost(evt);
            }
        });
        jPanel1.add(register_conpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 200, -1));

        register_password.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        register_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_passwordActionPerformed(evt);
            }
        });
        jPanel1.add(register_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 200, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel3.setText("password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Register");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 70, 30));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 90, 30));

        jButton3.setBackground(new java.awt.Color(102, 255, 102));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Go back");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 90, 30));

        jSeparator1.setBackground(new java.awt.Color(51, 51, 255));
        jSeparator1.setForeground(new java.awt.Color(102, 0, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 200, 10));

        jSeparator2.setBackground(new java.awt.Color(51, 51, 255));
        jSeparator2.setForeground(new java.awt.Color(102, 0, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 200, 10));

        jSeparator3.setBackground(new java.awt.Color(102, 102, 255));
        jSeparator3.setForeground(new java.awt.Color(102, 51, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        reset();
         
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void register_conpasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_register_conpasswordFocusLost
        // TODO add your handling code here:
        
        String password = register_password.getText();
        String conpassword = register_conpassword.getText();
        
        if(!password.equals(conpassword)){
            JOptionPane.showMessageDialog(this, "Password does not matchn");
        }
    }//GEN-LAST:event_register_conpasswordFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                   // String sqli="INSERT INTO `user`(`User`, `Password`, `ConPassword`) VALUES (?,?,?)";
           // CreatFiles();
       
        // this.setVisible(false);
        //new Login().setVisible(true);
        createFolder();
        readFile();
         countLines();
         //addData("a","1","1");
        addData(register_user.getText(),register_password.getText(),register_conpassword.getText());
        //CheckData("a","1");
      //CheckData(register_user.getText(),register_password.getText());

       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
//         createFolder();
//        readFile();
//         countLines();
//       logic(register_user.getText(),register_password.getText());
          this.setVisible(false);
        new LoginJf().setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
//         LoginJf jf = new LoginJf();
//         jf.setVisible(true);
//         dispose();
            //   CheckData(register_user.getText(),register_password.getText());


    }//GEN-LAST:event_jButton3MouseClicked

    private void register_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_register_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField register_conpassword;
    private javax.swing.JPasswordField register_password;
    private javax.swing.JTextField register_user;
    // End of variables declaration//GEN-END:variables
}
