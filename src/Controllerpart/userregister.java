package Controllerpart;

import Modelpart.usermodel;
import javax.swing.JOptionPane;

import java.sql.SQLException;

public class userregister {
    
    usermodel UR = new usermodel();
    
    public boolean isRegistered( String username, String password,int phone ) throws SQLException
    {
        boolean isSucess = false;
        // check parameters
        if( username.isEmpty()&& password.isEmpty() && phone == 0 )
        {
          JOptionPane.showMessageDialog(null, "Please enter all required fields!");
        }
        else
        {// call the model method to register all fields to db
            isSucess = UR.userRegistration( username, password, phone);
        }
        return isSucess;
    }

    public boolean ischecked(int id, String uname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}