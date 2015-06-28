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
	<h1>All recipes</h1>
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
			
			<table border=1>
				<thead>
					<tr>
						<th>Recipe ID</th>
						<th>Name</th>
						<th>Type</th>
						<th>Flavour</th>
						<th>Difficulty</th>
						<th colspan=2>Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${recipes}" var="recipe">
						<tr>
							<td><c:out value="${recipe.recipeId}"/></td>
							<td><c:out value="${recipe.name}"/></td>
							<td><c:out value="${recipe.type}"/></td>
							<td><c:out value="${recipe.flavour}"/></td>
							<td><c:out value="${recipe.difficulty}"/></td>
							<td><a id="odsylacz" href="RecipeController?action=edit&recipeId=<c:out value="${recipe.recipeId}"/>">Update</a>
							</td>
							<td><a id="odsylacz" href="RecipeController?action=delete&recipeId=<c:out value="${recipe.recipeId}"/>">Delete</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</center></div>
	</div>

	<footer style="margin-top:40px;">
	Copyright - Team4 
	</footer>

</body>

</html>
