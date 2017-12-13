package com.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月27日 下午4:24:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class HashMapTest {

	public static void main(String[] args) {
		//HaspMap 集合类存储对象
		//映射key值----->value值。
		
		HashMap<CountryTest, String> hashMap = new HashMap<CountryTest,String>();
		
		
		CountryTest China = new CountryTest("china",15);
		CountryTest Japan = new CountryTest("Japan",2);
		CountryTest Germany = new CountryTest("Germany",3);
		
		
		
		hashMap.put(China, "beijing");
		hashMap.put(Japan, "Tokyo");
		hashMap.put(Germany, "Berlin");
		
		
		
		String string = hashMap.get(China);
		System.out.println(string);
		
		String string1 = hashMap.get(Japan);
		System.out.println(string1);
		
		String string2 = hashMap.get(Germany);
		System.out.println(string2);
		
		Iterator<Entry<CountryTest, String>> iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
		Entry<CountryTest, String> entry = iterator.next();
			CountryTest key = entry.getKey();
			String value = entry.getValue();
			System.out.println(entry.toString()+""+value);
		}
 
	}
}
