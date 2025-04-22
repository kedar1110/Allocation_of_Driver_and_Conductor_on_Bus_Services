/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kedar
 */
public class NewServlet5 extends HttpServlet {

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
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            int field1=Integer.parseInt(request.getParameter("t1"));
            String field2=request.getParameter("t2");
            String field3=request.getParameter("t3");
            String field4=request.getParameter("t4");
            float field5=Float.parseFloat(request.getParameter("t5"));
            float field6=Float.parseFloat(request.getParameter("t6"));
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/member database","root","");
            PreparedStatement pst=con.prepareStatement("insert into duty(DutyNo,DutyName,DutyType,Destination,StartTime,TravelTime)values(?,?,?,?,?,?)");
            pst.setInt(1,field1);
            pst.setString(2,field2);
            pst.setString(3,field3);
            pst.setString(4,field4);
            pst.setFloat(5,field5);
            pst.setFloat(6,field6);
            
            int k=pst.executeUpdate();
            out.println("<h1>Saved</h1>");

            }catch(Exception ee){out.println(ee);}
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
        try{
         processRequest(request, response);
        }catch(Exception ee){}
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
        try{
         processRequest(request, response);
        }catch(Exception ee){}
       
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
