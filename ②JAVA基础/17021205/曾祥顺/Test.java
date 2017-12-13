package zengxiangshun;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2004年1月5日 下午5:27:19 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
		ArrayList<Contacts> arrayList = new ArrayList<Contacts>();
		ContactsService cService = new ContactsService();
		Scanner sc = new Scanner(System.in);
		cService.hellp();
		boolean is = true;
		while (is) {
			int key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("请输入信息");
				cService.add(arrayList, sc);
				
				break;
			case 2:
				System.out.println("以下便是录入的所有信息");
				cService.info(arrayList);
				break;
			case 3:
				System.out.println("请输入姓名");
				cService.find(arrayList, "姓名", sc);
				break;
			case 4:
				System.out.println("请输入性别");
				cService.find(arrayList, "性别", sc);
				break;
			case 5:
				System.out.println("请输入电话");
				cService.find(arrayList, "电话", sc);
				break;
			case 6:
				is = false;
				break;

			default:
				System.out.println("输入错，请输入1~6数字");
				break;
			}
		}
	}
}
