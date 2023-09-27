class TestBlock extends Parent
{
	
	public TestBlock()
	{
		System.out.println("Inside no-arg Constructor");
	}
	
	{
		System.out.println("Inside Instance block 2");
	}
	
	static
	{
		System.out.println("Inside Static block 2");
	}
	
	public static void printHello()
	{
		System.out.println("Inside PrintHello!!");
	}
	
	static
	{
		System.out.println("Inside Static block 1");
	}
	
	 public void printHi()
	{
		System.out.println("Inside PrintHi!!");
	}
	
	{
		System.out.println("Inside Instance block 1");
	}
	
	public static void main(String args[])
	{
		System.out.println("Inside main method!!");
		
		TestBlock t1 = new TestBlock();
		
		printHello();
		t1.printHi();
	}
}