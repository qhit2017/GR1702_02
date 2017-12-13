package kaoshi3;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年12月6日 下午7:15:30 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
		ArrayList<Commodity> arrayList = new ArrayList<Commodity>();
		CommodityService a = new CommodityService();
		Scanner sc = new Scanner(System.in);
		a.hellp();
		boolean is = true;
		while (is) {
			int key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("请输入增加的商品");
				a.add(arrayList, sc);
				break;
			case 2:
				
				a.add1(arrayList, sc);
				break;
			case 3:
				
				a.remove(arrayList, sc);
				break;
			case 4:
				System.out.println("库存");
				a.info(arrayList);
				break;
			case 5:
				is = false;
				break;

			default:
				System.out.println("错误");
				break;
			}
			
		}
		System.out.println("拜拜");
	}
}
