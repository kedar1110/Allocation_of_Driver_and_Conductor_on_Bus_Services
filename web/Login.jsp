<%-- 
    Document   : index
    Created on : Mar 4, 2024, 7:36:31 PM
    Author     : kedar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="description" content="" />
<link href="style.css" rel="stylesheet" type="text/css" media="screen" />
        <title>Login Page</title>
    </head>
    <body>
        <header>
        <div id="menu">
	<ul>
		<li><a href="index.html">Home</a></li>
		<li><a href="BusTable.jsp">Bus Registration</a></li>
		<li><a href="Duty.jsp">Duty Registration</a></li>
		<li><a href="Allocaion.jsp">Duty Allotment</a></li>
		<li><a href="newjsp7.jsp">Duty Disallocation</a></li>
                <li><a href="LeaveApply.jsp">Leave Alloaction</a></li>
		<li><a href="DisallocationLeave.jsp">Leave Release</a></li>
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
<hr />
    </header>
    <main>
        <center>
            <form method="post" action="NewServlet14">
            <table>
                <tr>
                    <th>UserName</th>
                    <td><input type="Text" name="t1"></td>
                </tr>
                <tr>
                    <th>Password</th>
                    <td><input type="password" name="t2"></td>
                </tr>
            </table>
            <input type="submit" value="submit">
            <br>
            <a href="./registration.jsp">New Registration</a>
            <br>
            
        </form>
        </center>
    </main>
    </body>
</html>
