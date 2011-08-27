/**
 * 
 */
package org.pok.g2g.domain;

/**
 * A class that is responsible for holding information about a location in
 * the real world. It's attributes contains latitude, longtitude and radius.
 * Meant to be used in interaction with googlemaps.
 * @author Kristofer
 *
 */
public class Location {
	
	double longtitude;
	double altitude;
	double radius;
	
	public Location(double longtitude, double altitude, double radius){
		this.longtitude = longtitude;
		this.altitude = altitude;
		this.radius = radius;
	}
	
	public String getGeoData(){
		return longtitude + " " + altitude + " " + radius;
	}
}
