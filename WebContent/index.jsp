<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome App</title>
<script type="text/javascript">
	function callAction(act) {
		frm.action = 'CentralController?action=' + act;
		frm.submit();
	}
</script>
</head>
<body>
<h1>This is My Welcome App!</h1>
	<form id="frm" method="post">
		<input type="text" name="userName" id="userName" /> 
		<input type="button" onClick="callAction('welcome')" value="Welcome" /><br />
		Number 1 :<input type="text" name="num1" id="num1" /> <br />
		Number 2:<input	type="text" name="num2" id="num2" /> <br />
		<input type="button" onClick="callAction('sum')" value="Perform Addition" /><br />
		<input type="submit" onClick="callAction('multiply')" value="Perform Multiplication" />
	</form>
</body>
</html>
