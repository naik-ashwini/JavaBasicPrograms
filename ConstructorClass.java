class ConstructorClass
{
	int i;
	int j;
	
	public ConstructorClass()
	{
		this.i=10;
		this.j=190;
	}
	
	public static void main(String args[])
	{
	   ConstructorClass c = new ConstructorClass();
	   
	   System.out.println(c.i);
	   System.out.println(c.j);
	}
}