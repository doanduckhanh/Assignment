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
import java.util.List;
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
            String sql = "select * from [Categories]";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while(rs.next())
           {
               Category ca = new Category();
               ca.setID(rs.getInt(1));
               ca.setName(rs.getString(2));
               categories.add(ca);
           }
        } catch (SQLException ex) {
            Logger.getLogger(CategoriesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categories;
    }
    public void deleteCategory(int id) {
       try {
           String sql = "DELETE FROM Categories WHERE CateID=?";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setInt(1, id);
           statement.executeUpdate();
       } catch (SQLException ex) {
           Logger.getLogger(CategoriesDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    public void insertCategory(Category c) {
       try {
           String sql = "INSERT INTO [Categories]\n"
                   + "           ([CateID]\n"
                   + "           ,[CateName])\n"
                   + "     VALUES\n"
                   + "           (?\n"
                   + "           ,?)";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setInt(1, c.getID());
           statement.setString(2, c.getName());
           statement.executeUpdate();
       } catch (SQLException ex) {
           Logger.getLogger(CategoriesDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    
    public void updateCate(int id,String name) {
       try {
           String sql = "UPDATE [Categories]\n"
                   + "   SET [CateID] = ?\n"
                   + "      ,[CateName] = ?\n"
                   + " WHERE [CateID] = ?";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setInt(1, id);
           statement.setString(2, name);
           statement.setInt(3, id);
           statement.executeUpdate();
       } catch (SQLException ex) {
           Logger.getLogger(CategoriesDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    
    public Category getById(int id){
        for(Category c : getAll()){
            if(id==c.getID()){
                return c;
            }
        }
        return null;
    }
    public List<Category> getListByPage(List<Category> list, int start, int end) {
        ArrayList<Category> arr = new ArrayList<>();
        for (int i = start; i < end; i++) {
            arr.add(list.get(i));
        }
        return arr;
    }
}
