class NestedIfElse
{
	public static void main(String args[])
	{
		int a = 20;
		int b = 50;
		int c = 10;
		
		if(a > b)
		{	
			if(a > c)
			{
				System.out.println("A is Greater number");
			}
			else
			{
				System.out.println("C is Greater number");
			}
		}
		else
		{
			if(b > c)
			{
				System.out.println("B is Greater number");
			}
			else
			{
				System.out.println("C is Greater number");
			}
		}
	}
}