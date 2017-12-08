package com.deal;

import java.util.ArrayList;
import java.util.Scanner;

public class DealService implements IDeal {

	void getHelp(){
		System.out.println("____进销存系统____");
		System.out.println("1   新增商品");
		System.out.println("2   进货");
		System.out.println("3   销售");
		System.out.println("4   参看库存");
		System.out.println("5   退出功能");
		
	}
	@Override
	public void addDeal(ArrayList<Deal> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String s = sc.next();
		String[] arr = s.split(",");
		if (arr.length!=4) {
			System.out.println("输入格式有误！");
		}else {
			Deal d = new Deal(arr[0], arr[1],Double.parseDouble(arr[2]),Double.parseDouble(arr[3]) );
			arrayList.add(d);
			System.out.println(d.toString());
		}

	}

	@Override
	public void stockDeal(ArrayList<Deal> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String a = sc.next();
		String[] arrs = a.split(",");
		

	}

	@Override
	public void sellDeal(ArrayList<Deal> arrayList, Scanner sc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void findById(ArrayList<Deal> arrayList, String id) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < arrayList.size(); i++) {
			Deal temp = arrayList.get(i);
			String dId = temp.getId();
			if(dId.equals(id)){
				System.out.println(temp.toString());
			}
		}
 		
	}
	
	void infoDeal(ArrayList<Deal> arrayList){
		for (Deal deal : arrayList) {
			System.out.println(deal.toString());
		}
	}

}
