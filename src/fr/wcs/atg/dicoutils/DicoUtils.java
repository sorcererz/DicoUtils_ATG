package fr.wcs.atg.dicoutils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DicoUtils {

	public static void main(String[] args) {
		DicoIHM ihm = new DicoIHM();
		DicoLoader loader = new DicoLoader();
		DicoSearch search = new DicoSearch();
		String[] arrayDico = loader.load();
		ihm.display("Enter your name :");
		String name = ihm.read(); // new instance of a value typed into the terminal
		ihm.display(name);
		String zyth = "(.*)yth";
		ihm.display(search.byRegex(arrayDico, zyth));
	}
}
