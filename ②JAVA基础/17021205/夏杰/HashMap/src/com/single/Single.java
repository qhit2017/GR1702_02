package com.single;

public class Single {

	private   Single(){
		

	}
	private static Single s = null;
	
	public static Single getSingle(){
		if(s==null){
			s = new Single();
		}
		return s;
	}
}
