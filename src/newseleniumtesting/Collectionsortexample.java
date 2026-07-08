package newseleniumtesting;

import java.util.*;

public class Collectionsortexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList arrlist1 = new ArrayList();
		arrlist1.add("Mango");
		arrlist1.add("Banana");
		arrlist1.add("Grapes");
		arrlist1.add("Apple");
		//Collections.sort(arrlist1);
		Collections.sort(arrlist1,Collections.reverseOrder());
		//Collections.reverseOrder(arrlist1);
		for (Object obj : arrlist1) {
			System.out.println(obj);
		}
		
//		System.out.println(arrlist1);

	}

}
