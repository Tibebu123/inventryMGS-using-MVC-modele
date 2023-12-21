
package Controllerpart;

import Modelpart.CustomerModel;
import Modelpart.prodcutmodel;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Tibebu
 */
public class Customerdelate {
         CustomerModel de = new CustomerModel();
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
            isDeleted = de.Customerdelate(id);
        }
        return isDeleted;
    }

   
    
}
