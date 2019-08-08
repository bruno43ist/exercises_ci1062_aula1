package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		/*build a program that reads 3 numbers and 
		returns if they form a triangle and what type it is*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type the first measure: ");
		double a = sc.nextDouble();
		
		System.out.println("Type the second measure: ");
		double b = sc.nextDouble();
		
		System.out.println("Type the last measure: ");
		double c = sc.nextDouble();
		
		if(formTriangle(a, b, c)) {
			int type = typeTriangle(a, b, c);
			if(type == 0) {
				System.out.println("ERROR!");
			} else if( type == 1) {
				System.out.println("EQUILATERAL!");
			} else if( type == 2) {
				System.out.println("ISOSCELES!");
			} else if( type == 3) {
				System.out.println("SCALENE!");
			}
		} else {
			System.out.println("This measures can't form a triangle!");
		}
		
		
		sc.close();
	}
	
	//this function returns true if the three measures can form a triangle
	public static boolean formTriangle(double a, double b, double c) {
		double module = Math.abs(b - c);
		if(a > module && a < (b+c)) {
			module = Math.abs(a - c);
			if(b > module && b < (a+c)) {
				module = Math.abs(a - b);
				if(c > module && c < (a+b)) {
					return true;
				}
			}
		}
		return false;
	}
	
	//this function returns the type of the triagle
	// 0 ->error
	// 1 -> equilateral
	// 2 -> isosceles
	// 3->  scalene
	public static int typeTriangle(double a, double b, double c) {
		if(a == b && a == c) {
			return 1;
		}
		if(a != b && a != c && b != c) {
			return 3;
		}
		if(a == b || a == c || b == c) {
			return 2;
		}
		return 0;
	}

}
