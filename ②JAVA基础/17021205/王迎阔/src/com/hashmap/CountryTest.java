package com.hashmap;
/**
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月27日 下午4:24:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class CountryTest {

	
	String name;
	long population;
	
	
	
	/**
	 * @param name
	 * @param population
	 */
	public CountryTest(String name, long population) {
		super();
		this.name = name;
		this.population = population;
	}



	@Override
	public String toString() {
		return "CountryTest [name=" + name + ", population=" + population + "]";
	}
	
	
}
