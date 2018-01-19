package com.design.pattern.decorate;
/**
 * 
 * 作者:    马行空
 * 创建时间: 2018年1月18日上午11:12:03
 * 描述:    轮胎装饰
 * 备注:
 */
public class TyreWhip extends CarDecorate{

	private String size ="米其林 18寸轮胎";//默认型号
	
	private double price = 1200.00;//默认价格
	
	Car car;
	
	public TyreWhip(Car car) {
		this.car =car;
	}
	
	public TyreWhip(String size,double price,Car car) {
		this.size = size;
		this.price = price;
		this.car =car;
	}
	
	
	@Override
	public String carName() {
		
		return car.carName()+"";
	}

	@Override
	public String configure() {
		
		return car.configure()+"\n"+this.size;
	}

	@Override
	public double price() {
		
		return car.price()+this.price;
	}

}
