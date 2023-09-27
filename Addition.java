class Addition
{
	public static void sum(int a, int b)
	{
		int add = a+b;
		System.out.println("Sum= "+add);
		
		int sub = a-b;
		System.out.println("Subtraction= "+sub);
		
		int mul = a*b;
		System.out.println("Multiplication= "+mul);
		
		int div = a/b;
		System.out.println("Division= "+div);
	}


	public static void main(String args[])
	{
	    sum(24,5);     //to call from static to static method no need to create an object
	}	
}