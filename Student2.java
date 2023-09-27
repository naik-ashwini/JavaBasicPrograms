class Student2
{
	int rollNum;
	String name;
	String address;
	String subject;
	
	public Student2(int rollNum, String name, String address, String subject)
	{
		this.rollNum = rollNum;
		this.name = name;
		this.address = address;
		this.subject = subject;
	}
	public static void main (String args[])
	{
		Student2 s1 = new Student2(11, "Shivangi", "Nanded", "Maths");
		
		System.out.println(s1.rollNum);
		System.out.println(s1.name);
		System.out.println(s1.address);
		System.out.println(s1.subject);
		
		Student2 s2 = new Student2(12, "Deepak", "Delhi", "English");
		
		System.out.println(s2.rollNum);
		System.out.println(s2.name);
		System.out.println(s2.address);
		System.out.println(s2.subject);
		
		Student2 s3 = new Student2(13, "Asha", "Pune", "Hindi");
		
		System.out.println(s3.rollNum);
		System.out.println(s3.name);
		System.out.println(s3.address);
		System.out.println(s3.subject);	
	}
}