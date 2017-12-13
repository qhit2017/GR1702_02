/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2004年1月1日 上午12:14:08 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Country {

	String name;
	long population;
	
	
	public Country(String name, long population) {
		this.name = name;
		this.population = population;
		
	}


	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population + "]";
	}
	
	
}
