<%-- 
    Document   : newjsp9
    Created on : Mar 31, 2024, 1:07:29 PM
    Author     : kedar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Duty</title>
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
        <form id="frm2" method="post" action="NewServlet15">
            <center>
                <input type="submit" value="Display">
            </center>
        </form>
    </body>
</html>
