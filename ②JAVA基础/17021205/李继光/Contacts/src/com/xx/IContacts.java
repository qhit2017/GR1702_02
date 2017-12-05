package com.xx;

import java.util.ArrayList;
import java.util.Scanner;

public interface IContacts {
	
	//Ìí¼Ó
	void Add(ArrayList<Contacts> arr,Scanner as);
	//±éÀú
	void info(ArrayList<Contacts> arr);
	//²éÕÒ
	void findByName(ArrayList<Contacts> arr,String name);
	void findBySex(ArrayList<Contacts> arr,String sex);
	void findBy(ArrayList<Contacts> arr,String num);
	
	
	
}
