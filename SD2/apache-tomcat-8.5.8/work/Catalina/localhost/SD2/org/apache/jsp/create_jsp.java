/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.8
 * Generated at: 2016-12-18 22:51:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class create_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1478207702000L));
    _jspx_dependants.put("jar:file:/Users/ritaalmeida/SD_Proj/SD2/apache-tomcat-8.5.8/webapps/SD2/WEB-INF/lib/struts2-core.jar!/META-INF/struts-tags.tld", Long.valueOf(1430895926000L));
    _jspx_dependants.put("/WEB-INF/lib/struts2-core.jar", Long.valueOf(1479945324000L));
    _jspx_dependants.put("jar:file:/Users/ritaalmeida/SD_Proj/SD2/apache-tomcat-8.5.8/webapps/SD2/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425978670000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <title>Create Auction</title>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/demo.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/header-second-bar.css\">\n");
      out.write("    <div class=\"header-two-bars\">\n");
      out.write("\n");
      out.write("        <div class=\"header-first-bar\">\n");
      out.write("\n");
      out.write("            <div class=\"header-limiter\">\n");
      out.write("\n");
      out.write("                <h1><a href=\"#\">I<span>bei</span></a></h1>\n");
      out.write("\n");
      out.write("                <nav>\n");
      out.write("                    <div class=\"button\">\n");
      out.write("                        <form action=\"createpage\">\n");
      out.write("                            <button type=\"submit\">Send Message</button>\n");
      out.write("                        </form>\n");
      out.write("                        <form action=\"createpage\">\n");
      out.write("                            <button type=\"submit\">My Messages</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("                <div class=\"buttonLog\">\n");
      out.write("                    <form action=\"logout\">\n");
      out.write("                        <button type=\"submit\">Logout</button>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                    <form id=\"facebook_form\" method=\"post\"></form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"header-second-bar\">\n");
      out.write("\n");
      out.write("            <div class=\"header-limiter\">\n");
      out.write("                <h2><a href=\"#\">Welcome ");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("</a></h2>\n");
      out.write("\n");
      out.write("                <div class=\"button\">\n");
      out.write("\n");
      out.write("                    <form action=\"searchpage\">\n");
      out.write("                        <button type=\"submit\">Search Auction</button>\n");
      out.write("                    </form>\n");
      out.write("                    <form action=\"detailpage\">\n");
      out.write("                        <button type=\"submit\">Detail Auction</button>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"menu\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <h1>Ibei - the best way to make easy money</h1>\n");
      out.write("    <nav>\n");
      out.write("        <div class=\"button\">\n");
      out.write("\n");
      out.write("            <form action=\"createpage\">\n");
      out.write("                <button type=\"submit\">New Auction</button>\n");
      out.write("            </form>\n");
      out.write("            <form action=\"searchpage\">\n");
      out.write("                <button type=\"submit\">Search Auction</button>\n");
      out.write("            </form>\n");
      out.write("            <form action=\"detailpage\">\n");
      out.write("                <button type=\"submit\">Detail Auction</button>\n");
      out.write("            </form>\n");
      out.write("            <form action=\"myauctions\">\n");
      out.write("                <button type=\"submit\">My Auctions</button>\n");
      out.write("            </form>\n");
      out.write("            <form action=\"createbidpage\">\n");
      out.write("                <button type=\"submit\">Create Bid</button>\n");
      out.write("            </form>\n");
      out.write("            <form action=\"editauctionpage\">\n");
      out.write("                <button type=\"submit\">Edit Auction</button>\n");
      out.write("            </form>\n");
      out.write("            <form action=\"messageauctionpage\">\n");
      out.write("                <button type=\"submit\">Message Auction</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"info\">\n");
      out.write("        <form action=\"createauction\" method=\"post\">\n");
      out.write("            <p><strong>Insira o codigo do artigo:</strong></p>\n");
      out.write("            <input id=\"code\" type=\"number\" class=\"form-control\" placeholder=\"Code\" name=\"Code\" required/><br>\n");
      out.write("            <p><strong>Insira o titulo do leilao:</strong></p>\n");
      out.write("            <input id=\"title\" type=\"text\" class=\"form-control\" placeholder=\"Title\" name=\"Title\" required/><br>\n");
      out.write("            <p><strong>Insira a descricao do leilao:</strong></p>\n");
      out.write("            <input id=\"description\" type=\"text\" class=\"form-control\" placeholder=\"Description\" name=\"Description\"/><br>\n");
      out.write("            <p><strong>Insira valor do leilao:</strong></p>\n");
      out.write("            <input id=\"amount\" type=\"number\" class=\"form-control\" placeholder=\"Amount\" name=\"Amount\" required/><br>\n");
      out.write("            <p><strong>Insira a data de conclusão:</strong></p>\n");
      out.write("            <input id=\"datalimite\" type=\"datetime-local\" class=\"form-control\" placeholder=\"DataLimite\" name=\"Datalimite\" required/><br>\n");
      out.write("            <p></p>\n");
      out.write("            <input type=\"submit\" class=\"btn btn-primary\" method=\"execute\" value=\"Create Auction\">\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script src=\"js/social.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    window.onload = change_button_on_load(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getUser().getIdFacebook()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(");\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent(null);
      // /create.jsp(52,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getUser().getName()}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    }
    return false;
  }
}
