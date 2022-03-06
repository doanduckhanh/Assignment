/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Order;

/**
 *
 * @author khanh doan
 */
public class OrderDAO extends BaseDAO<Order>{
    public ArrayList<Order> getAll(){
        ArrayList<Order> list = new ArrayList<>();
        String sql = "SELECT * FROM [Order]";
        try {
           PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Order or = new Order();
               or.setOrid(rs.getInt(1));
               or.setBook(rs.getString(3));
               or.setStart(rs.getDate(4));
               or.setEnd(rs.getDate(5));       
               or.setStatus(rs.getBoolean(6));
               list.add(or);
           }
        } catch (Exception e) {
                Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }
}
