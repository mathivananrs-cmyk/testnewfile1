package newseleniumtesting;

public class Strequals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Str1 = "Java";
		String Str2 = "Java";
		String Str3 = new String ("Java");
		System.out.println(Str1.equals(Str2));
		System.out.println(Str1.equalsIgnoreCase(Str2));
		// (==) it compares references not values for String
		System.out.println(Str1 == Str3);
		System.out.println(Str1 == Str2);

	}

}
