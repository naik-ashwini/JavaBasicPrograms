class MethodDemo
{
	static void print()
	{
		System.out.println("Print method started here!!!!");
		System.out.println("Hello!!!!");
		
		print1();
		
		System.out.println("Print method Ended here!!!!");
	}
	public static void print1()
	{
		System.out.println("Print1 method started here!!!!");
		System.out.println("Hii");
		System.out.println("Print1 method Ended here!!!!");
	}
	
	public static void main(String args[])
	{
		System.out.println("Main method started here!!!!");
		print();
		System.out.println("Main method ended here!!!!");
	}
}