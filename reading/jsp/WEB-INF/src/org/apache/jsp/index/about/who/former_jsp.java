package org.apache.jsp.index.about.who;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class former_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/includes/index/header.jsp");
    _jspx_dependants.add("/includes/index/../head_search.html");
    _jspx_dependants.add("/includes/common/analytics.htm");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("<html>\n<head><title>Former Perseus Staff</title>\n<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/hopper.css\"/>\n<script type=\"text/javascript\" src=\"/js/hopper.js\"></script>\n</head>\n<body>\n");
      out.write("<div id=\"header\">\n\t<a id=\"banner\" href=\"/hopper/\">\n\t</a>\n\t<div id=\"header_side\">\n\t\t");
      out.write("<form action=\"/hopper/searchresults\" class=\"search_form\" onsubmit=\"return validate_form(this,q);\">\n    <input name=\"q\" />\n    <input type=\"submit\" value=\"Search\" />\n    <p>(\"Agamemnon\", \"Hom. Od. 9.1\", \"denarius\")</p>\n    <p><a href=\"/hopper/search\">All Search Options</a> [<a href=\"javascript:abbrev_help()\">view abbreviations</a>]</p>\n</form>\n");
      out.write("\n\t</div>\n</div>\n");
      out.write("\n\n<div id=\"main\">\n    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/includes/index/indexNav.jsp" + (("/includes/index/indexNav.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("tabActive", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("about", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("subtabActive", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("who", request.getCharacterEncoding()), out, false);
      out.write("\n    \n    <div id=\"content\" class=\"2column\">\n        <div id=\"index_main_col\">\n\t\t<div id=\"members\">\n\t\t<h3>Former Perseus Staff:</h3>\n\t\t\n\t\t<p><b>Jason Bates</b>, Graduate Student Research Assistant.</p>\n\t\t<p><b>Monica Berti</b>, Visiting Scholar.</p>\n\t\t<p><b>Hilary Binda</b>, Graduate Research Fellow.</p>\n\t\t<p><b>Federico Boschetti</b>, Visiting Scholar.</p>\n\t\t<p><b>Ellen Brundige</b>, Assistant Programmer.</p>\n\t\t<p><b>Sara Bryant</b>, Research Coordinator.</p>\n\t\t<p><b>M. Soledad Caballero</b>, Graduate Research Assistant</p>\n\t\t<p><b>Robert F. Chavez</b>, Technology Manager, DCA.</p>\n\t\t<p><b>Maria Daniels</b>, Visual Collections Curator.</p>\n\t\t<p><b>Nick Gresens</b>, Graduate Research Fellow.</p>\n\t\t<p><b>Susan Ingram</b>, Editorial Assistant.</p>\n\t\t<p><b>Al Kaiser</b>, Graduate Research Assistant.</p>\n\t\t<p><b>Josh Kallen</b>, Undergraduate Research Assistant.</p>\n\t\t<p><b>Marion Lame</b>, Visiting Scholar.</p>\n\t\t<p><b>Gwynne Langley</b>, Research Coordinator.</p>\n\t\t<p><b>Adam McLean Lewis</b>, Research Assistant.</p>\n");
      out.write("\t\t<p><b>Anne Mahoney</b>, Programmer</p>\n\t\t<p><b>Francesco Mambrini</b>, Visiting Scholar.</p>\n\t\t<p><b>William Merrill</b>, Texts Editor.</p>\n\t\t<p><b>Thomas L. Milbank</b>, Art & Archaeology Editor.</p>\n\t\t<p><b>David Mimno</b>, Head Programmer.</p>\n\t\t<p><b>Christiane Nowak</b>, Visiting Scholar.</p>\n\t\t<p><b>Adrian Packel</b>, Programmer.</p>\n\t\t<p><b>Jennifer Goodall Powers</b>, Research Assistant.</p>\n\t\t<p><b>Michael Ramage</b>, Research Assistant.</p>\n\t\t<p><b>David Rapp</b>, Post Doctoral Research Associate.</p>\n\t\t<p><b>Matteo Romanello</b>, Visiting Scholar.</p>\n\t\t<p><b>Pamela Russell</b>, MFA Liaison for Roman Perseus.</p>\n\t\t<p><b>Jeffrey A. Rydberg-Cox</b>, Assistant Editor for Language and Lexicography.</p>\n\t\t<p><b>Kreg Segall</b>, Graduate Research Assistant.</p>\n\t\t<p><b>Rashmi Singhal</b>, Lead Programmer.</p>    \n\t\t<p><b>Amy C. Smith</b>, Art & Archaeology Editor.</p>\t\t\n\t\t<p><b>David A. Smith</b>, Programmer.</p>\n\t\t<p><b>Sonia Sturzer</b>, Undergraduate Research Assistant.</p>\n\t\t<p><b>Chen-Chieh Jack Su</b>, Undergraduate Assistant Programmer.</p>\n");
      out.write("\t\t<p><b>Agnes Thomas</b>, Visiting Scholar.</p>\n\t\t<p><b>Maureen Toner</b>, Graduate Research Fellow.</p>\n\t\t<p><b>Gabe Weaver</b>, Programmer.</p>\n\t\t<p><b>Kellie Donovan Wixson</b>, Graduate Research Assistant.</p>\n\t\t<p><b>Cindy Wood</b>, Graduate Research Fellow.</p>\n\t\t<p><b>Clifford E. Wulfman</b>, Post-Doctoral Associate.</p>\n\t\t<p><b>Ben Zarit</b>, Assistant Programmer.</p>\n\t\t\n\t\t</div> <!-- members div -->\n\t\t</div> <!-- main_col div -->\n    \n    <div id=\"img_side_col\">\n    </div> <!-- img_side_col -->\n    \n    </div> <!-- 2column div -->\n</div> <!-- main div -->\n\n<!-- Google Analytics --> \n");
      out.write("<script type=\"text/javascript\">\nvar gaJsHost = ((\"https:\" == document.location.protocol) ? \"https://ssl.\" : \"http://www.\");\ndocument.write(unescape(\"%3Cscript src='\" + gaJsHost + \"google-analytics.com/ga.js' type='text/javascript'%3E%3C/script%3E\"));\n</script>\n<script type=\"text/javascript\">\nvar pageTracker = _gat._getTracker(\"UA-4545594-2\");\npageTracker._initData();\npageTracker._trackPageview();\n</script>");
      out.write("\n\n</body>\n</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}