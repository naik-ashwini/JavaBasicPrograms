class FindMaxMinNumber
{
	 public static int maxNumber(int number1, int number2)
	 {
		 if(number1 > number2)
		 {
			 return number1;
		 }
		 else
		 {
			 return number2;
		 }
	 }
	 
	 public static int minNumber(int number1, int number2)
	 {
		 
		 //return(number1 < number2) ? number1 : number2;      This can be done simply by using ternary operator
		 
		 		 
		 if(number1 < number2)
		 {
			 return number1;
		 }
		 else
		 {
			 return number2;
		 }
	 }
	 
	 public static void main(String args[])
	 {
		 int maximumNum = maxNumber(40,60);
		 System.out.println("Maximum number is : "+maximumNum);
		 
		 int minimumNum = minNumber(40,60);
		 System.out.println("Minimum number is : "+minimumNum);
	 }
}