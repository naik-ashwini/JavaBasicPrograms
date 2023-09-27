class LeapYear
{
	public static void isLeapYear(int number)
	{
		if((number % 4 == 0 && number % 100 != 0) || (number % 400 == 0))
		{
			System.out.println(number+" is a leap year.");
		}
		else
		{
			System.out.println(number+" is not a leap year.");
		}
	}
	
	public static void main(String args[])
	{	
		isLeapYear(2023);
	}
}