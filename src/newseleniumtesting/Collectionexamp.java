package newseleniumtesting;

import java.util.ArrayList;
import java.util.*;

public class Collectionexamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// group of objects is called collections
		// Can add or remove element at a time
		ArrayList obj = new ArrayList();
		obj.add("Mathi");
		obj.add(5.34);
		
		obj.add('a');
		obj.add('a');
		
		// It maintains insertion order and allows duplicate values
		System.out.println(obj);
		
		obj.add(2, 25.90);
		System.out.println(obj);
		
		System.out.println(obj.get(2));

	    System.out.println(obj.indexOf("Mathi"));
	System.out.println(obj.contains(5.34));
	System.out.println(obj.size());
	
// To clear the array
	//obj.clear();

	System.out.println(obj.isEmpty());
	// if nothing returns it prints -1
	System.out.println(obj.lastIndexOf('a'));
	
	System.out.println(obj.remove(2));
	System.out.println(obj);

	List obj1 = obj.subList(1, 3);
	System.out.println(obj1);
	
	System.out.println("**********");
	
//	Iterator itr = obj.iterator();
//	while(itr.hasNext())
//	{
//		System.out.println(itr.next());
//	}
	for (Object obj2 : obj) {
		
		System.out.println(obj2);
	}
	
	//array cannot be used for array list 
	
//	for(int i=0; i<obj.size(); i++)
//	{
//		System.out.println(obj[i]);
//	}
	
	ArrayList list = new ArrayList();
	list.addAll(obj);
	System.out.println(list);
	
	list.clone();
	System.out.println(list);
	
	}

}
