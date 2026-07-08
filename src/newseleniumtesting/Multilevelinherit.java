package newseleniumtesting;


class Animal1
{
 void eat()
 {
	 
	 System.out.println("Eating");
 }
}
class Dog1 extends Animal1
{
	void bark()
	{
		System.out.println("Barking");
	}
}

class Cat extends Dog1
{
	void color()
	{
		System.out.println("The color of cat is Black");
	}
}
public class Multilevelinherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat obj = new Cat();
		obj.bark();
		obj.color();
		obj.eat();

	}

}
