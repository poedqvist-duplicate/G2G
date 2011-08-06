package org.pok.g2g.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String DELETE_JSP = "/Delete.jsp";
	private static String EDIT_JSP = "/Edit.jsp";
	private static String SHOWALL_JSP = "/ShowAll.jsp";

	private static String s = "";
	
	public Controller(){
		s = "Constucotr";
	}

    public void init() throws ServletException{
    	s = "init";
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] forward;
		// Get a map of the request parameters
		//@SuppressWarnings("unchecked")
		Map<String, String[]> parameters = request.getParameterMap();
		if (parameters.containsKey("delete")){
			forward = parameters.get("delete");//DELETE_JSP;
		} else if (parameters.containsKey("edit")){
			forward = parameters.get("edit");//forward = EDIT_JSP;
		} else {
			forward = new String []{"bla"};//forward = SHOWALL_JSP;
		}
		//RequestDispatcher view = request.getRequestDispatcher(forward);
		//view.forward(request, response);
		
		PrintWriter out = response.getWriter();
		String retVal = "";
		for (String s : forward){
			retVal += s;
		}
		out.println("<html><head></head><body><p>Information to you: " + retVal + "</p></body></html>");
	}
	
	
}
