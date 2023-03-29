package ExceptionHandling;
import java.util.*;
public class Try {
	public static void main(String args[])
	{
		try
		{
			int a=1/0;
		}

		catch(Exception e)
		{
			System.out.println("Exception caught" + e);
		}
		
	}
}
