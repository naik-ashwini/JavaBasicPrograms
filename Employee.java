class Employee
{
	int employeeId;
	int salary;
	String designation;
	String name;
	
	public Employee(int employeeId, int salary, String designation, String name)
	{
		this.employeeId = employeeId;
		this.salary = salary;
		this.designation = designation;
		this.name = name;
	}
	
	public static void main (String args[])
	{
		Employee e1 = new Employee(101, 1000000, "Manager", "Ashish");
		
		System.out.println("employeeId is: "+e1.employeeId);
		System.out.println("salary is: "+e1.salary);
		System.out.println("designation is: "+e1.designation);
		System.out.println("name is: "+e1.name);
		
		Employee e2 = new Employee(102, 1200000, "Jr.Manager", "Priya");
		
		System.out.println("employeeId is: "+e2.employeeId);
		System.out.println("salary is: "+e2.salary);
		System.out.println("designation is: "+e2.designation);
		System.out.println("name is: "+e2.name);
		
		Employee e3 = new Employee(103, 1500000, "Sr.Manager", "Apeksha");
		
		System.out.println("employeeId is: "+e3.employeeId);
		System.out.println("salary is: "+e3.salary);
		System.out.println("designation is: "+e3.designation);
		System.out.println("name is: "+e3.name);
		
		Employee e4 = new Employee(104, 1300000, "Developer", "Asha");
		
		System.out.println("employeeId is: "+e4.employeeId);
		System.out.println("salary is: "+e4.salary);
		System.out.println("designation is: "+e4.designation);
		System.out.println("name is: "+e4.name);
	}
}