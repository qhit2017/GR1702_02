import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2004年1月6日 上午8:33:41 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class HashMapTest {

	public static void main(String[] args) {
		//集合类存储对象
		//映射 key 键 -----> value 值
		HashMap<Country, String> hashMap = new HashMap<Country, String>();
		
		Country China = new Country("中国", 16);
		Country Japan = new Country("日本", 2);
		Country India = new Country("印度", 12);
		
		hashMap.put(India, "Delhi");
		hashMap.put(Japan, "Tokyo");
		hashMap.put(China, "BeiJing");
		
		Iterator<Entry<Country, String>> iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Country, String> entry = iterator.next();
			String value = entry.getValue();
			Country key = entry.getKey();
			System.out.println(entry.toString());
			System.out.println(value.toString());
			
		}
		}
	}

