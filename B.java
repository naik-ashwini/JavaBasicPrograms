class B extends A
{
	int i;
	 
	 public B()
	{
		super(); this(10);                                 // this is not allowed in constructor
		System.out.println("Inside B() Constructor!!");
	}	
	
	public B(int i)
	{
		System.out.println("Inside B(int i) Constructor!!");
		this.i = i;
	}
}