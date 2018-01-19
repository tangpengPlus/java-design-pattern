package com.design.pattern.decorate;
/**
 * 
 * 作者:    马行空
 * 创建时间: 2018年1月18日上午10:44:30
 * 描述:    汽车超类
 * 备注:
 */
public abstract class Car {
	
	
	private final static String RUN= "我是汽车我现在只有跑的功能";
	
	private int speed;//汽车速度
	
	
	public String carName() {
		
		return RUN+",我现在的速度是:"+speed;
	}
	
	/**
	 * 
	 * 作者:    马行空
	 * 创建时间: 2018年1月18日上午10:49:23
	 * 描述:    汽车配置
	 * 备注:
	 */
	public abstract String configure();
	
	
	/**
	 * 
	 * 作者:    马行空
	 * 创建时间: 2018年1月18日上午10:52:21
	 * 描述:    价格
	 * 备注: 
	 * @return
	 */
    public abstract double price();
}
