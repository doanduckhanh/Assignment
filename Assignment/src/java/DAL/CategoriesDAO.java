/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Category;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Book;

/**
 *
 * @author khanh doan
 */
public class CategoriesDAO extends BaseDAO<Category>{
    public ArrayList<Category> getAll(){
        ArrayList<Category> categories = new ArrayList<>();
        try {
            String sql = "SELECT c.CateID,c.CateName,COUNT(CateID) AS NumberOfBook FROM Categories c INNER JOIN Book b\n" +
                         "ON c.CateID = b.CategoryID\n" +
                         "GROUP BY c.CateID,c.CateName";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while(rs.next())
           {
               Category ca = new Category();
               ca.setID(rs.getInt(1));
               ca.setName(rs.getString(2));
               ca.setNumB(rs.getInt(3));
               categories.add(ca);
           }
        } catch (SQLException ex) {
            Logger.getLogger(CategoriesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categories;
    }
    public ArrayList<Book> getBooksByCategories(String Cate){
        
    }
    public void deleteStudent(int id) {
       try {
           String sql = "DELETE FROM Categories WHERE CateID=?";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setInt(1, id);
           statement.executeUpdate();
       } catch (SQLException ex) {
           Logger.getLogger(CategoriesDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    
    
}
