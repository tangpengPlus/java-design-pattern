package com.design.pattern.singleton;
/**
 * 
 * 作者:    马行空
 * 创建时间: 2018年1月19日上午10:04:25
 * 描述:    单例模式
 * 备注:
 */
public class Singleton {

	private static Singleton uniqueInstance;
	
	private Singleton() {};
	
	public static Singleton getInstance() {
		
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
}
