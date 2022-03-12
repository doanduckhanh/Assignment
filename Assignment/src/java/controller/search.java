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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Book;
import DAL.BookDAO;
import DAL.CategoriesDAO;
import DAL.CustomerDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;
import model.Category;
import model.Customer;
/**
 *
 * @author khanh doan
 */
@WebServlet(name = "search", urlPatterns = {"/search"})
public class search extends HttpServlet {

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
            out.println("<title>Servlet search</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet search at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
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
        HttpSession session = request.getSession(); 
       Cookie[] cookies = request.getCookies();
       String username = null;
       String password = null;
       for (Cookie cooky : cookies) {
               if(cooky.getName().equals("username")){
                   username = cooky.getValue();
               }
               if(cooky.getName().equals("password")){
                   password = cooky.getValue();
               }     
            }
       Customer cus = new Customer();
       CustomerDAO dbcus = new CustomerDAO();
        try {
            cus = dbcus.getCusByUsernameAndPassword(username, password);
        } catch (SQLException ex) {
            Logger.getLogger(searchCate.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("cus", cus);
        
        String s = request.getParameter("search");
        ArrayList<Book> listbook = new ArrayList<>();
        BookDAO db = new BookDAO();
        listbook = db.getBookByName(s);
        request.setAttribute("listbook", listbook);
        
        CategoriesDAO db1 = new CategoriesDAO();
        ArrayList<Category> listcate = new ArrayList<>();
        listcate = db1.getAll();
        request.setAttribute("listcate", listcate);
        
        request.getRequestDispatcher("user.jsp").forward(request, response);
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
