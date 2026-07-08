package Pack2;

public class prog9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a = 9; int b = 12; int c= 12;
		 
		int d = a-b/3+c*2-1;
		System.out.println("The first expression is"+d);
		
		int e = a-b/(3+c)*(2-1);
		System.out.println("The second expression is"+e);
		
		int f = a-((b/c*3+c)*2)-1;
		System.out.println("The third expression is"+f);
		
		int g = a&b;
        System.out.println(g);	
        
        int h = (a+b*c)/10;
        System.out.println(h);
	}

}
