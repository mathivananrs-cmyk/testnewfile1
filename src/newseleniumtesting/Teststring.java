package newseleniumtesting;

public class Teststring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String str = "I Love Java";
        String noSpace = str.replace(" ", "");
        String rev = new StringBuilder(noSpace).reverse().toString();
        System.out.println(rev);
        
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                System.out.print(" ");
            } else {
                System.out.print(rev.charAt(index++));
            }
		
		
	}

	}}
