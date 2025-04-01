package javapractice;

public class basic {
	//instance variables
	public static void main(String[] args)
	{
		
	double a = 3.0, b = 4.0;
	// c is dynamically initialized
	double c =Math.sqrt(a*a+b*b);
	double maxval=Math.max(a, b);

	System.out.println("Hypotenuse is " + c);
	System.out.println("max of 2 is " + maxval);

	}

}
