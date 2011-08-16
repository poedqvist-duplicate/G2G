package org.pok.g2g.servlets;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.pok.g2g.domain.Traveller;
import org.pok.g2g.helpers.JsonString;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Traveller t = new Traveller();
		JsonString responseJson = new JsonString(); 
		try{
			t.setName(request.getParameter("Name"));
			t.setPhoneNumber(request.getParameter("PhoneNumber"));
			t.setAge(Integer.parseInt(request.getParameter("Age")));
			
			if(t.saveTraveller())
				responseJson.add("Success", "true");
			else
				responseJson.add("Success", "false");
			
			responseJson.add("traveller", t.toJson());
		}catch (NumberFormatException nfe){
			responseJson.add("ERROR", nfe.getMessage());
		}finally{
			response.setContentType("text/html; charset=UTF-8");
			response.getWriter().print(responseJson.toString());
		}
	}

}
