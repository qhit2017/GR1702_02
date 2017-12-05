package Com.singleInstance;
/** 
 * @author  作者 qqE-mail:157334005@qq.com
 * @date    创建时间：2017年12月5日 上午11:44:17 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
		SingleInstance singleInstance=SingleInstance.getInstance();
		SingleInstance singleInstance_1=SingleInstance.getInstance();
		SingleInstance singleInstance_2=SingleInstance.getInstance();
		SingleInstance singleInstance_3=SingleInstance.getInstance();
		
		
		System.out.println(singleInstance);
		System.out.println(singleInstance_1);
		System.out.println(singleInstance_2);
		System.out.println(singleInstance_3);
		
		
		
	}
}
