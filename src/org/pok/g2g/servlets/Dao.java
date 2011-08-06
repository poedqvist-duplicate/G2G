package org.pok.g2g.servlets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Dao {
	public int getCount(){
		int count = 0;
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		PrintWriter writer = null;
		try{
			File f = new File("FileCounter.initial");
			if (!f.exists()){
				f.createNewFile();
				writer = new PrintWriter(new FileWriter(f));
				writer.println(0);
			}
			if (writer != null){
				writer.close();
			}
			
			fileReader = new FileReader(f);
			bufferedReader = new BufferedReader(fileReader)	;
			String initial = bufferedReader.readLine();
			count = Integer.parseInt(initial);
		}catch (Exception ec){
			if (writer != null){
				writer.close();
			}
		}
		if (bufferedReader != null){
			try{
				bufferedReader.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		return count;
	}
	
	public void save(int count) throws Exception{
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
		fileWriter = new FileWriter("FileCounter.initial");
		printWriter = new PrintWriter(fileWriter);
		printWriter.println(count);
		
		if (printWriter != null){
			printWriter.close();
		}
	}
}
