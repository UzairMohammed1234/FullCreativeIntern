package Strings;

public class StringEquals {
	public static void main(String args[])
	{
		String a="Uzair";
		String b=new String("Uzair");
		
		System.out.println(a==b); //false as it has different references
		System.out.println(a.equals(b)); //true
	}
}
