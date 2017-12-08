/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年12月6日 下午7:20:34 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
*/
package com.Test03;

import java.util.ArrayList;
import java.util.Scanner;

public interface ICommodity {
	
	void add(ArrayList<Property> arrayList,Scanner sc);
	
	void stock(ArrayList<Property> arrayList,Scanner sc);
	
	void market(ArrayList<Property> arrayList,Scanner sc);
	
	void info(ArrayList<Property> arrayList);
	


}
