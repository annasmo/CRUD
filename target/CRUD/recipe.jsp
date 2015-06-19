<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link type="text/css"
    href="css/ui-lightness/jquery-ui-1.8.18.custom.css" rel="stylesheet" />
<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.8.18.custom.min.js"></script>
<title>Add new recipe</title>
</head>
<body>
    <script>
        $(function() {
            $('input[name=dob]').datepicker();
        });
    </script>

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
            value="<c:out value="${recipe.dishflavour}" />" /> <br /> <input
            type="submit" value="Submit" />
    </form>
</body>
</html>