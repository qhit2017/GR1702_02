package com.hashmaptest;
/**制作者：陈亮亮
 *制作时间：2017年12月5日上午9:03:04
 *邮箱：2507147605@qq.com
 */
public class Country {
String name;
long population ;

public Country(String name, long population) {
	this.name = name;
	this.population = population;
}

@Override
public String toString() {
	return "Country [name=" + name + ", population=" + population + "]";
}

}
