/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllerpart;

import Modelpart.prodcutmodel;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Tibebu
 */
public class productupdate {
prodcutmodel up = new prodcutmodel();
    
    public boolean isupdated(int id, String pname, String category, int quantity, int price) throws SQLException
    {
        boolean isSucess = false;
        // check parameters
        if(id == 0 && pname.isEmpty()&& category.isEmpty() && quantity == 0 && price == 0)
        {
          JOptionPane.showMessageDialog(null, "Please enter all required fields!");
        }
        else
        {// call the model method to register all fields to db
            isSucess = up.productisupdated(id, pname, category, quantity,price);
        }
        return isSucess;
    }
   
    
}
