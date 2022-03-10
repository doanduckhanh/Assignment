/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Book;
import DAL.CategoriesDAO;
/**
 *
 * @author khanh doan
 */
public class BookDAO extends BaseDAO<Book>{
    public ArrayList<Book> getAll(){
        ArrayList<Book> list = new ArrayList<>();
        CategoriesDAO db = new CategoriesDAO();
        String sql = "SELECT * FROM [Book]";
        try {
           PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Book b = new Book();
               b.setID(rs.getInt(1));
               b.setName(rs.getString(2));
               b.setCategory(db.getById(rs.getInt(3)));
               b.setNumber(rs.getInt(4));
               b.setEntryDate(rs.getDate(5));       
               b.setPrice(rs.getInt(6));
               b.setAuthor(rs.getString(8));
               list.add(b);
           }
        } catch (Exception e) {
                Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }
}
