package fr.wcs.atg.dicoutils;

public class DicoUtils {

	public static void main(String[] args) {
		DicoIHM ihm = new DicoIHM();
		DicoLoader loader = new DicoLoader();
		DicoSearch search = new DicoSearch();
		String[] arrayDico = loader.load();
		ihm.display("Enter your name :");
		String name = ihm.read(); // new instance of a value typed into the terminal
		ihm.display(name);
		String zyth = "z";
		ihm.display(search.byEquals(arrayDico, zyth));
		String answer = search.byStartsWith(arrayDico, zyth);
		ihm.display(answer);
	}
}
