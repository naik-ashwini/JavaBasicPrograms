class FinalVariableDemo
{
	public static void main(String args[])
	{
		final Integer i = 50;              //All the wrappers & String is immutable in nature that's why 	                                   
		i = 40;                            //its value is not changing here
		System.out.println(i);
	}
}