package com.deal;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Deal> arrayList = new ArrayList<Deal>(10);
		DealService dealService = new DealService();
		boolean isquit = true;
		dealService.getHelp();
		int key;
		while (isquit) {
			key = sc.nextInt();
			switch (key) {
			case 1:
				dealService.addDeal(arrayList, sc);
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				dealService.infoDeal(arrayList);
				break;
			case 5:
				isquit = false;
				break;

			default:
				System.out.println("输入指令无效！");
				break;
			}
		}
		System.out.println("退出系统！");
	}

}
