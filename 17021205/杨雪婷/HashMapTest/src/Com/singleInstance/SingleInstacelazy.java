package Com.singleInstance;
/** 
 * @author  作者 qqE-mail:157334005@qq.com
 * @date    创建时间：2017年12月5日 上午11:45:07 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class SingleInstacelazy {

	private SingleInstacelazy(){
	}
	private static SingleInstacelazy singleInstacelazy=null;
	public static SingleInstacelazy getsingleInstacelazy(){
		if (singleInstacelazy!=null) {
			singleInstacelazy=new SingleInstacelazy();
		}
		return singleInstacelazy;
		
	}
}
