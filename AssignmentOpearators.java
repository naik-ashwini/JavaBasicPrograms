class AssignmentOpearators
{
	public static void main(String args[])
	{
		int a = 15;
		int b = 20;
		
		a = b;           // a = b
		System.out.println("a = b: "+a);
		
		a += b;          // a = a+b
		System.out.println("a += b: "+a);
		
		a -= b;          // a = a-b;
		System.out.println("a -= b: "+a);
		
		a *= b;          // a = a*b;
		System.out.println("a *= b: "+a);
		
		a /= b;          // a = a/b;
		System.out.println("a /= b: "+a);
		
		a %= b;          // a = a%b;
		System.out.println("a %= b: "+a);
	}
}