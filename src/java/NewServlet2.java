/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kedar
 */
public class NewServlet2 extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            String x="Avaliable";
            int field1=Integer.parseInt(request.getParameter("t1"));
            String field2=request.getParameter("t2");
            String field3=request.getParameter("t3");
            int field4=Integer.parseInt(request.getParameter("t4"));
            String field5=request.getParameter("t5");
            String field6=request.getParameter("t6");
            String field7=request.getParameter("t7");
            String field8=request.getParameter("t8");
            
            try{
              Class.forName("com.mysql.jdbc.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/member database","root","");
               PreparedStatement pst=con.prepareStatement("insert into bus(BusId,BusNo,BusRoute,BusCapacity,BusModel,Insurance,DepoName,Status,BusType)values(?,?,?,?,?,?,?,?,?)");
               pst.setInt(1,field1);
               pst.setString(2,field2);
               pst.setString(3,field3);
               pst.setInt(4,field4);
               pst.setString(5,field5);
               pst.setString(6,field6);
               pst.setString(7,field7);
               pst.setString(8,x);
               pst.setString(9,field8);
               int k=pst.executeUpdate();
            out.println("<h1>Saved</h1>");
            }catch(Exception eee){out.println(eee);}
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
