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
<div id="header">
<jsp:include page="Header.jsp"></jsp:include>
</div>
<h2><s:property value="firstName"></s:property>&nbsp;your data is save successfully please choose user credential .</h2>
<s:form action="credential">
<s:textfield name="userName" key="User Name"></s:textfield>
<s:password name="password" key="Password"></s:password>
<s:password name="confirmPassword" key="Confirm Password"></s:password>
<s:submit label="Registration" method="completeRegister"></s:submit>

</s:form>
<div id="footer">
<jsp:include page="Footer.jsp"></jsp:include>
</div>
</body>
</html>