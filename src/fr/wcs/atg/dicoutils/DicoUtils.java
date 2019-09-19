package fr.wcs.atg.dicoutils;

public class DicoUtils {

	public static void main(String[] args) {
		DicoIHM ihm = new DicoIHM();
		DicoLoader loader = new DicoLoader();
		DicoSearch search = new DicoSearch();
		String[] arrayDico = loader.load();
		ihm.displayWelcome();
		String strChoice;
		int choice;

		do {
			ihm.displayChoice();
			strChoice = ihm.read(); // new instance of a value typed into the terminal
			choice = Integer.parseInt(strChoice);

			switch (choice) {
			case 1:
				ihm.display("Enter your word :");
				String type1 = ihm.read(); // new instance of a value typed into the terminal
				ihm.display(type1);
				ihm.display(search.byEquals(arrayDico, type1));
				break;
			case 2:
				ihm.display("Enter your word :");
				String type2 = ihm.read(); // new instance of a value typed into the terminal
				ihm.display(type2);
				ihm.display(search.byContains(arrayDico, type2));
				break;
			case 3:
				ihm.display("Enter your word :");
				String type3 = ihm.read(); // new instance of a value typed into the terminal
				ihm.display(type3);
				ihm.display(search.byStartsWith(arrayDico, type3));
				break;
			case 4:
				ihm.display("Enter your word :");
				String type4 = ihm.read(); // new instance of a value typed into the terminal
				ihm.display(type4);
				ihm.display(search.byEndsWith(arrayDico, type4));
				break;
			case 5:
				ihm.display("Enter your word :");
				String type5 = ihm.read(); // new instance of a value typed into the terminal
				ihm.display(type5);
				ihm.display(search.byRegex(arrayDico, type5));
				break;
			default:
				ihm.display("Sortie");
				break;
			}

		} while (choice != 0);
	}
}

