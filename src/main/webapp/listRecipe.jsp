<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Show All Recipes</title>
</head>
<body>
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
                    <td><c:out value="${recipe.recipeid}" /></td>
                    <td><c:out value="${recipe.recipename}" /></td>
                    <td><c:out value="${recipe.dishtype}" /></td>
                    <td><c:out value="${recipe.dishflavour}" /></td>
                    <td><c:out value="${recipe.dishdifficulty}" /></td>
                    <td><a href="RecipeController?action=edit&recipeid=<c:out value="${recipe.recipeid}"/>">Update</a></td>
                    <td><a href="RecipeController?action=delete&recipeid=<c:out value="${recipe.recipeid}"/>">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <p><a href="RecipeController?action=insert">Add Recipe</a></p>
</body>
</html>