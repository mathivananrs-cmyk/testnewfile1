package newseleniumtesting;

import java.io.IOException;

class throwsexample
{
	void exceptMethod(int num)throws IOException, ClassNotFoundException
	{
		if (num==1)
		{
			throw new IOException("IOException occured");
		}
			else
			{
			throw new
			ClassNotFoundException("ClassNotFoundException");
			}
}

public class throwsExamp {

	public static void main(String[] args)throws ClassNotFoundException,IOException {
		// TODO Auto-generated method stub
		
		try
		{
			throwsexample obj = new throwsexample();
			obj.exceptMethod(1);
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
System.out.println("hello");
	}

}
