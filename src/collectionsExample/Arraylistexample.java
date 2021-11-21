package collectionsExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylistexample {
	//we can add different datatypes
	//the values store as objects in arraylist(Autoboxing)

	public static void main(String[] args) {

		ArrayList  list = new ArrayList();

		list.add("hello");
		list.add(45);
		list.add(null);
		list.add('a');
		
		//list.remove(2);
		
		list.get(0);
		

		System.out.println(list);
		
//		for (Object object : list) {
//			System.out.println(object);
//		}
		
		Iterator iterator=list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		/*
		 * //generic arraylist
		 * 
		 * List<Integer> list2=new ArrayList<Integer>(); { list2.add(23); //this will
		 * store in integer value }
		 */

	}

}
