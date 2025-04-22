<%-- 
    Document   : newjsp1
    Created on : Mar 11, 2024, 5:13:07 PM
    Author     : kedar
--%>

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
	<img src="images/img05.jpg" alt="" /><br>
</div>
        <form id="frm2" method="post" action="NewServlet3">
            <center>
                <br>
                <input type="submit" value="Display">
            </center>
        </form>
    </body>
</html>
