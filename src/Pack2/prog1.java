package Pack2;

import java.util.Scanner;

public class prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth Number");
		Integer n = sc.nextInt();
	   
		for(int i =1; i<=n; i++)
		{
			System.out.println("The numbers are"+i);
		}
		
sc.close();
	}

}
