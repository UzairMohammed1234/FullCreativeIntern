package Loops;
import java.util.*;
public class ForLoop {
	public static void main(String args[])
	{
		int[] arr;
		
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}
