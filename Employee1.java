class Employee1
{
	int id; 
	String name;
	String dept;
	
	
	public Employee1()
	{
		this(10);                           //this(); it is uded to call a another constructor of a same class
	}
	
	public Employee1(int id)
	{
		this(id, "Ram");		
	}
	
	public Employee1(int id, String name)
	{
		this(id, name, "IT");
	}
	
	public Employee1(int id, String name, String dept)
	{
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
}