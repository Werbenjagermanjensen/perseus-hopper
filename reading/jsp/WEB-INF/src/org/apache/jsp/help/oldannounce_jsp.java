package org.apache.jsp.help;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class oldannounce_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n  <head><title>Perseus Recent Announcements</title>\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"/css/hopper.css\"/>\n    <script type=\"text/javascript\" src=\"/js/hopper.js\"></script>\n  </head>\n  <body onload=\"checkRedirect();\">\n    <div id=\"header\">\n      ");
      out.write("<div id=\"header\">\n\t<a id=\"banner\" href=\"/hopper/\">\n\t</a>\n\t<div id=\"header_side\">\n\t\t");
      out.write("<form action=\"/hopper/searchresults\" class=\"search_form\" onsubmit=\"return validate_form(this,q);\">\n    <input name=\"q\" />\n    <input type=\"submit\" value=\"Search\" />\n    <p>(\"Agamemnon\", \"Hom. Od. 9.1\", \"denarius\")</p>\n    <p><a href=\"/hopper/search\">All Search Options</a> [<a href=\"javascript:abbrev_help()\">view abbreviations</a>]</p>\n</form>\n");
      out.write("\n\t</div>\n</div>\n");
      out.write("\n      \n      <div id=\"main\">\n \t  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/includes/index/indexNav.jsp" + (("/includes/index/indexNav.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("tabActive", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("help", request.getCharacterEncoding()), out, false);
      out.write("\n\t  \n\t  <div id=\"content\" class=\"2column\">\n            <div id=\"index_main_col\">\n\t      <div id=\"home\">\n\t        <div id=\"news\">\n\t\t  <h3>All Announcements</h3>\n\t\t  <ul>\n\t\t  \n\t\t  \t<li>February 5, 2010:\n\t\t    <ul>\n\t\t    <li>We have fixed the problem with viewing full-size images in IE7 and 8.\n\t\t    </li>\n\t\t    </ul>\n\t\t    </li>\n\t\t  \n\t\t  \t<li>February 4, 2010:\n\t\t    <ul>\n\t\t    <li>A new release of our source code is now available on <a href=\"http://sourceforge.net/projects/perseus-hopper\" \nonclick=\"javascript: pageTracker._trackPageview('/outgoing/sourceForgeHopper');\">SourceForge</a>. Updated data and text files are also available <a href=\"/hopper/opensource/download\">here</a>.\n\t\t    </li>\n\t\t    </ul>\n\t\t    </li>\n\t\t  \n\t\t  \t<li>February 1, 2010:\n\t\t    <ul>\n\t\t    <li>Become a fan of Perseus on <a target=\"_blank\" \n\t\t    onclick=\"javascript: pageTracker._trackPageview('/outgoing/Facebook');\" \n\t\t    href=\"http://www.facebook.com/perseusproject\">Facebook</a>!\n\t\t    </li>\n\t\t    <li><b>Problems viewing images on IE 7 and 8:</b> We are aware of the problem with viewing full-size images through IE 7 or 8 and \n");
      out.write("\t\t    are working to fix it. For the best experience on Perseus, we always recommend using the latest version of <a target=\"_blank\" \n\t\t    onclick=\"javascript: pageTracker._trackPageview('/outgoing/Firefox');\" \n\t\t    href=\"http://www.mozilla.com/firefox/\">Firefox</a>.</li>\n\t\t    </ul>\n\t\t    </li>\n\t\t    \n\t\t    <li>December 15, 2009:\n\t\t    <ul>\n\t\t    <li><b>Updates to Perseus Digital Library:</b> The <a target=\"_blank\" href=\"/hopper/vocablist\">Vocabulary Tool</a> is now \n\t\t    available. For more information about this tool, please see the <a target=\"_blank\" href=\"/hopper/help/vocab\">help page</a>.\n\t\t    </li>\n\t\t    </ul>\n\t\t    </li>\n\t\t    \n\t\t    <li>October 7, 2009:\n\t\t    <ul>\n\t\t    <li><b>Updates to Perseus Digital Library:</b> We have added many new authors and texts \n\t\t    to our collection, including <a href=\"/hopper/searchresults?q=seneca\">Seneca</a>, \n\t\t    <a href=\"/hopper/searchresults?q=quintilian\">Quintilian</a>, \n\t\t    <a href=\"/hopper/searchresults?q=flaccus\">Flaccus</a>, \n\t\t    <a href=\"/hopper/searchresults?q=cicero\">Cicero</a>, \n");
      out.write("\t\t    <a href=\"/hopper/searchresults?q=gellius\">Aulus Gellius</a>, \n\t\t    <a href=\"/hopper/searchresults?q=ammianus\">Ammianus</a>\n\t\t     and <a href=\"/hopper/searchresults?q=petronius\">Petronius</a>.\n\t\t    </li>\n\t\t    </ul>\n\t\t    </li>\n\t\t    \n\t\t     <li>March 31, 2009:\n\t\t    <ul>\n\t\t    <li><b>Updates to Perseus Digital Library:</b> You can now view the places mentioned\n\t\t    in the Perseus Digital Library by <a href=\"/hopper/collections\">collection</a> or text \n\t\t    through the Google Maps interface. Links to view places in a text can be found on a \n\t\t    text page, in the Places box. Places are automatically extracted, so please email the \n\t\t    <a href=\"mailto:webmaster@perseus.tufts.edu\">webmaster</a> if you notice errors.\n\t\t    </li>\n\t\t    </ul>\n\t\t    </li>\n\t\t    \n\t\t    <li>March 16, 2009:\n\t\t    <ul><li><b>New job announcement:</b> Perseus is seeking a <b><a href=\"/hopper/about/jobs\">Greek Treebank \n\t\t    Editor</a></b> to supervise the creation of a syntactic database for classical Greece with \n\t\t    1,000,000 words - one of the most promising instruments ever produced for the study of Greek \n");
      out.write("\t\t    linguistics, literary style, and lexicography.  We encourage graduate students who could build \n\t\t    their dissertation work on this project, as well as classicists with PhD in hand, to consider \n\t\t    applying.\n\t\t    \n\t\t    </li>\n\t\t    <li><b>Updates to Perseus Digital Library:</b>\n\t\t    <ul>\n\t\t    <li>Many improvements to the Art & Archaeology data and interface.  You can now <a href=\"/hopper/search\">search</a> the \n\t\t    \tA&A data and image captions.\n\t\t    </li>\n\t\t    <li>Euclid's <i>Elements</i> have been added, as well as a large number of Plutarch texts, edited by Bernadotte Perrin.\n\t\t    Links to these texts can be found on the <a href=\"/hopper/collection.jsp?collection=Perseus:collection:Greco-Roman\">Greek and \n\t\t    Roman collection</a> page.\n\t\t    </li>\n\t\t    </ul>\n\t\t    </li>\n\t\t    </ul>\n\t\t    </li>\n\n\t\t\t<li>September 23, 2008:\n\t\t\t<ul><li><b>Updates to Perseus Digital Library: </b></li>\n\t\t\t<ul>\n\t\t\t  <li>The first release of the <a href=\"/hopper/collection?collection=Perseus:collection:Arabic\">Arabic Collection</a>.</li>\n");
      out.write("\t\t\t  <li><a href=\"/hopper/search\">Search tools</a> have been refined.</li>\n\t\t\t  <li>Navigation in 4.0 has been updated.</li>\n\t\t\t  <li>Art & Archaeology data has been\n\t\t\t  updated. The A & A Artifact Browser can now be found\n\t\t\t  under the <a href=\"/hopper/collections\">Collections</a> tab</li>\n\t\t\t  <li>General information on the Perseus\n\t\t\t  Project has been added: <a href=\"/hopper/research\">Research</a>,\n\t\t\t  <a href=\"/hopper/grants\">Grants</a>, \n\t\t\t  <a href=\"/hopper/about/research\">Research Opportunities</a>, and\n\t\t\t  <a href=\"/hopper/about/jobs\">Job Opportunities</a>.</li>\n\t\t\t  <li>A dedicated <a href=\"/hopper/opensource\">Open Source</a> section.</li>\n\t\t\t  <li>Our list\n\t\t\t  of <a href=\"/hopper/about/publications\">Publications</a>\n\t\t\t  has been moved to the About section.</li>\n\t\t\t  <li>4.0 Help pages have been updated.</li>\n\t\t\t  <li>Additional hardware has been added to\n\t\t\t  the Perseus backend servers.</li>\n\t\t\t</ul>\n\t\t\t</ul>\n\t\t\t</li>\n\t\t\t\n\t\t    <li>May 13, 2008:\n\t\t      <ul>\n\t\t\t\t<li><strong>New updates to Perseus Hopper open source release:</strong> \n");
      out.write("\t\t\t\tThe open source release of the Perseus Hopper has been updated. You now have \n\t\t\t\tthe choice of downloading the data generated by the installation process rather \n\t\t\t\tthan loading the data using the texts. The text files continue to be available \n\t\t\t\tunder the <a href=\"http://creativecommons.org/licences/by-nc-sa/3.0/us\">Creative \n\t\t\t\tCommons license</a>.\n\t\t\t  <ul>\n\t\t\t    <li>Download the latest release of source code from <a href=\"http://sourceforge.net/projects/perseus-hopper\">SourceForge</a>.\n\t\t\t    <li>Download the text files or data <a href=\"/opensource/\">here</a>.\n\t\t\t  </ul>\n\t\t      </ul>\n\t\t      \n\t\t    <li>March 28, 2008:\n\t\t      <ul>\n\t\t\t\t<li><b>Updates to Perseus Digital Library: </b>\n\t\t\t  <ul>\n\t\t\t    <li>Searching has been re-enabled.\n\t\t\t    <li>The first 4.0 release of the Renaissance Collection is now available.\n\t\t\t    <li>Word study tools and word frequencies have been refined.\n\t\t\t    <li>Additional memory has been added to all Perseus servers.\n\t\t\t  </ul>\n\t\t      </ul>\n\t\t      \n\t\t    <li><span class=\"date\">February 7, 2008</span>:\n");
      out.write("\t\t      <ul>\n\t\t\t\t<li><strong>Building a &quot;FRBR-Inspired&quot; Catalog</strong>: The \n\t\t\t\tPerseus Digital Library has been exploring the creation of a FRBR-Inspired \n\t\t\t\tcatalog for classics, and with funding from the Mellon Foundation, has taken \n\t\t\t\tsome preliminary steps beyond our initial work first reported in \n\t\t\t\t<a href=\"http://www.dlib.org/dlib/october05/crane/10crane.html\">October 2005</a>. \n\t\t\t\tIf you are interested in reading more, please check out our new \n\t\t\t\t<a href=\"http://www.perseus.tufts.edu/~ababeu/PerseusFRBRExperiment.pdf\">report</a>.\n\t\t      </ul>\n\t\t      \n\t\t    <li><span class=\"date\">November 9, 2007</span>:\n\t\t      <ul>\n\t\t\t\t<li><strong>Install Perseus 4.0 on your computer</strong>: All of the source code \n\t\t\t\tfor the Perseus Java Hopper and much of the content in Perseus is now available \n\t\t\t\tunder an open source license. You can download the code, compile it, and run it \n\t\t\t\ton your own system. This requires more labor and a certain level of expertise for \n\t\t\t\twhich we can only provide minimal support. However, since it will be running on your \n");
      out.write("\t\t\t\town machine, it can be much faster than our website, especially during peak usage \n\t\t\t\ttimes. You also have the option to install only certain collections or texts on your \n\t\t\t\tversion, making it as specialized as you wish. Also, if you want to use a different \n\t\t\t\tsystem to make the content available, you can do so within the terms of the \n\t\t\t\t<a href=\"http://creativecommons.org/licences/by-nc-sa/3.0/us\">Creative Commons</a> \n\t\t\t\tlicense. This is the first step in open sourcing the code as you can modify the code \n\t\t\t\tas much as you want, but at this time, we cannot integrate your changes back into our \n\t\t\t\tsystem. That is our ultimate goal, so keep a look out for that!\n\t\t\t  <ul>\n\t\t\t    <li>Download source code <a href=\"http://sourceforge.net/projects/perseus-hopper\">here</a>\n\t\t\t    <li>Download text data <a href=\"/opensource/\">here</a>\n\t\t\t  </ul>\n\t\t      </ul>\n\t\t      \n\t\t      <!-- \n\t\t\t   \n\t\t\t   <li><span class=\"date\">March 27, 2008</span>:\n\t\t\t     <ul>\n\t\t\t       <li><strong>Site updates</strong>: Please be\n");
      out.write("\t\t\t\t patient as the website may\n\t\t\t\t be slow for next day while we update the\n\t\t\t\t website.\n\t\t\t       </li>\n\t\t\t     </ul>\n\t\t\t   </li>\n\t\t\t   \n\t\t    <li><span class=\"date\">March 26, 2008</span>:\n\t\t      <ul>\n\t\t\t<li><strong>Searching function</strong>: The search function in Perseus 4.0 is not yet operable, but will be with the upcoming site update. This tool will be working shortly!</li>\n\t\t      </ul>\n\t\t    </li>\n\t\t    \n\t\t    -->\n\t\t    \n\t\t    <li><span class=\"date\">November 15, 2006</span>: \n              <ul>\n            \t\t<li><strong>\n             \t\t    Classics in a Digital World</strong>: Curious about where classics might go in a digital\n\t\t\t  \t\t\tworld? See the <a href=\"http://dl.tufts.edu/view_pdf.jsp?urn=tufts:facpubs:gcrane-2006.00003\">preprint\n\t\t\t    \t\tof a new article about ePhilology</a> that will appear in The Blackwell Companion to Digital Literary Studies.\n\t\t      </ul>\n\t\t      \n\t\t\t<!--<li><span class=\"date\">October 12, 2006</span>:\n\t\t\t    <ul>\n\t\t\t      <li><strong>Issues resolved</strong>: Morphological analyses should now be up and running again; many texts that were throwing errors are now working properly. Our sincere apologies for the issues. Please keep reporting any errors--we're not any more pleased about them than you are!</li>\n");
      out.write("\t\t\t    </ul>\n\t\t\t</li>\n\t\t\t<li><span class=\"date\">October 10, 2006</span>:\n\t\t\t  <ul>\n\t\t\t    <li><strong>More site issues</strong>: the\n\t\t\t      maintenance seems to have resulted in some problems.  One of them,\n\t\t\t      a display bug in Internet Explorer, was fixed this morning; others\n\t\t\t      (including \"null\" showing up in place of some texts and lexicon\n\t\t\t      entries not appearing on morphological analyses) we're hoping to\n\t\t\t      fix today or tommorrow.  We're very sorry for the trouble!</li>\n\t\t\t  </ul>\n\t\t\t</li>\n\t\t\t<li><span class=\"date\">August 16, 2006</span>:\n\t\t\t  <ul>\n\t\t        <li><strong>Hardware problems!</strong>:  A\n\t\t\t  key server in the Perseus site has experience intermittent\n\t\t\t  hardware problems.  We are in the process of upgrading this\n\t\t\t  hardware and creating a more stable hardware environment.  We\n\t\t\t  apologize for the delays  and hope to have the problem resolved in\n\t\t\t  a few days.</li>\n\t\t\t<li><strong>Vocabulary Tool</strong>:  A first\n\t\t\t  release at a new Vocabulary Tool widget is now available on the\n");
      out.write("\t\t\t  text page.</li>\n\t\t\t  </ul>\n\t\t\t  \n\t\t\t</li> -->\n\t\t\t\n\t\t\t<li><span class=\"date\">June 21, 2006</span>:  Art and Archaeology Browser Updated\n\t\t    \n\t\t   \t<li><span class=\"date\">March 15, 2006</span>: Improvements to the Perseus Digital Library\n\t\t\t<ul>\n\t\t\t  <li><strong>Migration of core data to the Tufts University Repository</strong>: We are beginning \n\t\t\t  to shift core Perseus data to the Tufts Institutional Repository, where it will become a part of \n\t\t\t  the university's permanent collection. There are several implications: </li>\n\t\t\t  <li><strong>Preservation</strong>: This step addresses the long term needs of preservation and \n\t\t\t  access: while Perseus has been in operation for almost two decades, libraries are better suited \n\t\t\t  to maintain collections over time than particular projects. </li>\n\t\t\t  <li><strong>Separation of production from research</strong>: The on-line version of the \n\t\t\t  Perseus Digital Library, now more than ten years old, has combined services with research \n\t\t\t  and development activities. As time progresses, established services will shift to the \n");
      out.write("\t\t\t  institutional repository, with the Perseus Digital Library focusing progressively more \n\t\t\t  on research and development. As research services become established and prove useful, \n\t\t\t  they will subsequently migrate to the production server. </li>\n\t\t\t  <li><strong>Named entity browsing and searching</strong>: Perseus has extracted placenames \n\t\t\t  and dates from full text for more than five years. This version of the Perseus Digital \n\t\t\t  Library adds additional functionality:\n\t\t\t    <ul>\n\t\t\t      <li>You can now search for and browse placenames and dates in Perseus documents. </li>\n\t\t\t      <li>We are adding personal names and will soon add other categories (e.g., \n\t\t\t      organizations). Personal names are in the new Perseus American collection and will \n\t\t\t      be added to classical texts. Classical texts have placenames and dates marked in \n\t\t\t      their public XML source.</li>\n\t\t\t    </ul>\n\t\t\t  </li>\n\t\t\t  <li><strong>Downloadable XML source texts</strong>: Public domain primary materials \n\t\t\t  are now available under a Creative Commons license for download in their native XML \n");
      out.write("\t\t\t  format.</li>\n\t\t\t  <li><strong>Bug fixes and incremental modifications</strong>: many general optimizations \n\t\t\t  have been implemented, and various display issues have been fixed, based on user \n\t\t\t  reports.</li>\n\t\t\t  <li><strong>Improved hardware</strong>: we are adding new servers that are not only \n\t\t\t  faster but easier to manage. This should improve not only speed but reliability.</li>\n\t\t\t</ul>\n\t\t    \n\t\t    <li><span class=\"date\">May 27, 2005:</span><strong> <a href=\"http://www.perseus.tufts.edu/hopper/\">\n\t\t    Perseus 4.0</a> released -- a new implementation of the Perseus Digital Library.</strong>\n\t\t\t\t<ul>\n\t\t\t  \t\t<li>Perseus 4.0, a new Java-based version of the Perseus Digital Library, is available for testing. It\n\t\t\t    \t\tcontains a faster, more manageable back-end and a more modern look and feel.\n\t\t\t    \t\tMany features of Perseus are now available as XML services -- for example, developers can extract <a href=\"http://www.perseus.tufts.edu/hopper/xmlchunk?doc=Perseus%3Atext%3A1999.02.0002%3Abook%3D1%3Achapter%3D1\">\n");
      out.write("\t\t\t      \t\twell-formed XML fragments</a> of primary sources with full TEI-conformant\n\t\t\t   \t\t\tmarkup in order to create their own front ends. <a href=\"/PR/perseus4.0.ann.full.html\">Read more...</a></li>\n\t\t\t\t</ul>\n\t\t\t\n\t\t      <li><a href=\"/hopper/help/archived/archann.html\">Earlier announcements</a>\n\t\t    </ul>\n\t\t</div> <!-- news -->\n\t\t\n\t      </div> <!-- home -->\n\t      \n\t    </div> <!-- main_col -->\n\t    \n\t  </div> <!-- content -->\n\t</div> <!-- main -->\n\t\n\t<!-- Google Analytics --> \n\t");
      out.write("<script type=\"text/javascript\">\nvar gaJsHost = ((\"https:\" == document.location.protocol) ? \"https://ssl.\" : \"http://www.\");\ndocument.write(unescape(\"%3Cscript src='\" + gaJsHost + \"google-analytics.com/ga.js' type='text/javascript'%3E%3C/script%3E\"));\n</script>\n<script type=\"text/javascript\">\nvar pageTracker = _gat._getTracker(\"UA-4545594-2\");\npageTracker._initData();\npageTracker._trackPageview();\n</script>");
      out.write("\n  </body>\n</html>\n");
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