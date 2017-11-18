<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="style/common.css" type="text/css"/>

<title>Insert title here</title>
<script type="text/javascript">
function findselected(){ 
	var tansactionType = document.getElementById('tansactionType'); 
	var accountNo=document.getElementById("accountNo");
	var toaccountNo = document.getElementById('toaccountNo'); 
	(tansactionType.value == "03")? toaccountNo.disabled=false : toaccountNo.disabled=true ;
			(tansactionType.value == "02")? accountNo.disabled=true : accountNo.disabled=false ;
	} 
</script>
</head>
<body>
<div id="header">
<jsp:include page="Header.jsp"></jsp:include>
</div>
Welcome Mr.&nbsp;<b><s:property value="userName"/></b><br>
Your Account number is : &nbsp;<b><s:property value="accountNo"/></b><br>
<s:form action="Transaction">
<s:textfield name="accountNo" label="your Account Number" id= "accountNo"></s:textfield>

<s:select label="Select transaction type" name="tansactionType" id="tansactionType" headerkey="1" headerValue="Select" onchange="findselected()"  list="#{'01':'select','02':'deposit','03':'withdrow'} "></s:select>
<div id="trnsfer">
<s:textfield name="toaccountNo" label="To Account Number" id="toaccountNo"></s:textfield>
</div>
<s:textfield label="Enter Amount" name="amount"></s:textfield>
<s:submit label="confirm" method="accountTransaction"></s:submit>

</s:form>
</body>
</html>