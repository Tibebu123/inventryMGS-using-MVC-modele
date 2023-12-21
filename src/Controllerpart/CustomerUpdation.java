/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllerpart;

import Modelpart.CustomerModel;
import Modelpart.prodcutmodel;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Tibebu
 */
public class CustomerUpdation {

    public boolean isupdated(int cusid, String cusname, String email, int phone)throws SQLException {
CustomerModel up = new CustomerModel();
    
       boolean isSucess = false;
        // check parameters
        if(cusid == 0 && cusname.isEmpty()&& email.isEmpty() && phone == 0 )
        {
          JOptionPane.showMessageDialog(null, "Please enter all required fields!");
        }
        else
        {// call the model method to register all fields to db
            isSucess = up.productisupdated(cusid, cusname, email, phone);
        }
        return isSucess;    }
    
}
