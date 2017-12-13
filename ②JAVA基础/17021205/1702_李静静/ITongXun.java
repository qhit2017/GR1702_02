package lijingjing;

import java.util.ArrayList;
import java.util.Scanner;

public interface ITongXun {

	void addTongXun(ArrayList<TongXun>arrayList,Scanner sc);
	void InFoTongXun(ArrayList<TongXun>arrayList);
	public void findbyname(ArrayList<TongXun> arrayList,String name,Scanner sc);
	public void findbyxingbie(ArrayList<TongXun> arrayList,String xingbie,Scanner sc);
	public void findbydianhua(ArrayList<TongXun> arrayList,String dianhua,Scanner sc);
	
}
