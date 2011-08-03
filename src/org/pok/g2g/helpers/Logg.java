package org.pok.g2g.helpers;

import javax.swing.JOptionPane;

/**
 * This class is used to logg and store important information about the execution
 * of the page/application. Stores information in text file if not specified as
 * debug-mode. If debug-mode then print information in Console/Pop-upmessages..
 * @author P-O Edqvist
 *
 */
public class Logg {
	
	boolean debugMode = false;
	
	public Logg(){}
	public Logg(boolean debug){
		debugMode = debug;
	}
	
	public void write(String mess, boolean file){
		if (debugMode){
			if (file){
			
			}else
				System.out.println(mess);
		}
		else
			JOptionPane.showMessageDialog(null, "NOT IMPLEMENTED!!");
	}
	
	/**
	 * assuming that you want to run debug-mode...
	 * @param mess
	 */
	public static void write(String mess){
		System.out.println(mess);
	}

}
