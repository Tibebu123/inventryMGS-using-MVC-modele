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
public class categoryupdate {
    Categorymodel up=new Categorymodel();
     public boolean isupdated(int catid, String catname) throws SQLException
    {
        boolean isSucess = false;
        // check parameters
        if(catid == 0 && catname.isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Please enter all required fields!");
        }
        else
        {// call the model method to register all fields to db
            isSucess = up.categoryisupdated(catid, catname);
        }
        return isSucess;
    }
   
}
