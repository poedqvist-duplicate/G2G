package org.pok.g2g.domain;

import org.pok.g2g.domain.City;

/**
 * A class that is to keep track of a journeys start and endcities, the stops it 
 * may have in different locations.
 * @author Kristofer
 *
 */
public class Journey {
	
	private City startCity;
	private City endCity;
	//private City stopCity;
	
	public Journey (City startCity, City endCity){
		this.startCity = startCity;
		this.endCity = endCity;
	}
	
	public void setStartCity(City startCity){
		this.startCity = startCity;
	}
	
	public void setEndCity(City endCity){
		this.endCity = endCity;
	}
	
	public String getStartCity(){
		return startCity.getCityName();
	}
	
	public String getEndCity(){
		return endCity.getCityName();
	}

}

