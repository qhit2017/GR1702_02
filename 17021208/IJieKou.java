package com.homework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**制作者：陈亮亮
 *制作时间：2017年12月7日上午8:14:15
 *邮箱：2507147605@qq.com
 */
public interface IJieKou {
	
	void zhumoun();
	
	void add(ArrayList<ShuXing>arrayList,Scanner sc);
	
	void info(ArrayList<ShuXing>arrayList);
	
	void findchinese(ArrayList<ShuXing>arrayList);
	
	void findmath(ArrayList<ShuXing>arrayList);

	void findEnglish(ArrayList<ShuXing>arrayList);
	
	void findsum(ArrayList<ShuXing>arrayList);

}
