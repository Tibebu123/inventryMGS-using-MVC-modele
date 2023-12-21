/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelpart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Tibebu
 */
public class Categorymodel {
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
   
    public boolean categoryRegistration(int categoryid, String categoryName) throws SQLException {
   boolean isRegister = false;
        try {
            // Store the connection object
            Connection conn = this.openConnection();
            // create statement object
            Statement st = conn.createStatement();
            // define the sql string
            String sql = "insert into category values ('"+categoryid+"','"+categoryName+"')";
          
             int affected_row = st.executeUpdate(sql);
            
             if(affected_row != 0)
             {
                 isRegister = true;
             }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(prodcutmodel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return isRegister;    }

    public boolean categorydelete(String id) throws SQLException {

 boolean Deleted = false;
try {
    // Store the connection object
    Connection conn = this.openConnection();
    // create statement object
    Statement st = conn.createStatement();
    // define the sql string
    String sql = "DELETE FROM category WHERE categoryid  = " + id;
    
    int affected_row = st.executeUpdate(sql);
    
    if(affected_row != 0)
    {
        Deleted = true;
    }
    
} catch (ClassNotFoundException ex) {
    Logger.getLogger(prodcutmodel.class.getName()).log(Level.SEVERE, null, ex);
}
    
return Deleted; 
}

    public boolean categoryisupdated(int catid, String catname) throws SQLException {
boolean isupdate = false;

    try {
        // Store the connection object
        Connection conn = this.openConnection();
        // create statement object
        PreparedStatement st = conn.prepareStatement("UPDATE  category SET categoryName  =? WHERE  categoryid = ?");

        // Bind the values
        
        st.setString(1, catname);
        st.setInt(2, catid);

      
       

        // Execute the update statement
        int affected_row = st.executeUpdate();

        if(affected_row != 0)
        {
            isupdate = true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No record found for this id. Please check your input!");
        }

    } catch (ClassNotFoundException ex) {
        Logger.getLogger(prodcutmodel.class.getName()).log(Level.SEVERE, null, ex);
    }

    return isupdate;       }
}
