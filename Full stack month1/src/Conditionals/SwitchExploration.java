package Conditionals;
import java.util.*;
public class SwitchExploration {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		// we will determine fruits 
		String fruit=sc.nextLine();
		switch(fruit)
		{
			case "apple" : System.out.println("THis is apple fruit"); break;
			case "banana" : System.out.println("This is banana");break;
			case "promaganate" : System.out.println("This is promogonate");break;
			default: System.out.println("Papaya");break;
			
		}
		
		
		
		
	}
}
