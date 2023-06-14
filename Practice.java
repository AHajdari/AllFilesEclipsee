import java.util.Scanner;

public class Practice {
	
	public static double findMax(double a, double b, double c) {
		double max_num = a;
		
		if(b > max_num) {
			max_num = b;
		}
		
		if(c > max_num) {
			max_num = c;
		}
		
		return max_num;
			

		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter three floating numbers");
		double number1 = scan.nextDouble();
		double number2 = scan.nextDouble();
		double number3 = scan.nextDouble();
		
		double result = findMax(number1, number2, number3);
		
		System.out.println("The maximum number is " + result);
		
	

	}

}
