<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<% 
	
	String moduleName = (String)request.getSession().getAttribute("moduleName");
%> 
<body>
  对不起!你无权访问<%=moduleName %>页面！
</body>
</html>