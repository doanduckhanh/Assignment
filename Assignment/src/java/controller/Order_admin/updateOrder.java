/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Order_admin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAL.OrderDAO;
import java.sql.Date;
import model.Order;
/**
 *
 * @author khanh doan
 */
@WebServlet(name = "updateOrder", urlPatterns = {"/updateOrder"})
public class updateOrder extends HttpServlet {

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
            out.println("<title>Servlet updateOrder</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet updateOrder at " + request.getContextPath() + "</h1>");
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
        OrderDAO db = new OrderDAO();
        Order o =new Order();
        o=db.takeOrder(Integer.parseInt(id));
        
        request.setAttribute("order", o);
        request.getRequestDispatcher("updateOrder.jsp").forward(request, response);
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
        String cus = request.getParameter("cus");
        String book = request.getParameter("book");
        String start = request.getParameter("start");
        String end = request.getParameter("end");
        String status = request.getParameter("status");
        
        Order o = new Order();
        OrderDAO db = new OrderDAO();
        o.setOrid(Integer.parseInt(id));
        o.setCus(cus);
        o.setBook(book);
        o.setStart(Date.valueOf(start));
        o.setEnd(Date.valueOf(end));
        if(status.equalsIgnoreCase("1")){
            o.setStatus(true);
        } else {
            o.setStatus(false);
        }
        db.updateOrder(o);
        response.sendRedirect("admin");
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
