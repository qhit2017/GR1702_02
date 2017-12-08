package com.goodstrade;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年12月5日 下午6:23:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TestTrade {

	public static void main(String[] args) {
		ArrayList<Trade> trade=new ArrayList<Trade>();
		TradeSer ser=new TradeSer();
		Scanner sc=new Scanner(System.in);
		boolean is=true;
		String key;
		System.out.println("---------商品管理---------");
		ser.help();
		while (is) {
			System.out.println("请输入指令：（输入【0】查看帮助）");
			key=sc.next();
			switch (key) {
			case "0":
				ser.help();
				break;
			case "1":
				ser.getadd(trade, sc);
				break;
			case "2":
				ser.into(trade, sc);
				break;
			case "3":
				ser.out(trade, sc);
				break;
			case "4":
				ser.info(trade);
				break;
			case "5":
				is=false;
				System.out.println("感谢您的使用，再见！");
				break;
			default:
				System.out.println("指令无效，请重新输入");
				break;
			}
		}

	}

}
