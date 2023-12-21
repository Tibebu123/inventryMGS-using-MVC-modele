/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllerpart;

import Modelpart.prodcutmodel;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Tibebu
 */
public class productdeleted {
     prodcutmodel de = new prodcutmodel();
       public boolean isDeleted(int id) throws SQLException
    {
        boolean isDeleted = false;
        // check parameters
        if(id==0 )
        {
          JOptionPane.showMessageDialog(null, "enter the product id to deleted!");
        }
        else
        {// call the model method to register all fields to db
            isDeleted = de.productdeleted(id);
        }
        return isDeleted;
    }

   
  

   
    
   
}
