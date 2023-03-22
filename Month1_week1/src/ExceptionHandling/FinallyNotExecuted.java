package ExceptionHandling;

public class FinallyNotExecuted {
	public static void main(String args[])
	{
		try
		{
			int a = 1/0 ;
			
		}
		catch(Exception e)
		{
			System.out.println("Error occured");
			System.exit(0);
		}
		finally
		{
			System.out.println("This will not be executed");
		}
		
		
	}
}
