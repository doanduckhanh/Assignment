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
import java.sql.SQLException;
/**
 *
 * @author khanh doan
 */
public class BookDAO extends BaseDAO<Book>{
    public ArrayList<Book> getAll(){
        ArrayList<Book> list = new ArrayList<>();
        CategoriesDAO db = new CategoriesDAO();
        String sql = "SELECT [ID]\n" +
"      ,[Name]\n" +
"      ,[CategoryID]\n" +
"      ,[Number]\n" +
"      ,[EntryDate]\n" +
"      ,[Price]\n" +
"      ,[Author]\n" +
"  FROM [LibraryDb].[dbo].[Book]";
        try {
           PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Book b = new Book();
               b.setID(rs.getInt("ID"));
               b.setName(rs.getString("Name"));
               b.setCategory(db.getById(rs.getInt("CategoryID")));
               b.setNumber(rs.getInt("Number"));
               b.setEntryDate(rs.getDate("EntryDate"));       
               b.setPrice(rs.getInt("Price"));
               b.setAuthor(rs.getString("Author"));
               list.add(b);
           }
        } catch (Exception e) {
                Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }
    
    public void deleteBook(int id) {
       try {
           String sql = "DELETE FROM Categories WHERE CateID=?";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setInt(1, id);
           statement.executeUpdate();
       } catch (SQLException ex) {
           Logger.getLogger(CategoriesDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    public void insertBook(Book c) {
       try {
           String sql = "INSERT INTO [Book]\n"
                   + "           ([ID]\n"
                   + "           ,[Name]\n"
                   + "           ,[CategoryID]\n"
                   + "           ,[Number]\n"
                   + "           ,[EntryDate]\n"
                   + "           ,[Price]\n"
                   + "           ,[Author])\n"
                   + "     VALUES\n"
                   + "           (?\n"
                   + "           ,?\n"
                   + "           ,?\n"
                   + "           ,?\n"
                   + "           ,?\n"
                   + "           ,?\n"
                   + "           ,?)";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setInt(1, c.getID());
           statement.setString(2, c.getName());
           statement.setInt(3, c.getCategory().getID());
           statement.setInt(4, c.getNumber());
           statement.setDate(5, c.getEntryDate());
           statement.setInt(6, c.getPrice());
           statement.setString(7, c.getAuthor());
           statement.executeUpdate();
       } catch (SQLException ex) {
           Logger.getLogger(CategoriesDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    
    public void updateBook(int id,Book b) {
       try {
           String sql = "UPDATE [Book]\n"
                   + "   SET [ID] = ?\n"
                   + "      ,[Name] = ?\n"
                   + "      ,[CategoryID] = ?\n"
                   + "      ,[Number] = ?\n"
                   + "      ,[EntryDate] = ?\n"
                   + "      ,[Price] = ?\n"
                   + "      ,[Author] = ?\n"
                   + " WHERE [ID] = ?";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setInt(1, id);
           statement.setString(2, b.getName());
           statement.setInt(3, b.getCategory().getID());
           statement.setInt(4, b.getNumber());
           statement.setDate(5, b.getEntryDate());
           statement.setInt(6, b.getPrice());
           statement.setString(7, b.getAuthor());
           statement.setInt(8, id);
           statement.executeUpdate();
       } catch (SQLException ex) {
           Logger.getLogger(CategoriesDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    
    public Book getBookById(int id){
        CategoriesDAO db = new CategoriesDAO();
        try {
           String sql = "SELECT * FROM Book \n"
                   + "WHERE id = ?";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setInt(1, id);
           ResultSet rs = statement.executeQuery();
           if (rs.next()) {
               Book s = new Book();
               s.setID(rs.getInt(1));
               s.setName(rs.getString(2));
               s.setCategory(db.getById(rs.getInt(3)));
               statement.setInt(4, s.getNumber());
               statement.setDate(5, s.getEntryDate());
               statement.setInt(6, s.getPrice());
               statement.setString(7, s.getAuthor());
               return s;
           }

       } catch (SQLException ex) {
           Logger.getLogger(BookDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
       return null;
    }
}
