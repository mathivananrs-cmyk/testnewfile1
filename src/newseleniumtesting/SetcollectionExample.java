package newseleniumtesting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.*;

public class SetcollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set does not allow duplicates
		Set s1 = new LinkedHashSet();
		s1.add("Mark");
		s1.add(35);
		s1.add(25000.00);
		s1.add(null);
		s1.add("Mark");
		s1.add(null);
		
//		s1.add("Jan");
//		s1.add("Feb");
//		s1.add("Mar");
//		s1.add("Apr");
//		s1.add("May");
		
//		Collections.sort(s1);
		System.out.println(s1);
		System.out.println(s1);
		
//		Iterator itr = s1.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}

	}

}
