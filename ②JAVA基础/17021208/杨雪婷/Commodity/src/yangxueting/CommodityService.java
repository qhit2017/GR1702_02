package yangxueting;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 qqE-mail:157334005@qq.com
 * @date    创建时间：2017年12月7日 上午8:54:48 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class CommodityService implements InCommodity{

	@Override
	public void help() {
		System.out.println("1新增商品");
		System.out.println("2进货");
		System.out.println("3销售");
		System.out.println("4参看库存");
		System.out.println("5退出功能");
	}

	@Override
	public void addCommodit(ArrayList<Commodit> arrayList, Scanner sc) {
		String s=sc.next();
		String[] a=s.split(",");
		if (a.length!=4) {
			System.out.println("您输入的信息超出范围，请重新输入");
		} else {
			Commodit commodit=new Commodit(a[0],a[1],Double.parseDouble(a[2]),Double.parseDouble(a[3]));
			arrayList.add(commodit);
			System.out.println(commodit.toString());
		}
		
	}

	@Override
	public void infoCommodit(ArrayList<Commodit> arrayList) {
		for (Commodit commodit : arrayList) {
			System.out.println(commodit.toString());
		}
		
	}

	@Override
	public void stockCommodit(ArrayList<Commodit> arrayList, Scanner sc) {
		String id=sc.next();
		boolean isId=false;
		for (int i = 0; i<arrayList.size(); i++) {
			String string=arrayList.get(i).getId();
			if (id.equals(string)) {
				int d=sc.nextInt();
				arrayList.get(i).setQuantity(arrayList.get(i).getQuantity()+d);
				System.out.println("进货的数量为:"+arrayList.get(i).getQuantity());
			}
			if (isId) {
				System.out.println("找不到这类商品，进货失败");
			}
		}
	}

	@Override
	public void sellCommodit(ArrayList<Commodit> arrayList, Scanner sc) {
		String id=sc.next();
		boolean isNull=false;
		for (int i = 0; i < arrayList.size(); i++) {
			String string=arrayList.get(i).getId();
			if (id.equals(string)) {
				int num=sc.nextInt();
				double quantity= arrayList.get(i).getQuantity();
				if (quantity<num) {
					arrayList.get(i).setQuantity(quantity-num);
					System.out.println("销售的数量为:"+arrayList.get(i).getQuantity());
					isNull=true;
				} else {
					if (isNull) {
						System.out.println("销售失败");
					}
				}
			}
		}
		
	}

}
