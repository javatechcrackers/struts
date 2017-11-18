<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="s" uri="/struts-tags"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="style/common.css" type="text/css"/>
<title>Insert title here</title>
</head>
<body>

<jsp:include page="Header.jsp"></jsp:include>

<b><i>Mr.&nbsp;<s:property value="userName"/></i></b>&nbsp;Your Password Has Been Changed Successfully...<br>
<a href="Login.jsp">Go to login page</a> 
<div id="footer">
<jsp:include page="Footer.jsp"></jsp:include>
</div>
</body>
</html>