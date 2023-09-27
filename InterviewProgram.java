class InterviewProgram
{
	public static void guessTheSeason(int month)
	{
		switch(month)
		{
			case 1:
			case 10:
			case 11:
			case 12:
			
			System.out.println("Winter Season!!");
			break;
			
			case 2:
			case 3:
			case 4:
			case 5:
			
			System.out.println("Summer Season!!");
			break;
			
			case 6:
			case 7:
			case 8:
			case 9:
			
			System.out.println("Rainy Season!!");
			break;
			
			default:
			System.out.println("Invalid Season!!");
			break;
		}
	}
	
	public static void main(String args[])
	{
		guessTheSeason(7);
	}
}