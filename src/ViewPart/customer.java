
package ViewPart;

import Controllerpart.Categoryregister;
import Controllerpart.CustomerRegister;
import Controllerpart.CustomerUpdation;
import Controllerpart.Customerdelate;
import Controllerpart.productdeleted;
import Controllerpart.productregister;
import Controllerpart.productupdate;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Tibebu
 */
public final class customer extends javax.swing.JFrame {

    /**
     * Creates new form customer
     */
    public customer() {
        initComponents();
       displaycustomer();
      
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
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        custidbtn = new javax.swing.JTextField();
        cestnamebtn = new javax.swing.JTextField();
        custphonebtn = new javax.swing.JTextField();
        custadd = new javax.swing.JButton();
        custdelet = new javax.swing.JButton();
        custupdatebtn = new javax.swing.JButton();
        custhomebtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        customertable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        emailfiled = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jPanel4.setBackground(new java.awt.Color(0, 0, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Inventory Managment System_customer");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(251, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231)
                .addComponent(jLabel1)
                .addGap(42, 42, 42))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1214, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 35, Short.MAX_VALUE)))
        );

        jPanel3.setBackground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1214, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Customer phone:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("Customer id:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("Customer name:");

        custidbtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        custidbtn.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        cestnamebtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cestnamebtn.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        custphonebtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        custphonebtn.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        custadd.setBackground(new java.awt.Color(0, 102, 255));
        custadd.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        custadd.setText("Add");
        custadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                custaddMouseClicked(evt);
            }
        });
        custadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custaddActionPerformed(evt);
            }
        });

        custdelet.setBackground(new java.awt.Color(249, 51, 51));
        custdelet.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        custdelet.setText("Delete");
        custdelet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                custdeletMouseClicked(evt);
            }
        });
        custdelet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custdeletActionPerformed(evt);
            }
        });

        custupdatebtn.setBackground(new java.awt.Color(255, 0, 255));
        custupdatebtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        custupdatebtn.setText("Update");
        custupdatebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                custupdatebtnMouseClicked(evt);
            }
        });
        custupdatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custupdatebtnActionPerformed(evt);
            }
        });

        custhomebtn.setBackground(new java.awt.Color(0, 0, 255));
        custhomebtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        custhomebtn.setText("Home");
        custhomebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                custhomebtnMouseClicked(evt);
            }
        });

        customertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "CustomerID", "Customer Name", "customer Email", "Customer Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        customertable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customertableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customertable);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Customer List");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("customer email:");

        emailfiled.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        emailfiled.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(231, 231, 231))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(custadd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(custhomebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(custupdatebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addComponent(custdelet)
                .addGap(616, 616, 616))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel5)))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(custphonebtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addComponent(cestnamebtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addComponent(custidbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addComponent(emailfiled, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addComponent(jLabel4)
                    .addContainerGap(1037, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(custidbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(cestnamebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(emailfiled, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(custphonebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(98, 98, 98))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(custadd)
                                    .addComponent(custupdatebtn)
                                    .addComponent(custdelet))
                                .addGap(35, 35, 35)))
                        .addComponent(custhomebtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(206, 206, 206)
                    .addComponent(jLabel4)
                    .addContainerGap(434, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void displaycustomer() {
  try {
      Connection conn = this.openConnection();
            // create statement object
           Statement  st = conn.createStatement();
       ResultSet rs = st.executeQuery("select * from customertable ");

        // Check if ResultSet is not null
        if (rs != null) {
            customertable.setModel(DbUtils.resultSetToTableModel(rs));
        } else {
            // Handle the case when ResultSet is null
            // For example, you can display an error message or take appropriate action
            System.out.println("No data found in ResultSet");
        }

    } catch (Exception e) {
    }
}
    private void custaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custaddMouseClicked
    
    }//GEN-LAST:event_custaddMouseClicked

    private void custdeletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custdeletMouseClicked
   
                          
    }//GEN-LAST:event_custdeletMouseClicked

    private void custupdatebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custupdatebtnMouseClicked
     
    }//GEN-LAST:event_custupdatebtnMouseClicked

    private void custhomebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custhomebtnMouseClicked
        new HomeView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_custhomebtnMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void custaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custaddActionPerformed

        CustomerRegister cust = new CustomerRegister();
       // accept the values from the interface
int cusid;
try {
    cusid = Integer.parseInt(this.custidbtn.getText());
} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(null, "Invalid input for Customer ID!");
    return; // Exit the method if there is an error
}

String cusname = this.cestnamebtn.getText();
String email = this.emailfiled.getText();
int phone;
try {
    phone = Integer.parseInt(this.custphonebtn.getText());
} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(null, "Invalid input for Phone number!");
    return; // Exit the method if there is an error
}

if (cusid == 0 && cusname.isEmpty() && email.isEmpty() && phone == 0) {
    JOptionPane.showMessageDialog(null, "Please enter all required fields!");
} else {
    boolean isSucess = false;
    try {
        isSucess = cust.isRegistered(cusid, cusname, email, phone);
    } catch (SQLException ex) {
        Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
    }
    if (isSucess) {
        JOptionPane.showMessageDialog(this, "Registration is successful!");
    }
}
displaycustomer();
    }//GEN-LAST:event_custaddActionPerformed

    private void custupdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custupdatebtnActionPerformed
        // TODO add your handling code here:
         CustomerUpdation cust = new CustomerUpdation();
        // accept the values form interface
         int cusid=Integer.parseInt(this.custidbtn.getText());
        String cusname = this.cestnamebtn.getText();
        String email = this.emailfiled.getText();
  
        int phone=Integer.parseInt(this.custphonebtn.getText());
         

    if(cusid == 0 && cusname.isEmpty()&& email.isEmpty() && phone == 0)
        {
          JOptionPane.showMessageDialog(null, "Please enter all required fields!");
        }
        boolean isSucess = false;
        try {
            isSucess = cust.isupdated(cusid, cusname, email, phone);
        } catch (SQLException ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (isSucess) {
            JOptionPane.showMessageDialog(this, "record is updated  sucessfully!");
        }
         displaycustomer();
    }//GEN-LAST:event_custupdatebtnActionPerformed

    private void custdeletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custdeletActionPerformed
        // TODO add your handling code here:
          Customerdelate de = new Customerdelate();
        int cusid=Integer.parseInt(this.custidbtn.getText());
     boolean Deleted = false;
        try {
            Deleted = de.isDeleted(cusid);
        } catch (SQLException ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }
     if (Deleted) {
         JOptionPane.showMessageDialog(this, "deletion is sucess!");
     }
   displaycustomer();
    }//GEN-LAST:event_custdeletActionPerformed

    private void customertableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customertableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)customertable.getModel();
        int myindex=customertable.getSelectedRow();
        custidbtn.setText(model.getValueAt(myindex, 0).toString());
        cestnamebtn.setText(model.getValueAt(myindex, 1).toString());
        emailfiled.setText(model.getValueAt(myindex, 2).toString());
        custphonebtn.setText(model.getValueAt(myindex, 3).toString());
      // proCate.setText(model.getValueAt(myindex, 3).toString());
    }//GEN-LAST:event_customertableMouseClicked

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
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cestnamebtn;
    private javax.swing.JButton custadd;
    private javax.swing.JButton custdelet;
    private javax.swing.JButton custhomebtn;
    private javax.swing.JTextField custidbtn;
    private javax.swing.JTable customertable;
    private javax.swing.JTextField custphonebtn;
    private javax.swing.JButton custupdatebtn;
    private javax.swing.JTextField emailfiled;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
