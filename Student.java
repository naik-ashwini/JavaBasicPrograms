class Student
{
	int rollNum;
	String name;
	String address;
	static String sub = "Maths";
	
	public static void main(String args[])
	{
		Student s1 = new Student();
		
		s1.rollNum = 11;
		s1.name = "Raju";
		s1.address = "Pune";
		 	
		System.out.println(s1.rollNum);
		System.out.println(s1.name);
		System.out.println(s1.address);
		System.out.println(sub);
		
		Student s2 = new Student();
		
		s2.rollNum = 12;
		s2.name = "Asha";
		s2.address = "Mumbai";
		 	
		System.out.println(s2.rollNum);
		System.out.println(s2.name);
		System.out.println(s2.address);
		System.out.println(sub);
	}
}