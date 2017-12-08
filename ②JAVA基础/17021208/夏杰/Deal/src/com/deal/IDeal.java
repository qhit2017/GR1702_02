package com.deal;

import java.util.ArrayList;
import java.util.Scanner;

public interface IDeal {

	void addDeal(ArrayList<Deal>arrayList,Scanner sc);
	
	void stockDeal(ArrayList<Deal>arrayList,Scanner sc);
	
	void sellDeal(ArrayList<Deal>arrayList,Scanner sc);
	
	void findById(ArrayList<Deal>arrayList,String id);
}
