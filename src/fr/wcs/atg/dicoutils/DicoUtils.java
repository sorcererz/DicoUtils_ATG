package fr.wcs.atg.dicoutils;

public class DicoUtils {

	public static void main(String[] args) {
		 DicoIHM ihm = new DicoIHM();
		 DicoLoader loader = new DicoLoader();
		 String[] arrayDico = loader.load();
		 ihm.display("Enter your name :");
		 String name = ihm.read(); //new instance of a value typed into the terminal
		 ihm.display(name);
		 for (int i = 0; i < arrayDico.length; i++) {
			ihm.display(arrayDico[i]);
		}
	}

}
