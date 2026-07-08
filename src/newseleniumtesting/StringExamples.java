package newseleniumtesting;

public class StringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Sachin Tendulkar";
		System.out.println(str.length());
		
		String str1 = " Welcome to";
		String str2 = "Java";
		System.out.println(str1+str2);
		System.out.println(str1.concat(str2));
		
		System.out.println(str.charAt(1));
		System.out.println(str.indexOf("c"));
		System.out.println(str.contains("Tendulkar"));
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toLowerCase());
		
		System.out.println(str2.startsWith("J"));
		System.out.println(str2.endsWith("a"));
		System.out.println(str1.trim());
		System.out.println(str.substring(2, 5));
		//System.out.println(str2.replace("Java", "Python"));
		String Str3 = "Bike";
		String replace = Str3.replace("Bike", "car");
		System.out.println(replace);
		//
		
		
		
	}

}
