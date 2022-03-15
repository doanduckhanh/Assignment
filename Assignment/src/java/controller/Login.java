/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Customer;
import DAL.CustomerDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Book;
import model.Category;
import model.Order;
import DAL.BookDAO;
import DAL.CategoriesDAO;
import DAL.OrderDAO;
import java.util.ArrayList;
/**
 *
 * @author khanh doan
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Login at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        Cookie[] cookies = request.getCookies();
        if(cookies!=null)
        {
            for (Cookie cooky : cookies) {
               if(cooky.getName().equals("username")){
                   request.setAttribute("username", cooky.getValue());
               }
               if(cooky.getName().equals("password")){
                   request.setAttribute("password", cooky.getValue());
               }     
            }
        }    
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
       String username = request.getParameter("username");
       String password = request.getParameter("password");
       String role = request.getParameter("role");
       CustomerDAO db = new CustomerDAO();
       Customer cus = new Customer();
        try {
            cus = db.getCusByUsernameAndPassword(username, password);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
       if(cus != null) // login successfully!
       {
           String remember = request.getParameter("remember");
           if(remember !=null)
           {
               Cookie c_user = new Cookie("username", username);
               Cookie c_pass = new Cookie("password", password);
               c_user.setMaxAge(3600*24*30);
               c_pass.setMaxAge(3600*24*30);
               response.addCookie(c_pass);
               response.addCookie(c_user);
               HttpSession session = request.getSession();
               session.setAttribute("user", cus);
           }         
           request.setAttribute("cus", cus);
           CategoriesDAO db1 = new CategoriesDAO();
           ArrayList<Category> listcate = new ArrayList<>();
           listcate = db1.getAll();
           request.setAttribute("listcate", listcate);
           
           BookDAO db2 = new BookDAO();
           ArrayList<Book> listbook = new ArrayList<>();
           listbook = db2.getAll();
           request.setAttribute("listbook", listbook);
           
           OrderDAO db3 = new OrderDAO();
           ArrayList<Order> listorder = new ArrayList<>();
           listorder = db3.getByCus(cus.getCusID());
           request.setAttribute("listordercus", listorder);
                
           request.getRequestDispatcher("user.jsp").forward(request, response);
       }
       else //login fail
       {   
           request.setAttribute("err", 1);
           request.getRequestDispatcher("login.jsp").forward(request, response);
       }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
