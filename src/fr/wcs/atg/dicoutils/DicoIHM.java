package fr.wcs.atg.dicoutils;

import java.util.*;

public class DicoIHM {
	
	public static void display(String arg) {
		System.out.println(arg);
	}
	
	public static void displayWelcome() {
		display("Welcome to our dictionary!");
	}
	
	public static String read() {
		Scanner scan = new Scanner(System.in); //initialize the Scanner object and read the value of the terminal
		return scan.next(); //return the next string the user types in the terminal
	}
}
