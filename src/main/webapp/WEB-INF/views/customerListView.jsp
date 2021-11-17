<%@ page import="ir.maktabExcersice.models.Customer" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Java Developer
  Date: 11/12/2021
  Time: 7:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>list customer</title>
</head>
<body>
<h1>list of customers:</h1>
<% List<Customer> customerList = (List<Customer>) request.getAttribute("customerList");%>
<table>
    <tr>
        <th>ID</th>
        <th>FIRSTNAME</th>
        <th>LASTNAME</th>
        <th>EMAIL</th>
    </tr>
    <%
        for (Customer customer : customerList)
        {%>
<tr>
    <td><%= customer.getId()%></td>
    <td><%= customer.getFirstName()%></td>
    <td><%= customer.getLastName()%></td>
    <td><%= customer.getEmail()%></td>
</tr>

       <%
        }
    %>
</table>
</body>
</html>
