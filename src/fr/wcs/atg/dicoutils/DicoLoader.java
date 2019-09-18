package fr.wcs.atg.dicoutils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DicoLoader {

	public String[] load() {
		
		
		//files loading
		final String FILENAME = "dictionnaire.txt";

		try (BufferedReader bufferedreader = new BufferedReader(new FileReader(FILENAME))) {
			String strCurrentLine;
			List<String> arrayLines = new ArrayList<String>();
			while ((strCurrentLine = bufferedreader.readLine()) != null) {
				arrayLines.add(strCurrentLine);
			}			
			//Array with size 
			String[] arrayDico = new String[arrayLines.size()];
			arrayDico = arrayLines.toArray(arrayDico);
			return arrayDico;
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return null;

	}

}
