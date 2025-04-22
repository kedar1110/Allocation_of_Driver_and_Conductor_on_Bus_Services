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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kedar
 */
public class NewServlet9 extends HttpServlet {

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
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/member database","root","");
            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=st.executeQuery("select * from bus where Status='Avaliable' and BusType='Local'");
            List localbus=new ArrayList();
            while(rs.next())
            {
                localbus.add(rs.getString("BusNo"));
            }
            rs=st.executeQuery("select * from bus where Status='Avaliable' and BusType='Express'");
            List expressbus=new ArrayList();
            while(rs.next())
            {
                expressbus.add(rs.getString("BusNo"));
            }
            rs=st.executeQuery("select * from member where MemberType='Conductor' and MemberStatus='Avaliable' and DutyType='Local'");
            List localconductor=new ArrayList();
            while(rs.next())
            {
                localconductor.add(rs.getString("MemberName"));
            }
             rs=st.executeQuery("select * from member where MemberType='Conductor' and MemberStatus='Avaliable' and DutyType='Express'");
            List expressconductor=new ArrayList();
            while(rs.next())    
            {
                expressconductor.add(rs.getString("MemberName"));
            }
             rs=st.executeQuery("select * from member where MemberType='Driver'and MemberStatus='Avaliable' and DutyType='Express'");
            List expressdriver=new ArrayList();
            while(rs.next())
            {
                expressdriver.add(rs.getString("MemberName"));
            }
             rs=st.executeQuery("select * from member where MemberType='Driver'and MemberStatus='Avaliable' and DutyType='Local'");
            List localdriver=new ArrayList();
            while(rs.next())
            {
                localdriver.add(rs.getString("MemberName"));
            }
            GregorianCalendar gc=new GregorianCalendar();
            String xx=gc.get(Calendar.YEAR)+"-"+(gc.get(Calendar.MONTH)+1)+"-"+(gc.get(Calendar.DAY_OF_MONTH)+1);
            java.sql.Date dt1=java.sql.Date.valueOf(xx);
            rs=st.executeQuery("select * from duty");
            while(rs.next())
            {
                String dtype=rs.getString("DutyType");
            if(dtype.equals("Local"))
            {
                try{
            PreparedStatement pst=con.prepareStatement("insert into duty_table(Date,Duty_No,BusNo,DriverName,ConductorName)values(?,?,?,?,?)");
            pst.setDate(1, dt1);
            pst.setInt(2, rs.getInt("DutyNo"));
            String p1=(String)localbus.get(0); 
            pst.setString(3,p1);
            pst.setString(4,(String)localdriver.get(0));
            pst.setString(5,(String)localconductor.get(0));
            int k=pst.executeUpdate();
            System.out.println("1");
            String st1="update bus set Status='Unavaliable' where BusNo=?";
            PreparedStatement ps=con.prepareStatement(st1);
            ps.setString(1,p1);
            k=ps.executeUpdate();
            st1="update member set MemberStatus='Unavaliable' where MemberName='"+(String)localdriver.get(0)+"'";
            ps=con.prepareStatement(st1);
            k=ps.executeUpdate();
            st1="update member set MemberStatus='Unavaliable' where MemberName='"+(String)localconductor.get(0)+"'";
            ps=con.prepareStatement(st1);
            k=ps.executeUpdate();
            localbus.remove(0);
            localdriver.remove(0);
            localconductor.remove(0);
            }catch(Exception e){}
            }
            else if(dtype.equals("Express"))
            {
                try{
            PreparedStatement pst=con.prepareStatement("insert into duty_table(Date,Duty_No,BusNo,DriverName,ConductorName)values(?,?,?,?,?)");
            pst.setDate(1, dt1);
            pst.setInt(2, rs.getInt("DutyNo"));
//            String p1=; 
            pst.setString(3,(String)expressbus.get(0));
            pst.setString(4,(String)expressdriver.get(0));
            pst.setString(5,(String)expressconductor.get(0));
            int k=pst.executeUpdate();
            System.out.println("1");
            String st1="update bus set Status='Unavaliable' where BusNo='"+(String) expressbus.get(0)+"'";
            PreparedStatement ps=con.prepareStatement(st1);
            //ps.setString(1,p1);
            k=ps.executeUpdate();
            st1="update member set MemberStatus='Unavaliable' where MemberName='"+(String) expressdriver.get(0)+"'";
            ps=con.prepareStatement(st1);
            k=ps.executeUpdate();
            st1="update member set MemberStatus='Unavaliable' where MemberName='"+(String) expressconductor.get(0)+"'";
            ps=con.prepareStatement(st1);
            k=ps.executeUpdate();
            expressbus.remove(0);
            expressdriver.remove(0);
            expressconductor.remove(0);
            }catch(Exception e){}
            }
            else 
            {
                try{
            PreparedStatement pst=con.prepareStatement("insert into duty_table(Date,Duty_No,BusNo,DriverName,ConductorName)values(?,?,?,?,?)");
            pst.setDate(1, dt1);
            pst.setInt(2, rs.getInt("DutyNo"));
            //String p1=; 
            pst.setString(3,(String)expressbus.get(0));
            pst.setString(4,(String)expressdriver.get(0));
            pst.setString(5," ");
            int k=pst.executeUpdate();
            System.out.println("1");
            String st1="update bus set Status='Unavaliable' where BusNo='"+(String)expressbus.get(0)+"'";
            PreparedStatement ps=con.prepareStatement(st1);
//            ps.setString(1,p1);
            k=ps.executeUpdate();
            st1="update member set MemberStatus='Unavaliable' where MemberName='"+(String)expressdriver.get(0)+"'";
            ps=con.prepareStatement(st1);
            k=ps.executeUpdate();
            expressbus.remove(0);
            expressdriver.remove(0);
            }catch(Exception e){}
            }
            }
            request.getRequestDispatcher("index.html").forward(request, response);
            }catch(Exception e){}
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
