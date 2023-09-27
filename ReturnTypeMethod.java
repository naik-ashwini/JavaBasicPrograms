class ReturnTypeMethod
{
	public int add(int a,  int b)
	{
		System.out.println("add method started!!");
		int res = a+b;
		System.out.println("add method ended!!");
		return res;
	}
	
	public int square(int a)
	{
		System.out.println("square method started!!");
		int res = a*a;
		System.out.println("square method ended!!");
		return res;
	}
	
	public static void main(String args[])
	{
		System.out.println("Main method started!!");
		
		ReturnTypeMethod obj = new ReturnTypeMethod();
		
		int returnedValue = obj.add(50,20);
		
		int squaredValue = obj.square(4);
		
		System.out.println("addition is: "+returnedValue);
		System.out.println("addition is: "+squaredValue);
		System.out.println("Main method ended!!");
	}
}