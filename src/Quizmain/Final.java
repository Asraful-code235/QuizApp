/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizmain;

import LoginForm.Registration;
import static Quizmain.Welcome.PlayersName;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Acer Aspire 7
 */
public class Final extends javax.swing.JFrame {
       File f = new File("C:\\Users\\Acer Aspire 7\\Documents\\NetBeansProjects\\QuizApp\\PlayersInfo");
       String Score;
    int ln;
    /**
     * Creates new form Final
     */
    public Final() {
        initComponents();
    }
   public void read(){
                try {
                    FileReader fr = new FileReader(f+"\\Scores.txt");
                    //JOptionPane.showMessageDialog(null, "Exists");
                } catch (FileNotFoundException ex) {
                    try {
                        FileWriter fw = new FileWriter(f+"\\Scores.txt");
                    } catch (IOException ex1) {
                        Logger.getLogger(Sample.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }
         
     }
  
    public void cscore(){
           try {
                  ln=1;
               RandomAccessFile raf = new RandomAccessFile(f+"\\Scores.txt" ,"rw");
                for(int i=0;raf.readLine()!=null;i++)
                {
                ln++;
                }
           } catch (FileNotFoundException ex) {
               Logger.getLogger(Final.class.getName()).log(Level.SEVERE, null, ex);
           } catch (IOException ex) {
               Logger.getLogger(Final.class.getName()).log(Level.SEVERE, null, ex);
           }

    }
  
   public void addData(String name , String s){
                try {
                    RandomAccessFile raf = new RandomAccessFile(f+"\\Scores.txt","rw");
                     for(int i=1;i<ln;i++){
                raf.readLine();
            
                
                }
                    raf.writeBytes("Username:"+name+"Score:"+" and "+s+"\r\n");
                
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Sample.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Sample.class.getName()).log(Level.SEVERE, null, ex);
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
        FinalScore = new javax.swing.JLabel();
        FinalScore1 = new javax.swing.JLabel();
        score = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FinalScore.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        FinalScore.setForeground(new java.awt.Color(51, 51, 255));
        FinalScore.setText("Your final score is:-");
        FinalScore.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                FinalScoreMouseMoved(evt);
            }
        });
        jPanel1.add(FinalScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 200, 30));

        FinalScore1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        FinalScore1.setForeground(new java.awt.Color(51, 51, 255));
        FinalScore1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                FinalScore1MouseMoved(evt);
            }
        });
        jPanel1.add(FinalScore1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 110, 30));

        score.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                scoreMouseMoved(evt);
            }
        });
        score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreActionPerformed(evt);
            }
        });
        jPanel1.add(score, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 40, 30));

        jButton1.setBackground(new java.awt.Color(102, 51, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 313, 90, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FinalScoreMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FinalScoreMouseMoved
        // TODO add your handling code here:
          PlayersName.setText(Sample.jname.getText());
        
    }//GEN-LAST:event_FinalScoreMouseMoved

    private void FinalScore1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FinalScore1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_FinalScore1MouseMoved

    private void scoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreActionPerformed
        // TODO add your handling code here:
          score.setText(Question3.points.getText());
          //read();
          //addData(Sample.jname.getText(),score.getText());
        
        
    }//GEN-LAST:event_scoreActionPerformed

    private void scoreMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scoreMouseMoved
        // TODO add your handling code here:
         score.setText(Question3.points.getText());
//          read();
//          cscore();
//          addData(Sample.jname.getText(),score.getText());
          
    }//GEN-LAST:event_scoreMouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          read();
          cscore();
          addData(Sample.jname.getText(),score.getText());
        this.dispose();
        new Sample().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Final().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel FinalScore;
    public static javax.swing.JLabel FinalScore1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField score;
    // End of variables declaration//GEN-END:variables
}
