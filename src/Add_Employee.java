
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ankur
 */
public class Add_Employee extends javax.swing.JFrame {

    /**
     * Creates new form Add_employee
     */
    public Add_Employee() {
        initComponents();
         jTextField13.setText(logics.Employee.getLastEmployeeID()+1+"");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(1000, 550));
        getContentPane().setLayout(null);

        jLabel1.setText("Name");
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 14));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 90, 90, 30);

        jLabel3.setText("Permanent Address  ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 130, 120, 30);

        jLabel4.setText("Present Address");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 170, 130, 30);

        jLabel5.setText("Pincode");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 210, 90, 30);

        jLabel6.setText("Aadhar No.");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(170, 250, 90, 30);

        jLabel7.setText("Phone no.");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(170, 290, 90, 30);

        jLabel8.setText("2nd phone no.");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(170, 330, 90, 30);

        jLabel9.setText("Fmaily cantact no.");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(170, 370, 120, 30);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(300, 90, 200, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(300, 130, 200, 30);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(300, 170, 200, 30);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(300, 210, 200, 30);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(300, 250, 200, 30);
        getContentPane().add(jTextField10);
        jTextField10.setBounds(380, 290, 200, 30);
        getContentPane().add(jTextField11);
        jTextField11.setBounds(300, 330, 200, 30);
        getContentPane().add(jTextField12);
        jTextField12.setBounds(300, 370, 200, 30);

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(470, 453, 130, 40);

        jLabel2.setText("City");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(540, 130, 60, 20);

        jLabel10.setText("State");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(730, 130, 50, 20);

        jLabel11.setText("City");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(540, 180, 60, 20);

        jLabel12.setText("State");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(730, 180, 50, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(590, 130, 100, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(780, 130, 100, 30);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(590, 180, 100, 30);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(780, 180, 100, 30);
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(300, 290, 60, 30);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(750, 460, 73, 23);

        jLabel13.setText("Date of Birth ");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(540, 80, 110, 40);

        jLabel14.setText("Password");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(650, 370, 130, 80);

        jTextField13.setEditable(false);
        getContentPane().add(jTextField13);
        jTextField13.setBounds(780, 330, 120, 50);

        jLabel15.setText("Employee ID");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(650, 320, 130, 80);

        jPasswordField1.setText("jPasswordField1");
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(780, 400, 111, 20);

        jLabel16.setText("Gender");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(540, 220, 80, 30);

        jButton3.setText("show");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(920, 400, 57, 23);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Male");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(620, 220, 47, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(760, 220, 59, 23);
        getContentPane().add(jDateChooser2);
        jDateChooser2.setBounds(620, 80, 250, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try
        {
            String name=jTextField1.getText();
//            Date date = jDateChooser1.getDate();
//            String date_of_birth = DateFormat.getDateInstance().format(date);
            DateFormat df = new SimpleDateFormat("DD/MM/YYYY");
            String permanent_address=jTextField2.getText();
            String permanent_city=jTextField3.getText();
            String permanent_state=jTextField4.getText();
            String present_address=jTextField5.getText();
            String present_city=jTextField6.getText();
            String present_state=jTextField7.getText();
            String pincode=jTextField8.getText();
            String aadhar_no=jTextField9.getText();
            String phone_code=jSpinner1.getValue().toString();
            String first_phone_no=jTextField10.getText();
            String second_phone_no=jTextField11.getText();
            String fmaily_contact_no=jTextField12.getText();
            String id=jTextField13.getText();
            String gender="Male";
                    if(jRadioButton2.isSelected())
                    {gender="Female";}
            String password = String.valueOf(jPasswordField1.getPassword());
            
            
            Connection com = logics.DB_Work.myDBInstance();
            PreparedStatement pstmt = com.prepareStatement("insert into employee (`id`,`name`,`permanent_address`,`permanent_city`,"
                + "`permanent_state`,`present_address`,`present_city`,`present_state`,`pincode`,`aadhar_no`,`phone_code`,`first_phone_no`,"
                + "`second_phone_no`,`fmaily_contact_no`,`date_of_birth`,`gender`,`password` ) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pstmt.setString(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, permanent_address);
            pstmt.setString(4, permanent_city);
            pstmt.setString(5, permanent_state);
            pstmt.setString(6, present_address);
            pstmt.setString(7, present_city);
            pstmt.setString(8, present_state);
            pstmt.setString(9, pincode);
            pstmt.setString(10, aadhar_no);
            pstmt.setString(11, phone_code);
            pstmt.setString(12, first_phone_no);
            pstmt.setString(13, second_phone_no);
            pstmt.setString(14, fmaily_contact_no);
//            pstmt.setString(15, date_of_birth);
            pstmt.setString(16, gender);
            pstmt.setString(17, password);

            int flag = pstmt.executeUpdate();
            if (flag > 0)
            {
                JOptionPane.showMessageDialog(this, "Added");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "NOT Added");
            }
        }
        catch(Exception e)
        {System.out.println("---ERROR---a"+e);}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new Home().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jPasswordField1.setEchoChar((char)0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
