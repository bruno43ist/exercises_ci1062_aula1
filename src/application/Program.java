package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		/*build a program that reads multiple numbers while different -1 and 
		prints the sum of all these numbers*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type a number: ");
		int a = sc.nextInt();
		
		int sum = 0;
		
		if(a != -1) {
			while(a != -1) {
				sum += a;
				System.out.println("Type another number: ");
				a = sc.nextInt();
			}
		}
		
		System.out.println("The sum is: " + sum);
		
		sc.close();
	}
}
