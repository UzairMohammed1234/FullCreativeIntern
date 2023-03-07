package Whileloop;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[])
	{
		
		
		int temp=0;
		int rev=0;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		temp=num;
		int rem;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		if(temp==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}
}
