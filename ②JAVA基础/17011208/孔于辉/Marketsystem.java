package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Marketsystem implements IMarket {

	void help() {
		System.out.println("~~~~~~~~~~商品进销存系统~~~~~~~~~");
		System.out.println("1   新增商品");
		System.out.println("2   进货");
		System.out.println("3   销售");
		System.out.println("4   参看库存");
		System.out.println("5   退出功能");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	@Override
	public void addArrayList(ArrayList<Market> markets, Scanner sc) {

		String s = sc.next();
		String[] a = s.split(",");
		Market market = new Market(a[0], a[1], Double.parseDouble(a[2]),
				Integer.parseInt(a[3]));
		markets.add(market);
		System.out.println(market.toString());
	}

	@Override
	public void infoArrayList(ArrayList<Market> markets) {
		for (int i = 0; i < markets.size(); i++) {
			System.out.println(markets.get(i).toString());
		}

	}

	@Override
	public void setArrayList(ArrayList<Market> markets, Scanner sc) {
		
		System.out.println("请输入进货商品编号");
		String w = sc.next();
		boolean isid = false;
		
		for (int i = 0; i < markets.size(); i++) {
			String id = markets.get(i).getId();

			if (w.equals(id)) {

				System.out.println("请输入进货数量");
				int r = sc.nextInt();
				markets.get(i).setNumber(markets.get(i).getNumber() + r);

				System.out.println("进货后库存为：" + markets.get(i).getNumber());
				System.out.println(markets.get(i).toString());
				isid = true;
			}

		}

		if (!isid) {

			System.out.println("进货失败");
		}

	}

	@Override
	public void removeArrayList(ArrayList<Market> markets, Scanner sc) {
		
		System.out.println("请输入销售商品编号");
		String w = sc.next();
		boolean isid = false;
		
		for (int i = 0; i < markets.size(); i++) {
			String a = markets.get(i).getId();
			if (w.equals(a)) {
				
				System.out.println("请输入销售商品数量");
				int s = sc.nextInt();
				int o = (int) markets.get(i).getNumber();

				if (o >= s) {
					
					markets.get(i).setNumber(o - s);
					System.out.println("销售后库存为：" + markets.get(i).getNumber());
					System.out.println(markets.get(i).toString());
					isid = true;

				}
			}
		}
		if (!isid) {

			System.out.println("销售失败");

		}

	}

}
