package Pack2;

class p
{
	float a = 10;
	String str = "Welcome";
	
}

class q extends p
{
	Double b = 50.25;
}

public class prog5 extends q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		q obj = new q();
		
		System.out.println(obj.a+" "+obj.b+ " "+obj.str);

	}

}
