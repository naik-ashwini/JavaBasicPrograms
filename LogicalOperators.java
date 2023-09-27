class LogicalOperators
{
	public static void main(String args[])
	{
		
		int a = 5;
		int b = 15;
		
		//------------Logical AND ----------------
		boolean res1 = (a < b) && (b > a); // true && true = true
		boolean res2 = (a < b) && (b < a); // true && false = false
		boolean res3 = (a > b) && (b > a); // false && true = false
		boolean res4 = (a > b) && (b < a); // false && false = false
		
		System.out.println("res1: "+res1);
		System.out.println("res2: "+res2);
		System.out.println("res3: "+res3);
		System.out.println("res4: "+res4);
		
		//------------Logical OR ----------------
		boolean res5 = (a < b) || (b > a); // true && true = true
		boolean res6 = (a < b) || (b < a); // true && false = true
		boolean res7 = (a > b) || (b > a); // false && true = true
		boolean res8 = (a > b) || (b < a); // false && false = false
		
		System.out.println("res5: "+res5);
		System.out.println("res6: "+res6);
		System.out.println("res7: "+res7);
		System.out.println("res8: "+res8);
		
		//------------Logical NOT ----------------
		boolean res9 = !(a<b);
		boolean res10 = !(a>b);
		
		System.out.println("res9: "+res9);   //false
		System.out.println("res10: "+res10);   //true
		
	}
}