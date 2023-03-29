package CollectionsArrayList;
import java.util.*;

public class TraversingArrayList {
	public static void main(String args[])
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		
		int size=sc.nextInt();
		
		for(int i=0;i<size;i++)
		{
			list.add(sc.nextInt());
		}
		
		for(int i:list)
		{
			System.out.println(i);
		}
		
		
		
		
	}
}
