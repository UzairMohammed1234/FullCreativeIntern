package Whileloop;
import java.util.*;
public class Reverse {
	public static void main(String args[])
	{
		
		
		int temp=0;
		int rev=0;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rem;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		System.out.println("reverse of a number is "+rev);
	}
}
