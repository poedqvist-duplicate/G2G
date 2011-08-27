package org.pok.g2g.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Tester
 */
@WebServlet("/Tester")
public class Tester extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Tester() {
        super();
        // TODO Auto-generated constructor stub
    }

	/* *
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * /
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}*/

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//First-test return a string
		//response.getWriter().println("<html><head><title>En svarssida</title></head>\n" +
			//	"<body><p>Hej här står svarstexten!</p></body></html>");
		//then show all parameters..
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		//out.println("HEJ");
		out.println("{\"name\":\"P-O\",\"age\":\"26\", \"journey\":{\"destination\":\"Göteborg\"}}");
		//{"name":"P-O", "age":"26", "journey":{"destination":"Göteborg"} }
		/*String docType =  "<!DOCTYPE <!DOCTYPE HTML PUBLIC HTML PUBLIC \"-//W3C//DTD //W3C//DTD HTML 4.0 HTML 4.0   " +
						"Transitional//EN\">\n";
		String title = "Reading All Request Parameters";
		out.println(docType +
		"<HTML>\n" +
		"<HEAD><TITLE>"+title + "</TITLE></HEAD>\n"+
		"<BODY BGCOLOR=\"#FDF5E6\">\n" +
		"<H1 <H1 ALIGN=CENTER> ALIGN=CENTER>" + title + title + "</H1> </H1>\\nn" +
		"<TABLE BORDER=1 ALIGN=CENTER>\n" +
		"<TR BGCOLOR=\"#FFAD00\">\n" +
		"<TH>Parameter Name<TH>Parameter Value(s)");
		Enumeration<String> paramNames = request.getParameterNames();
		while(paramNames.hasMoreElements()) {
			String paramName = (String)paramNames.nextElement();
			out.print("<TR><TD>" + paramName + "\n<TD>");
			String[] paramValues = request.getParameterValues((paramName));
			if (paramValues.length == 1) {
				String paramValue = paramValues[0];
			if (paramValue.length() == 0)
				out.println("<I>No Value</I>");
			else
				out.println(paramValue);
			} else {
				out.println("<UL>");
				for(int i=0; i<paramValues.length; i++) {
					out.println("<LI>" + paramValues[i]);
				}
				out.println("</UL>");
			}
		}
		
		out.println("</TABLE>\n</BODY></HTML>");
		*/
		//later return a json...
	}

}
