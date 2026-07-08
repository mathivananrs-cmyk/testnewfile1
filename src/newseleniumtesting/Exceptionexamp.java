package newseleniumtesting;

public class Exceptionexamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int data = 50/0;
//System.out.println(data);
//System.out.println("Welcome");	
		
		try
		{
			
//		int data =50/2;
//		System.out.println(data);
		
		int arr[]= new int[3];
		arr[2] = 50;
		System.out.println(arr[2]);
		
//		String str = "Mike";
//		System.out.println(str.length());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
		System.out.println("Welcome");
		}
	
	//System.out.println("Welcome");	
	}
	

}
