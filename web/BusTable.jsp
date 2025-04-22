<%-- 
    Document   : BusTable
    Created on : Mar 5, 2024, 6:33:07 PM
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
		<li><a href="Allocaion.jsp">Duty Allotment</a></li>
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
        <header>
        <h2>Bus Information</h2>
    </header>
</center>
    <main>
        <center>
            <form method="post" action="NewServlet2">
                <table>
                    <tr>
                        <th>BusId</th>
                        <td><input type="text" name="t1"></td>
                    </tr>
                    <tr>
                        <th>BusNo</th>
                        <td><input type="text" name="t2"></td>
                    </tr>
                    <tr>
                        <th>Bus Route Name</th>
                        <td><input type="text" name="t3"></td>
                    </tr>
                    <tr>
                        <th>Bus Capacity</th>
                        <td><input type="radio" name="t4" value="32">32
                            <input type="radio" name="t4" value="40">40</td>
                    </tr>
                    <tr>
                        <th>Bus Model</th>
                        <td><input type="radio" name="t5" value="Ashok Leyland">Ashok Leyland
                            <input type="radio" name="t5" value="Tata">Tata</td>
                    </tr>
                    <tr>
                        <th>Bus Insurance Id</th>
                        <td><input type="text" name="t6"></td>
                    </tr>
                    <tr>
                        <th>Bus Depo-Name</th>
                        <td><input type="tel" name="t7"></td>
                    </tr>
                    <tr>
                        <th>Bus Type</th>
                        <td><input type="radio" name="t8" value="Local">Local
                            <input type="radio" name="t8" value="Express">Express</td>
                    </tr>

                </table>
                <input type="submit" value="submit">
            </form>
        </center>
    </main>
    </body>
</html>
