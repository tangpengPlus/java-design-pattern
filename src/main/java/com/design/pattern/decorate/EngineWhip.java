package com.design.pattern.decorate;

/**
 * 
 * 作者:    马行空
 * 创建时间: 2018年1月18日上午10:55:49
 * 描述:    蒙迪欧发动机装饰
 * 备注:
 */
public class EngineWhip extends CarDecorate{

	private  String engine_name = "EcoBoost";
	
	private  String engine_displacement = "1.5T";//排量
	
	private double  price  = 120000.00;//发动机默认价格
	
	Car car;
	
	
	public EngineWhip(Car car) {
		this.car = car;
	}
	
	/**
	 * 
	 * 作者:    马行空
	 * 创建时间: 2018年1月18日上午10:59:42
	 * 描述:    重新构造此装饰
	 * 备注: 
	 * @param negine_name
	 * @param engine_displacement
	 */
	public EngineWhip(String negine_name,String engine_displacement,double price,Car car) {
		this.engine_name = engine_displacement;
		this.engine_displacement = negine_name;
		this.price = price;
		this.car = car;
	}
	
	@Override
	public String carName() {
		
		return car.carName()+"\n"+this.engine_name;
	}

	@Override
	public String configure() {
		
		return car.configure()+"\n"+this.engine_displacement;
	}

	@Override
	public double price() {
		
		return car.price()+this.price;
	}

	
	
}
