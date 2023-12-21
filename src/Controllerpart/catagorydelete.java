
package Controllerpart;

import Modelpart.Categorymodel;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Tibebu
 */
public class catagorydelete {
       Categorymodel de = new Categorymodel();
       public boolean isDeleted(String id) throws SQLException
    {
        boolean Deleted = false;
        // check parameters
        if(id==null )
        {
          JOptionPane.showMessageDialog(null, "enter the product id to deleted!");
        }
        else
        {// call the model method to register all fields to db
            Deleted = de.categorydelete(id);
        }
        return Deleted;
    }

  

    
}
