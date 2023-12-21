
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
public class CustomerModel {

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
    public boolean customerRegistration(int custID, String custName, String custEmail, int custphone) throws SQLException {
 boolean isRegister = false;
        try {
            // Store the connection object
            Connection conn = this.openConnection();
            // create statement object
            Statement st = conn.createStatement();
            // define the sql string
            String sql = "insert into Customertable values ('"+custID+"','"+custName+"','"+custEmail+"','"+custphone+"')";
           // String sql_update = "update set "
            // send sql commend and execute on database
             int affected_row = st.executeUpdate(sql);
            
             if(affected_row != 0)
             {
                 isRegister = true;
             }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(prodcutmodel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return isRegister;    }

    public boolean productisupdated(int cusid, String cusname, String email, int phone) throws SQLException {
 boolean isupdate = false;

    try {
        // Store the connection object
        Connection conn = this.openConnection();
        // create statement object
        PreparedStatement st = conn.prepareStatement("UPDATE customertable SET custName = ?, custEmail = ? ,custphone=? WHERE custID  = ?");

        // Bind the values
        st.setString(1, cusname);
        st.setString(2, email);
        st.setInt(3, phone);
        st.setInt(4, cusid);
        

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

    return isupdate;        }

    public boolean Customerdelate(int id) throws SQLException {
            boolean Deleted = false;
    try {
        // Store the connection object
        Connection conn = this.openConnection();
        // create statement object
        Statement st = conn.createStatement();
        // define the sql string
        String sql = "DELETE FROM customertable WHERE custID = " + id;
        
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
    
}
