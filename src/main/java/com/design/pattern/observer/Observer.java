package com.design.pattern.observer;

public interface Observer {

	//所有的观察者必须实现此接口来获取主题的变化
	public void update(float temp,float humidity,float pressure);
}
