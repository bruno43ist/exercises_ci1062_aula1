package application;

public class Program {

	public static void main(String[] args) {
	
		//solution of equation xˆ2+x-6=0
		int a = 1;
		int b = 1;
		int c = -6;
		
		//delta
		int delta = (b * b) - (4 * a * c);
		
		double x1 = ((-b) + Math.sqrt(delta)) / ((double)2*a);
		double x2 = ((-b) - Math.sqrt(delta)) / ((double)2*a);
		
		System.out.println("x1 = " + String.format("%.2f", x1) + "\nx2 = " + String.format("%.2f", x2));
	}

}
