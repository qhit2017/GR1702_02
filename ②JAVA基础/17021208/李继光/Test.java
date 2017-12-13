package com.xx;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList<Commodity> arrs = new ArrayList<Commodity>();
		Scanner as = new Scanner(System.in);
		ArrayCommodity arrayCommodity = new ArrayCommodity();
		boolean isQuit = true;
		arrayCommodity.help();
		int key;
		while (isQuit) {
			key = as.nextInt();
			switch (key) {
			case 1:
				arrayCommodity.addCommodity(arrs, as);
				break;
			case 2:
				arrayCommodity.infoCommodity(arrs);
				break;
			case 3:
				arrayCommodity.stock(arrs, as);
				break;
			case 4:
				arrayCommodity.sell(arrs, as);
				break;
			case 5:
				isQuit = false;
				break;
			default:
				break;
			}
		}
		System.out.println("谢谢您的使用，再见");
	}
}
