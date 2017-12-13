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
public interface ICommodityInformationInterface {
	//1、新增商品
	void addCommodityInformation(ArrayList<CommodityInformation>arrayList,Scanner sc);
	//2、进货
	void getCommodityInformation(ArrayList<CommodityInformation>arrayList,Scanner sc);
	//3、销售
	void sellCommodityInformation(ArrayList<CommodityInformation>arrayList,Scanner sc);
	//4、遍历
	void infoCommodityInformation(ArrayList<CommodityInformation>arrayList,Scanner sc);
}
