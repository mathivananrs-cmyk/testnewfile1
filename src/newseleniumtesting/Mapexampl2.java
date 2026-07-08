package newseleniumtesting;

import java.util.Map;
import java.util.*;

public class Mapexampl2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> m2 = new LinkedHashMap<String,Integer>();
		m2.put("emp1", 123);
		m2.put("emp2", 124);
		m2.put("emp3", 125);
		m2.put("emp4", 126);
		
		for (Map.Entry obj : m2.entrySet()) {
			String key = (String) obj.getKey();
			int val = (Integer) obj.getValue();
			System.out.println(key+ " "+ val);
					
		}
			
		System.out.println(m2.get("emp3"));
		System.out.println(m2.size());
		System.out.println(m2.containsKey("emp2"));
		System.out.println(m2.remove("emp4"));
		System.out.println(m2);
		
		Map <String, Integer> m4 = new LinkedHashMap<String, Integer>();
		m4.putAll(m2);
		
		System.out.println(m4);
		m4.put("emp4", 126);
		System.out.println(m4);
	}

}
