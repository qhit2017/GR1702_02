package kaoshi3;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年12月6日 下午6:30:25 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface ICommodity {

	//增加
	void add(ArrayList<Commodity> arrayList,Scanner sc);
	
	//进货
	void add1(ArrayList<Commodity> arrayList,Scanner sc);
	
	//销售
	void remove(ArrayList<Commodity> arrayList,Scanner sc);
	
	//查看库存
	void info(ArrayList<Commodity> arrayList);
	
}
