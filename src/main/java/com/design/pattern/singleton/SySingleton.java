package com.design.pattern.singleton;
/**
 * 
 * 作者:    马行空
 * 创建时间: 2018年1月19日上午10:14:37
 * 描述:    多线程之间共同使用同一个对象的实例
 * 备注:
 */
public class SySingleton {

	private static SySingleton  uniqueInstance= new SySingleton();//线程安全
	
	/**
	 * 
	 * 作者:    马行空
	 * 创建时间: 2018年1月19日上午10:17:19
	 * 描述:    无法外部实例
	 * 备注:
	 */
	private SySingleton() {
		
	}
	
	public static SySingleton getInstance() {
		return uniqueInstance;
	}
}
