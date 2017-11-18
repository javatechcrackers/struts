<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="s" uri="/struts-tags"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style/common.css" type="text/css"/>
</head>
<body>

<jsp:include page="Header.jsp"></jsp:include>

<div align="center">
<s:form action="changepassword">
<s:password name="oldPassword" label="Enter Old Password"></s:password>
<s:password name="password" label="Choose New Password"></s:password>
<s:password name="confirmPassword" label="Confirm New Password"></s:password>
<s:submit method="changePassword" label="Change"></s:submit>
</s:form>
</div>
<div id="footer">
<jsp:include page="Footer.jsp"></jsp:include>
</div>
</body>
</html>