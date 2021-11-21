package collectionsExample;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetPractice {
	
	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>();
		
		set.add("pranay");
		set.add("bhaskar");
		set.add("virat");
		set.add("kohli");
		set.add("sachin");
		set.add(null);
		set.add("sachin");
		
		Iterator iterator=set.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
