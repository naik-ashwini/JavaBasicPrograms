class Voting
{
	public static void votingMethod(int age)
	{
		if(age >= 18)
		{
			System.out.println("Your age is valid you can vote!!!");
		}
		else
		{
			System.out.println("Your age is invalid to vote you can't vote!!!");
		}
	}
	public static void main(String args[])
	{
		votingMethod(22);
	}
}  