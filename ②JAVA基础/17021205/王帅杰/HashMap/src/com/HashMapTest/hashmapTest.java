package com.HashMapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class hashmapTest {
public static void main(String[] args) {
	
	HashMap<Country, String>hashMap=new HashMap<Country, String>();
	Country china =new Country("china", 15);
	Country india =new Country("india", 14);
	Country japan =new Country("japan", 2);
	
	//通过put方法往Map里面放对象
	hashMap.put(china, "beijing");
	hashMap.put(india, "Delhi");
	hashMap.put(japan, "Tokyo");
	
	/*//怎样通过键key找到value
	String string =hashMap.get(japan);
	System.out.println(string);
	String string_1 =hashMap.get(china);
	System.out.println(string_1);
	String string_2 =hashMap.get(india);
	System.out.println(string_2);*/
	//遍历迭代器
	Iterator<Entry<Country, String>> iterator = hashMap.entrySet().iterator();
	while (iterator.hasNext()) {
		Entry<Country, String> entry = iterator.next();
		String value = entry.getValue();
		Country country = entry.getKey();
		
		
		
		
	}
	
	
}
}
