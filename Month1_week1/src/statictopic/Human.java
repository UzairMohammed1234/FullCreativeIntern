package statictopic;

public class Human {
	int age;
	String name;
	static int population;
	
	public Human(int age,String name)
	{
		this.age=age;
		this.name=name;
		Human.population+=1;
	}
	
	static void greet(Human obj)
	{
		System.out.println(obj.name);
	}
	
	
}
