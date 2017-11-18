<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="style/menu.css" type="text/css"/>
<title>Insert title here</title>
</head>
<body>

<ul id="menu-bar">

 <li class="active"><a href="#">Online Banking System</a></li>
 <li ><a href="#">Home</a>
  <ul>
   <li><a href="index.jsp">Main Home</a></li>
   <li><a href="#"></a></li>
  </ul>
 </li>
 <li><a href="#">Existing User</a>
  <ul>
   <li><a href="Login.jsp">Login</a></li>
   <li><a href="#">Services Sub Menu 2</a></li>
   <li><a href="#">Services Sub Menu 3</a></li>
   <li><a href="#">Services Sub Menu 4</a></li>
  </ul>
 </li>

 <li><a href="#">Request to open an account</a></li>
 <li><a href="#">Contact Us</a></li>
 
<!--  <li><a href="Login.jsp">Logout</a> -->
</ul>

<%-- Welcome Mr.&nbsp;<b><s:property value="userName"/></b><br> --%>
</body>
</html>