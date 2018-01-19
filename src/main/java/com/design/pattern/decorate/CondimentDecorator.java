package com.design.pattern.decorate;

/**
 * 
 * 作者:    马行空
 * 创建时间: 2018年1月17日下午12:01:43
 * 描述:	      调料抽象 (装饰者类)
 * 备注:
 */
public abstract class CondimentDecorator extends Beverage{

	//所有的装饰者必须重新实父类的方法
	public 	abstract String getDescription();
}
