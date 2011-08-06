package org.pok.g2g.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.pok.g2g.domain.Traveller;

/**
 * Servlet implementation class ServletTest
 */
@WebServlet("/ServletTest")
public class ServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int count;
	private Dao dao;
	
	
    /**
     * Default constructor. 
     */
    public ServletTest() {
        // TODO Auto-generated constructor stub
    }
    
    public void init() throws ServletException{
    	//Traveller t = new Traveller();
    	dao = new Dao();
    	try{
    	
    	}catch(Exception e){
    		getServletContext().log("An ecveption occurred in ServletTest", e);
    		throw new ServletException("An ecveption occurred in ServletTest" + e.getMessage());
    	}
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		session.setMaxInactiveInterval(5);
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		if (session.isNew()){
			count++;
		}
		out.println("This site has been accessed " + count + " times.");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	
	public void destroy(){
		super.destroy();
		try{
			dao.save(count);
		}catch(Exception e ){
			e.printStackTrace();
		}
	}

}
