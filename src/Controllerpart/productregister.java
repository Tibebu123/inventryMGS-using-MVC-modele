package Controllerpart;

import Modelpart.prodcutmodel;
import javax.swing.JOptionPane;

import java.sql.SQLException;

public class productregister {

    prodcutmodel UR = new prodcutmodel();

    public boolean isRegistered(int id, String pname, String category, int quantity, int price) throws SQLException {
        boolean isSuccess = false;
        
        
        if (id == 0 || pname.isEmpty() || category.isEmpty() || quantity == 0 || price == 0) {
            JOptionPane.showMessageDialog(null, "Please enter all required fields!");
        } 
       
        else if (quantity < 0) {
            JOptionPane.showMessageDialog(null, "Quantity  cannot be negative!");
        } 
          else if ( price < 0) {
            JOptionPane.showMessageDialog(null, "price cannot be negative!");
        } 
          
        
        else {
         isSuccess = UR.productRegistration(id, pname, category, quantity, price);
            if (isSuccess) {
                JOptionPane.showMessageDialog(null, "Product registered successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to register the product!");
            }
        }
        return isSuccess;
    }
}