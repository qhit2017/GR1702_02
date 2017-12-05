package com.hashmap;
/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年12月5日 上午11:30:09 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Single {
	//单例模式
	
	public Single(){
		
	}
	private static Single single=new Single();
	public static Single getsingle(){
		return single;
	}
}
