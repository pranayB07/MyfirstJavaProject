package collectionsExample;

import java.util.HashMap;
import java.util.Set;

public class HashMapPractice {
	
	
	public static void main(String[] args) {
		
		HashMap<String , String> hashmap= new HashMap<String, String>();
		hashmap.put("Name", "Pranay Bhaskar");
		hashmap.put("Age","25");
		hashmap.put("Place", "Hyderabad");
		
		String name=hashmap.get("Name");
		System.out.println(name);
		
		//hashmap.remove("Place");
		
		System.out.println(hashmap);
		System.out.println(hashmap.get("Place"));
		
		//return null value if we try to retrieve key value which is not in the list
		
		Set<String> set=hashmap.keySet();
		
		for (String string : set) {
			
			System.out.print("The key Name :" + string);
			System.out.print("--->");
			System.out.println("The value is :"+ hashmap.get(string));
			
		}
		
	}

}
