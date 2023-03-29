package Strings;
import java.util.*;
public class StringBuilderClass {
	public static void main(String args[])
	{
		StringBuilder obj = new StringBuilder();
		Scanner sc=new Scanner(System.in);
		obj.append(sc.nextLine());
		String a="uzair";
		StringBuilder ob=new StringBuilder();
		ob.append(a);
		System.out.println(obj+" "+obj);
		
		StringBuilder obj1=new StringBuilder("hi");
		StringBuilder obj2=obj1;
		
		System.out.println(obj1==obj2);
		
	}
}
