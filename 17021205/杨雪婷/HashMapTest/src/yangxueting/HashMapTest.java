package yangxueting;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/** 
 * @author  作者 qqE-mail:157334005@qq.com
 * @date    创建时间：2017年12月5日 上午8:33:55 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class HashMapTest {

	private static String value;

	public static void main(String[] args) {
		HashMap<Country,String> hashMap=new HashMap<Country,String>();
		
		Country china=new Country("china", 15);
		Country indid=new Country("indid", 13);
		Country japan=new Country("japan", 4);
		
		
		hashMap.put(china, "Beijing");
		hashMap.put(indid, "Delhi");
		hashMap.put(japan, "Tokhyo");
		
		
		String string=hashMap.get(china);
		System.out.println(string);
		
		String string_1=hashMap.get(indid);
		System.out.println(string_1);
		
		String string_2=hashMap.get(japan);
		System.out.println(string_2);
		System.out.println();
		
		Iterator<Entry<Country, String>> iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Country, String> entry = iterator.next();
			Country key = entry.getKey();
			System.out.println(key.toString()+""+value);
		}
	}

}
