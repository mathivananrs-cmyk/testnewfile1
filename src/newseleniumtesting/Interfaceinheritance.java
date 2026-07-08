package newseleniumtesting;

interface Printable1
{
	void print();
	
}


interface Showable1 extends Printable1
{
	void show();
}
public class Interfaceinheritance implements Showable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaceinheritance obj = new Interfaceinheritance();
		obj.show();
		obj.print();

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show the output");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Print the output");
	}

}
