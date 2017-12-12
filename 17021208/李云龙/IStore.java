package zk.store.com;

import java.util.ArrayList;
import java.util.Scanner;

public interface IStore {

	void addStore(ArrayList<Store> arrayList, Scanner sc);
	void stockStore(ArrayList<Store> arrayList,String number,String quantity);
	void sellStore(ArrayList<Store> arrayList,String number,String quantity);
	void infoStore(ArrayList<Store> arrayList);
}

