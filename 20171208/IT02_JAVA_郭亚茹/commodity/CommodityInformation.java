package Com.commodity;
/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class CommodityInformation {
	//商品编号、名称、价格、数量
   private String CommodityId;
   private String CommodityName;
   private double Commodityprice;
   private double Commoditynumber;

   
   
   

public String getCommodityId() {
	return CommodityId;
}


public void setCommodityId(String commodityId) {
	CommodityId = commodityId;
}


public String getCommodityName() {
	return CommodityName;
}


public void setCommodityName(String commodityName) {
	CommodityName = commodityName;
}


public double getCommodityprice() {
	return Commodityprice;
}


public void setCommodityprice(double commodityprice) {
	Commodityprice = commodityprice;
}


public double getCommoditynumber() {
	return Commoditynumber;
}


public void setCommoditynumber(double commoditynumber) {
	Commoditynumber = commoditynumber;
}


public CommodityInformation() {
	super();
}


public CommodityInformation(String commodityId, String commodityName,
		double commodityprice, double commoditynumber) {
	super();
	CommodityId = commodityId;
	CommodityName = commodityName;
	Commodityprice = commodityprice;
	Commoditynumber = commoditynumber;
}


@Override
public String toString() {
	return "CommodityInformation [CommodityId=" + CommodityId
			+ ", CommodityName=" + CommodityName + ", Commodityprice="
			+ Commodityprice + ", Commoditynumber=" + Commoditynumber + "]";
}
                  
    
}
