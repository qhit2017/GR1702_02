package zengxiangshun;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 作者 曾祥顺\张彤彤
 * @date 创建时间：2004年1月5日 下午2:41:39
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public interface IContacts {

	// 增加
	void add(ArrayList<Contacts> arrayList, Scanner sc);

	// 遍历
	void info(ArrayList<Contacts> arrayList);

	// 查找
	void find(ArrayList<Contacts> arrayList, String leixing,Scanner sc);
}
