class DataTypePromotions
{
public static void main(String args[])
{
	/*byte a = 124;
	short b = a;
	
	System.out.println("value of B "+b);
	*/
	
	int c = 655;
	byte d = (byte)c;
	System.out.println("value of D after explicit casting: "+d);
	
	char p = 'A';
	int i = p;
	
	System.out.println("Value of I after casting: "+i);
	
	char a = (char)d;
	System.out.println("Value of A after explicit casting: "+a);

    float f = c;
	System.out.println("Value of F after casting: "+f);
	
	
    double g = c;
	System.out.println("Value of G after casting: "+g);
	
	long h = c;
	System.out.println("Value of H after casting: "+h);
}
}