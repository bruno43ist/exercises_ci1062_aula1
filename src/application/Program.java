package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		//build a program that reads a number and 
		//tells if its positive 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type a integer number: ");
		int number = sc.nextInt();
		
		if(number >= 0) {
			System.out.println("This number is positive! ");
		} else {
			System.out.println("This number is NOT positive! ");
		}
		
		sc.close();
	}

}
