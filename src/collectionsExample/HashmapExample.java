package collectionsExample;

import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.map.HashedMap;

public class HashmapExample {

	public static void main(String[] args) {

		Map<String, String> map = new HashedMap<String, String>();

		// we are defininig here that both key and value are of string type

		map.put("FirstName", "PranayBhaskar");
		map.put("LastName", "Bolla");
		map.put("City", "Hyderabad");
		map.put("Age", "25");
		map.put("name", null);   //allows Null values to the keys
		
		//map.put("City", "Karimnagar");   //does not allow the duplication

		System.out.println(map);

		// to fetch all the values, we will store all the key values in a set and
		// iterate
		//keySet() method is used to get all the values of keys.
		Set<String> keys = map.keySet();
		
		for (String key : keys) {
			
			System.out.println("Key--> " + key + " The value is --->" + map.get(key));
			
		}

	}

}
