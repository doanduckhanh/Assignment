/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templatessel
 * and open the template in the editor.
 */
package DAL;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Customer;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author khanh doan
 */
public class CustomerDAO extends BaseDAO<Customer>{
    public Customer getCusByUsernameAndPassword(String username, String password) throws SQLException{
         try {
            String sql = "SELECT c.CusID,c.Name,c.Address,c.State,c.City,c.Gender,c.Birth,c.Phone,c.Email,c.username,c.password FROM Customer c\n"+"WHERE c.username = ?";
             PreparedStatement statement = connection.prepareStatement(sql);
             statement.setString(1, username);
             ResultSet rs = statement.executeQuery();
             if(rs.next()){
                 Customer cus = new Customer();
                 cus.setCusID(rs.getString("CusID"));
                 cus.setName(rs.getString("Name"));
                 cus.setAddress(rs.getString("Address"));
                 cus.setState(rs.getString("State"));
                 cus.setCity(rs.getString("City"));
                 cus.setGender(rs.getBoolean("Gender"));
                 cus.setDob(rs.getDate("Birth"));
                 cus.setPhone(rs.getString("Phone"));
                 cus.setEmail(rs.getString("Email"));
                 cus.setAddress("address");
                 cus.setUsername(rs.getString("username"));
                 cus.setPassword(rs.getString("password"));
                 return cus;
             }
        } catch (Exception e) {
             Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, e);
        }
         return null;
    }
}
