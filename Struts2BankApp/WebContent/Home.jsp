<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" href="style/common.css" type="text/css"/>
<title>Insert title here</title>
<script type="text/javascript">
<% 

response.setHeader("Cache-Control","no-cache"); // HTTP 1.1 
response.setHeader("Pragma","no-cache"); //HTTP 1.0 
response.setDateHeader ("Expires", 0); 
%> 

<script language="JavaScript"> 
var x=window.history.length; 
if (window.history[x]!=window.location) 
{ 
window.history.forward(); 
} 
</script> 

</head>
<body>

<jsp:include page="Header.jsp"></jsp:include>


Welcome Mr.&nbsp;<b><s:property value="userName"/></b><br>
Your Account Number is&nbsp;<b><s:property value="accountNo"/></b> <br>
<a href="<s:url action="user_transactionHome"/>">Fund transfer</a>  <br>
<a href="ChangePassword.jsp">Change Password</a><br>
<a href="">View Account Details</a><br> 
<a href="">Upadate Personal details</a><br>
<a href="">select language for page display</a>


<div id="footer">
<jsp:include page="Footer.jsp"></jsp:include>
</div>
</body>
</html>