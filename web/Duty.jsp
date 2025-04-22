<%-- 
    Document   : Duty
    Created on : Mar 13, 2024, 5:20:29 PM
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
        <form method="post" action="NewServlet5">
            <header>
                <h1>Duty Form</h1>
            </header>
            <main>
                <table>
                <tr>
                    <th>
                        Duty No
                    </th>
                    <td><input type="text" name="t1"></td>
                </tr>
                 <tr>
                    <th>
                        Duty Name
                    </th>
                    <td><input type="text" name="t2"></td>
                </tr>
                 <tr>
                    <th>
                        Duty Type
                    </th>
                    <td><input type="radio" name="t3" value="Local">Local
                     <input type="radio" name="t3" value="Express">Express
                </tr>
                 <tr>
                    <th>
                        Destination
                    </th>
                    <td><input type="text" name="t4" ></td>
                </tr>
                <tr>
                    <th>
                        StartTime
                    </th>
                    <td><input type="text" name="t5" ></td>
                </tr>
                <tr>
                    <th>
                      Travel  Time
                   </th>
                    <td><input type="text" name="t6" ></td>
                </tr>
                </table>
                <input type="submit" value="submit">
            </main>
        </form>
    </center>
    </body>
</html>
