package kaoshi3;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年12月6日 下午6:39:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class CommodityService implements ICommodity {
	void hellp(){
		System.out.println("进销存系统");
		System.out.println("1  增加商品");
		System.out.println("2  进货商品数量");
		System.out.println("3  销售商品数量");
		System.out.println("4  查看库存");
		System.out.println("5  退出");
		
	}

	@Override
	public void add(ArrayList<Commodity> arrayList, Scanner sc) {
		String a = sc.next();
		String[] a1 = a.split(",");
		Commodity a2 = new Commodity(a1[0], a1[1], Integer.parseInt(a1[2]), Integer.parseInt(a1[3]));
		arrayList.add(a2);
		System.out.println(a2.toString());
	}

	@Override
	public void add1(ArrayList<Commodity> arrayList, Scanner sc) {
		//编号
		System.out.println("请输入编号");
		String a = sc.next();
		
		//找下标
		for (int i = 0; i < arrayList.size(); i++) {
			String number = arrayList.get(i).getNumber();
			if (number.equals(a)) {
				System.out.println("请输入进货多少");
				int s = sc.nextInt();
				arrayList.get(i).setAmount(arrayList.get(i).getAmount()+s);
			}
		}
		info(arrayList);
	}

	@Override
	public void remove(ArrayList<Commodity> arrayList, Scanner sc) {
		//编号
		System.out.println("请输入编号");
		String a = sc.next();
		
		//找下标
		for (int i = 0; i < arrayList.size(); i++) {
			String number = arrayList.get(i).getNumber();
			if (number.equals(a)) {
				System.out.println("请输入销售多少");
				int s = sc.nextInt();
				arrayList.get(i).setAmount(arrayList.get(i).getAmount()-s);
			}
		}
		info(arrayList);
		
		

	}

	@Override
	public void info(ArrayList<Commodity> arrayList) {
		for (Commodity commodity : arrayList) {
			System.out.println(commodity.toString());
		}

	}

}
