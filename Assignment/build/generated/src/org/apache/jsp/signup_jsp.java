package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<title>Sign up Page Page</title>\n");
      out.write("\t<!--Bootstrap 4 CDN-->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/Signup-style.css\">\n");
      out.write("    <!--Fontawesome CDN-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\">\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!-- Responsive navbar-->\n");
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
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link active\" aria-current=\"page\" href=\"#!\">Home</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link active\" aria-current=\"page\" href=\"#!\">Login</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    <!-- Signup Form -->\n");
      out.write("    <section class=\"h-100 bg-dark\">\n");
      out.write("  <div class=\"container py-5 h-100\">\n");
      out.write("    <div class=\"row d-flex justify-content-center align-items-center h-100\">\n");
      out.write("      <div class=\"col\">\n");
      out.write("        <div class=\"card card-registration my-4\">\n");
      out.write("          <div class=\"row g-0\">\n");
      out.write("            <div class=\"col-xl-6 d-none d-xl-block\">\n");
      out.write("              <img\n");
      out.write("                src=\"https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/img4.webp\"\n");
      out.write("                alt=\"Sample photo\"\n");
      out.write("                class=\"img-fluid\"\n");
      out.write("                style=\"border-top-left-radius: .25rem; border-bottom-left-radius: .25rem;\"\n");
      out.write("              />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-6\">\n");
      out.write("              <div class=\"card-body p-md-5 text-black\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                  <div class=\"col-md-6 mb-4\">\n");
      out.write("                    <div class=\"form-outline\">\n");
      out.write("                      <input type=\"text\" id=\"form3Example1m\" class=\"form-control form-control-lg\" />\n");
      out.write("                      <label class=\"form-label\" for=\"form3Example1m\">First name</label>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-md-6 mb-4\">\n");
      out.write("                    <div class=\"form-outline\">\n");
      out.write("                      <input type=\"text\" id=\"form3Example1n\" class=\"form-control form-control-lg\" />\n");
      out.write("                      <label class=\"form-label\" for=\"form3Example1n\">Last name</label>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-outline mb-4\">\n");
      out.write("                  <input type=\"text\" id=\"form3Example8\" class=\"form-control form-control-lg\" />\n");
      out.write("                  <label class=\"form-label\" for=\"form3Example8\">Address</label>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"d-md-flex justify-content-start align-items-center mb-4 py-2\">\n");
      out.write("\n");
      out.write("                  <h6 class=\"mb-0 me-4\">Gender: </h6>\n");
      out.write("\n");
      out.write("                  <div class=\"form-check form-check-inline mb-0 me-4\">\n");
      out.write("                    <input\n");
      out.write("                      class=\"form-check-input\"\n");
      out.write("                      type=\"radio\"\n");
      out.write("                      name=\"inlineRadioOptions\"\n");
      out.write("                      id=\"femaleGender\"\n");
      out.write("                      value=\"option1\"\n");
      out.write("                    />\n");
      out.write("                    <label class=\"form-check-label\" for=\"femaleGender\">Female</label>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <div class=\"form-check form-check-inline mb-0 me-4\">\n");
      out.write("                    <input\n");
      out.write("                      class=\"form-check-input\"\n");
      out.write("                      type=\"radio\"\n");
      out.write("                      name=\"inlineRadioOptions\"\n");
      out.write("                      id=\"maleGender\"\n");
      out.write("                      value=\"option2\"\n");
      out.write("                    />\n");
      out.write("                    <label class=\"form-check-label\" for=\"maleGender\">Male</label>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <div class=\"form-check form-check-inline mb-0\">\n");
      out.write("                    <input\n");
      out.write("                      class=\"form-check-input\"\n");
      out.write("                      type=\"radio\"\n");
      out.write("                      name=\"inlineRadioOptions\"\n");
      out.write("                      id=\"otherGender\"\n");
      out.write("                      value=\"option3\"\n");
      out.write("                    />\n");
      out.write("                    <label class=\"form-check-label\" for=\"otherGender\">Other</label>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                  <div class=\"col-md-6 mb-4\">\n");
      out.write("\n");
      out.write("                    <select class=\"select\">\n");
      out.write("                      <option value=\"1\">State</option>\n");
      out.write("                      <option value=\"2\">Option 1</option>\n");
      out.write("                      <option value=\"3\">Option 2</option>\n");
      out.write("                      <option value=\"4\">Option 3</option>\n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-md-6 mb-4\">\n");
      out.write("\n");
      out.write("                    <select class=\"select\">\n");
      out.write("                      <option value=\"1\">City</option>\n");
      out.write("                      <option value=\"2\">Option 1</option>\n");
      out.write("                      <option value=\"3\">Option 2</option>\n");
      out.write("                      <option value=\"4\">Option 3</option>\n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-outline mb-4\">\n");
      out.write("                  <input type=\"text\" id=\"form3Example9\" class=\"form-control form-control-lg\" />\n");
      out.write("                  <label class=\"form-label\" for=\"form3Example9\">DOB</label>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-outline mb-4\">\n");
      out.write("                  <input type=\"text\" id=\"form3Example90\" class=\"form-control form-control-lg\" />\n");
      out.write("                  <label class=\"form-label\" for=\"form3Example90\">Pincode</label>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-outline mb-4\">\n");
      out.write("                  <input type=\"text\" id=\"form3Example99\" class=\"form-control form-control-lg\" />\n");
      out.write("                  <label class=\"form-label\" for=\"form3Example99\">Course</label>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-outline mb-4\">\n");
      out.write("                  <input type=\"text\" id=\"form3Example97\" class=\"form-control form-control-lg\" />\n");
      out.write("                  <label class=\"form-label\" for=\"form3Example97\">Email ID</label>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"d-flex justify-content-end pt-3\">\n");
      out.write("                  <button type=\"button\" class=\"btn btn-light btn-lg\">Reset all</button>\n");
      out.write("                  <button type=\"button\" class=\"btn btn-warning btn-lg ms-2\">Submit form</button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("</body>\n");
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
