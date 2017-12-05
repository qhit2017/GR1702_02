package com.hashmp;

public class Contry {
	
	String name;
	long population;
	
	
	public Contry(String name, long population) {
		super();
		this.name = name;
		this.population = population;
	}


	@Override
	public String toString() {
		return "Contry [name=" + name + ", population=" + population + "]";
	}
	
	

}
