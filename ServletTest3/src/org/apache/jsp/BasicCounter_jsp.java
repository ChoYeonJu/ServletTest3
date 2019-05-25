package org.apache.jsp;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspFactory;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.SkipPageException;

import org.apache.jasper.runtime.HttpJspBase;
import org.apache.jasper.runtime.JspSourceDependent;

/**
 * Servlet implementation class BasicCounter
 */
@WebServlet("/BasicCounter")
public class BasicCounter_jsp extends HttpJspBase implements JspSourceDependent{

	int count = 0;
	private static Map<String, Long> _jspx_dependants;
	
	
	@Override
	public Map<String, Long> getDependants() {
		// TODO Auto-generated method stub
		return _jspx_dependants;
	}

	@Override
	public void _jspService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		JspFactory _jspxFactory = null;
		PageContext pageContext = null;
		HttpSession session = null;
		ServletContext application = null;
		ServletConfig config = null;
		JspWriter out = null;
		Object page = null;
		JspWriter _jspx_out = null;
		PageContext _jspx_page_context = null;
		
		try {
			_jspxFactory = JspFactory.getDefaultFactory();
			response.setContentType("text/html");
			pageContext = _jspxFactory.getPageContext(this, request, response, null, true, 8192, true);
			_jspx_page_context = pageContext;
			application = pageContext.getServletContext();
			config = pageContext.getServletConfig();
			session = pageContext.getSession();
			out = pageContext.getOut();
			_jspx_out = out;
			out.write("\r<html>\r<body>\r");
			out.write("\rThe page count is now:  \r");
			out.println(++count);
			out.write("\r<body>\r<html>\r");
		}catch (Throwable t) {
			// TODO: handle exception
			if(!(t instanceof SkipPageException)) {
				out = _jspx_out;
				if(out != null && out.getBufferSize() != 0) {
					out.clearBuffer();
				}
				if(_jspx_page_context != null) {
					_jspx_page_context.handlePageException(t);
				}
			}
		}finally {
			if(_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
		}
		
	}
	

}
