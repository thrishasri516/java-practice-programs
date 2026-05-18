<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    //HttpSession session = request.getSession();
    String user = (String) session.getAttribute("loggedInUser");

    if (user == null) {
        response.sendRedirect("login.jsp");
    }
%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to My Store</h1>
  <p>Hello, <%= session.getAttribute("name") %>!</p>

  <h2>Featured Products</h2>
  <ul>
    <li>Smartphone - ₹15,000</li>
    <li>Laptop - ₹55,000</li>
    <li>Headphones - ₹2,000</li>
  </ul>

  <a href="logout.jsp">Logout</a>

</body>
</html>