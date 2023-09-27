import java.util.Scanner;

class SwitchCase2
{
	public static void main(String args[])
	{
		String input;
		
		sizeGenerator("Medium");	
	}
		
		public static void sizeGenerator(String input)
		{
            input = input.toLowerCase();
			   
		switch(input)
		{
			case "small":
			System.out.println("Size is - 28");
			break;
			
			case "medium":
			System.out.println("Size is - 30");
			break;
			
			case "large":
			System.out.println("Size is - 40");
			break;
			
			case "extra large":
			System.out.println("Size is - 42");
			break;
			
			default:
			System.out.println("Invalid size");
			break;
		}		
    }		
}