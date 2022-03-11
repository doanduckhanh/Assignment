/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Book_admin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAL.BookDAO;
import DAL.CategoriesDAO;
import java.sql.Date;
import java.util.ArrayList;
import model.Book;
import model.Category;
        
/**
 *
 * @author khanh doan
 */
@WebServlet(name = "updateBook", urlPatterns = {"/updateBook"})
public class updateBook extends HttpServlet {

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
            out.println("<title>Servlet updateBook</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet updateBook at " + request.getContextPath() + "</h1>");
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
        String id = request.getParameter("id");
        BookDAO db = new BookDAO();
        Book b = new Book();
        b = db.getBookById(Integer.parseInt(id));
        CategoriesDAO db1 = new CategoriesDAO();
        ArrayList<Category> listca = new ArrayList<>();
        listca = db1.getAll();
        request.setAttribute("listcate", listca);
        request.setAttribute("book", b);
        request.getRequestDispatcher("Book_admin/updateBook.jsp").forward(request, response);
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
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String cate = request.getParameter("category");
        String num = request.getParameter("number");
        String entrydate = request.getParameter("entrydate");
        String price = request.getParameter("price");
        String author = request.getParameter("author");
        BookDAO db = new BookDAO();
        CategoriesDAO dbc = new CategoriesDAO();
        Book b =new Book();
        b.setName(name);
        b.setCategory(dbc.getById(Integer.parseInt(cate)));
        b.setNumber(Integer.parseInt(num));
        b.setEntryDate(Date.valueOf(entrydate));
        b.setPrice(Integer.parseInt(price));
        b.setAuthor(author);
        db.updateBook(Integer.parseInt(id), b);
        request.getRequestDispatcher("admin").forward(request, response);
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
