package com.wyk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import oracle.jrockit.jfr.tools.ConCatRepository;

/**
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月27日 下午4:24:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class RealizeEmployee implements IEmployeeSystem{

	void help(){
		System.out.println("-----商品进销存系统-----");
		System.out.println("[1]新增商品请输入add");
		System.out.println("[2]商品进货请输入get");
		System.out.println("[3]商品销售请输入sell");
		System.out.println("[4]查看商品库存请输入info");
		System.out.println("[5]退出系统输入Exit");
	}
	
	
	@Override
	public void addEmployee(ArrayList<Employee> arrayList, Scanner sc) {
		String string =sc.next();
		String[]a=string.split(",");
		
		if (a.length!=4) {
			System.out.println("请您重新输入，输入的格式如下:");
			System.out.println("001，苹果，1元，20");
		} else {
			Employee employee = new Employee(a[0],a[1],Double.parseDouble(a[2]),Double.parseDouble(a[3]));
			 arrayList.add(employee);
			 System.out.println(arrayList.toString());
			 System.out.println("添加成功");
		}
		
	}

	@Override
	public void getEmployee(ArrayList<Employee> arrayList, Scanner sc) {
		System.out.println("请输入商品编号");
		String s = sc.next();
		
		boolean isEmployeeid = false;
		
		for (int i = 0; i < arrayList.size(); i++) {
			
			String id = arrayList.get(i).getId();
			
			if (id.equals(s)) {
				
				System.out.println("请输入进货数量");
				
				int j = sc.nextInt();
				
				arrayList.get(i).setQuantity(arrayList.get(i).getQuantity() + j);
				
				System.out.println("进货后数量为" + arrayList.get(i).getQuantity());
				
				
				isEmployeeid = true;
			}
			if (!isEmployeeid) {
				System.out.println("进货失败");
			}
		}

	}

	@Override
	public void sellEmployee(ArrayList<Employee> arrayList, Scanner sc) {
		System.out.println("请输入商品编号");
		String string = sc.next();
		boolean isQuit = false;
		for (int i = 0; i <arrayList.size(); i++) {
			String d = arrayList.get(i).getId();
			if(string.equals(d)){
				System.out.println("请输入销售数量");
				int y = sc.nextInt();
				double l = arrayList.get(i).getPrice();
				if(y>=1){
					arrayList.get(i).setPrice(l-y);
					System.out.println("销售后的数量:"+arrayList.get(i).getPrice());
					isQuit = true;
				}
				if(!isQuit){
					System.out.println("销售失败！");
				}
			}
		}
		
	}

	@Override
	public void infoEmployee(ArrayList<Employee> arrayList, Scanner sc) {
		for (Employee employee : arrayList) {
			System.out.println(employee.toString());
		}
		
	}

}
