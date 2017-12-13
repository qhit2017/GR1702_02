package com.hashmap.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap<Country, String> hashMap = new HashMap<Country, String>();

	Country china = new Country("china", 15);
	Country india = new Country("india", 14);
	Country japan = new Country("japan",2);
	
	hashMap.put(china, "BeJing");
	hashMap.put(india, "NewDelhi");
	hashMap.put(japan, "Tokyo");
	String string = hashMap.get(china);
	String string_2 = hashMap.get(japan);
	String string_3 = hashMap.get(india);
	
	System.out.println(string);
	System.out.println(string_2);
	System.out.println(string_3);
	
	Iterator<Entry<Country, String>> iterator = hashMap.entrySet().iterator();
	
	while (iterator.hasNext()) {
		Entry<Country, String> entry = iterator.next();
		String value = entry.getValue();
		Country key = entry.getKey();
		System.out.println(key.toString());
	}
	}
	}


