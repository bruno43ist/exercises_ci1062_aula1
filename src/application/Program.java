package application;

public class Program {

	public static void main(String[] args) {
		
	
		//build a program that prints the 10 first multiples of 3
		
		int n = 3, sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			int mult = n * i;
			sum += mult;
		}
		
		System.out.println(sum);
	}
}
