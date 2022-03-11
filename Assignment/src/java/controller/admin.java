/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAL.BookDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAL.OrderDAO;
import model.Order;
import java.util.ArrayList;
import DAL.CategoriesDAO;
import java.util.List;
import javax.servlet.http.HttpSession;
import model.Book;
import model.Category;
/**
 *
 * @author khanh doan
 */
@WebServlet(name = "admin", urlPatterns = {"/admin"})
public class admin extends HttpServlet {

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
        HttpSession session = request.getSession();      
        //Order
        OrderDAO db = new OrderDAO();
        ArrayList<Order> listor = new ArrayList<>();
        listor = db.getAll();
        int pageor, numperpageor = 8;
        int sizeor = listor.size();
        int numor = (sizeor%8==0?(sizeor/8):((sizeor/8))+1);
        String xpageor = request.getParameter("pageor");    
        if (xpageor == null) {
            pageor = 1;
        } else {
            pageor = Integer.parseInt(xpageor);
        }
        int startor, endor;
        startor = (pageor - 1) * numperpageor;
        endor = Math.min(pageor * numperpageor, sizeor);
        List<Order> listorder = db.getListByPage(listor, startor, endor);
        request.setAttribute("listor", listorder);
        request.setAttribute("numor", numor);
        //Book
        BookDAO db2 = new BookDAO();
        ArrayList<Book> listb = new ArrayList<>();
        listb = db2.getAll();
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
        List<Book> listbook = db2.getListByPage(listb, startb, endb);
        request.setAttribute("listb", listbook);
        request.setAttribute("numb", numb);
        
        //Category
        CategoriesDAO db1 = new CategoriesDAO();
        ArrayList<Category> listcate = new ArrayList<>();
        listcate = db1.getAll();
        int pagecate, numperpagecate = 8;
        int sizecate = listcate.size();
        int numcate = (sizecate%8==0?(sizecate/8):((sizecate/8))+1);
        String xpagecate = request.getParameter("pagecate");    
        if (xpagecate == null) {
            pagecate = 1;
        } else {
            pagecate = Integer.parseInt(xpagecate);
        }
        int startcate, endcate;
        startcate = (pagecate - 1) * numperpagecate;
        endcate = Math.min(pagecate * numperpagecate, sizecate);
        List<Category> listcategory = db1.getListByPage(listcate, startcate, endcate);
        request.setAttribute("listcate", listcategory);
        request.setAttribute("numcate", numcate);
        
        request.getRequestDispatcher("admin.jsp").forward(request, response);
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
