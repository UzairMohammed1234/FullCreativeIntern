package Whileloop;
import java.util.*;
public class Fibonacci {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a=0,b=1,c;
		if(num==0)
		{
			System.out.println(0);
			
		}
		else if(num==1)
		{
			System.out.println(0+" "+1);
		}
		else
		{
			int count=2;
			System.out.print(0+" "+" ");
			while(count<=num)
			{	c=a+b;
				a=b;
				b=c;
				System.out.print(c+" ");
				count++;
			}
		}
	}
}
