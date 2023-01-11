/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.82
 * Generated at: 2022-12-01 11:58:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.reservation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.kh.exhibition.model.vo.Exhibition;
import com.kh.member.model.vo.*;
import java.util.Date;

public final class reservationListView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/reservation/../common/footerbar.jsp", Long.valueOf(1667872950000L));
    _jspx_dependants.put("/views/reservation/../common/menubar.jsp", Long.valueOf(1667870372000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("com.kh.member.model.vo");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kh.exhibition.model.vo.Exhibition");
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');

	String contextPath = request.getContextPath();

	String alertMsg = (String)session.getAttribute("alertMsg");
	
	String errorMsg = (String)session.getAttribute("errorMsg");
	
	Member loginUser = (Member)session.getAttribute("loginUser");
	Grade grade = (Grade)session.getAttribute("grade");	

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <!-- 메뉴바 아이콘 -->\r\n");
      out.write("    <script src=\"https://kit.fontawesome.com/c7bfbb0e5b.js\" crossorigin=\"anonymous\"></script> \r\n");
      out.write("    <!-- 부트스트랩 css 사용 -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://bootswatch.com/5/lux/bootstrap.css\">\r\n");
      out.write("    <!-- JavaScript Bundle with Popper -->\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <!-- jQuery -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-1.12.4.min.js\" ></script>\r\n");
      out.write("    <!-- ajax jQuery -->\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <title>JV ARTCENTER</title>\r\n");
      out.write("    <!-- index.jsp 타이틀보다 우선하기 때문에 주석처리 -->\r\n");
      out.write("    <!-- 모두 동일한 타이틀을 위해 변경함 -->\r\n");
      out.write("  </head>\r\n");
      out.write("  <style>\r\n");
      out.write("\r\n");
      out.write("    /* ---------- 전체 스타일 ---------- */\r\n");
      out.write("    html, body { width : 1900px; }\r\n");
      out.write("    div {  /*표 확인용 */\r\n");
      out.write("        /* border: 0.5px solid lightgrey;  */\r\n");
      out.write("        box-sizing: border-box;\r\n");
      out.write("    }\r\n");
      out.write("    .wrap {\r\n");
      out.write("      width: 1900px;\r\n");
      out.write("    }\r\n");
      out.write("    a {\r\n");
      out.write("      text-decoration: none;   \r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* header, content, footer의 공통속성 : 가로길이 100% */\r\n");
      out.write("    .wrap > div {\r\n");
      out.write("      width: 100%;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* ---------- header ---------- */\r\n");
      out.write("    #header {\r\n");
      out.write("      height: 150px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* 메인메뉴 전체를 감싸는 ul */\r\n");
      out.write("    #navbar_menu>a {\r\n");
      out.write("      display: block;\r\n");
      out.write("      line-height: 35px;\r\n");
      out.write("    }\r\n");
      out.write("    #navbar_menu {\r\n");
      out.write("      display: flex;\r\n");
      out.write("      list-style: none;\r\n");
      out.write("      padding-left: 0;\r\n");
      out.write("      font-size: large;\r\n");
      out.write("      position: relative;\r\n");
      out.write("      margin-left: 550px;\r\n");
      out.write("    }\r\n");
      out.write("    #navbar_menu>li {\r\n");
      out.write("      font-size: 20px;\r\n");
      out.write("      position: static;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* 각 메인 메뉴 */\r\n");
      out.write("    .nav-item {\r\n");
      out.write("      font-size: 20px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* 메인메뉴 우측 아이콘 */\r\n");
      out.write("    #navbar_icons {\r\n");
      out.write("      font-size: 20px;\r\n");
      out.write("      display: flex;\r\n");
      out.write("      padding: 5px 10px;\r\n");
      out.write("    }\r\n");
      out.write("    #search,\r\n");
      out.write("    #user,\r\n");
      out.write("    #calender,\r\n");
      out.write("    #exit {\r\n");
      out.write("      padding: 10px 12px;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    /* 서브메뉴를 담당하는 ul 태그에 대한 스타일 */\r\n");
      out.write("    #navbar_menu>li>div {\r\n");
      out.write("      list-style-type: none;\r\n");
      out.write("      padding: 0px;\r\n");
      out.write("      display: none; /* 평소에는 안보여주다가 마우스가 올라가는 순간 보여지게끔 */\r\n");
      out.write("      position: absolute;\r\n");
      out.write("    }\r\n");
      out.write("    /* 메인메뉴에 마우스가 올라가는 순간 서브메뉴가 펼쳐져서 보이게끔 */\r\n");
      out.write("    #navbar_menu>li>a:hover + div {\r\n");
      out.write("      display: block; /* 메인메뉴에만 마우스가 올라갔을때만 유지됨 */\r\n");
      out.write("    }\r\n");
      out.write("    /* 서브메뉴에도 마우스가 올라갈 때 펼쳐진게 유지될 수 있게끔 */\r\n");
      out.write("    #navbar_menu > li > div:hover {\r\n");
      out.write("      display: block;\r\n");
      out.write("    }\r\n");
      out.write("    /* 서브메뉴 글씨만 좀 더 작게 보이게끔 */\r\n");
      out.write("    #navbar_menu > li > div a {\r\n");
      out.write("      font-size: 15px;\r\n");
      out.write("    }\r\n");
      out.write("    #navbar_menu > li > div a:hover {\r\n");
      out.write("      font-size: 18px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* 고정된 세부메뉴 전체를 감싸는 div */\r\n");
      out.write("    #navi {\r\n");
      out.write("      height: 75px;\r\n");
      out.write("      text-align: center;\r\n");
      out.write("    }\r\n");
      out.write("    #navi>a {\r\n");
      out.write("    	margin: 15px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* ---------- content ---------- */\r\n");
      out.write("    #content {\r\n");
      out.write("      height: 1050px;\r\n");
      out.write("      display: flex;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #content > div {\r\n");
      out.write("      height: 100%;\r\n");
      out.write("    }\r\n");
      out.write("    #content_1 {\r\n");
      out.write("      width: 15%;\r\n");
      out.write("      float: left;\r\n");
      out.write("    }\r\n");
      out.write("    #content_2 {\r\n");
      out.write("      width: 70%;\r\n");
      out.write("      height: 100%;\r\n");
      out.write("    }\r\n");
      out.write("    #content_3 {\r\n");
      out.write("      width: 15%;\r\n");
      out.write("      float: right;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    /* 모달 */\r\n");
      out.write("    .modal-body>div {\r\n");
      out.write("    	column-count: 2;\r\n");
      out.write("    	column-gap: 80px;\r\n");
      out.write("    	padding: 20px;\r\n");
      out.write("    }\r\n");
      out.write("    .modal-body>div h3 {\r\n");
      out.write("    	font-size: 22px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("  </style>\r\n");
      out.write("  <body>\r\n");
      out.write("  	<script>\r\n");
      out.write("	\r\n");
      out.write("		if(\"");
      out.print( alertMsg );
      out.write("\" != \"null\") {\r\n");
      out.write("			alert(\"");
      out.print( alertMsg );
      out.write("\");\r\n");
      out.write("			// 알림창을 띄워준 후 session 에 담긴 해당 메세지를 지워줘야함\r\n");
      out.write("			// 안그러면 menubar.jsp 가 로딩될 때마다 매번 alert 가 계속 뜰 것!!\r\n");
      out.write("			\r\n");
      out.write("			");
 session.removeAttribute("alertMsg"); 
      out.write("\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		if(\"");
      out.print( errorMsg );
      out.write("\" != \"null\") {\r\n");
      out.write("			alert(\"");
      out.print( errorMsg );
      out.write("\");\r\n");
      out.write("			");
 session.removeAttribute("errorMsg"); 
      out.write("\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("	</script>\r\n");
      out.write("  \r\n");
      out.write("    <div class=\"wrap\">\r\n");
      out.write("      <!--전체를 감싸는 wrap영역-->\r\n");
      out.write("\r\n");
      out.write("      <div id=\"header\">\r\n");
      out.write("        <!--헤더영역-->\r\n");
      out.write("        \r\n");
      out.write("        <div>\r\n");
      out.write("          <nav class=\"navbar navbar-expand-lg navbar-light bg-light\" style=\"border: 1px 0px;\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("              <a class=\"navbar-brand\" href=\"");
      out.print( contextPath );
      out.write("\"><span style=\"margin-left: 10px;\">JV</span> ART CENTER</a>\r\n");
      out.write("              <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarColor03\" aria-controls=\"navbarColor03\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("              </button>\r\n");
      out.write("              <div class=\"collapse navbar-collapse\" id=\"navbarColor03\">\r\n");
      out.write("                <ul class=\"navbar-nav me-auto\" id=\"navbar_menu\">\r\n");
      out.write("                  <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\" href=\"");
      out.print( contextPath );
      out.write("/list.ex?term=C&currentPage=1\">전시</a>\r\n");
      out.write("                    <div class=\"dropdown-menu\">\r\n");
      out.write("                      <a class=\"dropdown-item\" href=\"");
      out.print( contextPath );
      out.write("/list.ex?term=C&currentPage=1\">현재전시</a>\r\n");
      out.write("                      <a class=\"dropdown-item\" href=\"");
      out.print( contextPath );
      out.write("/list.ex?term=P&currentPage=1\">지난전시</a>\r\n");
      out.write("                      <a class=\"dropdown-item\" href=\"");
      out.print( contextPath );
      out.write("/list.ex?term=F&currentPage=1\">오픈예정</a>\r\n");
      out.write("                   \r\n");
      out.write("                    </div>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"nav-item\">\r\n");
      out.write("                  	<a class=\"nav-link\" href=\"\" id=\"resvlink\">예매</a>\r\n");
      out.write("                  	<script>\r\n");
      out.write("                  		$(\"#resvlink\").click(function() {\r\n");
      out.write("                  			\r\n");
      out.write("                  			if(\"");
      out.print( loginUser );
      out.write("\" == \"null\") {\r\n");
      out.write("                  				alert(\"로그인 후 이용 가능합니다.\");\r\n");
      out.write("                  				$(\"#resvlink\").attr(\"href\", \"");
      out.print( contextPath );
      out.write("/login\");\r\n");
      out.write("                  			} else {\r\n");
      out.write("                  				$(\"#resvlink\").attr(\"href\", \"");
      out.print( contextPath );
      out.write("/list.resv\");\r\n");
      out.write("                  			}\r\n");
      out.write("                  		})\r\n");
      out.write("                  	</script>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\" href=\"");
      out.print( contextPath );
      out.write("/info\">안내</a>\r\n");
      out.write("                    <div class=\"dropdown-menu\">\r\n");
      out.write("                      <a class=\"dropdown-item\" href=\"");
      out.print( contextPath );
      out.write("/info\">JV소개</a>\r\n");
      out.write("                      <a class=\"dropdown-item\" href=\"");
      out.print( contextPath );
      out.write("/location\">전시관 안내</a>\r\n");
      out.write("                      <a class=\"dropdown-item\" href=\"");
      out.print( contextPath );
      out.write("/facility\">편의시설 안내</a>\r\n");
      out.write("                      <a class=\"dropdown-item\" href=\"");
      out.print( contextPath );
      out.write("/directions\">오시는길</a>\r\n");
      out.write("                      \r\n");
      out.write("                    </div>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"nav-item dropdown\">\r\n");
      out.write("                    <a class=\"nav-link dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\" href=\"");
      out.print( contextPath );
      out.write("/list.no?currentPage=1\">서비스</a>\r\n");
      out.write("                    <div class=\"dropdown-menu\">\r\n");
      out.write("                      <a class=\"dropdown-item\" href=\"");
      out.print( contextPath );
      out.write("/list.no?currentPage=1\">공지사항</a>\r\n");
      out.write("                      <a class=\"dropdown-item\" href=\"");
      out.print( contextPath );
      out.write("/faq\">FAQ</a>\r\n");
      out.write("                      <a class=\"dropdown-item\" href=\"\" id=\"qnaMenu\">1대1 문의</a>\r\n");
      out.write("                      <a class=\"dropdown-item\" href=\"");
      out.print( contextPath );
      out.write("/list.news?currentPage=1\">뉴스레터</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                \r\n");
      out.write("                <script>\r\n");
      out.write("	                $(\"#qnaMenu\").click(function() {\r\n");
      out.write("	          			\r\n");
      out.write("	          			if(\"");
      out.print( loginUser );
      out.write("\" == \"null\") {\r\n");
      out.write("	          				alert(\"로그인 후 이용 가능합니다.\");\r\n");
      out.write("	          				$(\"#qnaMenu\").attr(\"href\", \"");
      out.print( contextPath );
      out.write("/login\");\r\n");
      out.write("	          			} else {\r\n");
      out.write("	          				$(\"#qnaMenu\").attr(\"href\", \"");
      out.print( contextPath );
      out.write("/enrollForm.qna\");\r\n");
      out.write("	          			}\r\n");
      out.write("	          		})\r\n");
      out.write("		        </script>   \r\n");
      out.write("                \r\n");
      out.write("              </div>\r\n");
      out.write("              <div id=\"navbar_icons\">\r\n");
      out.write("                <a href=\"\" onclick=\"thisYear();\" data-bs-toggle=\"modal\" data-bs-target=\"#thisYear\"\r\n");
      out.write("                  ><i id=\"calender\" class=\"fa-regular fa-calendar-days\" ></i\r\n");
      out.write("                ></a>\r\n");
      out.write("                ");
 if(loginUser == null) { 
      out.write("\r\n");
      out.write("                	<a href=\"");
      out.print( contextPath );
      out.write("/login\"><i id=\"user\" class=\"fa-regular fa-user\"></i></a>\r\n");
      out.write("                ");
 } else { 
      out.write("\r\n");
      out.write("                	<a href=\"");
      out.print( contextPath );
      out.write("/mypageMain.me\"><i id=\"user\" class=\"fa-regular fa-user\"></i></a>\r\n");
      out.write("                	<a href=\"");
      out.print( contextPath );
      out.write("/logout.me\"><i id=\"exit\" class=\"fa-solid fa-arrow-right-from-bracket\"></i></a>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("                \r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      <!-- 달력 -->\r\n");
      out.write("		<div class=\"modal\" tabindex=\"-1\" id=\"thisYear\">\r\n");
      out.write("			<div class=\"modal-dialog modal-xl modal-dialog-centered\">\r\n");
      out.write("				<div class=\"modal-content\">\r\n");
      out.write("					<div class=\"modal-header\">\r\n");
      out.write("					<h3 class=\"modal-title\">&nbsp;&nbsp;&lt;<b style=\"color: red;\">2022</b> 올해의 전시&gt;</h3>\r\n");
      out.write("					<button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"modal-body\">\r\n");
      out.write("						<div style=\"margin: 40px;\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("      \r\n");
      out.write("      <script>\r\n");
      out.write("      function thisYear() {\r\n");
      out.write("    	  \r\n");
      out.write("    	  $.ajax({\r\n");
      out.write("			url : \"year.ex\",\r\n");
      out.write("			success : function(result) {\r\n");
      out.write("				\r\n");
      out.write("				var str = \"\";\r\n");
      out.write("				\r\n");
      out.write("				if(result.length != 0) {\r\n");
      out.write("					\r\n");
      out.write("   					for(var i = 0; i < result.length; i++) {\r\n");
      out.write("   						\r\n");
      out.write("   						str += \"<h4>▷ \" + result[i].exTitle + \"</h4>\"\r\n");
      out.write("						 	 + \"<h5>\" + result[i].startDate + \" ~ \" + result[i].endDate + \"</h5><br>\";\r\n");
      out.write("   					}\r\n");
      out.write("				} else {\r\n");
      out.write("					\r\n");
      out.write("					str = \"<h2 align='center;'>올해 기획된 전시가 없습니다.</h2>\";\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("				$(\".modal-body>div\").html(str);\r\n");
      out.write("			},\r\n");
      out.write("			error : function() {\r\n");
      out.write("				\r\n");
      out.write("				console.log(\"ajax 통신 실패\");\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      </script>\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
      out.write('\r');
      out.write('\n');

	ArrayList<Exhibition> list = (ArrayList<Exhibition>)request.getAttribute("list");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>JV Art Center</title>\r\n");
      out.write("<style>\r\n");
      out.write("	/* 각자 필요한 content 길이만큼 height 속성값 수정해서 길이 조정 */\r\n");
      out.write("	#content { height: 3200px; }\r\n");
      out.write("	\r\n");
      out.write("	/* ----- Reservation 공통 스타일 ----- */\r\n");
      out.write("	  /* 전체적으로 조금씩 띄우기 */\r\n");
      out.write("	  #content_2 * { margin: 1px; }\r\n");
      out.write("	  /* 상단 스텝바 세로길이 */\r\n");
      out.write("	  #resv_step {\r\n");
      out.write("	      height : 75px;\r\n");
      out.write("	  }\r\n");
      out.write("	  /* 각 스텝 div */\r\n");
      out.write("	  #resv_step>div {\r\n");
      out.write("	      display: inline-block;\r\n");
      out.write("	      width: 32%; /* margin 이 들어가 있어서 1/3 씩 */\r\n");
      out.write("	      height: 100%;\r\n");
      out.write("	      margin: 1px;\r\n");
      out.write("	      line-height: 70px;\r\n");
      out.write("	      font-weight: bold;\r\n");
      out.write("	  }\r\n");
      out.write("	  /* 진행됐거나 진행 중인 단계에만 스타일 적용 */\r\n");
      out.write("	  #resv_step_1 {\r\n");
      out.write("	    background-color: black;\r\n");
      out.write("	      color: white;\r\n");
      out.write("	  }\r\n");
      out.write("		\r\n");
      out.write("	/* ----- ReservationStep1 스타일 ----- */\r\n");
      out.write("	  /* 스텝바를 제외한 전체 영역 */\r\n");
      out.write("	  #resv_content {\r\n");
      out.write("	      height: 100%;\r\n");
      out.write("	      margin-top: 35px;\r\n");
      out.write("	  }\r\n");
      out.write("	\r\n");
      out.write("	  /* 검색창 */\r\n");
      out.write("	  #resv_search { height: 60px; }\r\n");
      out.write("	  #resv_search input {\r\n");
      out.write("	    height: 100%;\r\n");
      out.write("	    border: 1px solid black;\r\n");
      out.write("	    margin: 0px;\r\n");
      out.write("	    box-sizing: border-box;\r\n");
      out.write("	  }\r\n");
      out.write("	  #resv_search input[type=button] {\r\n");
      out.write("	    vertical-align: top; /* 텍스트 입력칸과 높이가 맞지 않아서 상단으로 올렸음 */\r\n");
      out.write("	    line-height: 8px;\r\n");
      out.write("	  }\r\n");
      out.write("	  #searchExKeyword {\r\n");
      out.write("	  	padding-left : 10px;\r\n");
      out.write("	  }\r\n");
      out.write("	\r\n");
      out.write("	  /* 테이블 확인용 테두리 */\r\n");
      out.write("	  /* #resv_list td { border: 1px solid red;} */\r\n");
      out.write("	  /* 전시 목록 테이블 전체 */\r\n");
      out.write("	  #resv_list {\r\n");
      out.write("	    margin: auto;\r\n");
      out.write("	    width: 60%;\r\n");
      out.write("	    table-layout: fixed; /* 테이블 사이즈가 어떤 경우에도 바뀌지 않도록 */\r\n");
      out.write("	    margin-top: 50px;\r\n");
      out.write("	  }\r\n");
      out.write("	  #resv_list tr {\r\n");
      out.write("	  	height: 100px;\r\n");
      out.write("	  }\r\n");
      out.write("	  \r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"wrap\">\r\n");
      out.write("      <!--전체를 감싸는 wrap영역-->\r\n");
      out.write("      \r\n");
      out.write("      <div id=\"navi\">\r\n");
      out.write("        <!--세부메뉴 영역-->\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div id=\"content\">\r\n");
      out.write("        <!--바디-->\r\n");
      out.write("        <div id=\"content_1\"></div>\r\n");
      out.write("        <div id=\"content_2\">\r\n");
      out.write("\r\n");
      out.write("          <div id=\"resv_step\" align=\"center\">\r\n");
      out.write("            <div id=\"resv_step_1\">01.티켓선택</div>\r\n");
      out.write("            <div id=\"resv_step_2\">02.관람일/인원선택</div>\r\n");
      out.write("            <div id=\"resv_step_3\">03.결제</div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <br>\r\n");
      out.write("\r\n");
      out.write("          <div id=\"resv_content\">\r\n");
      out.write("            <div id=\"resv_search\" align=\"center\">\r\n");
      out.write("              <input type=\"text\" id=\"searchExKeyword\" style=\"width: 300px;\">\r\n");
      out.write("              <input type=\"button\" class=\"btn btn-primary\" value=\"검색\" onclick=\"searchExList();\">\r\n");
      out.write("          	</div>\r\n");
      out.write("            \r\n");
      out.write("	          <br>\r\n");
      out.write("			\r\n");
      out.write("			<table id=\"resv_list\">\r\n");
      out.write("	          	\r\n");
      out.write("				");
 if(!list.isEmpty()) { 
      out.write("\r\n");
      out.write("\r\n");
      out.write("					");
 for(Exhibition ex : list) { 
      out.write("\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td width=\"40%\" height=\"300 !important\" rowspan=\"3\">\r\n");
      out.write("								<button type=\"button\" style=\"padding: 5px;\">\r\n");
      out.write("									<img src=\"");
      out.print( contextPath );
      out.write('/');
      out.print( ex.getExThumbnail() );
      out.write("\" width=\"230px\" height=\"300px\">\r\n");
      out.write("									<input type=\"hidden\" value=\"");
      out.print( ex.getExNo() );
      out.write("\">\r\n");
      out.write("								</button>\r\n");
      out.write("							</td>\r\n");
      out.write("							<td rowspan=\"3\" width=\"10%\"></td>\r\n");
      out.write("							<td style=\"vertical-align: bottom;\"><h3>");
      out.print( ex.getExTitle() );
      out.write("</h3></td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td><h4>");
      out.print( ex.getLcCode() );
      out.write("</h4></td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td style=\"vertical-align: top;\">");
      out.print( ex.getStartDate() );
      out.write(' ');
      out.write('~');
      out.write(' ');
      out.print( ex.getEndDate() );
      out.write("</td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						<tr style=\"height: 20px !important;\"></tr>\r\n");
      out.write("					");
 } 
      out.write("\r\n");
      out.write("				");
 } else { 
      out.write("\r\n");
      out.write("					<h2 align=\"center\" style=\"margin-top: 200px;\">현재 예매 가능한 전시가 없습니다.</h2>\r\n");
      out.write("				");
 } 
      out.write("\r\n");
      out.write("	          </table>\r\n");
      out.write("	          \r\n");
      out.write("	          <script>\r\n");
      out.write("	          	$(function() {\r\n");
      out.write("	          		\r\n");
      out.write("	          		$(document).on(\"click\", \"#resv_list button>img\", function() {\r\n");
      out.write("	          			\r\n");
      out.write("	          			location.href = \"");
      out.print( contextPath );
      out.write("/detail.resv?exno=\" + $(this).next().val();\r\n");
      out.write("	          		});\r\n");
      out.write("\r\n");
      out.write("	          	});\r\n");
      out.write("\r\n");
      out.write("				function searchExList() {\r\n");
      out.write("\r\n");
      out.write("					$.ajax({\r\n");
      out.write("						url : \"search.resv\",\r\n");
      out.write("						data : { keyword : $(\"#searchExKeyword\").val() },\r\n");
      out.write("						success : function(result) {\r\n");
      out.write("\r\n");
      out.write("							var str = \"\";\r\n");
      out.write("							\r\n");
      out.write("							if(result.length != 0) {\r\n");
      out.write("								\r\n");
      out.write("								for(var i = 0; i < result.length; i++) {\r\n");
      out.write("								\r\n");
      out.write("									str += \"<tr>\"\r\n");
      out.write("										+ 		\"<td width='40%' height='300 !important' rowspan='3'>\"\r\n");
      out.write("										+ 		\"<button type='button' style='padding: 5px;'>\"\r\n");
      out.write("										+			\"<img src=");
      out.print( contextPath );
      out.write("/\" + result[i].exThumbnail + \" width='230px' height='300px'>\"\r\n");
      out.write("										+ 			\"<input type='hidden' value='\" + result[i].exNo + \"'>\"\r\n");
      out.write("										+ 		\"</button>\"\r\n");
      out.write("										+ 		\"</td>\"\r\n");
      out.write("										+ 		\"<td rowspan='3' width='10%'></td>\"\r\n");
      out.write("										+ 		\"<td style='vertical-align: bottom;'><h3>\" + result[i].exTitle + \"</h3></td>\"\r\n");
      out.write("										+ \"</tr>\"\r\n");
      out.write("										+ \"<tr><td><h4>\" + result[i].lcCode + \"</h4></td></tr>\"\r\n");
      out.write("										+ \"<tr><td style='vertical-align: top;'>\" + result[i].startDate + \" ~ \" + result[i].endDate + \"</td></tr>\"\r\n");
      out.write("										+ \"<tr style='height: 20px !important;'></tr>\";\r\n");
      out.write("								}\r\n");
      out.write("							} else {\r\n");
      out.write("\r\n");
      out.write("								str = \"<h2 align='center' style='margin-top: 200px;'>해당 키워드가 포함된 전시가 없습니다.</h2>\";\r\n");
      out.write("								\r\n");
      out.write("							}\r\n");
      out.write("\r\n");
      out.write("							$(\"#resv_list\").html(str);\r\n");
      out.write("\r\n");
      out.write("						},\r\n");
      out.write("						error : function() {\r\n");
      out.write("							console.log(\"ajax 통신 실패\");\r\n");
      out.write("						}\r\n");
      out.write("\r\n");
      out.write("					});\r\n");
      out.write("				}\r\n");
      out.write("	          </script>\r\n");
      out.write("			\r\n");
      out.write("	          \r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"content_3\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <title>footerbar</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  <style>\r\n");
      out.write("\r\n");
      out.write("    /* ---------- footer ---------- */\r\n");
      out.write("    #footer {\r\n");
      out.write("      background-color: black;\r\n");
      out.write("      color: white;\r\n");
      out.write("      padding : 30px;\r\n");
      out.write("      width: 100%;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* ---------하단에 딱 달라붙게 하는 css---------- */\r\n");
      out.write("    * {\r\n");
      out.write("      margin: 0;\r\n");
      out.write("    }\r\n");
      out.write("    /* 리셋을 하지 않은 경우 추가 */\r\n");
      out.write("\r\n");
      out.write("    html, body {\r\n");
      out.write("      height: 100%;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .wrapper {\r\n");
      out.write("      min-height: 100%;\r\n");
      out.write("      margin: 0 auto -155px;\r\n");
      out.write("    }\r\n");
      out.write("    /* 하단 마진은 푸터의 높이 값과 같다 */\r\n");
      out.write("\r\n");
      out.write("    footer, .push {\r\n");
      out.write("      height: 155px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* ------------------------------------------ */\r\n");
      out.write("\r\n");
      out.write("    #footer>p {\r\n");
      out.write("        padding: 10px;\r\n");
      out.write("        box-sizing: border-box;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #footer_etc {\r\n");
      out.write("      padding: 10px;\r\n");
      out.write("    }\r\n");
      out.write("    #footer_etc a {\r\n");
      out.write("      text-decoration: none;\r\n");
      out.write("      color: white;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("  </style>\r\n");
      out.write("  <body>\r\n");
      out.write("     <!--전체를 감싸는 wrap영역-->\r\n");
      out.write("      <div class=\"wrap\">\r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write("      <div id=\"footer\">\r\n");
      out.write("        <!--푸터-->\r\n");
      out.write("        <div id=\"footer_etc\">\r\n");
      out.write("            <a href=\"");
      out.print( contextPath );
      out.write("/privacypolicy\">개인정보처리방침</a> |\r\n");
      out.write("            <a href=\"");
      out.print( contextPath );
      out.write("/tos\">이용약관</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <br><br>\r\n");
      out.write("        <p>\r\n");
      out.write("          JV ART CENTER<br />\r\n");
      out.write("          서울특별시 영등포구 선유동2로 57 <br /><br />\r\n");
      out.write("\r\n");
      out.write("          Tel 1544-9970<br />\r\n");
      out.write("\r\n");
      out.write("          © 2022 JV Arts Center All right reserved.\r\n");
      out.write("        </p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
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
}
