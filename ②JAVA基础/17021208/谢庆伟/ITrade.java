package com.goodstrade;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年12月5日 下午5:22:06 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface ITrade {

	void getadd(ArrayList<Trade> arraylist,Scanner sc);
	void into(ArrayList<Trade> arraylist,Scanner sc);
	void out(ArrayList<Trade> arraylist,Scanner sc);
	void info(ArrayList<Trade> arraylist);
}
