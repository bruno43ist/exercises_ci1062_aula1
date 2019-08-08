package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
	
		/*build a program that reads multiple weights and heights and 
		returns how many are above ideal weight*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type your weight: ");
		double weight = sc.nextDouble();
		
		System.out.println("Type your height: ");
		double height = sc.nextDouble();
		
		int counter = 0;
		
		while(weight != -1.0 && height != -1.0) {
			if(weight/(height*height) > 25) {
				counter += 1;
			}
			
			System.out.println("Type your weight: ");
			weight = sc.nextDouble();
			
			if(weight != -1.0) {
				System.out.println("Type your height: ");
				height = sc.nextDouble();
			}
		}
		
		System.out.println(counter + " people are above weight! ");
		
		sc.close();
	}
}
