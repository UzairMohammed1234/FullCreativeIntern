package ExceptionHandling;
import java.util.*;
public class DemoOfFinally {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		try
		{
			int arr[]=new int[2];
			arr[3]=1;
		}
		catch(Exception e)
		{
			System.out.println("Array index out of bounds exception "+e);
		}
		finally
		{
			System.out.println("This will always execute");
		}
	}
}	
