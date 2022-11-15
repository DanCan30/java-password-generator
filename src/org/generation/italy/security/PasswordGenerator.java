package org.generation.italy.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Inserisci il nome: ");
		String name = sc.nextLine();

		System.out.print("Inserisci il cognome: ");
		String surname = sc.nextLine();

		System.out.print("Inserisci il tuo colore preferito: ");
		String favColor = sc.nextLine();
		
		System.out.print("Inserisci il giorno di nascita(dd): ");
		int dayOfBirth = sc.nextInt();
		
		System.out.print("Inserisci il mese di nascita(mm): ");
		int monthOfBirth = sc.nextInt();
		
		System.out.print("Inserisci l'anno di nascita(yyyy): ");
		int yearOfBirth = sc.nextInt();
		
		System.out.println("Data di nascita: " + dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth);
		
		int birthSum = dayOfBirth + monthOfBirth + yearOfBirth;
		
		System.out.println("La tua password è: " + name + "-" + surname + "-" + favColor + "-" + birthSum);
	}
}
