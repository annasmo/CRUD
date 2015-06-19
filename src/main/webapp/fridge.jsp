<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <form method="POST" action='FridgeController' name="frmAddProduct">
        ID uzytkownika: <input type="text" readonly="readonly" name="userid"
            value="<c:out value="${fridge.userid}" />" /> <br />
        ID produktu: <input type="text" readonly="readonly" name="productid"
            value="<c:out value="${fridge.productid}" />" /> <br /> 
        Nazwa produktu: <input
            type="text" name="ProductName"
            value="<c:out value="${fridge.ProductName}" />" /> <br /> 
         <input type="submit" value="Dodaj" />
    </form>

</body>
</html>