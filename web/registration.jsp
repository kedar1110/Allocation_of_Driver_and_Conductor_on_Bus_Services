<%-- 
    Document   : registration.html
    Created on : Mar 4, 2024, 7:40:29 PM
    Author     : kedar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body>
            <center>
        <header>
        <h2>Member Registration</h2>
    </header>
</center>
    <main>
        <center>
            <form method="post"  action="NewServlet1">
                <table>
                    <tr>
                        <th>Member Name</th>
                        <td><input type="text" name="t1" required></td>
                    </tr>
                    <tr>
                        <th>Member Type</th>
                        <td><input type="radio" name="t2" value="Driver" required>Driver
                            <input type="radio" name="t2" value="Conductor" required>Conductor</td>
                    </tr>
                <tr>
                    <th>
                        Duty Type
                    </th>
                    <td><input type="radio" name="t3" value="Local" required>Local
                     <input type="radio" name="t3" value="Express" required>Express</td>
                </tr>
                    <tr>
                        <th>Licence No</th>
                        <td><input type="text" name="t4" required></td>
                    </tr>
                    <tr>
                        <th>Addhar Card No</th>
                        <td><input type="text" name="t5" required></td>
                    </tr>
                    <tr>
                        <th>Address</th>
                        <td><input type="text" name="t6" required></td>
                    </tr>
                    <tr>
                        <th>Contact No</th>
                        <td><input type="tel" name="t7" required></td>
                    </tr>
                    <tr>
                        <th>UserName</th>
                        <td><input type="text" name="t8" required></td>
                    </tr>
                    <tr>
                        <th>Password</th>
                        <td><input type="password" name="t9" required></td>
                    </tr>
                    <tr>
                        <th>Confirm Password</th>
                        <td><input type="password" name="t10" required></td>
                    </tr>
                </table>
                <input type="submit" value="Submit">
            </form>
        </center>
    </main>
    </body>
</html>
