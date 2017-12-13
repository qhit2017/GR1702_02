package f;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Country, String> hashmap = new HashMap<Country, String>();
		Country china = new Country("China", 15);
		Country japan = new Country("Japan", 2);
		Country india = new Country("India", 15);
		hashmap.put(china, "BeJing");
		hashmap.put(japan, "Tokyo");
		hashmap.put(india, "Delhi");
		
		/*String string = hashmap.get(china);
		String string2 = hashmap.get(japan);
		String string3 = hashmap.get(india);
		System.out.println(string);
		System.out.println(string2 );
		System.out.println(string3 );*/
		
	Iterator<Entry<Country, String>> iterator = hashmap.entrySet().iterator();
		while (iterator.hasNext()) {
			 Entry<Country, String> entry = iterator.next();
			Country country = entry.getKey();
			String value = entry.getValue();
			System.out.println( country.toString());
		}
		
		
	
		
}}
