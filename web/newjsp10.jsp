  <%-- 
    Document   : newjsp10
    Created on : Mar 31, 2024, 1:09:07 PM
    Author     : kedar
--%>

<%@page import="java.util.StringTokenizer"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
                <meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Duty Disallocation</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="style.css" rel="stylesheet" type="text/css" media="screen" />
</head>
    <body>
        <div id="menu">
	<ul>
		<li><a href="index1.jsp">Home</a></li>
                <li><a href="newjsp9.jsp">Duty View</a></li>
                <li><a href="About1.jsp">About</a></li>
                <li><a href="Contact1.jsp">Contact</a></li>
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
        <h1>Duty List
        </h1>
    </center>
    <hr>
    <form id="frm2" method="post">
        <center>
            <%List dt=(List)request.getAttribute("st");%>
            <center>
                <table width="600" border="2">
                    <tr>
                    
                    <th>Date</th>
                    <th>Duty No</th>
                    <th>Bus No</th>
                     <th>Driver Name</th>
                    <th>Conductor Name</th>
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
