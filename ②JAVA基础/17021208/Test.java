package com.stock;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Stock> arrayList = new ArrayList<Stock>();
		StockServer server = new StockServer();
		server.help();
		boolean isQuite = true;
		int key;
		while (isQuite) {
			System.out.println("请输入你要执行的指令");
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("请输入添加的商品");
				server.addStock(arrayList, sc);
				break;
			case 2 :
				break;
			case 3:
				break;
			case 4:
				server.infoStock(arrayList);
				break;
			case 5:
				isQuite = false;
				break;
			default:
				System.out.println("输入指令有误");
				break;
			}
		}
		System.out.println("再见!");
	}

}
