/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kedar
 */
public class NewServlet8 extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            int field1=Integer.parseInt(request.getParameter("t1"));
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/member database","root","");
            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            
            ResultSet rs =st.executeQuery("select * from duty_table where Duty_No="+field1);
            rs.first();
            PreparedStatement pst=con.prepareStatement("update bus set Status='Avaliable' where BusNo=?");
            pst.setString(1,rs.getString("BusNo"));
            out.print("1");
            int k=pst.executeUpdate();
            pst=con.prepareStatement("update member set MemberStatus ='Avaliable' where MemberName=?");
            pst.setString(1,rs.getString("DriverName"));
            out.print("2");
            k=pst.executeUpdate();
            pst=con.prepareStatement("update member set MemberStatus ='Avaliable' where MemberName=?");
            pst.setString(1,rs.getString("ConductorName"));
            out.print("3");
            k=pst.executeUpdate();
           PreparedStatement ps=con.prepareStatement("delete from duty_table where Duty_No=?");
           ps.setInt(1,field1);
           out.print("4");
            k=ps.executeUpdate();
            rs =st.executeQuery("select * from duty_table");
            List dt=new ArrayList();
            while(rs.next())
            {
            dt.add(rs.getInt("Sr.No")+":"+rs.getDate("Date")+":"+rs.getInt("Duty_No")+":"+rs.getString("BusNo")+":"+rs.getString("DriverName")+":"+rs.getString("ConductorName"));
            }
            request.setAttribute("sm", dt);
            request.getRequestDispatcher("newjsp8.jsp").forward(request, response);
            }catch(Exception e){out.println(e);}
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
        }catch(Exception e){}
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
        }catch(Exception e){}
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
