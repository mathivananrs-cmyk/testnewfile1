package Pack2;

import java.util.Scanner;

public class prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		
		int rev = 0;
		
		while(n!=0)
		{
			int num = n%10;
			rev = (rev*10)+num;
			n = n/10;
			
		}
System.out.println("Reversed Number"+rev);
	}

}
