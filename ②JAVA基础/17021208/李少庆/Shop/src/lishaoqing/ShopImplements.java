package lishaoqing;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopImplements implements IShop {

	void help(){
		System.out.println("---商店系统帮助信息---");
		System.out.println("请输入指令序号");
		System.out.println("1  进新货");
		System.out.println("2  显示库存");
		System.out.println("3  补货");
		System.out.println("4  销售");
		System.out.println("5  退出");
	}
	
	@Override
	public void addNew(ArrayList<Shop> arrayList,Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("请输入您要进的新商品");
		String next = sc.next();
		String[] split = next.split(",");
		
		if (split.length==4) {
			Shop shop=new Shop();
			shop.setNum(split[0]);
			shop.setName(split[1]);
			shop.setPrice(Double.parseDouble(split[2]));
			shop.setAmount(Integer.parseInt(split[3]));
			
			arrayList.add(shop);
			System.out.println(shop);
			
		} else {
			System.out.println("请输入正确的格式");
		}
	}

	@Override
	public void stock(ArrayList<Shop> arrayList,Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("请输入商品编号");
		String n = sc.next();
		boolean isNo = true;
		for (int i = 0; i < arrayList.size(); i++) {
			if (n.equals(arrayList.get(i).getNum())) {
				System.out.println("请输入进货的数量");
				int j = sc.nextInt();
				int k = arrayList.get(i).getAmount();
				k+=j;
				arrayList.get(i).setAmount(k);
				System.out.println(arrayList.get(i).toString());
				isNo=false;
			}
		}
		if (isNo) {
			System.out.println("您要进的商品不存在");
		}
	}

	@Override
	public void market(ArrayList<Shop> arrayList,Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("请输入您要销售的商品编号");
		String m = sc.next();
		boolean isNo=false;
		for (int i = 0; i < arrayList.size(); i++) {
			if (m.equals(arrayList.get(i).getNum())) {
				System.out.println("请输入要销售的数量");
				int j = sc.nextInt();
				int k = arrayList.get(i).getAmount();
				if (j<k) {
					k=k-j;
					arrayList.get(i).setAmount(k);
					System.out.println(arrayList.get(i).toString());
				}else {
					System.out.println("存货不足，销售失败");
				}
			isNo=true;
			}
		}
		if (!isNo) {
			System.out.println("您要销售的商品不存在");
		}
	}

	@Override
	public void infoCommodity(ArrayList<Shop> arrayList) {
		// TODO Auto-generated method stub
		for (Shop shop : arrayList) {
			System.out.println(shop.toString());
		}
	}

}
