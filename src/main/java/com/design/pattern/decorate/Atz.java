package com.design.pattern.decorate;

public class Atz extends Car{

   public String carName() {
		
		return "我是阿特兹";
	}
	
	
	
	@Override
	public String configure() {
		
		return "中车悬架\n";
	}

	@Override
	public double price() {
		
		return 10000;
	}

}
