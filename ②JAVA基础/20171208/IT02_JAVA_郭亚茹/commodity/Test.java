package Com.commodity;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
		ArrayList< CommodityInformation> arrayList=new ArrayList<CommodityInformation>();
		CommodityInformationImpelement commodityInformationImpelement=new CommodityInformationImpelement();
		Scanner sc=new Scanner(System.in);
		commodityInformationImpelement.help();
		
		boolean isquit=true;
		
		while (isquit) {
			System.out.println("请输入你的指令并按回车键");
			String key = sc.next();
		switch (key) {

		case "add":
			System.out.println("请输入你要添加的商品名称！");
			commodityInformationImpelement.addCommodityInformation(arrayList, sc);
			break;
		case "get":
			
			commodityInformationImpelement.getCommodityInformation(arrayList, sc);
			break;
		case "sell":
		
			commodityInformationImpelement.sellCommodityInformation(arrayList, sc);
			break;
		case "info":
			System.out.println("请输入你要遍历的名称");
			commodityInformationImpelement.infoCommodityInformation(arrayList, sc);
			break;
		case "exit":
	isquit=false;
			break;

		default:
			System.out.println("对不起！你输入的指令没用，请重新输入！");
			break;
		}
		
		}
		System.out.println("再见！");
	}

}
