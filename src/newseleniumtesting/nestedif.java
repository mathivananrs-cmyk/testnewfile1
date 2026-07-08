package newseleniumtesting;

public class nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100;
		if (a >50)
		{
			System.out.println("a is greater than 50, a is: "+a);
			if(a>80)
			{
				System.out.println("a is greater than 80");
			}
		}

	}

}
