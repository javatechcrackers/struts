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
<h3>Account Registration Form</h3>

<s:form action="resister">
<s:textfield name="firstName" label="First Name"></s:textfield>
<s:textfield name="lastName" label="Last Name"></s:textfield>
<s:radio name="gender" label="Gender" list="#{'1':'Male','2':'Female'}" value="2"></s:radio>
<s:textfield name="mobileNo" label="Mobile Number"></s:textfield>
<s:textfield name="occupation" label="Occupation"></s:textfield>
<s:textarea name="address" label="Address"></s:textarea>
<s:textarea name="officeAddress" label="Office Address"></s:textarea>
<s:submit value="Register" method="resister"></s:submit>
</s:form>

<div id="footer">
<jsp:include page="Footer.jsp"></jsp:include>
</div>
</body>
</html>