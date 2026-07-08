package newseleniumtesting;

class Animal2
{
 void eat()
 {
	 
	 System.out.println("Eating");
 }
}
class Dog2 extends Animal2
{
	void bark()
	{
		System.out.println("Barking");
	}
}

class Cat1 extends Animal2
{
	void color()
	{
		System.out.println("The color of cat is Black");
	}
}
public class Hierarchialinherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog2 obj1 = new Dog2();
		Cat1 obj2 = new Cat1();
        obj1.bark();
        obj1.eat();
        obj2.color();
        
       
	}

}
