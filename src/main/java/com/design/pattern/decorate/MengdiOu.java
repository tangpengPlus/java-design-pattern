package com.design.pattern.decorate;

public class MengdiOu extends Car{

	@Override
    public String carName() {
		
		return "我是蒙迪欧";
	}
	
	
	@Override
	public String configure() {
		
		return "高级车悬架\n";
	}

	@Override
	public double price() {
		
		return 12500;
	}

}
