class TestConstructor1
{
	public static void main(String args[])
	{
		Student1 s = new Student1();
		
		s.age = 10;
		s.height = 3;
		s.weight = 28;
		s.roll = 12;
		s.name = "Vijay";
		
		System.out.println(s.age);
		System.out.println(s.height);
		System.out.println(s.weight);
		System.out.println(s.roll);
		System.out.println(s.name);		
		
		Student1 s1 = new Student1();
		
		System.out.println(s1.age);
		System.out.println(s1.height);
		System.out.println(s1.weight);
		System.out.println(s1.roll);
		System.out.println(s1.name);	
		
		Teacher1 t = new Teacher1();
		
		t.age = 19;
		t.height = 4;
		t.weight = 35;
		t.name = "Sanjana";
		t.subject = "English";
		
		System.out.println(t.age);
		System.out.println(t.height);
		System.out.println(t.weight);
		System.out.println(t.name);
		System.out.println(t.subject);	
		
		Student1 s2 = new Student1(14, "Anju", 15, 4, 30);
		
	    System.out.println(s2.roll);
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.height);
		System.out.println(s2.weight);	
		
	}
}