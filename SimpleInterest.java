package assignment;

public class SimpleInterest {
	
	static int p=10000;
	static float r=13.5f;
	static int t=3;
	void simpleInt()
	{
		float SI=(p*r*t)/100;
		System.out.println("Total amount to be paid after Loan duration ends: "+(SI+p));
		
	}

}
