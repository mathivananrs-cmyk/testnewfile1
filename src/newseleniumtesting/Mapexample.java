package newseleniumtesting;

import java.util.HashMap;
import java.util.*;

public class Mapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> m1= new LinkedHashMap<Integer,String>();
		m1.put(100, "Apple");
		m1.put(101, "banana");
		m1.put(102, "grapes");
		m1.put(103, "banana");
		m1.put(103, "pineapple");
		//m1.put(null, "guava");
		m1.put(105, "guava");
		
		//m1.put(104, null);
		
		System.out.println(m1);
		
//	for (Map.Entry obj : m1.entrySet()) {
////		int key1 = (int) obj.getKey();
////		String val1 = (String) obj.getValue();
//		
//		System.out.println(obj.getKey()+" "+obj.getValue());
//			
//	}

	for (Map.Entry obj2 : m1.entrySet()) {
		int key = (int) obj2.getKey();
		String val = (String) obj2.getValue();
		
		System.out.println(key+" "+val);
		
	}

		
	}

}
