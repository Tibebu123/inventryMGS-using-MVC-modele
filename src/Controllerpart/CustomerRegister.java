
package Controllerpart;

import Modelpart.CustomerModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Tibebu
 */
public class CustomerRegister {

    public boolean isRegistered(int cusid, String cusname, String email, int phone) throws SQLException {
        CustomerModel cu=new CustomerModel();
 {
        boolean isSucess = false;
        // check parameters
        if(cusid == 0 && cusname.isEmpty()&& email.isEmpty() && phone == 0)
        {
          JOptionPane.showMessageDialog(null, "Please enter all required fields!");
        }
        
        else
        {// call the model method to register all fields to db
            isSucess = cu.customerRegistration(cusid, cusname, email, phone);
        }
        return isSucess;
    }    }
    
}
