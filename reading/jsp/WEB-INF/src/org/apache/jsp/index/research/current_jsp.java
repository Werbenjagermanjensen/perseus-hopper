package org.apache.jsp.index.research;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class current_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n<head><title>Current Research</title>\n<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/hopper.css\"/>\n<script type=\"text/javascript\" src=\"/js/hopper.js\"></script>\n</head>\n<body>\n");
      out.write("<div id=\"header\">\n\t<a id=\"banner\" href=\"/hopper/\">\n\t</a>\n\t<div id=\"header_side\">\n\t\t");
      out.write("<form action=\"/hopper/searchresults\" class=\"search_form\" onsubmit=\"return validate_form(this,q);\">\n    <input name=\"q\" />\n    <input type=\"submit\" value=\"Search\" />\n    <p>(\"Agamemnon\", \"Hom. Od. 9.1\", \"denarius\")</p>\n    <p><a href=\"/hopper/search\">All Search Options</a> [<a href=\"javascript:abbrev_help()\">view abbreviations</a>]</p>\n</form>\n");
      out.write("\n\t</div>\n</div>\n");
      out.write("\n\n<div id=\"main\">\n    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/includes/index/indexNav.jsp" + (("/includes/index/indexNav.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("tabActive", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("research", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("subtabActive", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("current", request.getCharacterEncoding()), out, false);
      out.write(" \t\n    \n    <div id=\"content\" class=\"2column\">\n    \t<div id=\"index_main_col\">\n\t\t<div id=\"research\">\n<h3>Research in 2008/09</h3>\t\t\n<p>\nThe following projects cluster around a number of themes:\n</p>\n<ul>\n\t<li>\n\t<p>\n\t<a name=\"undergradresearch\"></a><b>Enabling undergraduate research</b>: Nothing in our view offers more benefits to classics \n\tin particular and the humanities in general than our ability to make it the norm for our \n\tstudents to contribute early and often in tangible ways, large and small, to the field. \n\tWe can in this way make good on our promise to produce active citizens who expect to \n\tcontribute to their world. The print infrastructure of classics had in the twentieth century \n\tgrown so mature and so cumbersome that even the most advanced undergraduates in the most \n\tdemanding programs could not expect that they would, as a matter of course, conduct meaningful \n\tresearch or contribute in any tangible, if small, way to the field. As we build a new digital \n\tinfrastructure for Classics in particular and for the Humanities in general, the situation \n");
      out.write("\tis now completely different. We can now provide our students with opportunities to begin \n\tcontributing in small but tangible ways at a very early stage, to disseminate those digital \n\tcontributions far more widely than any print publications, to allow many contributions to be \n\treused in novel ways to support additional new scholarship and to put those contributions in \n\tan infrastructure designed to preserve them along with scientific data sets on which human \n\tcivilization depends.\n\t</p>\n\t<p>\n\tThe section on <a href=\"/hopper/about/research\">research opportunities</a> suggests specific \n\topportunities for students and classes but we encourage students and faculty to suggest ways \n\tto contribute to these <a href=\"/hopper/about/research\">active research projects</a> or in any \n\tother way.\n\t</p>\n\t<p>\n\tAt least three factors allow us to rethink the possibilities for undergraduate research.\n\t</p>\n\t<ul>\n\t\t<li>\n\t\t<p>\n\t\tFirst, students have more and better access to primary sources than were accessible in print. \n\t\tWe have the tools already whereby we much carry much further the visions behind publications such \n");
      out.write("\t\tas the Loeb Classical Library and Bud&eacute; Editions, providing a range of background and \n\t\ttranslation support. Scholars can now also include full citations for the primary sources behind \n\t\ttheir statements, knowing that electronic publications do not have the mechanical space limitations \n\t\tof print and that even primary sources previously available only in research libraries are or will \n\t\tsoon be available to the world and will contain links to basic background information. Thomas Martin's \n\t\t<a href=\"/hopper/text?doc=Perseus:text:1999.04.0009\">Historical Overview in Perseus</a> and \n\t\tChristopher Blackwell's <a target=\"_blank\"\n    \thref=\"http://www.stoa.org/projects/demos/home\"\n    \tonclick=\"javascript: pageTracker._trackPageview('/outgoing/StoaDemos');\">Demos</a>.\n\t\t</p>\n\t\t</li>\n\t\t<li>\n\t\t<p>\n\t\tSecond, we simply cannot do all the work that needs doing if we only rely upon professional scholars \n\t\tand automated systems - we need to enlist our students in this task. The projects outlined \n\t\t<a href=\"/hopper/about/research\">here</a> offer a wide range of tasks well within the range of \n");
      out.write("\t\tsupervised students with various levels of Greek and Latin. Projects such as the \n\t\t<a target=\"_blank\"\n    \thref=\"http://chs.harvard.edu/chs/homer_multitext\"\n    \tonclick=\"javascript: pageTracker._trackPageview('/outgoing/CHSHomer');\">Center for Hellenic Studies Homer Multitext</a> \n\t\thave students transcribing scholia and readings from the 10th century Venetus A that have never \n\t\tfound their way into print and that are now visible to anyone who downloads the newly created high \n\t\tresolution scans of the manuscript. Student-centered and driven annotations can provide a new \n\t\tgeneration of commentaries that address the actual problems that readers confront as they struggle \n\t\twith linguistically or culturally challenging texts. Students or classes might systematically \n\t\treview and revise the entries for people and places and realia in digitized versions of the old \n\t\tSmith's encyclopedias.\n\t\t</p>\n\t\t</li>\n\t\t<li>\n\t\t<p>\n\t\tThird, wholly new scholarly instruments are now becoming available that open up new avenues of \n");
      out.write("\t\tresearch. We have studied Greek and Latin for millennia but Treebanks (see below) allow us to place \n\t\tour ideas about Greek and Latin lexicography, linguistics and style on a quantifiable and explicit \n\t\tfoundation. We urge students to adopt particular authors or works, adding new syntactic data to the \n\t\tlarger treebanks and then using that data to conduct original research. We have, for example, already \n\t\tpublished a <a target=\"_blank\" href=\"http://nlp.perseus.tufts.edu/syntax/treebank/\">Treebank</a> that includes \n\t\tSallust's <em>Catiline</em> among other samples of Latin. Students could begin now comparing Sallust \n\t\twith the other samples while taking on the task of adding the <em>Jugurtha</em> and fragments.\n\t\t</p>\n\t\t</li>\n\t</ul>\n\t</li>\n\t<li>\n\t<p>\n\t<a name=\"2500years\"></a><b>2500 years later in 2010</b>: the world that Marathon made: Some of the efforts outlined below are \n\tinherently broad, others much more focused on particular texts or problems. As a general theme \n\tfor the coming year, however, we have chosen to focus our efforts on the Battle of Marathon in \n");
      out.write("\tparticular and the world that it helped create in general. Our ultimate goal is to prepare for \n\ta conference to commemorate Marathon 2500 years afterwards, in the late summer of 2010. We thus \n\twill, where possible, focus collection development on resources that allow us to better address \n\tthis topic. The topic is, however, a very broad one and includes not only all of the conventional \n\tclassical Greek period but major elements of Roman history. The topic also invites participation \n\tfrom scholars in contemporary Iran and raises the general topic of classical studies and its ancient \n\tties with not only the geographic Middle East but Islamic scholarship as well.\n\t</p>\n\t</li>\n\t<li>\n\t<p>\n\t<a name=\"library\"></a><b>A comprehensive, open source, fourth-generation library of Greek and Latin editions</b>: The first \n\tdigital texts contained transcription with markup representing the page-layout of the print source \n\t(e.g., representing that a word is in italics). A second generation of collections (of which the \n");
      out.write("\tprimary sources in Perseus provide one example) began to add semantic markup (e.g., representing that \n\ta word is in italics because it is a Latin quotation). Collections such as the \n\t<a target=\"_blank\" href=\"http://quod.lib.umich.edu/m/moagrp/\"\n    \tonclick=\"javascript: pageTracker._trackPageview('/outgoing/MoA');\">Making of America</a> and \n\t<a target=\"_blank\" href=\"http://www.jstor.org/\"\n    \tonclick=\"javascript: pageTracker._trackPageview('/outgoing/JSTOR');\">JSTOR</a> then\n    \tdemonstrated a third, much larger generation of \n\tcollections where readers search text automatically generated by Optical Character Recognition \n\t(OCR) software and basic library cataloguing data, and then view scanned page images of the source. \n\tWhere second generation collections extend the scope of first generation collections by adding \n\tsemantic markup to carefully transcribed text, third-generation collections reverse production \n\tphilosophies, emphasizing automation and scalability over the artisanal techniques of first and \n");
      out.write("\tsecond-generation collections.\n\t</p>\n\t<p>\n\tThird-generation collections focus on the quality of the page images and associated meta-data and \n\tassume that the automatically generated text will improve with each new generation of OCR software. \n\tIn the 1970s and 1980s, when the first- and second-generation collections emerged, scanning and \n\tstorage technology made libraries of scanned page images impractical - the several hundred megabytes \n\tof transcribed Greek from the Thesaurus Linguae Graecae  (TLG) required special disk drives that cost \n\ttens of thousands of dollars. Texts had to be transcribed well enough to stand on their own and \n\treaders would have to rely upon printed copies to identify errors and to find the textual notes, \n\tintroductions, indices, appendices and other scholarly apparatus. At least one major library has \n\tinformally reported that it would not accept first- or second-generation collections unless they \n\tcame with digital page images aligned to the transcribed texts.\n\t</p>\n\t<p>\n\tFourth-generation collections integrate not only carefully transcribed text and the original page \n");
      out.write("\timages but also other forms of annotation (e.g., morphological and syntactic analysis, indices of \n\tpeople and places, markup for the particular sense of particular words in context).\n\t</p>\n\t<p>\n\tThe first fourth-generation texts became available at least as early as 2006, when Perseus aligned \n\tmanually produced, TEI-compliant editions to page images that it scanned in-house. In 2007, Perseus \n\ttested the <a target=\"_blank\"\n    \thref=\"http://www.opencontentalliance.org/\"\n    \tonclick=\"javascript: pageTracker._trackPageview('/outgoing/OCA');\">Open Content Alliance</a> (OCA) workflow, \n\tin which scholars can pay to scan selected books from OCA partner libraries, and as a result a number \n\tof scholarly materials, including not only \n\t<a target=\"_blank\"\n    \thref=\"http://www.archive.org/details/autolycidesphaer00autouoft\"\n    \tonclick=\"javascript: pageTracker._trackPageview('/outgoing/InternetArchiveGreek');\">Greek</a> and \n\t<a target=\"_blank\"\n    \thref=\"http://www.archive.org/details/marcusdelingua00varruoft\"\n    \tonclick=\"javascript: pageTracker._trackPageview('/outgoing/InternetArchiveLatin');\">Latin</a> but \n");
      out.write("\t<a target=\"_blank\"\n    \thref=\"http://www.archive.org/details/syriacusthesaur01paynuoft\"\n    \tonclick=\"javascript: pageTracker._trackPageview('/outgoing/InternetArchiveSyriac');\">Syriac</a>, \n\t<a target=\"_blank\"\n    \thref=\"http://www.archive.org/details/sanskritwrterb01bhuoft\"\n    \tonclick=\"javascript: pageTracker._trackPageview('/outgoing/InternetArchiveSanskrit');\">Sanskrit</a> and \n\t<a target=\"_blank\"\n    \thref=\"http://www.archive.org/details/sturlungasagainc01aronuoft\"\n    \tonclick=\"javascript: pageTracker._trackPageview('/outgoing/InternetArchiveOldNorse');\">Old Norse</a>, have become \n\tavailable for download from the OCA. In 2008-09, Perseus is creating a fourth-generation collection \n\tthat includes:\n\t</p>\n\t<ul>\n\t\t<li>\n\t\t<p>\n\t\tExpanded TEI-compliant XML transcriptions of Greek and Latin primary sources within Perseus.\n\t\t</p>\n\t\t</li>\n\t\t<li>\n\t\t<p>\n\t\tAn open source collection of image-books representing at least one (and where possible more \n\t\tthan one) edition of every classical Greek and Latin author within the OCA.\n");
      out.write("\t\t</p>\n\t\t</li>\n\t\t<li>\n\t\t<p>\n\t\tCataloging data in XML <a target=\"_blank\"\n    \thref=\"http://www.loc.gov/standards/mods/\" \n\tonclick=\"javascript: pageTracker._trackPageview('/outgoing/MODS');\">MODS</a> and \n\t\t<a target=\"_blank\"\n    \thref=\"http://www.loc.gov/standards/mads/\" \n\tonclick=\"javascript: pageTracker._trackPageview('/outgoing/MADS');\">MADS</a> format that is modeled after the \n\t\t<a target=\"_blank\"\n    \thref=\"http://www.ifla.org/VII/s13/wgfrbr/\"\n    \tonclick=\"javascript: pageTracker._trackPageview('/outgoing/FRBR');\">Functional Requirements for Bibliographic \n\t\tRecords (FRBR)</a> to represent multiple editions, translations, commentaries, indices and \n\t\tother scholarly data. This \n\t\t<a\n    \thref=\"http://www.perseus.tufts.edu/~ababeu/PerseusFRBRExperiment.pdf\"\n    \tonclick=\"javascript: pageTracker._trackPageview('/outgoing/FRBRExperiment');\">catalogue</a> is \n\t\tdesigned to provide the detail now offered by discipline-specific checklists of \n\t\tsingle-editions (such as the Greek works and authors in the printed Liddell Scott Jones Lexicon \n");
      out.write("\t\tand the <a target=\"_blank\"\n    \thref=\"http://stephanus.tlg.uci.edu/canon/fontsel\"\n    \tonclick=\"javascript: pageTracker._trackPageview('/outgoing/TLG');\">on-line TLG Canon</a>) within \n\t\tan extensible, standards-compliant library infrastructure.\n\t\t</p>\n\t\t</li>\n\t\t<li>\n\t\t<p>\n\t\tMetadata to support access by book/chapter/section/verse or other conventional scholarly \n\t\tcitations under the <a target=\"_blank\"\n    \thref=\"http://katoptron.holycross.edu/cocoon/diginc/specs/cts\"\n    \tonclick=\"javascript: pageTracker._trackPageview('/outgoing/CTS');\">Canonical \n\t\tText Services (CTS) Protocol</a>. This metadata would make it possible to generate from a \n\t\ttextual citation a dynamic link into electronic page images and/or XML-transcriptions.\n\t\t</p>\n\t\t</li>\n\t</ul>\n\t</li>\n\t<li>\n\t<p>\n\t<a name=\"collections\"></a><b>Focused collections on selected Greek and Latin authors</b>: To complement the general collection \n\tdevelopment and scalable services we are choosing a small number of authors on which to focus \n\tparticular attention. For these authors, we will collect more editions and associated publications \n");
      out.write("\t(especially commentaries, indices, specialized lexica), with targeted creation of TEI-compliant XML \n\ttranscriptions. We will focus upon Herodotus, Aeschylus and Thucydides to illustrate classical Greece \n\tand the world that Marathon made. We also have a major commitment to Homer that reflects work already \n\tbegun at Perseus and collaborations with projects such as the Homer Multitext Project of Harvard's \n\tCenter for Hellenic Studies. On the Roman side, we will concentrate on Sallust and Propertius, whose \n\tcorpora are small enough for close study and for which we can, for example, provide comprehensive \n\tTreebanks (see below), and on Livy and Cicero, whose corpora are large enough to demand automated methods.\n\t</p>\n\t</li>\n\t<li>\n\t<p>\n\t<a name=\"scalable\"></a><b>Scalable methods to identify, transcribe and automatically tag Greek and Latin</b>: These services \n\tinclude not only optimized OCR but algorithms that compare the OCR output from different editions of \n\tthe same work to distinguish text from headers, textual notes and marginalia and OCR errors in the \n");
      out.write("\ttext from intentional editorial variations. The immediate goal is to create a searchable collection \n\tof Greek and Latin that provides better scholarly recall than manually produced collections on which \n\tscholars have traditionally relied: about 8% of the unique Greek and Latin words on a given pages \n\tfrom any standard edition only appear in the textual notes (in series such as the Loeb Classical \n\tLibrary which traditionally restrict readings to a minimum, this figure remains c. 4%). Curated \n\tcollections that contain perfect transcriptions but only the reconstructed text can only deliver \n\t92-96% of the words that the editor chose to print. \n\t<a target=\"_blank\"\n    \thref=\"http://dl.tufts.edu/view_pdf.jsp?pid=tufts:PB.001.001.00006\"\n    \tonclick=\"javascript: pageTracker._trackPageview('/outgoing/TDLOCR');\">OCR-generated text can \n\talready deliver 98-99%</a> of the words from printed Greek and thus immediately provide better recall \n\tthan perfect transcriptions. The result returned to the reader is, in addition, an image of the full \n");
      out.write("\tprinted edition.\n\t</p>\n\t</li>\n\t<li>\n\t<p>\n\t<a name=\"fragmentary\"></a><b>Fragmentary authors</b>: Humanists have been working with digital texts for a generation but we have \n\tin these first decades focused our efforts upon the large body of texts that survive more or less \n\tintact. Most of the works written in antiquity are, however, lost - less than 10% of the works of \n\tAeschylus, Euripides and Sophocles, for example survive. Most classical authors exist, therefore, in a \n\tfragmentary state. In some cases, these texts are scraps of papyrus that survived in the sands of Egypt \n\tand are literally fragments. In most cases, however, our surviving fragments are, in fact, passages \n\twhere surviving authors quote, summarize or simply allude to authors and works that have not survived. \n\tPrint editions of fragmentary authors typically print excerpts about a fragmentary authors along with \n\tvarious categories of scholarly apparatus (the editor's commentary, a translation, variant readings etc.) \n\tIn a digital world, such fragmentary editions should contain dynamic links that point to editions of the \n");
      out.write("\tquoting source. The comprehensive collection of Greek and Latin source texts, with scanned page images \n\tand searchable OCR-generated text for all, and carefully transcribed TEI-compliant XML for some, gives \n\tus the foundation on which we can build the dynamic, hypertextual editions of fragmentary authors.\n\t</p>\n\t<p>\n\tIn 2008-09 we will begin work on the Greek fragmentary historians, using M&uuml;ller's \n\t<a target=\"_blank\"\n    \thref=\"http://www.archive.org/details/fragmentahistori01mueluoft\"\n    \tonclick=\"javascript: pageTracker._trackPageview('/outgoing/InternetArchiveMuller');\">Fragmenta Graecorum Historicorum</a> \n\tas a starting point. The output of this work will be both an initial edition of Greek fragmentary \n\thistorians and the methods by which we represent pointers into source works and associated scholarly \n\tannotation. We will create a broad first pass at a comprehensive database of fragments for all Greek \n\tauthors, but we will focus particular attention on those authors most relevant to the theme of the \n");
      out.write("\tworld that Marathon made.\n\t</p>\n\t</li>\n\t<li>\n\t<p>\n\t<a name=\"machine\"></a><b>From human-readable information to machine actionable knowledge</b>: If a lexicon includes an entry \n\tsuch as \"insula, -ae, f.,\" students of Latin can recognize this is a statement that there is a \n\tfirst declension feminine Latin noun with stem <em>insul</em>- and endings with nominative \n\tsingular <em>insula</em>, genitive plural <em>insularum</em> etc. A machine can generate and \n\trecognize forms of this noun but it needs the information about stems and endings in a format \n\tthat it can process. Commentaries contain information about particular passages - if we can \n\trepresent the commentary entries in a format that machines can recognize. Encyclopedias contain \n\tmany statements about birth and death dates, offices held (\"X consul in Y\"), kinship (e.g., X \n\tson of Y), and other propositional statements. While we cannot carefully transcribe every book \n\tabout classics from our print libraries, a relatively constrained number of reference books \n");
      out.write("\tcontain a large body of information that could, if converted into a machine actionable format, \n\tdrive a range of services. Every funded project on which we are working depends upon the \n\tconversion of some part of the print infrastructure into such machine actionable knowledge bases. \n\tWe are therefore preparing to convert a range of such print resources into structured, \n\tmachine-actionable form including lexica, grammars, commentaries, editions, editions of surviving \n\ttexts and editions of fragmentary authors.\n\t</p>\n\t</li>\n\t<li>\n\t<p>\n\t<a name=\"borndigital\"></a><b>Born-digital knowledge bases</b>: While print reference works contain a great deal of information \n\tthat can be converted into machine actionable form, they cannot provide all of the data that we need \n\tto drive some of the services that are most promising for humanists.\n\t</p>\n\t<ul>\n\t\t<li>\n\t\t<p>\n\t\tFirst, information available in print format does not always lend itself to automatic extraction \n\t\t- in the general case, the automatic analysis of full text is an unsolved problem. An encyclopedia \n");
      out.write("\t\tor dictionary entry may contain propositional statements that automated systems could use but that \n\t\twe cannot extract from the text. Critical editions contain a wealth of statements about how one \n\t\tversion of a text differs from various others but these print annotations are hard for automatic \n\t\tsystems to decode.\n\t\t</p>\n\t\t</li>\n\t\t<li>\n\t\t<p>\n\t\tSecond, our printed reference works leave out information that their authors collected and which \n\t\tautomated systems need. The authors of lexica, for example, often have space to print only a \n\t\tselection of the passages that they have sorted into distinct word sense - their sorted slips of \n\t\tpaper or file cards contained the wealth of training examples on which machine learning thrives \n\t\tbut these are lost or available only as archival materials.\n\t\t</p>\n\t\t</li>\n\t\t<li>\n\t\t<p>\n\t\tThird, some categories of information do not have exact print antecedents. Classical philologists \n\t\tcan see from the emerging field of corpus linguistics a wide range of annotations relevant to their \n");
      out.write("\t\twork. These range from basic categories such as co-reference (e.g., determining whether <em>hic</em>, \n\t\t\"this person,\" refers back to Caesar or Antony in a particular passage) to more broadly interpretive \n\t\tcategories such as labeling expressions about time and events (e.g., languages such as \n\t\t<a target=\"_blank\"\n    \thref=\"http://www.timeml.org/site/index.html\"\n    \tonclick=\"javascript: pageTracker._trackPageview('/outgoing/TimeML');\">TimeML</a> and the Bruce Robertson's \n\t\t<a target=\"_blank\"\n    \thref=\"http://heml.mta.ca/heml-cocoon/\" \n\tonclick=\"javascript: pageTracker._trackPageview('/outgoing/HEML');\">Historical\n    \tEvent Markup and Linking language</a>). Even \n\t\tas we build up treebanks with core syntactic data we need to explore other categories of linguistic \n\t\tmarkup.\n\t\t</p>\n\t\t</li>\n\t</ul>\n\t</li>\n\t<li>\n\t<p>\n\t<a name=\"treebank\"></a><b>The Classical Greek and Latin Treebank Projects</b>: Syntactic annotations record information about the \n\trelationships between the words: e.g., <em>orationes</em> in a given sentence is the object of \n");
      out.write("\t<em>dicit</em> (\"s/he speaks, says\") and has the modifier ZZZ. Such annotations organize the words \n\tin a sentence into tree-like structures and can be collected into linguistic databases conventionally \n\tcalled Treebanks. These Treebanks can let us see phenomena such as the changing subjects and objects \n\tthat a given verb takes over time, sentence structure (e.g., subject-verb-object vs. subject-object-verb), \n\tand individual style of particular authors, genres and periods. Automated systems can automatically \n\tanalyze more than 90% of English sentences but these systems do so by analyzing pre-existing Treebanks \n\twith a million or more words. For complex, stylistically idiosyncratic and relatively small classical \n\ttexts, manual annotation would be necessary in any case, but such manual annotation allows us then to \n\tplace our understanding of these texts on a fundamentally new, more explicit foundation.\n\t</p>\n\t<p>\n\tIn August 2008, we published the latest version of the \n\t<a target=\"_blank\" href=\"http://nlp.perseus.tufts.edu/syntax/treebank/\">Latin Treebank</a>, which now includes more \n");
      out.write("\tthan 50,000 words. At the same time, we began work on what will be a 1,000,000 word Treebank for \n\tclassical Greek.\n\t</p>\n\t</li>\n\t<li>\n\t<p>\n\t<a name=\"datamining\"></a><b>Text/Data-mining and the Automated production of new knowledge</b>: Once we have converted even the \n\tsimplest print resources into machine actionable knowledge, we can use that knowledge to generate \n\tnew knowledge. Consider the examples of traditional print indices and translations. Conversion of print \n\tindices involves, at the simplest level, identifying the headwords and citations. This amount of structure \n\tallows machines to see that there are, for example, six figures named Alexander in a given corpus and a \n\tlist of passages where each separate Alexander appears. A named entity identification system can use \n\tmachine learning algorithms to analyze the context in which the different Alexanders appear to predict \n\tthe most likely Alexander to which other passages refer. Likewise, if we add basic citations to an \n\tEnglish translation (i.e., this passage of English corresponds to the Greek in Thucydides, Book 1, \n");
      out.write("\tchapter 86), then we can identify words and phrases in the English translation that correspond to \n\tthe Greek: e.g., Latin <em>orationes</em> corresponds to the English word \"speeches\" in one passage \n\tbut to \"prayers\" in another. We can then use machine learning algorithms to predict in passages where \n\tthere is no English translation whether <em>orationes</em> more likely corresponds to \"speeches\" or \n\t\"prayers.\" We can also begin to use these lower level conclusions (e.g., Antonius in passage X \n\tdesignates the famous Marc Antony the Triumvir who appears also in Shakespeare, <em>orationes</em> in \n\tpassage Y corresponds to \"speeches\") to identify more patterns that indicate people, places, word \n\tmeanings and other topics (e.g., what other people and places appear in conjunction with Antony? What \n\tother words in Latin and Greek correspond to the English word \"prayer\" in various periods and genres?) \n\tAt this point, we have moved from patterns that human beings have already labeled (e.g., passage \n\tX describes Marc Antony while passage Y describes another particular Antonius), to inferences that \n");
      out.write("\thuman beings make hundreds or thousands of times a day but do not have time to record (e.g., when \n\treaders automatically distinguish references to Alexandria, Egypt, vs. Alexandria, VA), to patterns \n\tthat no human being would see by simply reading through a texts (e.g., a survey of the Latin and \n\tGreek terms corresponding to \"prayer\" that appear in texts containing hundreds of millions of words \n\tand written over two millennia).\n\t</p>\n\t</li>\n\t<li>\n\t<p>\n\t<a name=\"adaptinfo\"></a><b>Adapting linguistic and cultural information for particular readers</b>: Once we begin assembling large \n\tbodies of information, we need methods to provide individual users with information adapted their \n\tgeneral backgrounds and their immediate purposes. There are two ways in which to adapt large bodies \n\tof information. Personalization compares the behavior of a given user against that of previous users \n\tto suggest actions of interest (e.g., people who bought book X also bought books Y and Z). Early \n\texperiments showed that similar techniques were applicable for readers of Greek and Latin: once \n");
      out.write("\treaders ask about four words from a particular passage, we can predict two thirds of the other \n\twords about which they will have questions.\n\t</p>\n\t<p>\n\tOur work in 2008-09 focuses primarily upon customized reading support. Customization follows \n\tdirections from the user (e.g., a user created profile that requests all new information about \n\tPericles' <em>Funeral Oration</em>). Our work focuses upon customized vocabulary profiles in which \n\twe have digitized the vocabularies from textbooks of Greek, Latin and Arabic. We want to be able \n\tto answer two basic questions: first, we want readers to be able to identify words that they have \n\tnot yet encountered in a given chunk of text and then to rank the unseen words according to various \n\tcriteria of significance; second, we want to be able to find passages that best match the existing \n\tvocabulary of a particular reader.\n\t</p>\n\t</li>\n\t<li>\n\t<p>\n\t<a name=\"scaife\"></a><b>The Scaife Digital Library</b>: Named after the late Ross Scaife, the Scaife Digital Library is \n");
      out.write("\tbeing developed as a distributed collection and a method whereby humanists from around the world \n\tcan automatically aggregate their content. The Scaife Digital Library contains durable objects \n\tthat (1) have received peer review, (2) are in sustainable formats such as the \n\t<a target=\"_blank\"\n    \thref=\"http://epidoc.sourceforge.net/resources.shtml\"\n    \tonclick=\"javascript: pageTracker._trackPageview('/outgoing/epiDoc');\">epiDoc TEI stylesheet</a>, (3) have a \n\tlong-term home such as an institutional repository separate from the producer of the object, and \n\t(4) are available under open licensing for third-party redistribution and/or further development.\n\t</p>\n\t<p>\n\tAll of the TEI-compliant XML texts already available for download from the Perseus Digital Library \n\tsatisfy the conditions 1, 2, and 4. Placing these and other objects within the \n\t<a target=\"_blank\" href=\"http://dl.tufts.edu/\"\n    \tonclick=\"javascript: pageTracker._trackPageview('/outgoing/TDL');\">Tufts Digital\n    \tLibrary</a> will satisfy the third condition. We plan \n");
      out.write("\ttherefore to move as many Perseus objects as possible into the Tufts Digital Library, with a \n\tparticular focus upon newly scanned image books and existing commentaries, lexica, encyclopedias \n\tand other materials not yet released under an open source license. Our goal at this stage is to \n\tprovide basic identifiers that will allow users to retrieve these objects from the Tufts Digital \n\tLibrary.\n\t</p>\n\t</li>\n\t<li>\n\t<p>\n\t<a name=\"repository\"></a><b>Institutional Repositories for Advanced Humanities Content</b>: The Scaife Digital Library addresses \n\tthe problem of long-term preservation for particular objects but we need services as well with which to \n\tuse the objects. Libraries have successfully maintained the products of intellectual labor for generations \n\tand have begun designing institutional repositories that can maintain digital content. These institutional \n\trepositories are, however, generally prepared to support very simple digital objects such as images and \n\tlightly structured journal articles. We are thus preparing to develop for one major institutional \n");
      out.write("\trepository system, <a target=\"_blank\"\n    \thref=\"http://www.fedora-commons.org/\" \n\tonclick=\"javascript: pageTracker._trackPageview('/outgoing/Fedora');\">Fedora</a>, the data models needed to \n\tsupport the more complex objects with which students of the three classical languages regularly work. \n\tThese include the ability to extract reference articles (e.g., the entry on Alexander the Great in \n\tencyclopedia A), dictionary entries and particular word senses from machine readable dictionaries \n\t(e.g., word sense II.2.a for word X), and the text associated with canonical text citations (e.g., \n\tthe Greek text and English translation for section 2, chapter 86, book 1 of Thucydides). To do this, \n\twe are starting to adapt the Perseus Digital Library system to work with Fedora as a backend system. \n\tThe goal of this effort is ultimately to release a version of the Perseus Digital Library system that \n\tinstitutions can download as a turn-key solution for scholarly collections.\n\t</p>\n\t</li>\n\t<li>\n\t<p>\n\t<a name=\"grid\"></a><b>Grid-Enabled Open Services</b>: The Perseus infrastructure has depended upon a traditional \n");
      out.write("\tarchitecture where we apply programs stored on local servers to locally stored texts and other \n\tdata. We are working with colleagues at Imperial College London to begin a distributed architecture \n\tthat works with services and collections from multiple sources. Such an architecture is designed to \n\tallow scholars and projects to create their own configurations, perhaps substituting one morphological \n\tanalyzer for another or adding new modules for particular text mining or visualization functions. \n\tSuch an architecture also allows us to tap into much greater computational resources, drawing upon \n\tservices driven by grid computing and/or the services from internet giants such as Google.\n\t</p>\n\t</li>\n</ul>\n\n</div> <!-- Research div -->\n</div> <!-- main_col div -->\n<div id=\"img_side_col\" style=\"font-size:small; text-align:left\">\n<h4>Research Themes</h4>\n<ul>\n<li><a href=\"#undergradresearch\">Enabling undergraduate research</a></li>\n<li><a href=\"#2500years\">2500 years later in 2010</a></li>\n<li><a href=\"#library\">A comprehensive, open source, fourth-generation library of Greek and Latin editions</a></li>\n");
      out.write("<li><a href=\"#collections\">Focused collections on selected Greek and Latin authors</a></li>\n<li><a href=\"#scalable\">Scalable methods to identify, transcribe and automatically tag Greek and Latin</a></li>\n<li><a href=\"#fragmentary\">Fragmentary authors</a></li>\n<li><a href=\"#machine\">From human-readable information to machine actionable knowledge</a></li>\n<li><a href=\"#borndigital\">Born-digital knowledge bases</a></li>\n<li><a href=\"#treebank\">The Classical Greek and Latin Treebank Projects</a></li>\n<li><a href=\"#datamining\">Text/Data-mining and the Automated production of new knowledge</a></li>\n<li><a href=\"#adaptinfo\">Adapting linguistic and cultural information for particular readers</a></li>\n<li><a href=\"#scaife\">The Scaife Digital Library</a></li>\n<li><a href=\"#repository\">Institutional Repositories for Advanced Humanities Content</a></li>\n<li><a href=\"#grid\">Grid-Enabled Open Services</a></li>\n</ul>\n</div>\n</div> <!-- 2column div -->\n</div> <!-- main div -->\n\t\t\n<!-- Google Analytics --> \n");
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