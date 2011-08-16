/**
 * 
 */
package org.pok.g2g.servlets;

import javax.servlet.http.HttpServletRequest;

import org.pok.g2g.domain.DomainRegister;

/**
 * A class responsible for holding references to other objects.
 * @author Kristofer
 *
 */
public class Repository {

	private DomainRegister dr;
	private HttpServletRequest hsr;
	
	public Repository(HttpServletRequest request){
		hsr = request;
	}
	
	public boolean checkIfInputIsCorrect(){
		boolean input;
		if(hsr.getParameter("Name").equals("")) 
			input = false;
		else 
			if(hsr.getParameter("PhoneNumber").equals(""))
				input = false;
			else 
				if(hsr.getParameter("Age").equals(""))
					input = false;
				else input = true;
		return input;
	}
	
	public DomainRegister getDomainRegister(){
		return dr;
	}
}
