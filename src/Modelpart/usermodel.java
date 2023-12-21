
package Modelpart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class usermodel {
    
    // paraterms to register the drive 
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
            // open the connection isSucess = URC.isRegistered(pname, password, phone);
            
            con = DriverManager.getConnection(DBurl, uname, pass);
        }
        return con;
    }
    
    // function to register user accounts
    public boolean userRegistration(String username,String password,int phone) throws SQLException
    {
        boolean isRegister = false;
        try {
            // Store the connection object
            Connection conn = this.openConnection();
            // create statement object
            Statement st = conn.createStatement();
            // define the sql string
            String sql = "insert into usertable values ('"+username+"','"+password+"','"+phone+"')";
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
        
        return isRegister;
    }
     

    public boolean userdeleted(String user) throws SQLException {
    boolean Deleted = false;
    try {
        // Store the connection object
        Connection conn = this.openConnection();
        // create statement object
        Statement st = conn.createStatement();
        // define the sql string
        String sql = "DELETE FROM usertable WHERE username = " + user;
        
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
