package collectionsExample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetExample {

	public static void main(String[] args) {
	//hashset is an unordered list it stores values randomly ,so we dont have index numbers
		//it does not allow duplicate values .
		//due to no index number we cant print values with simple for loop
		//we can print data with foreach loop and iterator.
		
		HashSet<String> set=new HashSet<String>();
		set.add("HI");
		set.add("QA");
		set.add("Selenium");
		set.add("Automation");
		set.add("HI");
		
		System.out.println(set);
		
		/*
		 * for (String s : set) { System.out.println(s); }
		 */
		
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
