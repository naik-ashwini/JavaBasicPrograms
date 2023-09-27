import java.util.Scanner;

class SwitchCaseDemo3
{
	public static void main(String args[])
	{	
		System.out.println("Please enter a size: ");
		
		Scanner s = new Scanner(System.in);
		String sizeInString = s.next();
		
		System.out.println("Entered size: "+sizeInString);
		
		Integer size = Integer.parseInt(sizeInString);
		
		sizeGen(size);
	}
	
	public static void sizeGen(int size)
	{
		switch(size)
		{
			case 28 :
			System.out.println("Small");
			break;
			
			case 32:
			System.out.println("Medium");
			break;
			
			case 40 :
			System.out.println("Large");
			break;
			
			case 42 :
			System.out.println("Extra Large");
			break;
			
			default:
			System.out.println("Invalid size");
			break;
		}
	}
}