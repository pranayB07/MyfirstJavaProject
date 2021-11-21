package collectionsExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(07);
		list.add(307);
		list.add(405);
		list.add(500);

		System.out.println(list);

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		/*
		 * for (Integer i : list) {
		 * 
		 * System.out.println(i); }
		 */

	}

}
