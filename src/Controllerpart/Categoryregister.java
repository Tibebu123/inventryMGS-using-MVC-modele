/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllerpart;

import Modelpart.Categorymodel;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Tibebu
 */
public class Categoryregister {
Categorymodel cat=new Categorymodel();
   
    
    public boolean isRegistered(int catID, String catname) throws SQLException
    {
        boolean isSucess = false;
        // check parameters
        if(catID == 0 && catname.isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Please enter all required fields!");
        }
        else
        {// call the model method to register all fields to db
            isSucess = cat.categoryRegistration(catID, catname);
        }
        return isSucess;
    }

    
}
