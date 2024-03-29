package org.apache.jsp.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updateCus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Profile</title>\n");
      out.write("        <!--Bootstrap 4 CDN-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("    <!-- Custom Stylesheet -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/Signup-style.css\">\n");
      out.write("    <!--Fontawesome CDN-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\">\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <!-- State/City -->   \n");
      out.write("    <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js'></script>\n");
      out.write("    <script src='https://cdn.jsdelivr.net/gh/vietblogdao/js/districts.min.js'></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Responsive navbar-->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("            <div class=\"container px-5\">\n");
      out.write("                <a href=\"#\" class=\"navbar-brand has-logo\">\n");
      out.write("                    <span class=\"logo d-inline\">\n");
      out.write("                        <img src=\"https://cdn.discordapp.com/attachments/387267441245552642/942414648764944424/unknown.png\" height=\"40\" width=\"110\" alt=\"reading\">\n");
      out.write("                    </span>\n");
      out.write("                </a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"><span class=\"navbar-toggler-icon\"></span></button>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    <!-- Signup Form -->\n");
      out.write("    <section class=\"h-100 bg-dark\">\n");
      out.write("    <div class=\"container py-5 h-100\">\n");
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
      out.write("              <!-- Form -->\n");
      out.write("            <div class=\"col-xl-6\">\n");
      out.write("              <form action=\"updateCustomer\" method=\"post\">\n");
      out.write("              <div class=\"card-body p-md-5 text-black\">\n");
      out.write("                <div class=\"form-outline mb-4\">\n");
      out.write("                    <input type=\"text\" id=\"form3Example8\" class=\"form-control form-control-lg\" name=\"fullname\"/>\n");
      out.write("                    <label class=\"form-label\" for=\"form3Example8\">Họ và tên</label>\n");
      out.write("                </div>\n");
      out.write("                  \n");
      out.write("                <div class=\"form-outline mb-4\">\n");
      out.write("                    <input type=\"text\" id=\"form3Example8\" class=\"form-control form-control-lg\" name=\"address\"/>\n");
      out.write("                    <label class=\"form-label\" for=\"form3Example8\">Địa chỉ</label>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <select name=\"calc_shipping_provinces\" required=\"\">\n");
      out.write("                <option value=\"\">Provinces</option>\n");
      out.write("                </select>\n");
      out.write("                <select name=\"calc_shipping_district\" required=\"\">\n");
      out.write("                <option value=\"\">District</option>\n");
      out.write("                </select>\n");
      out.write("                <input class=\"billing_address_1\" name=\"city\" type=\"hidden\" value=\"\">\n");
      out.write("                <input class=\"billing_address_2\" name=\"state\" type=\"hidden\" value=\"\">\n");
      out.write("                <div class=\"d-md-flex justify-content-start align-items-center mb-4 py-2\">\n");
      out.write("\n");
      out.write("                  <h6 class=\"mb-0 me-4\">Giới tính </h6>\n");
      out.write("                  <br> \n");
      out.write("                  <div class=\"form-check form-check-inline mb-0 me-4\">\n");
      out.write("                    <input\n");
      out.write("                      class=\"form-check-input\"\n");
      out.write("                      type=\"radio\"\n");
      out.write("                      name=\"gender\"\n");
      out.write("                      id=\"femaleGender\"\n");
      out.write("                      value=\"1\"\n");
      out.write("                    />\n");
      out.write("                    <label class=\"form-check-label\" for=\"femaleGender\">Nam</label>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <div class=\"form-check form-check-inline mb-0 me-4\">\n");
      out.write("                    <input\n");
      out.write("                      class=\"form-check-input\"\n");
      out.write("                      type=\"radio\"\n");
      out.write("                      name=\"gender\"\n");
      out.write("                      id=\"maleGender\"\n");
      out.write("                      value=\"0\"\n");
      out.write("                    />\n");
      out.write("                    <label class=\"form-check-label\" for=\"maleGender\">Nữ</label>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-outline mb-4\">\n");
      out.write("                    <input type=\"text\" id=\"form3Example9\" class=\"form-control form-control-lg\" name=\"dob\"/>\n");
      out.write("                    <label class=\"form-label\" for=\"form3Example9\">Ngày sinh</label>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-outline mb-4\">\n");
      out.write("                    <input type=\"text\" id=\"form3Example90\" class=\"form-control form-control-lg\" name=\"phone\"/>\n");
      out.write("                  <label class=\"form-label\" for=\"form3Example90\">SDT</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-outline mb-4\">\n");
      out.write("                    <input type=\"text\" id=\"form3Example97\" class=\"form-control form-control-lg\" name=\"email\"/>\n");
      out.write("                    <label class=\"form-label\" for=\"form3Example97\">Email</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"d-flex justify-content-end pt-3\">\n");
      out.write("                  <button type=\"submit\" class=\"btn btn-warning btn-lg ms-2\">Submit</button>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              </form>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<script>//<![CDATA[\n");
      out.write("if (address_2 = localStorage.getItem('address_2_saved')) {\n");
      out.write("  $('select[name=\"calc_shipping_district\"] option').each(function() {\n");
      out.write("    if ($(this).text() == address_2) {\n");
      out.write("      $(this).attr('selected', '')\n");
      out.write("    }\n");
      out.write("  })\n");
      out.write("  $('input.billing_address_2').attr('value', address_2)\n");
      out.write("}\n");
      out.write("if (district = localStorage.getItem('district')) {\n");
      out.write("  $('select[name=\"calc_shipping_district\"]').html(district)\n");
      out.write("  $('select[name=\"calc_shipping_district\"]').on('change', function() {\n");
      out.write("    var target = $(this).children('option:selected')\n");
      out.write("    target.attr('selected', '')\n");
      out.write("    $('select[name=\"calc_shipping_district\"] option').not(target).removeAttr('selected')\n");
      out.write("    address_2 = target.text()\n");
      out.write("    $('input.billing_address_2').attr('value', address_2)\n");
      out.write("    district = $('select[name=\"calc_shipping_district\"]').html()\n");
      out.write("    localStorage.setItem('district', district)\n");
      out.write("    localStorage.setItem('address_2_saved', address_2)\n");
      out.write("  })\n");
      out.write("}\n");
      out.write("$('select[name=\"calc_shipping_provinces\"]').each(function() {\n");
      out.write("  var $this = $(this),\n");
      out.write("    stc = ''\n");
      out.write("  c.forEach(function(i, e) {\n");
      out.write("    e += +1\n");
      out.write("    stc += '<option value=' + e + '>' + i + '</option>'\n");
      out.write("    $this.html('<option value=\"\">Tỉnh / Thành phố</option>' + stc)\n");
      out.write("    if (address_1 = localStorage.getItem('address_1_saved')) {\n");
      out.write("      $('select[name=\"calc_shipping_provinces\"] option').each(function() {\n");
      out.write("        if ($(this).text() == address_1) {\n");
      out.write("          $(this).attr('selected', '')\n");
      out.write("        }\n");
      out.write("      })\n");
      out.write("      $('input.billing_address_1').attr('value', address_1)\n");
      out.write("    }\n");
      out.write("    $this.on('change', function(i) {\n");
      out.write("      i = $this.children('option:selected').index() - 1\n");
      out.write("      var str = '',\n");
      out.write("        r = $this.val()\n");
      out.write("      if (r != '') {\n");
      out.write("        arr[i].forEach(function(el) {\n");
      out.write("          str += '<option value=\"' + el + '\">' + el + '</option>'\n");
      out.write("          $('select[name=\"calc_shipping_district\"]').html('<option value=\"\">Quận / Huyện</option>' + str)\n");
      out.write("        })\n");
      out.write("        var address_1 = $this.children('option:selected').text()\n");
      out.write("        var district = $('select[name=\"calc_shipping_district\"]').html()\n");
      out.write("        localStorage.setItem('address_1_saved', address_1)\n");
      out.write("        localStorage.setItem('district', district)\n");
      out.write("        $('select[name=\"calc_shipping_district\"]').on('change', function() {\n");
      out.write("          var target = $(this).children('option:selected')\n");
      out.write("          target.attr('selected', '')\n");
      out.write("          $('select[name=\"calc_shipping_district\"] option').not(target).removeAttr('selected')\n");
      out.write("          var address_2 = target.text()\n");
      out.write("          $('input.billing_address_2').attr('value', address_2)\n");
      out.write("          district = $('select[name=\"calc_shipping_district\"]').html()\n");
      out.write("          localStorage.setItem('district', district)\n");
      out.write("          localStorage.setItem('address_2_saved', address_2)\n");
      out.write("        })\n");
      out.write("      } else {\n");
      out.write("        $('select[name=\"calc_shipping_district\"]').html('<option value=\"\">Quận / Huyện</option>')\n");
      out.write("        district = $('select[name=\"calc_shipping_district\"]').html()\n");
      out.write("        localStorage.setItem('district', district)\n");
      out.write("        localStorage.removeItem('address_1_saved', address_1)\n");
      out.write("      }\n");
      out.write("    })\n");
      out.write("  })\n");
      out.write("})\n");
      out.write("//]]></script>\n");
      out.write("<!-- Bootstrap core JS-->\n");
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
