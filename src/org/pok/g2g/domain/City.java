package org.pok.g2g.domain;

/**
 * 
 */

/**
 * A class that is to hold information about cities in Sweden. So far only 
 * names implemented.
 * @author Kristofer
 *
 */
public class City {
	
	private String cityName;
	
	public City(String cityName){
		this.cityName = cityName;
	}
	
	public String getCityName(){
		return cityName;
	}

}

