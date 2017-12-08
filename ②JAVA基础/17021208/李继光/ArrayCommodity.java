package com.xx;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayCommodity implements IArray{
	
	void help(){
		System.out.println("----------------------");
		System.out.println("    按1新增商品                ");
		System.out.println("    按2查看库存                ");
		System.out.println("    按3进货                       ");
		System.out.println("    按4销售                       ");
		System.out.println("    按5退出本系统            ");
		System.out.println("----------------------");
	}

	
	public void addCommodity(ArrayList<Commodity> arrs, Scanner as) {
		String a = as.next();
		String[] s = a.split(",");
		if (s.length!=4) {
			System.out.println("输入错误");
		} else {
			Commodity commodity = new  Commodity(s[0], s[1], Double.parseDouble(s[2]),Integer.parseInt(s[3]));
			arrs.add(commodity);
			System.out.println(commodity.toString());
		}
		}

	@Override
	public void infoCommodity(ArrayList<Commodity> arrs) {
		for (int i = 0; i < arrs.size(); i++) {
			System.out.println(arrs.get(i).toString());
		}
		
	}
	
	
	//进货
	@Override
	public void stock(ArrayList<Commodity> arrs, Scanner as) {
		System.out.println("请输入您要进货的商品编号");
		String s = as.next();
		boolean isid  = false;
		for (int i = 0; i < arrs.size(); i++) {
			String e = arrs.get(i).getNumber();
			if (s.equals(e)) {
				System.out.println("请输入您要进货的数量");
				int k = as.nextInt();
				arrs.get(i).setQuantity(arrs.get(i).getQuantity()+k);
				System.out.println(arrs.get(i).toString());
				isid = true;
			}
			}
		if (!isid) {
			System.out.println("进货失败");
		}
		
	}
	//销售
	@Override
	public void sell(ArrayList<Commodity> arrs,Scanner as) {
		System.out.println("请输入您要进货的商品编号");
		String w = as.next();
		boolean isid = false;
		for (int i = 0; i < arrs.size(); i++) {
			String e = arrs.get(i).getNumber();
			if (w.equals(e)) {
				System.out.println("请输入您销售的商品数量");
				int l = as.nextInt();
				int z = arrs.get(i).getQuantity();
				if(z>=l){
					arrs.get(i).setQuantity(arrs.get(i).getQuantity()-l);
					System.out.println(arrs.get(i).toString());
					isid = true;
				}
				}
				}
		if (!isid) {
			System.out.println("销售失败");
		}
			}
			
		
	
	
}
