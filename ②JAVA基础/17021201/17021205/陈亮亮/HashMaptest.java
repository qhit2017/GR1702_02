package com.hashmaptest;

import java.awt.event.ItemEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * 制作者：陈亮亮 制作时间：2017年12月5日上午8:31:52 邮箱：2507147605@qq.com
 */
public class HashMaptest {

	public static void main(String[] args) {

		HashMap<Country, String> hashMap = new HashMap<Country, String>();

		Country china = new Country("china", 15);
		Country India = new Country("India ", 14);
		Country Japanese = new Country("Japanese", 2);

		hashMap.put(china, "Peking ");
		hashMap.put(India, "Delhi");
		hashMap.put(Japanese, "Tokyo");

		Iterator<Entry<Country, String>> iterator = hashMap.entrySet()
				.iterator();
		while (iterator.hasNext()) {

			Entry<Country, String> entry = iterator.next();
			String value = entry.getValue();
			Country key = entry.getKey();
			System.out.println(key.toString() + "" + value);
		}

	}

}
