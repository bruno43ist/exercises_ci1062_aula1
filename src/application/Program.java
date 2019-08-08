package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		/*build a program that reads a number and 
		returns f(x)
		0<=x<5, f(x) = x 
		5<=x<10; f(x) = 2x+1 
		x>=10; f(x) = x-3 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type a integer number: ");
		int number = sc.nextInt();
		
		System.out.println("The function returns: " + function(number));
		sc.close();
	}
	
	public static int function(int x) {
		if(x >= 0 && x < 5) {
			return x;
		} else if(x >= 5 && x < 10) {
			return (2*x+1);
		}
		return (x-3);
	}

}
