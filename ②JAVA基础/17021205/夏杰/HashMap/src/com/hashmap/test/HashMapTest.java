package com.hashmap.test;

import java.util.HashMap;

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
	}

}
