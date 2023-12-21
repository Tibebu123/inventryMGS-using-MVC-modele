
package ViewPart;

import Controllerpart.UserDelete;
import Controllerpart.userregister;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Tibebu
 */
public final class User extends javax.swing.JFrame {

    /**
     * Creates new form User
     */
    public User() {
        initComponents();
      //  displayuser() ;
        
    }
        String driverName = "com.mysql.jdbc.Driver";
    
    // parameters to open the connection
    String DBurl = "jdbc:mysql://localhost:3306/mvcinventory";
    String uname = "root";
    String pass = "";
       public Connection openConnection() throws SQLException, ClassNotFoundException
    {
        // connection object
        Connection con = null;
        // load the driver
        Class c = Class.forName(driverName);
        if(c != null)
        {
            // open the connection 
            
            con = DriverManager.getConnection(DBurl, uname, pass);
        }
        return con;
    }
  

    @SuppressWarnings("unchecked")
            

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        userphone = new javax.swing.JTextField();
        useraddbtn = new javax.swing.JButton();
        userdeletebtn = new javax.swing.JButton();
        userupdatebtn = new javax.swing.JButton();
        userhomebtn = new javax.swing.JButton();
        userpassword = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inventory Managment System");

        jLabel2.setBackground(new java.awt.Color(204, 0, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 289, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("USER NAME:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 174, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("USER PASSWORD:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 226, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("PHONE:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 292, -1, -1));

        username.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 165, 258, 36));

        userphone.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(userphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 279, 258, 43));

        useraddbtn.setBackground(new java.awt.Color(0, 255, 0));
        useraddbtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        useraddbtn.setText("Add");
        useraddbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                useraddbtnMouseClicked(evt);
            }
        });
        useraddbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useraddbtnActionPerformed(evt);
            }
        });
        jPanel1.add(useraddbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 388, 80, -1));

        userdeletebtn.setBackground(new java.awt.Color(255, 4, 17));
        userdeletebtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        userdeletebtn.setForeground(new java.awt.Color(78, 78, 239));
        userdeletebtn.setText("Delete");
        userdeletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userdeletebtnMouseClicked(evt);
            }
        });
        userdeletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userdeletebtnActionPerformed(evt);
            }
        });
        jPanel1.add(userdeletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 388, -1, -1));

        userupdatebtn.setBackground(new java.awt.Color(51, 255, 0));
        userupdatebtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        userupdatebtn.setText("Update");
        userupdatebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userupdatebtnMouseClicked(evt);
            }
        });
        userupdatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userupdatebtnActionPerformed(evt);
            }
        });
        jPanel1.add(userupdatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 388, -1, -1));

        userhomebtn.setBackground(new java.awt.Color(0, 0, 255));
        userhomebtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        userhomebtn.setText("Home");
        userhomebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userhomebtnMouseClicked(evt);
            }
        });
        userhomebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userhomebtnActionPerformed(evt);
            }
        });
        jPanel1.add(userhomebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 468, -1, -1));

        userpassword.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(userpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 219, 258, 42));

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 603, 1167, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//            public void displayuser() {
//  try {
//      Connection conn = this.openConnection();
//            // create statement object
//           Statement  st = conn.createStatement();
//       ResultSet rs = st.executeQuery("select * from usertable ");
//
//        // Check if ResultSet is not null
//        if (rs != null) {
//            usertbl.setModel(DbUtils.resultSetToTableModel(rs));
//        } else {
//            // Handle the case when ResultSet is null
//            // For example, you can display an error message or take appropriate action
//            System.out.println("No data found in ResultSet");
//        }
//
//    } catch (Exception e) {
//    }}
    private void useraddbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_useraddbtnMouseClicked
  
    }//GEN-LAST:event_useraddbtnMouseClicked

    private void userupdatebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userupdatebtnMouseClicked
   
    }//GEN-LAST:event_userupdatebtnMouseClicked

    private void userdeletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userdeletebtnMouseClicked
 
    }//GEN-LAST:event_userdeletebtnMouseClicked

    private void userhomebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userhomebtnMouseClicked
        // TODO add your handling code here:
        new HomeView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_userhomebtnMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void useraddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useraddbtnActionPerformed
        // TODO add your handling code here:
           
      userregister URC = new userregister();

String username = this.username.getText();
String password = this.userpassword.getText();

int phone;
try {
    phone = Integer.parseInt(this.userphone.getText());
} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(null, "Invalid input for Phone number!");
    return; // Exit the method if there is an error
}

boolean isSuccess = false;
try {
    isSuccess = URC.isRegistered(username, password, phone);
    if (isSuccess) {
        JOptionPane.showMessageDialog(this, "Registration is successful!");
    }
} catch (SQLException ex) {
    Logger.getLogger(ProdcutView.class.getName()).log(Level.SEVERE, null, ex);
}
      //  displayuser() ;

        
    }//GEN-LAST:event_useraddbtnActionPerformed

    private void userdeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userdeletebtnActionPerformed
         UserDelete de = new UserDelete();
        String user=this.username.getText();
     boolean Deleted = false;
        try {
            Deleted = de.isDeleted(user);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
     if (Deleted) {
         JOptionPane.showMessageDialog(this, "deletion is sucess!");
     }
        
     
    }//GEN-LAST:event_userdeletebtnActionPerformed

    private void userhomebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userhomebtnActionPerformed
        // TODO add your handling code here:
         new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_userhomebtnActionPerformed

    private void userupdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userupdatebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userupdatebtnActionPerformed

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton useraddbtn;
    private javax.swing.JButton userdeletebtn;
    private javax.swing.JButton userhomebtn;
    private javax.swing.JTextField username;
    private javax.swing.JPasswordField userpassword;
    private javax.swing.JTextField userphone;
    private javax.swing.JButton userupdatebtn;
    // End of variables declaration//GEN-END:variables

   
}
