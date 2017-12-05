package com.HashMap;
/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class County {
	String name;
	long population;

	
	public County(String name, long population) {
		super();
		this.name = name;
		this.population = population;
		
	}


	@Override
	public String toString() {
		return "County [name=" + name + ", population=" + population + "]";
	}
	

}
