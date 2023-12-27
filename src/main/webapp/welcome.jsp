<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	body {  
    background-color: #f4f4f4;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    margin: 0;
}

.success-container {
    background-color: #fff;
    padding: 20px;
    border-radius: 5px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    text-align: center;
}

.success-container h1 {
    color: #4CAF50;
}

.success-container a {
    display: inline-block;
    margin-top: 20px;
    padding: 10px 15px;
    background-color: #008CBA;
    color: white;
    border-radius: 5px;
}

</style>
<body>
 <div class="success-container">
        <h1>Login Successful!</h1>
        <p>Welcome back! <%=request.getParameter("username") %></p>
        <a href="user.html">Click to go Home</a>
    </div>
</body>
</html>