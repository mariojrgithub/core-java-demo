package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		// a Map has a key and a value
		
		Map<String, Integer> phoneBook = new HashMap<>();
		
		// Create
		phoneBook.put("xyz", 12345);
		phoneBook.put("abc", 67890);
		phoneBook.put("asd", 24680);
		
		// Read
		System.out.println("Phone number of asd is: " + phoneBook.get("asd"));
		
		// iteration
		// first obtain the keys
		Set<String> allKeys = phoneBook.keySet();
		// create iterator
		Iterator<String> itr = allKeys.iterator();
		
		while(itr.hasNext()) {
			String name = itr.next();
			Integer number = phoneBook.get(name);
			System.out.println("Key: " + name + ", Value: " + number);
			
		}
		
		// delete
		phoneBook.remove("abc");
		System.out.println("After deletion: " + phoneBook);
		
		// update
		phoneBook.replace("xyz", 55555);
		System.out.println("After replacing xyz: " + phoneBook);
		
	}

}
