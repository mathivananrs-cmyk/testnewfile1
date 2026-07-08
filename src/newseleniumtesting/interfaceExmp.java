package newseleniumtesting;

interface Printable
{
	void print();
}

interface Showable
{
	void show();
}
public class interfaceExmp implements Printable,Showable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfaceExmp obj = new interfaceExmp();
		obj.show();
		obj.print();
		
		

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("showing");
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Printing");
	}

}
