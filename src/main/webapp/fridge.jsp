<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>TheFridge</title>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <link rel="stylesheet" href="./style.css" type="text/css">
</head>

<body>
	<header>
	<h1>Fridge content</h1>
	</header>

	<div id="center" style="text-align:center;" name="interfejs">
		<div id="menu_place" name="panel_sterowania">
			<div id="pole_batona">
				<p><a id="odsylacz" href="RecipeController?action=insert">Add Recipe</a></p>
				<!--<input type="submit" value="Add recipe" name="Add_recipe">-->
			</div>
			<div id="pole_batona" style="top:90px;">
				<p><a id="odsylacz" href="FridgeController?action=insert">Add Product</a></p>
			</div>
			<div id="pole_batona" style="top:160px;">
				<p><a id="odsylacz" href="FridgeController?action=listFridge">Show all Products</a></p>
			</div>
			<div id="pole_batona" style="top:230px;">
				<p><a id="odsylacz" href="RecipeController?action=listRecipe">Show all Recipes</a></p>
			</div>
			<div id="pole_batona" style="top:300px;">
				<p><a id="odsylacz" href="RecipeController?action=insert">Other operation</a></p>
			</div>
			<div id="pole_batona" style="top:370px;">
				<p><a id="odsylacz" href="RecipeController?action=insert">Other operation</a></p>
			</div>
		</div>
		<div id="robocza"><center>

			<form method="POST" action='FridgeController' name="frmAddProduct">
				Recipe ID : <input type="text" readonly="readonly" name="productId"
								   value="${fridge.productID}" /> <br />
				Name : <input
					type="text" name="name"
					value="<c:out value="${fridge.name}" />" /> <br />
				Type : <input
					type="text" name="amount"
					value="<c:out value="${fridge.amount}" />" /> <br />
				Difficulty : <input
					type="text" name="userID"
					value="<c:out value="${fridge.userID}" />" /> <br />

				<input type="submit" value="Add" />
			</form>

		</center></div>
	</div>

	<footer style="margin-top:40px;">
	Copyright - Team4 
	</footer>

</body>

</html>
