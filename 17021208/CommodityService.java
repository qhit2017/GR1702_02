package com.test;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

public class CommodityService implements ICommodity {
	private static final int Commodity = 0;
	private static final int ArrayList = 0;

	void helpinfo(){
		System.out.println("1   新增商品");
		System.out.println("2   进货");
		System.out.println("3   销售");
		System.out.println("4   参看库存");
		System.out.println("5   退出功能");
	}

	@Override
	public void addCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		Commodity commodity=new Commodity();
		commodity.setId(a[0]);
		commodity.setName(a[1]);
		commodity.setPrice(Double.parseDouble(a[2]));
		commodity.setNumber(Integer.parseInt(a[3]));
		arrayList.add(commodity);
		System.out.println(commodity.toString());
	

	}

	@Override
	public void stockCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		 System.out.println("请输入商品编号");
		 String s = sc.next();
		 boolean isok=false;
		 for (int i = 0; i < arrayList.size(); i++) {
			 if (s.equals(arrayList.get(i).getId())) {
				 System.out.println("输入进货数量");
				int j=sc.nextInt();
				int k = arrayList.get(i).getNumber();
				k+=j;
				arrayList.get(i).setNumber(k);
				System.out.println(arrayList.get(i));
				isok=true;
				
			}
			
		}
		 
	}

	@Override
	public void sellCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		 

	}

	@Override
	public void findCommodity(ArrayList<Commodity> arrayList, String name) {
		 

		 

		
	}

	@Override
	public void infoCommodity(java.util.ArrayList<com.test.Commodity> arrayList) {
		 for (Commodity commodity : arrayList) {
			 System.out.println(commodity.toString());
			
		}
		
	}

}
