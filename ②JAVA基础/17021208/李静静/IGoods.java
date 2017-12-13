package lijingjing;

import java.util.ArrayList;
import java.util.Scanner;

public interface IGoods {

	void addGoods(ArrayList<Goods> arrayList, Scanner sc);

	void remoreGoods(ArrayList<Goods> arrayList, String e);

	void setGoods(ArrayList<Goods> arrayList, Scanner sc);

	void findGoods(ArrayList<Goods> arrayList, String name);
}
