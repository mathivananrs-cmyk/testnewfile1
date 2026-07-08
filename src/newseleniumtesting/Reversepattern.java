package newseleniumtesting;

public class Reversepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int i=1;i<=5;i++) {
//			for(int j=5;j>=i;j--)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

		
		for(int i = 1;i<=50;i++)
		{
			if (i%2==0)
			{
				
				System.out.println("Evennumber"+i);
			}
			else
			{
				System.out.println("oddnumber");
			}
		}

	}

}
