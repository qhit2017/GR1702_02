/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年12月5日 上午9:01:41 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.hashmap;

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
