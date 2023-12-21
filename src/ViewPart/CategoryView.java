/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewPart;

import Controllerpart.Categoryregister;
import Controllerpart.catagorydelete;
import Controllerpart.categoryupdate;
import Controllerpart.productupdate;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
//import ava.net.proteanit.sql.DbUtils;

/**
 *
 * @author Tibebu
 */
public class CategoryView extends javax.swing.JFrame {

    /**
     * Creates new form CategoryView
     */
    public CategoryView() {
        initComponents();
               displaycategory();

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
    public void displaycategory() {
  try {
      Connection conn = this.openConnection();
            // create statement object
           Statement  st = conn.createStatement();
       ResultSet rs = st.executeQuery("select * from category ");

        // Check if ResultSet is not null
        if (rs != null) {
            categorytable.setModel(DbUtils.resultSetToTableModel(rs));
        } else {
            // Handle the case when ResultSet is null
            // For example, you can display an error message or take appropriate action
            System.out.println("No data found in ResultSet");
        }

    } catch (Exception e) {
    }
}

     Connection con=null;
   Statement st=null;
   ResultSet rs=null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        catid = new javax.swing.JTextField();
        catName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        categorytable = new javax.swing.JTable();
        cataddbtn = new javax.swing.JButton();
        catupdatebtn = new javax.swing.JButton();
        catdeletebtn = new javax.swing.JButton();
        home = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 153, 254));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INVENTORY MAANGMNET SYSETM _CATEGORY");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(80, 80, 80))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1199, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("CATEGORY ID:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("CATEGORY NAMME:");

        catid.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        catid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catidActionPerformed(evt);
            }
        });

        catName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        categorytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "catID", "catName"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(categorytable);

        cataddbtn.setBackground(new java.awt.Color(204, 0, 51));
        cataddbtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cataddbtn.setForeground(new java.awt.Color(255, 255, 255));
        cataddbtn.setText("Add");
        cataddbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cataddbtnMouseClicked(evt);
            }
        });
        cataddbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cataddbtnActionPerformed(evt);
            }
        });

        catupdatebtn.setBackground(new java.awt.Color(204, 0, 51));
        catupdatebtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        catupdatebtn.setForeground(new java.awt.Color(255, 255, 255));
        catupdatebtn.setText("Update");
        catupdatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catupdatebtnActionPerformed(evt);
            }
        });

        catdeletebtn.setBackground(new java.awt.Color(204, 0, 51));
        catdeletebtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        catdeletebtn.setForeground(new java.awt.Color(255, 255, 255));
        catdeletebtn.setText("Delete");
        catdeletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catdeletebtnMouseClicked(evt);
            }
        });
        catdeletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catdeletebtnActionPerformed(evt);
            }
        });

        home.setBackground(new java.awt.Color(0, 153, 153));
        home.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("CATAGORY LIST");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(catName, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(catid, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cataddbtn)
                                .addGap(26, 26, 26)
                                .addComponent(catupdatebtn)
                                .addGap(42, 42, 42)
                                .addComponent(catdeletebtn))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(home)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(223, 223, 223))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(catid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(catName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(107, 107, 107)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cataddbtn)
                            .addComponent(catupdatebtn)
                            .addComponent(catdeletebtn))
                        .addGap(70, 70, 70)
                        .addComponent(home)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void cataddbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cataddbtnMouseClicked

    }//GEN-LAST:event_cataddbtnMouseClicked

    private void catdeletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catdeletebtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_catdeletebtnMouseClicked

    private void cataddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cataddbtnActionPerformed
     Categoryregister cat = new Categoryregister();
     int catID;
try {
    catID = Integer.parseInt(this.catid.getText());
} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(null, "Invalid input for Category ID!");
    return; // Exit the method if there is an error
}

String catname = this.catName.getText();

boolean isSuccess = false;
try {
    isSuccess = cat.isRegistered(catID, catname);
} catch (SQLException ex) {
    Logger.getLogger(CategoryView.class.getName()).log(Level.SEVERE, null, ex);
}
if (isSuccess) {
    JOptionPane.showMessageDialog(this, "Registration is successful!");
}
displaycategory();

    }//GEN-LAST:event_cataddbtnActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
          new HomeView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
                System.exit(0);

    }//GEN-LAST:event_jLabel1MouseClicked

    private void catupdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catupdatebtnActionPerformed
    categoryupdate URC = new categoryupdate();
        // accept the values form interface
         int catid=Integer.parseInt(this.catid.getText());
        String catname = this.catName.getText();
      

    if(catid == 0 && catname.isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Please enter all required fields!");
        }
        boolean isSucess;
        try {
            isSucess = URC.isupdated(catid, catname);

            if (isSucess) {
                JOptionPane.showMessageDialog(this, "record is updated  sucessfully!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdcutView.class.getName()).log(Level.SEVERE, null, ex);
        }
        displaycategory();
        
    }//GEN-LAST:event_catupdatebtnActionPerformed

    private void catidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catidActionPerformed

    private void catdeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catdeletebtnActionPerformed
        catagorydelete de = new catagorydelete();
        String id=this.catid.getText();
     boolean Deleted = false;
        try {
            Deleted = de.isDeleted(id);
        } catch (SQLException ex) {
            Logger.getLogger(ProdcutView.class.getName()).log(Level.SEVERE, null, ex);
        }
     if (Deleted) {
         JOptionPane.showMessageDialog(this, "deletion is sucess!");
     }
        displaycategory();
    }//GEN-LAST:event_catdeletebtnActionPerformed

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
            java.util.logging.Logger.getLogger(CategoryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoryView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField catName;
    private javax.swing.JButton cataddbtn;
    private javax.swing.JButton catdeletebtn;
    private javax.swing.JTable categorytable;
    private javax.swing.JTextField catid;
    private javax.swing.JButton catupdatebtn;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
