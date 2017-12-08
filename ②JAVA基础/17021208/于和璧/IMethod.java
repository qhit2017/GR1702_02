package com.qhit;

import java.util.ArrayList;
import java.util.Scanner;

public interface IMethod {
	
	//帮助信息
	void help();
	
	//新增商品
	void addcommodity(ArrayList<Commodity>arrayList,Scanner sc);
	
	//进货
	void stockcommodity(ArrayList<Commodity>arrayList,Scanner sc);

	//销售
	void removecommodity(ArrayList<Commodity>arrayList,Scanner sc);
	
	//查看库存所有商品信息
	void infocommodity(ArrayList<Commodity>arrayList);

}
