package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login Page</title>\n");
      out.write("\t<!--Bootstrap 4 CDN-->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("        <!-- Custom Style -->    \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style-login.css\">\n");
      out.write("        <!--Fontawesome CDN-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\">\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url(Img/login.jpg)\">\n");
      out.write("        ");

            String username = (String)request.getAttribute("username");
            String password = (String)request.getAttribute("password");
        
      out.write("\n");
      out.write("        <!-- Responsive navbar-->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("            <div class=\"container px-5\">\n");
      out.write("                <a href=\"#\" class=\"navbar-brand has-logo\">\n");
      out.write("                    <span class=\"logo d-inline\">\n");
      out.write("                        <img src=\"https://cdn.discordapp.com/attachments/387267441245552642/942414648764944424/unknown.png\" height=\"40\" width=\"110\" alt=\"reading\">\n");
      out.write("                    </span>\n");
      out.write("                </a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"><span class=\"navbar-toggler-icon\"></span></button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link active\" aria-current=\"page\" href=\"index.jsp\">Home</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!-- Form login -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("\t<div class=\"d-flex justify-content-center h-100\">\n");
      out.write("\t\t<div class=\"card\">\n");
      out.write("\t\t\t<div class=\"card-header\">\n");
      out.write("\t\t\t\t<h3>Log In</h3>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"card-body\">\n");
      out.write("                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.err==1?\"Failed to username or password\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <br/>\n");
      out.write("                                <form action=\"Login\" method=\"post\">\n");
      out.write("\t\t\t\t\t<div class=\"input-group form-group\">\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group-prepend\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"input-group-text\"><i class=\"fas fa-user\"></i></span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                ");

                                                    if(username!=null){
                                                
      out.write("\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" placeholder=\"username\" name=\"username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                                ");
 } else {
      out.write("\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" placeholder=\"username\" name=\"username\">\n");
      out.write("                                                ");
 } 
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"input-group form-group\">\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group-prepend\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"input-group-text\"><i class=\"fas fa-key\"></i></span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                ");

                                                    if(password!=null){
                                                
      out.write("\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" placeholder=\"password\" name=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                                ");
 } else {
      out.write("\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" placeholder=\"password\" name=\"password\">\n");
      out.write("                                                ");
 } 
      out.write("\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"row align-items-center remember\">\n");
      out.write("                                            <input type=\"checkbox\" name=\"remember\">Remember Me\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                    <div>\n");
      out.write("                                        <select name=\"role\" id=\"role\"> \n");
      out.write("                                            <option value=\"user\">User</option>\n");
      out.write("                                            <option value=\"admin\">Admin</option>\n");
      out.write("                                            <option value=\"mod\">Moderator</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Login\" class=\"btn float-right login_btn\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"card-footer\">\n");
      out.write("\t\t\t\t<div class=\"d-flex justify-content-center links\">\n");
      out.write("\t\t\t\t\tDon't have an account?<a href=\"signup.jsp\">Sign Up</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"d-flex justify-content-center\">\n");
      out.write("\t\t\t\t\t<a href=\"forgotpass.html\">Forgot your password?</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("        </div>\n");
      out.write("        <footer class=\"py-5 bg-dark\">\n");
      out.write("            <div class=\"container px-4 px-lg-5\"><p class=\"m-0 text-center text-white\">Copyright &copy; Your Website 2021</p></div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- Bootstrap core JS-->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <!-- Core theme JS-->\n");
      out.write("        <script src=\"js/scripts.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
