package com.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年12月5日 上午8:30:31 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TestHashMap {

	public static void main(String[] args) {
		HashMap<Country, String> hashmap=new HashMap<Country, String>();
		Country china=new Country("china",16);
		Country US=new Country("US",4);
		Country japan=new Country("japan",2);
		hashmap.put(china, "beijing");
		hashmap.put(US, "newyork");
		hashmap.put(japan, "dongjing");
		//System.out.println(hashmap.get(japan));
		Iterator<Entry<Country,  String>> iterator=hashmap.entrySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
		
		//Single.getsingle();
	}

}
