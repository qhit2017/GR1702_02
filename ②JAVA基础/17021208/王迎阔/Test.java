package com.wyk;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月27日 下午4:24:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
		 ArrayList<Employee>arrayList = new ArrayList<Employee>();
		 RealizeEmployee realizeEmployee = new RealizeEmployee();
		 Scanner sc = new Scanner(System.in);
		 realizeEmployee.help();
		 boolean isQuit = true;
		
		while (isQuit) {
			String key = sc.next();
			System.out.println("请输入您的指令并按回车键");
			
			switch (key) {
			case "add":
				System.out.println("请输入你要添加的商品名称");
			realizeEmployee.addEmployee(arrayList, sc);
				break;
			case "get":
				realizeEmployee.getEmployee(arrayList, sc);
				break;
			case "sell":
				realizeEmployee.sellEmployee(arrayList, sc);
				break;
			case "info":
				realizeEmployee.infoEmployee(arrayList, sc);
				break;
			case "Exit":
				isQuit = false;
				break;
			default:
				System.out.println("您输入的指令错误，请重新输入");
				break;
			}
		}
		System.out.println("再见，朋友");
		 }
}
