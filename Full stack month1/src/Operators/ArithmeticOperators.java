package Operators;
import java.util.Scanner;
public class ArithmeticOperators {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		//Arithmetic operators 
		
		// + operator
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int sum = a+b;
		
		// - operator
		
		int difference = a-b;
		
		// * -multiplication operator
		
		int multiplication = a*b;
		
		//   /-division operator
		
		double division = a/b;
		
		double rem= a%b;
		
		
		System.out.println("Sum by using + operator "+sum);
		System.out.println("Difference using - operator"+difference);
		System.out.println("Multiplication using * operator "+multiplication);
		System.out.println("Division using / operator "+division);
		System.out.println("Remainder using % operator "+rem);
		
		
		
	}
}
