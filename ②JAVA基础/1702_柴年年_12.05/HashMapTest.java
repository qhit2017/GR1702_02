package com.hashmap.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.swing.text.html.parser.Entity;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<Country, String> hashMap = new HashMap<Country, String>();
		
		Country china = new Country("china", 15);
		Country india = new Country("india", 14);
		Country japan = new Country("japan", 2);
		
		hashMap.put(china, "beijing");
		hashMap.put(india, "Delhi");
		hashMap.put(japan, "Tokyo");
		
		/*String string = hashMap.get(china);
		System.out.println(string);
		String string1 = hashMap.get(india);
		System.out.println(string1);
		String string2 = hashMap.get(japan);
		System.out.println(string2);
		*/
		Iterator<Entry<Country, String>> iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Country, String> entry = iterator.next();
			Country key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key.toString()+""+value);
			
		}
		
		
	}
}
