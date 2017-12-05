package Com.singleInstance;
/** 
 * @author  作者 qqE-mail:157334005@qq.com
 * @date    创建时间：2017年12月5日 上午11:34:05 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class SingleInstance {

	private SingleInstance(){
	}
	private final static SingleInstance INSTANCE=new SingleInstance();
	
	public static final SingleInstance getInstance(){
		return SingleInstance.INSTANCE;
	}
}
