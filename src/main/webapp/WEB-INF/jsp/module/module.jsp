<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 模块测试 </title>
</head>
<% 
	/* String path = request.getContextPath(); 
	System.out.println("path:" +path);
	String servletPath = request.getServletPath(); 
	System.out.println("servletPath:" +servletPath);
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	System.out.println("basePath:" +basePath);
	String requestURI = request.getRequestURI();
	System.out.println("requestURI:" + requestURI);
	String requestUrl = request.getRequestURL().toString();
	System.out.println("requestUrl:" + requestUrl);
	String queryString = request.getQueryString();
	System.out.println("queryString:" + queryString);
	String realPath = request.getRealPath("");
	System.out.println("realPath:" + realPath);
	System.out.println("realPath/:" + request.getRealPath("/")); */
	
	String moduleName = (String)request.getSession().getAttribute("moduleName");
%> 
<body>
  这是 <%=moduleName%> 页面！
</body>
</html>