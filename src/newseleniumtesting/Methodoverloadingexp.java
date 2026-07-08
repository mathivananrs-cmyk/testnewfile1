package newseleniumtesting;

public class Methodoverloadingexp {

	static int adder(int a,int b)
	{
		int res;
		return res=a+b;
	}
	
	static int adder(int a, int b, int c)
	{
		int res1;
		return res1=a+b+c;
	}
	// when static method is declared, no need to create instance.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// How to call Static Method
		// classname.methodname
int result = Methodoverloadingexp.adder(50, 30);
System.out.println(result);

int result1 = Methodoverloadingexp.adder(20, 30, 40);
System.out.println(result1);


	}


}
