import guiproject.GUI.connect.*;
import javax.swing.JOptionPane.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class SignIn extends javax.swing.JFrame {
Connection con=null;
PreparedStatement PST=null;
ResultSet  RS=null;


    public SignIn() {
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

        jPanel2 = new javax.swing.JPanel();
        jColorChooser1 = new javax.swing.JColorChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        button1 = new java.awt.Button();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_usernamee = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_passwordd = new javax.swing.JTextField();
        SIGNIN = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        button1.setLabel("button1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 204, 204));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 0);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(null);

        jLabel1.setText("ENTER YOUR USERNAME");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(89, 11, 170, 37);

        txt_usernamee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameeActionPerformed(evt);
            }
        });
        jPanel3.add(txt_usernamee);
        txt_usernamee.setBounds(82, 54, 177, 40);

        jLabel2.setText("ENTER YOUR PASSWORD ");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(82, 88, 177, 30);

        txt_passwordd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passworddActionPerformed(evt);
            }
        });
        jPanel3.add(txt_passwordd);
        txt_passwordd.setBounds(80, 120, 191, 40);

        SIGNIN.setText("SIGNIN");
        SIGNIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIGNINActionPerformed(evt);
            }
        });
        jPanel3.add(SIGNIN);
        SIGNIN.setBounds(199, 186, 104, 23);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 370, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    private void SIGNINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIGNINActionPerformed
   
        try{
       String sql="select * from  pos where USERNAME=? and PASSWORD=?";
       
       PST=con.prepareStatement(sql);
       PST.setString(1,txt_usernamee.getText());
       PST.setString(2,txt_passwordd.getText());
       RS=PST.executeQuery();
       if(RS.next()){
        ApplicationForm af= new ApplicationForm();
        af.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
        this.pack();
        this.setLocationRelativeTo(null);
         JOptionPane.showMessageDialog(null," USERNAME and PASSWORD is correct please complete the informatiom above");
       }
       else{
           JOptionPane.showMessageDialog(null,"the USERNAME and PASSWORD entered is incorrect");
   }
   }
   catch(Exception e) {
           JOptionPane.showMessageDialog(null,e);
           }   
      
    }//GEN-LAST:event_SIGNINActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
//con=GetConnection.connectdb();
    }//GEN-LAST:event_formWindowActivated

    private void txt_usernameeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameeActionPerformed

    private void txt_passworddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passworddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passworddActionPerformed

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and displa*/
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);

               

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SIGNIN;
    private java.awt.Button button1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt_passwordd;
    private javax.swing.JTextField txt_usernamee;
    // End of variables declaration//GEN-END:variables

 
}
