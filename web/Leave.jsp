<%-- 
    Document   : Leave
    Created on : Mar 30, 2024, 1:40:56 PM
    Author     : kedar
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.StringTokenizer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Collaboration by Free CSS Templates</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="style.css" rel="stylesheet" type="text/css" media="screen" />
    </head>
    <body>
        
        <div id="menu">
	<ul>
		<li><a href="index.html">Home</a></li>
		<li><a href="BusTable.jsp">Bus Registration</a></li>
		<li><a href="Duty.jsp">Duty Registration</a></li>
		<li><a href="#">Duty Allotment</a></li>
		<li><a href="newjsp7.jsp">Duty Disallocation</a></li>
                <li><a href="AboutUs.jsp">About</a></li>
                <li><a href="ContactUs.jsp">Contact</a></li>
	</ul>
</div>
<div id="logo">
	<h1><a href="#">MSRTC</a></h1>
	<h2>By Kedar Sharma</h2>
</div>
<div id="splash">
	<img src="images/img05.jpg" alt="" />
</div>
    <center>
        <h1>Member List
        </h1>
    </center>
    <hr>
    <form id="frm2" method="post" action="NewServlet11">
        <center>
            <%List dt=(List)request.getAttribute("st");%>
            <center>
                <table width="600" border="2">
                    <tr>
                    <th>Member Id</th>
                    <th>Member Name</th>
                    <th>Member Type</th>
                    <th>Duty Type</th>
                    <th>Member Licence</th>
                    <th>Addhar Card</th>
                    <th>Member Address</th>
                    <th>Member Contact</th>
                    <th>Member UserName</th>
                    <th>Member Status</th>
                    </tr>
                    <%for(Object p:dt){
                    String nm=(String)p;
                    StringTokenizer st=new StringTokenizer(nm,":");
                    %>
                    <tr>
                        <%
                        while(st.hasMoreTokens())
                        {
                            String field1=st.nextToken();
                            %>
                            <td><%=field1 %></td>
                    <%}%>    
                    </tr>
                    <%}%>
                </table> 
                <br>
            </center>
                <tr>
                    <th>
                    <td><input text="text" name="t1" placeholder="Member Id"><br>
                    <input type="submit" value="Leave"></td>
                    </th>
                </tr>
        </center>
    </form>
</body>
</html>
