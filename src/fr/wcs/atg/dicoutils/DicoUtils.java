package fr.wcs.atg.dicoutils;

public class DicoUtils {

	public static void main(String[] args) {
		 DicoIHM ihm = new DicoIHM();
		 ihm.displayWelcome();
		 ihm.display("Enter your name :");
		 String name = ihm.read(); //new instance of a value typed into the terminal
		 ihm.display(name);
	}

}
