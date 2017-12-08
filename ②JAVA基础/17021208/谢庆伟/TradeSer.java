package com.goodstrade;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年12月5日 下午5:35:18 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TradeSer implements ITrade {

	public void help(){
		System.out.println("【1】新增商品");
		System.out.println("【2】进货");
		System.out.println("【3】销售");
		System.out.println("【4】查看商品库存");
		System.out.println("【5】退出");
	}
	@Override
	public void getadd(ArrayList<Trade> arraylist, Scanner sc) {
		System.out.println("请输入新的商品编号：");
		String a=sc.next();
		System.out.println("请输入该商品的名称：");
		String b=sc.next();
		System.out.println("请输入该商品的价格：");
		double c=sc.nextDouble();
		System.out.println("请输入该商品的数量：");
		int d=sc.nextInt();
		Trade trade =new Trade(a,b,c,d);
		arraylist.add(trade);
		System.out.println("成功添加以下商品：");
		System.out.println(trade.toString());
	}

	@Override
	public void into(ArrayList<Trade> arraylist, Scanner sc) {
		System.out.println("请输入欲批进的商品编号：");
		String a=sc.next();
		boolean isnull=false;
		for (Trade trade : arraylist) {
			if(trade.getId().equals(a)){
				System.out.println("请输入该商品进货数量：");
				int b=sc.nextInt();
				trade.setNum(trade.getNum()+b);
				System.out.println("进货成功！该商品库存增加到"+trade.getNum());
				isnull=true;
				break;
			}
			else{
				isnull=false;
			}
		}
		if(!isnull){
			System.out.println("找不到该商品，进货失败！");
		}

	}

	@Override
	public void out(ArrayList<Trade> arraylist, Scanner sc) {
		System.out.println("请输入欲销售的商品编号：");
		String a=sc.next();
		System.out.println("请输入该商品的销售数量：");
		int b=sc.nextInt();
		boolean isnull=false;
		for (Trade trade : arraylist) {
			if(trade.getId().equals(a)){
				isnull=true;
				if(trade.getNum()>=b){
					trade.setNum(trade.getNum()-b);
					System.out.println("销售成功！该商品库存剩余"+trade.getNum());
				}else{
					System.out.println("库存不足，销售失败！");
				}
				break;
			}
			else{
				isnull=false;
			}
		}
		if(!isnull){
			System.out.println("找不到该商品，销售失败！");
		}
	}
	
	@Override
	public void info(ArrayList<Trade> arraylist) {
		boolean isnull=true;
		for (Trade trade : arraylist) {
			System.out.println(trade.toString());
			isnull=false;
		}
		if(isnull){
			System.out.println("仓库空空如也，请先添加！");
		}

	}

}
