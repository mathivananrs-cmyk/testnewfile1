package Pack2;

public class testprog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String str = "Automation";
String str1 = str.toLowerCase();
String result = "";

for(int i=0;i<str1.length();i++)
{
	if(aeiou.indexOf(str1.charAt(i))==-1)
	{
		result+=str1.charAt(i);
		
	}
		
	
}
System.out.println(result);

	}

}
