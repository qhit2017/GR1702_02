package com.xx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		//HashMap  集合类 存储对象
		//地图，某个坐标——>地球上的一个地方
		//电话本，一个名字——>对应一个手机号
		//身份证号——>唯一对应你自己
		//映射   key 键——>value 值
		//k、v  是引用数据类型
		//key不能重复，value可以重复
		//key和value可以为空
		HashMap<Country, String> hashMap = new HashMap<Country, String>();
		Country China = new Country("China", 15);
		Country India = new Country("India", 12);
		Country Japan = new Country("Japan", 2);
		//通过put方法想map
		hashMap.put(China, "beijing");
		hashMap.put(India, "Delhi");
		hashMap.put(Japan, "Tokyo");
		
		//通过get方法用键key找到value
		/*String string01 = hashMap.get(China);
		System.out.println(string01);
		String string02 = hashMap.get(India);
		System.out.println(string02);
		String string03 = hashMap.get(Japan);
		System.out.println(string03);
		*/
		//遍历，迭代器
		Iterator<Entry<Country, String>> iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Country, String> entry = iterator.next();
			String value = entry.getValue();
			Country key = entry.getKey();
			System.out.println(key.toString()+""+value);
		}
	} 
}
