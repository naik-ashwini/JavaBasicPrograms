class MethodDemo1
{
	public void addition(int a, int b)
	{
		int res = a+b;
		System.out.println("Addition is: "+res);
	}
	
	public static void main(String args[])
	{		
		
		System.out.println("Main method started here!!!!");
		
		MethodDemo1 obj = new MethodDemo1();   //to call static from non static method we need to create an object
	    obj.addition(24,5);
		
		System.out.println("Main method ended here!!!!");
	}	
}