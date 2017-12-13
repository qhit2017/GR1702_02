package Com.commodity;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 作者 E-mail:1561061182@qq.com
 * @date 创建时间：2017年11月8日 下午6:44:32
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class CommodityInformationImpelement implements
		ICommodityInformationInterface {
       void help(){
    	   System.out.println("-----查询帮助系统-----");
    	   System.out.println("【1】  新增商品请输入add");
    	   System.out.println("【2】 进货请输入get");
    	   System.out.println("【3】   销售请输入sell");
    	   System.out.println("【4】参看库存请输入info");
    	   System.out.println("【5】   退出功能请输入exit");
       }
	@Override
	public void addCommodityInformation(
			ArrayList<CommodityInformation> arrayList, Scanner sc) {

		String string = sc.next();
		String[] a = string.split(",");
		if (a.length != 4) {
			System.out.println("对不起！你输入的格式错误，请重新输入。");
		} else {
			CommodityInformation commodityInformation = new CommodityInformation(
					a[0], a[1], Double.parseDouble(a[2]),
					Double.parseDouble(a[3]));
			arrayList.add(commodityInformation);
			System.out.println(arrayList.toString());
			System.out.println("添加成功！");
		}

	}

	@Override
	public void getCommodityInformation(
			ArrayList<CommodityInformation> arrayList, Scanner sc) {
		//2、进货，输入商品编号和数量，如有此编号商品，则增加相应数量，如没有则显示进货失败。
		System.out.println("请输入商品编号");
		String y = sc.next();
		
		boolean isCommodityId = false;
		
		for (int i = 0; i <arrayList.size(); i++) {
			
			String t = arrayList.get(i).getCommodityId();
			
			if (t.equals(y)) {
				
				System.out.println("请输入进货数量");
				
				int r = sc.nextInt();
				
				arrayList.get(i).setCommoditynumber(arrayList.get(i).getCommoditynumber()+r);
				
				System.out.println("进货后数量为:"+arrayList.get(i).getCommoditynumber());
				
				isCommodityId = true;
			}
			
			if (!isCommodityId) {
				System.out.println("进货失败！");
			}
			
		}
		
		

	}

	@Override
	public void sellCommodityInformation(
			ArrayList<CommodityInformation> arrayList, Scanner sc) {
		//3、销售，输入商品编号和数量，如有此编号商品且商品数量大于销售数量，则减少相应数量，否则显示销售失败。
		System.out.println("请输入商品编号");
			String string = sc.next();
			boolean isnull=false;
			for (int i = 0; i < arrayList.size(); i++) {
				 String d = arrayList.get(i).getCommodityId();
				if (string.equals(d)) {
					System.out.println("请输入销售数量");
					int y = sc.nextInt();
					double l = arrayList.get(i).getCommoditynumber();
					if (y<l) {
						arrayList.get(i).setCommoditynumber(l-y);
						
						System.out.println("销售后的数量为："+arrayList.get(i).getCommoditynumber());
						isnull=true;
					} 
						if (!isnull) {
							System.out.println("销售失败！");
						

					}
					
				}
				
			}
	}

	@Override
	public void infoCommodityInformation(
			ArrayList<CommodityInformation> arrayList, Scanner sc) {
		for (CommodityInformation commodityInformation : arrayList) {
			System.out.println(commodityInformation.toString());
			
		}
		}

	}


