package newseleniumtesting;

public class throwexcexample {

	static void checkeligibility(int age, int weight)
	{
		if ((age<12) && (weight<40))
		{
			throw new ArithmeticException("student is not eligible for registration");
		}
		else
		{
			System.out.println("Student Entry is valid");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    throwexcexample.checkeligibility(10,35);
		
		
	}

}
