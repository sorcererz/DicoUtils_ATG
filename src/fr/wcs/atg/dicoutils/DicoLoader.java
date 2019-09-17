package fr.wcs.atg.dicoutils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DicoLoader {

	public static void main(String[] args) {

		final String FILENAME = "dictionnaire.txt";

		try (BufferedReader bufferedreader = new BufferedReader(new FileReader(FILENAME))) {
			String strCurrentLine;
			while ((strCurrentLine = bufferedreader.readLine()) != null) {
				System.out.println(strCurrentLine);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

}
