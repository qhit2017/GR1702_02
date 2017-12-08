package com.xx;

import java.util.ArrayList;
import java.util.Scanner;

public interface IArray {
	//添加商品
	void addCommodity(ArrayList<Commodity> arrs,Scanner as);
	//显示所有的商品信息
	void infoCommodity(ArrayList<Commodity> arrs);
	//进货
	void stock(ArrayList<Commodity> arrs, Scanner as);
	//销售
	void sell(ArrayList<Commodity> arrs,Scanner as);
	
	
	
	
}
