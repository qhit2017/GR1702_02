package com.test;

import java.util.ArrayList;
import java.util.Scanner;

public interface ICommodity {
/*新增商品
2   进货
3   销售
4   参看库存*/
		void addCommodity(ArrayList<Commodity>arrayList,Scanner sc );
		void stockCommodity(ArrayList<Commodity>arrayList,Scanner sc );
		void sellCommodity(ArrayList<Commodity>arrayList,Scanner sc );
		void findCommodity(ArrayList<Commodity>arrayList,String name );
		void infoCommodity(ArrayList<Commodity>arrayList);
}
