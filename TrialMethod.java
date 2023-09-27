class TrialMethod
{
	public static boolean isGreater(int num)
	{
		if(num >= 50)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String args[])
	{
		if(isGreater(40)== true)
		{
			System.out.println("Its a greater number");
		}
		else
		{
			System.out.println("Its a smaller number");
		}
	}
}