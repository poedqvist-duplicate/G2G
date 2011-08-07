package org.pok.g2g.servlets;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class wsTraveller
 */
@WebServlet(description = "Test getting travellers from domain", urlPatterns = { "/wsTraveller" })
public class wsTraveller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public wsTraveller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//To get the values from the parameters..
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
	}

}