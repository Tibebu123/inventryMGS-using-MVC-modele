/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllerpart;

import Modelpart.usermodel;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Tibebu
 */
public class UserDelete {
     usermodel de = new usermodel();
       public boolean isDeleted(String user) throws SQLException
    {
        boolean isDeleted = false;
        // check parameters
        if(user==null )
        {
          JOptionPane.showMessageDialog(null, "enter the product id to deleted!");
        }
        else
        {// call the model method to register all fields to db
            isDeleted = de.userdeleted(user);
        }
        return isDeleted;
   

    
    }
}
