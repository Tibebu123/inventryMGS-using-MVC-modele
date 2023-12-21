/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewPart;

import Modelpart.prodcutmodel;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
//import java.time.format.DateTimeFormatter;

/**
 *
 * @author Tibebu
 */
public final class order1 extends javax.swing.JFrame {

    /**
     * Creates new form order
     */
    public order1() {
        initComponents();
       displayproduct();
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

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BillID = new javax.swing.JTextField();
        addorder = new javax.swing.JButton();
        addtoorder = new javax.swing.JButton();
        vieworder = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderedtable = new javax.swing.JTable();
        homebtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        customertable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        custmname = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ProductTabbb1 = new javax.swing.JTable();
        totalamountbl = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        quntib1 = new javax.swing.JTextField();
        printbtn = new javax.swing.JButton();
        totalamountbl1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(51, 102, 255));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inventory Managment System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(457, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 82, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(127, 127, 127)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(128, 128, 128)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("orderid:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Date:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("CUSTOMER NAME:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Quantity:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Price:");

        BillID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BillID.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        addorder.setBackground(new java.awt.Color(255, 255, 255));
        addorder.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addorder.setForeground(new java.awt.Color(255, 0, 0));
        addorder.setText("Add order");
        addorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addorderMouseClicked(evt);
            }
        });
        addorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addorderActionPerformed(evt);
            }
        });

        addtoorder.setBackground(new java.awt.Color(255, 255, 255));
        addtoorder.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        addtoorder.setForeground(new java.awt.Color(255, 0, 0));
        addtoorder.setText("Add to order");
        addtoorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addtoorderMouseClicked(evt);
            }
        });
        addtoorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtoorderActionPerformed(evt);
            }
        });

        vieworder.setBackground(new java.awt.Color(255, 255, 255));
        vieworder.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        vieworder.setForeground(new java.awt.Color(255, 0, 0));
        vieworder.setText("View order");
        vieworder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vieworderActionPerformed(evt);
            }
        });

        orderedtable.setBackground(new java.awt.Color(204, 204, 255));
        orderedtable.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        orderedtable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        orderedtable.setForeground(new java.awt.Color(255, 51, 51));
        orderedtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num", "Product", "quantity", "unit price", "total price"
            }
        ));
        orderedtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderedtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(orderedtable);

        homebtn.setBackground(new java.awt.Color(255, 255, 255));
        homebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        homebtn.setForeground(new java.awt.Color(255, 0, 0));
        homebtn.setText("Home");
        homebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homebtnMouseClicked(evt);
            }
        });
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Product List");

        customertable.setBackground(new java.awt.Color(102, 102, 255));
        customertable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        customertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "CustomerID", "CustomerName", "CustomerPhone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane2.setViewportView(customertable);

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("customer list");

        custmname.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        custmname.setText("customername");

        ProductTabbb1.setBackground(new java.awt.Color(102, 196, 230));
        ProductTabbb1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ProductTabbb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProductID", "ProductName", "Category", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ProductTabbb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTabbb1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(ProductTabbb1);

        totalamountbl.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        totalamountbl.setForeground(new java.awt.Color(255, 0, 0));
        totalamountbl.setText("Amount");

        price.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        quntib1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        printbtn.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        printbtn.setText("Print");
        printbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printbtnMouseClicked(evt);
            }
        });

        totalamountbl1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        totalamountbl1.setForeground(new java.awt.Color(255, 0, 0));
        totalamountbl1.setText("Birr");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(addorder)
                        .addGap(263, 263, 263)
                        .addComponent(vieworder)
                        .addGap(470, 470, 470))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(285, 285, 285))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(quntib1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(jLabel4)))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BillID)
                                    .addComponent(custmname, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(350, 350, 350)
                                .addComponent(addtoorder))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(totalamountbl1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalamountbl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(printbtn)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(734, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(25, 25, 25)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(BillID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(custmname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(addtoorder, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(quntib1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printbtn)
                    .addComponent(totalamountbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalamountbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addorder, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vieworder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(homebtn)
                .addContainerGap(150, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(189, 189, 189)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(587, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void displayproduct() {
  try {
      Connection conn = this.openConnection();
            // create statement object
           Statement  st = conn.createStatement();
       ResultSet rs = st.executeQuery("select * from producttable ");

        // Check if ResultSet is not null
        if (rs != null) {
            ProductTabbb1.setModel(DbUtils.resultSetToTableModel(rs));
        } else {
            // Handle the case when ResultSet is null
            // For example, you can display an error message or take appropriate action
            System.out.println("No data found in ResultSet");
        }

    } catch (SQLException | ClassNotFoundException e) {
    }
}
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

    } catch (SQLException | ClassNotFoundException e) {
    }
}
private void gettoday()
{
 //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");//    LocalDateTime now=new LocalDateTime.now();
//   / date.setText(dtf.format(now));
}
private void productupdate() throws SQLException, ClassNotFoundException
{
    try (Connection conn = this.openConnection();
         Statement st = conn.createStatement()) {

        // create statement object
        int newquantity = oldquantity - Integer.valueOf(quntib1.getText());
        String update = "UPDATE producttable SET quantity=" + newquantity + " WHERE prodcutID = productidd";

        // use executeUpdate instead of executeQuery
        int executeUpdate = st.executeUpdate(update);

        displayproduct();
    }
}
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void addorderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addorderMouseClicked
        
   if(BillID.getText().isEmpty())
   {
       JOptionPane.showMessageDialog(this, "please enter the bill id");
   }
   else{
    try ( // Store the connection object
            Connection conn = this.openConnection()) {
        // create statement object
        PreparedStatement st = conn.prepareStatement("insert into transactiontable values(?,?,?,?)");

        // Bind the values
      // int newquantity=oldquantity-Integer.valueOf(quntib1.getText());

        st.setInt(1, Integer.valueOf(BillID.getText()));
        st.setString(2, custmname.getText());
    st.setInt(3,Integer.valueOf(jDateChooser1.getDateFormatString()) );
        st.setInt(4, Integer.valueOf(totalamountbl.getText()));
        

        // Execute the update statement
        int row = st.executeUpdate();

      
        

    } catch (ClassNotFoundException ex) {
        Logger.getLogger(prodcutmodel.class.getName()).log(Level.SEVERE, null, ex);
    }       catch (SQLException ex) {
                Logger.getLogger(order1.class.getName()).log(Level.SEVERE, null, ex);
            }
    JOptionPane.showMessageDialog(this, "Transaction is seccessfully added");

    
   }
    }//GEN-LAST:event_addorderMouseClicked
int i=1 ,uprice,tot=0,total;
String productname;
    private void addtoorderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addtoorderMouseClicked
       if (quntib1.getText().isEmpty() || price.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Missing information");
} else {
    int uprice;
    try {
        uprice = Integer.parseInt(price.getText());
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Invalid input for Price");
        return; // Exit the method if there is an error
    }

    int tot;
    try {
        tot = uprice * Integer.parseInt(quntib1.getText());
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Invalid input for Quantity");
        return; // Exit the method if there is an error
    }

    Vector<Object> v = new Vector<>();
    v.add(i);
    v.add(productname);
    v.add(quntib1.getText());
    v.add(uprice);
    v.add(tot);

    DefaultTableModel orderlist = (DefaultTableModel) orderedtable.getModel();
    orderlist.addRow(v);

    total = total + tot;
    totalamountbl.setText(String.valueOf(total));

    try {
        productupdate();
    } catch (SQLException | ClassNotFoundException ex) {
        Logger.getLogger(order1.class.getName()).log(Level.SEVERE, null, ex);
    }

    i++;
}
    }//GEN-LAST:event_addtoorderMouseClicked

    private void orderedtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderedtableMouseClicked
//roCate.setText(model.getValueAt(myindex, 3).toString());

    }//GEN-LAST:event_orderedtableMouseClicked

    private void homebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnMouseClicked
        new HomeView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homebtnMouseClicked

    private void vieworderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vieworderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vieworderActionPerformed
int flag=0,productidd,oldquantity;
    private void ProductTabbb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTabbb1MouseClicked
        // TODO add your handling code here:
           DefaultTableModel model=(DefaultTableModel)ProductTabbb1.getModel();
           int myindex=ProductTabbb1.getSelectedRow();
           productidd=Integer.valueOf(model.getValueAt(myindex, 0).toString());
            productname=model.getValueAt(myindex, 1).toString();
        oldquantity=Integer.valueOf(model.getValueAt(myindex, 3).toString());

            flag=1;
        try {
            productupdate();
        } catch (SQLException ex) {
            Logger.getLogger(order1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(order1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_ProductTabbb1MouseClicked

    private void addtoorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtoorderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addtoorderActionPerformed

    private void addorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addorderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addorderActionPerformed

    private void customertableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customertableMouseClicked
       
              DefaultTableModel model=(DefaultTableModel)customertable.getModel();
   int myindex=customertable.getSelectedRow();
     custmname.setText(model.getValueAt(myindex, 1).toString());
//       proName.setText(model.getValueAt(myindex, 1).toString());
//        proQty.setText(model.getValueAt(myindex, 2).toString());
//        proPrice.setText(model.getValueAt(myindex, 3).toString());
//        // proCate.setText(model.getValueAt(myindex, 3).toString());
displaycustomer();
    }//GEN-LAST:event_customertableMouseClicked

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homebtnActionPerformed

    private void printbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printbtnMouseClicked
        try {
            orderedtable.print();
        } catch (PrinterException ex) {
            Logger.getLogger(order1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_printbtnMouseClicked

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
            java.util.logging.Logger.getLogger(order1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(order1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(order1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(order1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new order1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BillID;
    private javax.swing.JTable ProductTabbb1;
    private javax.swing.JButton addorder;
    private javax.swing.JButton addtoorder;
    private javax.swing.JLabel custmname;
    private javax.swing.JTable customertable;
    private javax.swing.JButton homebtn;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable orderedtable;
    private javax.swing.JTextField price;
    private javax.swing.JButton printbtn;
    private javax.swing.JTextField quntib1;
    private javax.swing.JLabel totalamountbl;
    private javax.swing.JLabel totalamountbl1;
    private javax.swing.JButton vieworder;
    // End of variables declaration//GEN-END:variables
}
