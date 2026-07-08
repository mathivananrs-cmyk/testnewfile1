package newseleniumtesting;


class Animal
{
 void eat()
 {
	 
	 System.out.println("Eating");
 }
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking");
	}
}

public class InheritanceExamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Single Inheritance
        //We should create instance for a child class only not for parent
		
		Dog obj = new Dog();
		obj.bark();
		obj.eat();
		
		
		
		
	}

}
