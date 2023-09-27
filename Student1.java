class Student1 extends Person1
{
   int roll;
   String name;
   
   public Student1()
   {
	   
   }
   
   public Student1(int roll, String name)
   {
	   
	this(15, "Anu", 16, 5, 26);
	   
	this.roll = roll;
    this.name = name;	
	
	
   }
   
   public Student1(int roll, String name, int age, int height, int weight)
   {
	   this.roll = roll;
       this.name = name;
	   this.age = age;
	   this.height = height;
	   this.weight = weight;
   }
}