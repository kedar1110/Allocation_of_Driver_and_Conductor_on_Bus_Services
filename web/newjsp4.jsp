<%-- 
    Document   : newjsp4
    Created on : Mar 13, 2024, 9:08:48 AM
    Author     : kedar
--%>

<%@page import="java.util.*"%>

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
        <h1>Bus List
        </h1>
    </center>
    <hr>
    <form id="frm2" method="post">
        <center>
            <%List dt=(List)request.getAttribute("sm");%>
            <center>
                <table width="600" border="2">
                    <tr>
                    <th>BusId</th>
                    <th>BusNo</th>
                    <th>BusRoute</th>
                    <th>BusCapacity</th>
                    <th>BusModel</th>
                    <th>Insurance</th>
                    <th>DepoName</th>
                    <th>Status</th>
                    <th>Bus Type</th>
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
        </center>
    </form>
    </body>
</html>
