package com.design.pattern.decorate;

/**
 * 
 * 作者:    马行空
 * 创建时间: 2018年1月18日上午11:08:25
 * 描述:    颜色装饰
 * 备注:
 */
public class ColorWhip extends CarDecorate{
    
	private String color_name = "红色";
	
	private double price =5000.00;//价格
	
	Car car;
	
	public ColorWhip(Car car) {
		this.car = car;
	}
	
	public ColorWhip(String color_name,double price,Car car) {
		this.color_name = color_name;
		this.price = price;
		this.car = car;
	}
	
	
	@Override
	public String carName() {
		
		return car.carName()+"";
	}

	@Override
	public String configure() {
		
		return car.configure()+"\n"+this.color_name;
	}

	@Override
	public double price() {
		
		return car.price()+this.price;
	}

}
