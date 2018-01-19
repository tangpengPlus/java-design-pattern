package com.design.pattern.decorate;
/**
 * 作者:    马行空
 * 创建时间: 2018年1月17日上午11:58:29
 * 描述:    装饰模式
 * 备注:
 */
public abstract	 class Beverage {
	
	String description = "Unknown Beverage";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();

}
