package newseleniumtesting;

public class Tochararrexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Welcome";
		char c1arr[] = str.toCharArray();
//		for(int i=0;i<c1arr.length; i++) {
//			
//			System.out.println(c1arr[i]);
//		}
		
		for(int i = c1arr.length -1;i>=0;i--)
		{
			System.out.println(c1arr[i]);
		}

	}

}
