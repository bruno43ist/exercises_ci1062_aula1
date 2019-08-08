package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		//build a program that shows your entire name, 
		//your soccer team and your neighborhood
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Your name: ");
		String name = sc.nextLine();
		
		System.out.println("Your soccer team: ");
		String team = sc.nextLine();
		
		System.out.println("Your neighborhood: ");
		String nei = sc.nextLine();
		
		System.out.println("Your name is " + name + 
				"\nYour soccer team is " + team +
				"\nYour neighborhood is " + nei);
		
		sc.close();
	}

}
