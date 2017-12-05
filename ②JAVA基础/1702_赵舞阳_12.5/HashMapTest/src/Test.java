import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Test {
	public static void main(String[] args) {
		// 映射key键-----value值
		HashMap<Country, String> hashMap = new HashMap<Country, String>();
		Country china = new Country("china", 15);
		Country india = new Country("india", 13);
		Country japan = new Country("japan", 2);
		// 通过put方法往Map里面放对象
		hashMap.put(china, "Beijing");
		hashMap.put(india, "Delhi");
		hashMap.put(japan, "Tokyo");
		// 通过key找到value值
		String string = hashMap.get(china);
		System.out.println(string);
		String string1 = hashMap.get(india);
		System.out.println(string1);
		String string2 = hashMap.get(japan);
		System.out.println(string2);
		// 迭代器遍历
		Iterator<Entry<Country, String>> iterator = hashMap.entrySet()
				.iterator();
		while (iterator.hasNext()) {
			Entry<Country, String> entry = iterator.next();
			Country key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key.toString() + "\t\t" + value);
		}
	}
}
