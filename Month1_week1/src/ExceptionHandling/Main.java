package ExceptionHandling;


public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		try {
		   	   try{
		       int arr[]={1,2};
		       System.out.println(arr[4]);
		   }
		   catch(Exception e)
		   {
		       System.out.println("Andar pakda gaya");
		      
		   }
		   finally
		   {
		       System.out.println("Andar ka bhi chala");
		   }
		   	   System.out.println(" work");
		} 
		catch(Exception e) {
		    System.out.println("error pakda gaya");
		}
		finally
		{
		    System.out.println("Bahar ka bhi chala");
		}
		
		System.out.println("Bri");
	}
}

