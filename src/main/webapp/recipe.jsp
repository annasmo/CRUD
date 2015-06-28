<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<link type="text/css"
		href="css/ui-lightness/jquery-ui-1.8.18.custom.css" rel="stylesheet" />
	<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
	<script type="text/javascript" src="js/jquery-ui-1.8.18.custom.min.js"></script>
  <title>TheFridge</title>
  <link rel="stylesheet" href="./style.css" type="text/css">
</head>

<body>

	<script>
        $(function() {
            $('input[name=dob]').datepicker();
        });
    </script>
	
	<header>
	<h1>Add recipe</h1>
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
			
			<form method="POST" action='RecipeController' name="frmAddRecipe">
				Recipe ID : <input type="text" readonly="readonly" name="recipeid"
					value="<c:out value="${recipe.recipeid}" />" /> <br /> 
				Name : <input
					type="text" name="dishname"
					value="<c:out value="${recipe.dishname}" />" /> <br /> 
				Type : <input
					type="text" name="dishtype"
					value="<c:out value="${recipe.dishtype}" />" /> <br /> 
				Difficulty : <input
					type="text" name="dishdifficulty"
					value="<c:out value="${recipe.dishdifficulty}" />" /> <br />  
				Flavour : <input type="text" name="dishflavour"
					value="<c:out value="${recipe.dishflavour}" />" /> <br /> 
				<input type="submit" value="Add" />
			</form>
		</center></div>
	</div>

	<footer style="margin-top:40px;">
	Copyright - Team4 
	</footer>

</body>

</html>
