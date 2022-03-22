/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAL.BookDAO;
import DAL.CategoriesDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Book;
import java.util.ArrayList;
import javax.servlet.http.Cookie;
import model.Category;
import model.Customer;
import DAL.CustomerDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
/**
 *
 * @author khanh doan
 */
@WebServlet(name = "searchCate", urlPatterns = {"/searchCate"})
public class searchCate extends HttpServlet {

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
            out.println("<title>Servlet searchCate</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet searchCate at " + request.getContextPath() + "</h1>");
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
       // processRequest(request, response);
       /*HttpSession session = request.getSession(); 
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
            cus = dbcus.getCusByUsernameAndPassword(username, password,"user");
        } catch (SQLException ex) {
            Logger.getLogger(searchCate.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("cus", cus);
       */
       String id = request.getParameter("id");
       BookDAO db = new BookDAO();
       ArrayList<Book> listb = new ArrayList<>();     
       listb = db.getBookByCate(Integer.parseInt(id));
        int pageb, numperpageb = 8;
        int sizeb = listb.size();
        int numb = (sizeb%8==0?(sizeb/8):((sizeb/8))+1);
        String xpageb = request.getParameter("pageb");    
        if (xpageb == null) {
            pageb = 1;
        } else {
            pageb = Integer.parseInt(xpageb);
        }
        int startb, endb;
        startb = (pageb - 1) * numperpageb;
        endb = Math.min(pageb * numperpageb, sizeb);
        List<Book> listbook = db.getListByPage(listb, startb, endb);
        request.getSession().setAttribute("listbook", listb);
        request.setAttribute("numb", numb);
       
        CategoriesDAO db1 = new CategoriesDAO();
        ArrayList<Category> listcate = new ArrayList<>();
        listcate = db1.getAll();
        request.setAttribute("listcate", listcate);
        request.getRequestDispatcher("user.jsp").forward(request, response);
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
        processRequest(request, response);
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
