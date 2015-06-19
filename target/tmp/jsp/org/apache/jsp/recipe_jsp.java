package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class recipe_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n");
      out.write("<link type=\"text/css\"\r\n");
      out.write("    href=\"css/ui-lightness/jquery-ui-1.8.18.custom.css\" rel=\"stylesheet\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.7.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-ui-1.8.18.custom.min.js\"></script>\r\n");
      out.write("<title>Add new recipe</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <script>\r\n");
      out.write("        $(function() {\r\n");
      out.write("            $('input[name=dob]').datepicker();\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    <form method=\"POST\" action='RecipeController' name=\"frmAddRecipe\">\r\n");
      out.write("        Recipe ID : <input type=\"text\" readonly=\"readonly\" name=\"recipeid\"\r\n");
      out.write("            value=\"<c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${recipe.recipeid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\" /> <br /> \r\n");
      out.write("        Name : <input\r\n");
      out.write("            type=\"text\" name=\"dishname\"\r\n");
      out.write("            value=\"<c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${recipe.dishname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\" /> <br /> \r\n");
      out.write("        Type : <input\r\n");
      out.write("            type=\"text\" name=\"dishtype\"\r\n");
      out.write("            value=\"<c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${recipe.dishtype}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\" /> <br /> \r\n");
      out.write("        Difficulty : <input\r\n");
      out.write("            type=\"text\" name=\"dishdifficulty\"\r\n");
      out.write("            value=\"<c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${recipe.dishdifficulty}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\" /> <br />  \r\n");
      out.write("        Flavour : <input type=\"text\" name=\"dishflavour\"\r\n");
      out.write("            value=\"<c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${recipe.dishflavour}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\" /> <br /> <input\r\n");
      out.write("            type=\"submit\" value=\"Submit\" />\r\n");
      out.write("    </form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
