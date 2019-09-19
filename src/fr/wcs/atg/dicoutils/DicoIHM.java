package fr.wcs.atg.dicoutils;

import java.util.*;

public class DicoIHM {
	
	public void display(String arg) {
		System.out.println(arg);
	}
	
	public void displayWelcome() {
		display("Welcome to our dictionary!");
	}
	
	public void displayChoice() {
        display("1 = Rechercher la présence d'un mot exacte ");
        display("2 = Rechercher tous les mots qui commencent par une valeur ");
        display("3 = Rechercher tous les mots qui terminent par une valeur ");
        display("4 = Rechercher tous les mots qui contiennent une valeur ");
        display("5 = Rechercher des mots par une expression régulière ");
        display("0 = Pour quitter ");
    }
	
	public String read() {
		Scanner scan = new Scanner(System.in); //initialize the Scanner object and read the value of the terminal
		return scan.next(); //return the next string the user types in the terminal
	}
}
