package main.java.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.dao.RecipeDao;
import main.java.model.Recipe;

public class RecipeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String INSERT_OR_EDIT_RECIPE = "recipe.jsp";
    private static String LIST_RECIPE = "listRecipe.jsp";
    private RecipeDao dao;

    public RecipeController() {
        super();
        dao = new RecipeDao();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward="";
		String action = request.getParameter("action");
		System.out.println("a: " + action);
	    /*    if (action.equalsIgnoreCase("listRecipe")){
	        	 forward = LIST_RECIPE;   
	        }*/

		if (action!=null && action.equalsIgnoreCase("delete")){
			int recipeId = Integer.parseInt(request.getParameter("recipeId"));
			dao.deleteRecipe(recipeId);
			forward = LIST_RECIPE;
			request.setAttribute("recipes", dao.getAllRecipes());
		} else if (action!=null && action.equalsIgnoreCase("edit")){
			forward = INSERT_OR_EDIT_RECIPE;
			int recipeId = Integer.parseInt(request.getParameter("recipeId"));
			Recipe recipe = dao.getRecipeById(recipeId);
			request.setAttribute("recipe", recipe);
		} else if (action!=null && action.equalsIgnoreCase("listRecipe")){
			forward = LIST_RECIPE;
			request.setAttribute("recipes", dao.getAllRecipes());
		} else {
			forward = INSERT_OR_EDIT_RECIPE;
		}

		RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Recipe recipe = new Recipe();
		recipe.setName(request.getParameter("dishname"));
		recipe.setType(request.getParameter("dishtype"));
		recipe.setFlavour(request.getParameter("dishflavour"));
		recipe.setDifficulty(request.getParameter("dishdifficulty"));
		String recipeId = request.getParameter("recipeId");
		if(recipeId == null || recipeId.isEmpty())
		{
			dao.addRecipe(recipe);
		}
		else
		{
			recipe.setRecipeId(Integer.parseInt(recipeId));
			dao.updateRecipe(recipe);
		}

		RequestDispatcher view = request.getRequestDispatcher(LIST_RECIPE);
		request.setAttribute("recipes", dao.getAllRecipes());
		view.forward(request, response);
	}
}

