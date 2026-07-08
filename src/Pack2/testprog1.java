package Pack2;

public class testprog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String str = "Automation";
char a[] = str.toCharArray();
for (int i = 0; i<=str.length()-1;i++)
{
	if((a[i]=='a')||(a[i]=='e')||(a[i]=='i')||(a[i]=='o')||(a[i]=='u'))
	{
		
	
		System.out.print(a[i]);
	}
	
}
System.out.println();
	}

}
