/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templatessel
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Customer;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.html.CSS;

/**
 *
 * @author khanh doan
 */
public class CustomerDAO extends BaseDAO<Customer>{
    public Customer getCusByUsernameAndPassword(String username, String password, String role) throws SQLException{
         try {
            String sql = "SELECT c.CusID,c.Name,c.Address,c.State,c.City,c.Gender,c.Birth,c.Phone,c.Email,c.username,c.password,c.role FROM Customer c\n"+"WHERE c.username = ? AND c.password = ? AND c.role = ?";
             PreparedStatement statement = connection.prepareStatement(sql);
             statement.setString(1, username);
             statement.setString(2, password);
             statement.setString(3, role);
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
                 cus.setUsername(rs.getString("username"));
                 cus.setPassword(rs.getString("password"));
                 cus.setRole(rs.getString("role"));
                 return cus;
             }
        } catch (SQLException e) {
             Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, e);
        }
         return null;
    }
    
    public void insertCus(Customer c){
        try {
            String sql = "INSERT INTO [Customer]\n"
                    + "([CusID]\n"
                    + ",[Name]\n"
                    + ",[Address]\n"
                    + ",[State]\n"
                    + ",[City]\n"
                    + ", [Gender]\n"
                    + ", [Birth]\n"
                    + ", [Phone]\n"
                    + ", [Email]\n"
                    + ", [username]\n"
                    + ", [password]\n"
                    + ", [role])\n"                   
                    + "VALUES\n"
                    + "(?\n"
                    + ",?\n"
                    + ",?\n"
                    + ",?\n"
                    + ",?\n"
                    + ",?\n"
                    + ",?\n"
                    + ",?\n"
                    + ",?\n"
                    + ",?\n"
                    + ",?\n"
                    + ",?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, c.getCusID());
            statement.setString(2, c.getName());
            statement.setString(3, c.getAddress());
            statement.setString(4, c.getState());
            statement.setString(5, c.getCity());
            statement.setBoolean(6, c.isGender());
            statement.setDate(7, c.getDob());
            statement.setString(8, c.getPhone());
            statement.setString(9, c.getEmail());
            statement.setString(10, c.getUsername());
            statement.setString(11, c.getPassword());
            statement.setString(12, c.getRole());
            statement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public Customer getById(String id){
        try {
            String sql = "SELECT c.CusID,c.Name,c.Address,c.State,c.City,c.Gender,c.Birth,c.Phone,c.Email,c.username,c.password,c.role FROM Customer c\n"+"WHERE c.CusID = ?";
             PreparedStatement statement = connection.prepareStatement(sql);
             statement.setString(1, id);
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
                 cus.setRole(rs.getString("role"));
                 return cus;
             }
        } catch (SQLException e) {
             Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, e);
        }
         return null;
    }
    public  void updateCus(Customer c){
        String sql = "UPDATE [Customer]\n"
                +"SET [Name] = ?, [Address] = ?, [State] = ?, [City] = ?, [Birth] = ?, [Phone] = ? , [Email] = ?\n "
                +"WHERE CusID = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, c.getName());
            statement.setString(2, c.getAddress());
            statement.setString(3, c.getState());
            statement.setString(4, c.getCity());
            statement.setDate(5, c.getDob());
            statement.setString(6, c.getPhone());
            statement.setString(7, c.getEmail());
            statement.setString(8, c.getCusID());
            statement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public ArrayList<Customer> getAll(String role){
        String sql = "select c.CusID,c.Name,c.Address,c.State,c.City,c.Gender,c.Birth,c.Phone,c.Email,c.username,c.password,c.role from Customer c where c.role = ?";
        ArrayList<Customer> listcus = new ArrayList<>();
       Customer cus = new Customer();
       
        try {          
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setString(1, role);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {              
               cus.setCusID(rs.getString("CusID"));
               cus.setName(rs.getString("Name"));
               cus.setAddress(rs.getString("Address"));
               cus.setState(rs.getString("State"));
                cus.setCity(rs.getString("City"));
                 cus.setGender(rs.getBoolean("Gender"));
                 cus.setDob(rs.getDate("Birth"));
                 cus.setPhone(rs.getString("Phone"));
                 cus.setEmail(rs.getString("Email"));
                 cus.setUsername(rs.getString("username"));
                 cus.setPassword(rs.getString("password"));
                 cus.setRole(rs.getString("role"));
                 listcus.add(cus);
           }
        } catch (SQLException e) {
                Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return listcus;
    }
}
