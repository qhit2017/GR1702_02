package lishaoqing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {
public static void main(String[] args) {
	
	HashMap<Country, String> hashMap=new HashMap<Country, String>();
	
	Country China = new Country("China", 15);
	Country India = new Country("India", 14);
	Country Japan = new Country("Japan", 2);
	
	hashMap.put(China, "BeiJing");
	hashMap.put(India, "Delhi");
	hashMap.put(Japan, "DongJing");
	
	String c = hashMap.get(China);
	String i = hashMap.get(India);
	String j = hashMap.get(Japan);
	
	//System.out.println(c+"  "+i+"  "+j);
	
	Iterator<Entry<Country, String>> iterator = hashMap.entrySet().iterator();
	while (iterator.hasNext()) {
		Entry<Country, String> entry = iterator.next();
		
		System.out.println(entry.toString());
	}
}
}
