package com.qhit;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Receive w = new Receive();
		
		ArrayList<Commodity> arrayList = new ArrayList<Commodity>();
		
		Scanner sc = new Scanner(System.in);
		
		w.help();
		
		boolean isQuit = true;
		while (isQuit) {
			
			System.out.println("请输入命令并按回车键！");
			
			String r = sc.next();
			switch (r) {
			case "1":
				System.out.println("请输入商品信息，格式如下：");
				System.out.println("001,洗衣液,15.2,5");
				w.addcommodity(arrayList, sc);
				
				break;
			case "2":
				
				w.stockcommodity(arrayList, sc);
				break;
			case "3":
				
				w.removecommodity(arrayList, sc);
				break;
			case "4":
				
				w.infocommodity(arrayList);
				
				break;
			case "5":
				
				isQuit = false;
				
				break;

			default:
				break;
			}
			
		}
		
		System.out.println("已退出程序！");
	}

}
