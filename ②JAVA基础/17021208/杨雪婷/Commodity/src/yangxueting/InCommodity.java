package yangxueting;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 qqE-mail:157334005@qq.com
 * @date    创建时间：2017年12月7日 上午8:17:25 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface InCommodity {

	void help();
	void addCommodit(ArrayList<Commodit>arrayList,Scanner sc);
	void infoCommodit(ArrayList<Commodit>arrayList);
	void stockCommodit(ArrayList<Commodit>arrayList,Scanner sc);
	void sellCommodit(ArrayList<Commodit>arrayList,Scanner sc);
}
