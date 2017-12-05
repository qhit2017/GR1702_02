package lijingjing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		// HashMap集合类储存对象
		//映射key----->value值
		HashMap<Country, String> hashMap = new HashMap<Country, String>();

		Country China = new Country("China", 15);
		Country India = new Country("India", 14);
		Country Japan = new Country("Japan", 14);
		
		hashMap.put(China, "beijing");
		hashMap.put(India, "newDelhi");
		hashMap.put(Japan, "Tokyo");
		String string = hashMap.get(Japan);
		System.out.println(string);
		String string1 = hashMap.get(India);
		System.out.println(string1);
		String string2 = hashMap.get(China);
		System.out.println(string2);
		Iterator<Entry<Country, String>> iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Country, String> entry = iterator.next();
			String value = entry.getValue();
			Country key = entry.getKey();
			System.out.println(key.toString()+""+value.toString());
		}
	}

}
