package Task;
import java.util.*;
class Vehicle 
{
	HashMap<String,ArrayList<String>> map = new HashMap<>(); 
	ArrayList<String> list =new ArrayList<String>();
	ArrayList<String> ud=new ArrayList<String>();
	public void add_user(String temp) 
	{	
		ud.add(temp);
		StringBuilder panid=new StringBuilder();
		for(int i=0;i<temp.length();i++)
		{
			if(temp.charAt(i)!=',')
			{
				panid.append(temp.charAt(i));
			}
			else {
				break;
				}   
		}
		list.add(panid.toString());
	}
	
	public void addVehicle(String temp)
	{	int count=0;
		StringBuilder panid=new StringBuilder(); 
		for(int i=0;i<temp.length();i++)
		{
			if(temp.charAt(i)!=',')
			{
				panid.append(temp.charAt(i));
				count+=1;
			}
			else
				break;
		}
		
		if(list.contains(panid.toString())) {
			if(map.containsKey(panid.toString()))
			{
				map.get(panid.toString()).add(temp.substring(count+1));
			}
			else {
			map.put(panid.toString(), new ArrayList<String>());
			map.get(panid.toString()).add(temp.substring(count+1));
			}
		}
		else
		{
			System.out.println("Register the user first before adding vehicle");
		}
	
	}
	public void get_Vehicles_Info(String temp)
	{
		if(list.contains(temp))
		{
			String arr[];
			
			for(int i=0;i<ud.size();i++)
			{
				if(ud.get(i).indexOf(temp)> -1)
				{
					arr=ud.get(i).split(",");
					System.out.println(Arrays.toString(arr).replace(",", "\n").replace("[", "").replace("]", ""));
					break;   
				}
			}
			
			if(map.containsKey(temp))
			{
				System.out.println(temp);
				for(int i=0;i<map.get(temp).size();i++)
				{
					System.out.println("Vehicle of User"+map.get(temp).get(i));
				}
			}
		}
		else
		{
			System.out.println("There is no user with this registered id");
		}
	}
}
public class Test {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Vehicle beh=new Vehicle();
		beh.add_user("dl-sd-as,utsav,M,26");
		beh.addVehicle("dl-sd-ad,Car,Maruti Suzuki Brezza,dl-01-12345");
		beh.get_Vehicles_Info("dl-sd-ad");
	}
}
