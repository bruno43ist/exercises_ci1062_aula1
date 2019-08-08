package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		/*build a program that reads a number and 
		prints the multiplication table of this number from 1 to 10*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type the number: ");
		int a = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(a + " X " + i + " = " + a*i);
		}
		
		sc.close();
	}
}
