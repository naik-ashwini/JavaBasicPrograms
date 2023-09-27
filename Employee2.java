class Employee2
{
	int id; 
	String name;
	String dept;
	
	public Employee2()
	{
	                                  //No - arg Constructor
	}
	
	public Employee2(int id)
	{
		this.id = id;                 //Parameterized Constructor with 1 arg
	}
	
	public Employee2(int id, String dept)
	{
		this.id = id;
		this.dept = dept;            //Parameterized Constructor with 2 args
	}
	
	public Employee2(int id, String dept, String name)
	{
		this.id = id;
		this.dept = dept;           //Parameterized Constructor with 3 args
		this.name = name;
	}
	
	public static void main(String args[])
	{
	   Employee2 c1 = new Employee2();
	   
	   c1.id = 101;
	   c1.name = "ash";
	   c1.dept = "IT";
	   
	   System.out.println(c1.id);
	   System.out.println(c1.name);
	   System.out.println(c1.dept);
	   
       Employee2 c2 = new Employee2(102);
	   
	   System.out.println(c2.id);
	   System.out.println(c2.name);
	   System.out.println(c2.dept);
	   
	   Employee2 c3 = new Employee2(103, "HR");
	   
	   System.out.println(c3.id);
	   System.out.println(c3.name);
	   System.out.println(c3.dept);
	   
	   Employee2 c4 = new Employee2(104, "Account", "Ajay");
	   
	   System.out.println(c4.id);
	   System.out.println(c4.name);
	   System.out.println(c4.dept);
	}
}