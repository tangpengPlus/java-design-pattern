package com.design.pattern.singleton;

public class DubSingleton {

	private volatile static DubSingleton uniqueInstance;
	
	private String name;//
	
	private String disable;//
	
	private String hha;
	
	
	private DubSingleton() {};
	
	/**
	 * 
	 * 作者:    马行空
	 * 创建时间: 2018年1月19日上午10:21:20
	 * 描述:   
	 * 备注: 
	 * @return
	 */
	public static DubSingleton getInstance() {
		
		if(uniqueInstance == null) {
			synchronized (DubSingleton.class) {
				if(uniqueInstance == null) {
					uniqueInstance = new DubSingleton();
				}
			}
		}
		return uniqueInstance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisable() {
		return disable;
	}

	public void setDisable(String disable) {
		this.disable = disable;
	}

	public String getHha() {
		return hha;
	}

	public void setHha(String hha) {
		this.hha = hha;
	}
	
	
	
}
