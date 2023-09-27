class Person
{
	String name;
	int height;
	float weight;
	
	public Person()
	{
		
	}
	
	public Person(int height, String name, float weight)
	{
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public static void main(String args[])
	{
		Person p1 = new Person(6, "Ashu", 58.2f);
		
		System.out.println(p1.name);
		System.out.println(p1.height);
		System.out.println(p1.weight);
		
		Person p2 = new Person();
	}
}