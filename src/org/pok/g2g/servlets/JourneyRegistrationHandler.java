package org.pok.g2g.servlets;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.pok.g2g.domain.Journey;
import org.pok.g2g.domain.Location;
import org.pok.g2g.domain.DomainRegister;
import org.pok.g2g.helpers.JsonString;

/**
 * Servlet implementation class JourneyRegistrationHandler
 */
@WebServlet("/JourneyRegistrationHandler")
public class JourneyRegistrationHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JourneyRegistrationHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("startar dopost");
		Journey j = new Journey();
		JsonString responseJson = new JsonString(); 
		
		System.out.println(request.getParameter("oLatitude"));
		System.out.println(request.getParameter("oAltitude"));
		System.out.println(request.getParameter("oRadius"));
		System.out.println(request.getParameter("dLatitude"));
		System.out.println(request.getParameter("dAltitude"));
		System.out.println(request.getParameter("dRadius"));
		System.out.println(request.getParameter("jDescription"));
		System.out.println(request.getParameter("amountOfPassengers"));
		
		try{
			Location originLoc = new Location(Double.parseDouble(request.getParameter("oLatitude")), 
					Double.parseDouble(request.getParameter("oAltitude")), 
					Double.parseDouble(request.getParameter("oRadius")));
			
			Location destinationLoc = new Location(Double.parseDouble(request.getParameter("dLatitude")), 
					Double.parseDouble(request.getParameter("dAltitude")), 
					Double.parseDouble(request.getParameter("dRadius")));
			
			System.out.println("origin" + originLoc.getGeoData());
			System.out.println("dest" + destinationLoc.getGeoData());
			
			j.setOrigin(originLoc);
			j.setDestination(destinationLoc);
			j.setDescription(request.getParameter("jDescription"));
			j.setAmountOfPassengers(Integer.parseInt(request.getParameter("amountOfPassengers")));
			System.out.println("jamount" + j.getAmountOfPassengers());
			
			System.out.println(j.getAmountOfPassengers() + j.getDescription() + j.getDestination()
					+ j.getOrigin());
			
			if(j.saveJourney())
				responseJson.add("Success", "true");
			else
				responseJson.add("Success", "false");
			
			responseJson.add("journey", j.toJson());
		}catch (NumberFormatException nfe){
			responseJson.add("ERROR", nfe.getMessage());
		}finally{
			response.setContentType("text/html; charset=UTF-8");
			response.getWriter().print(responseJson.toString());
		}
	}
	
	
}
