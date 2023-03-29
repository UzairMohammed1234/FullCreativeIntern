package Conditionals;
import java.util.*;
public class ifelseifelse {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),maxi=a;
		
		if(b>maxi)
		{
			maxi=b;
			
		}
		if(c>maxi)
		{
			maxi=c;
		}
		System.out.println(maxi);
		sc.skip("");
		String fruit=sc.nextLine();
		if(fruit.equals("apple"))
		{
			System.out.println("Apple is fruit");
		}
		else if(fruit.equals("banana"))
		{
			System.out.println("Banana is fruit");
		}
		else 
		{
			System.out.println("Fruit is other than apple or banana");
		}
	}
}
