package March7;
import java.util.*;
public class TryBlock {
	public static void main(String args[])
	{
	//	Scanner sc=new Scanner(System.in);
		
		try
		{
			int a=2/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.exit(0);
		}
		finally
		{
			System.out.println("This is block which is always executed");
		}
	}
}
