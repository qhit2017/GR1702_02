package com.hashmap;
/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年12月5日 上午9:01:57 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Country {

	String name;
	long population;
	Country() {
	}
	Country(String name, long population) {
		this.name = name;
		this.population = population;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population + "]";
	}
	
}
