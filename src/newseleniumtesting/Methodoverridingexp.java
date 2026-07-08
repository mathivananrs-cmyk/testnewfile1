package newseleniumtesting;

class Bike3
{
	void run()
	{
		System.out.println("Running");
	}
}

public class Methodoverridingexp extends Bike3 {

	void run()
	{
		
		//Super keyword is used only for Method overriding in Inheritancel
		super.run();
		System.out.println("Child class - Bike is running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methodoverridingexp obj = new Methodoverridingexp();
		obj.run();
		
		

	}

}
