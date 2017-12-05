package com.hash.map;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/*制作人：王欣
 *日期2017年12月5日时间上午8:31:00
 *邮箱:2408368509@qq.com
 */

public class HashMapTxst {
	public static void main(String[] args) {
		HashMap<Country, String> hashmap = new HashMap<Country, String>();
		
		Country china = new Country("china", 15);
		Country india = new Country("india", 14);
		Country japan = new Country("japan", 2);
		
		
		hashmap.put(china, "beijing");
		hashmap.put(india, "delni");
		hashmap.put(japan, "tokyo");
		
		String string =hashmap.get(china);
		System.out.println(string);
		String string1 =hashmap.get(japan);
		System.out.println(string1);
		String string2 =hashmap.get(india);
		System.out.println(string2);
		
		Iterator<Entry<Country, String>> iterator = hashmap.entrySet().iterator();
		
		while (iterator.hasNext()) {
			 Entry<Country, String> entry = iterator.next();
			 String value = entry.getValue();
			 Country key = entry.getKey();
			 System.out.println(key.toString()+""+value);
			 
			 
			
			
		}
	}

}
