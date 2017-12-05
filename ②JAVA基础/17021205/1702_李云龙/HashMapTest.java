package com.hashmap.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class HashMapTest {

	public static void main(String[] args) {
		//HashMap 集合类存储对象
		//地图，某一个坐标---->地球上的一个地方
		//电话本，一个名字---->对应一个手机号
		//      身份证号---->唯一对应你自己
		//映射 key建---> value值
		
		//k 和 v 必须 是引用数据类型
		
		HashMap<Country, String> hashMap = new HashMap<Country, String>();

		
		Country China = new Country("China", 15);
		Country India = new Country("India", 15);
		Country Japan = new Country("Japan", 2);
		
		//通过put方法往Map里面放对象
		hashMap.put(China, "beijing");
		hashMap.put(India, "Delh");
		hashMap.put(Japan, "Tokyo");
		//怎么同键key找到value
		/*String string = hashMap.get(China);
		System.out.println(string);
		
		String string1 = hashMap.get(India);
		System.out.println(string1);
		
		String string2 = hashMap.get(Japan);
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
