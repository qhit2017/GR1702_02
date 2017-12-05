package com.hashmp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMpTest {

	public static void main(String[] args) {

		HashMap<Contry, String> hashMap = new HashMap<Contry, String>();

		Contry china = new Contry("中国", 15);
		Contry india = new Contry("印度", 14);
		Contry japan = new Contry("日本", 2);

		hashMap.put(china, "北京");
		hashMap.put(india, "新德里");
		hashMap.put(japan, "东京");
/*
		String string = hashMap.get(china);
		System.out.println(string);

		String string1 = hashMap.get(india);
		System.out.println(string1);

		String string2 = hashMap.get(japan);
		System.out.println(string2);
		*/
		
	Iterator<Entry<Contry, String>> iterator = hashMap.entrySet().iterator();
	while (iterator.hasNext()) {
		Entry<Contry, String> entry = iterator.next();
		String value = entry.getValue();
		Contry key = entry.getKey();
		System.out.println(key.toString()+value);
	}
	}

}
