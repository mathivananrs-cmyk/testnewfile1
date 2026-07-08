package newseleniumtesting;

abstract class Bike
{
abstract void run();
abstract void walk();
{
System.out.println("Walking");	
}
void eat()
{
	System.out.println("Eating");
}
}


public class Abstractexamp extends Bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Abstractexamp obj = new Abstractexamp();
		//Bike obj = new Bike();
		obj.run();
		obj.walk();
		obj.eat();

	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Running");
	}

	@Override
	void walk() {
		// TODO Auto-generated method stub
		System.out.println("walking");
	}

}
