package lishaoqing;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	

	ArrayList<Shop> arrayList=new ArrayList<Shop>();
	Scanner sc=new Scanner(System.in);
	ShopImplements shopImplements=new ShopImplements();
	shopImplements.help();
	boolean isExit=true;
	while (isExit) {
		int int1 = sc.nextInt();
		switch (int1) {
		case 1:
			shopImplements.addNew(arrayList, sc);
			break;
		case 2:
			shopImplements.infoCommodity(arrayList);
			break;
		case 3:
			shopImplements.stock(arrayList, sc);
			break;
		case 4:
			shopImplements.market(arrayList, sc);
			break;
		case 5:
			isExit=false;
			break;
		default:
			System.out.println("请输入正确的指令");
			break;
		}
	}
	System.out.println("拜拜");
}
}