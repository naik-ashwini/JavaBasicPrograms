class Sum_Square
{	
	public static int findSum(int a, int b)
	{
		int result = a + b;
		System.out.println("Sum is : "+result);
		
		findSquare(result);
		return result;
	}
	
	public static int findSquare(int result)
	{
		int square = result * result;
		System.out.println("Square  is : "+square);
		return square;
	}
	
	public static void main(String args[])
	{
		System.out.println("Main method started");
		findSum(2,6);
		System.out.println("Main method ended");
	}
}