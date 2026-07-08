package newseleniumtesting;

public class Countofchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count = 0;
		String s = "Welcome to Javatpoint";
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)== 't')
			{
				count++;
				
			}
				
			
		}
		System.out.println(count);
		
	}

}
