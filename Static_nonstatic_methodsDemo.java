class Static_nonstatic_methodsDemo
{
	public void m1()
	{
		System.out.println("m1 method started!!");
		System.out.println("Inside m1");
		
		m3();                                     //to call from non static to non static method no need to create an object
		
		System.out.println("m1 method ended!!");
	}
	
	public static void m2()
	{
		System.out.println("m2 method started!!");
		System.out.println("Inside m2");
		System.out.println("m2 method ended!!");
	}
	
	public void m3()
	{
		System.out.println("m3 method started!!");
		System.out.println("Inside m3");
		
		m2();
		
		System.out.println("m3 method ended!!");
	}
	
	
	public static void main(String args[])
	{
		System.out.println("main method started!!");
		
		Static_nonstatic_methodsDemo obj = new Static_nonstatic_methodsDemo(); 
		
		obj.m1();
		
		System.out.println("main method ended!!");
	}
}