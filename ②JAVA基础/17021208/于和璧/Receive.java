package com.qhit;

import java.util.ArrayList;
import java.util.Scanner;

public class Receive implements IMethod {

	@Override
	public void help() {
		System.out.println("----------进销存系统帮助----------");
		System.out.println("【1】新增商品请输入1");
		System.out.println("【2】进货请输入2");
		System.out.println("【3】销售请输入3");
		System.out.println("【4】参看库存请输入4");
		System.out.println("【5】退出请输入5");

	}

	@Override
	public void addcommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String a = sc.next();
		
		String[] arrs = a.split(",");
		
		if (arrs.length!=4) {
			
			System.out.println("你输入的格式不正确，请重新输入！ ");
		} else {
			
			Commodity q = new Commodity(arrs[0], arrs[1], Double.parseDouble(arrs[2]), Integer.parseInt(arrs[3]));
			
			arrayList.add(q);
			
			System.out.println(q.toString());

		}
		

	}
	
	@Override
	public void stockcommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		
		System.out.println("请输入商品编号");
		 String number = sc.next();
		 boolean isnumber = false;
		 for (int i = 0; i < arrayList.size(); i++) {
			 
			 String number2 = arrayList.get(i).getNumber();
			 
			 if(number.equals(number2)){
				 System.out.println("请输入进货数量");
				 int r = sc.nextInt();
				 
				arrayList.get(i).setQuantity(arrayList.get(i).getQuantity()+r);
				 
				System.out.println("进货后的数量为:"+arrayList.get(i).getQuantity());
				
				System.out.println(	arrayList.get(i).toString());
				
				 isnumber = true;
			 }
			 

			
		}
		 if (!isnumber) {
				
			 System.out.println("找不到此编号商品,进货失败!");
		}
	}

	@Override
	public void removecommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		
		System.out.println("请输入商品编号");
		
		String f = sc.next();
		
		boolean isnumber = false;
		
		for (int i = 0; i <arrayList.size(); i++) {
			
			String u = arrayList.get(i).getNumber();
			
			if (u.equals(f)) {
				
				System.out.println("请输入销售数量");
				int p = sc.nextInt();
				
				
				if(arrayList.get(i).getQuantity()>=p){
					
					arrayList.get(i).setQuantity(arrayList.get(i).getQuantity()-p);
					
					System.out.println("销售后的数量为:"+arrayList.get(i).getQuantity());
					
					System.out.println(arrayList.get(i).toString());
				}
				isnumber = true;
				
			}
			
		}
		if (!isnumber) {
			
			System.out.println("库存不足，销售失败！");
			
		}

	}

	@Override
	public void infocommodity(ArrayList<Commodity> arrayList) {
		for (Commodity commodity : arrayList) {
			System.out.println(commodity.toString());
		}

	}

	

}
