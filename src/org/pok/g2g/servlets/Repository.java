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
	
	public DomainRegister getDomainRegister(){
		return dr;
	}
	
}
