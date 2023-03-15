package Test;
import java.util.Scanner;

public class Intern {
	private int id;
	private String name;
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.nextLine();
		String nam=sc.nextLine();
		Intern obj=new Intern();
		obj.setId(num);
		obj.setName(nam);
		System.out.println(obj.getId());
		System.out.println(obj.getName());
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
}
