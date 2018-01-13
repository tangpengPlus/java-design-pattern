package com.design.pattern.observer;

/**
 * 
 * 作者:    马行空
 * 创建时间: 2018年1月13日下午2:36:32
 * 描述:    具体的摸个观察者
 * 备注:
 */
public class CurrentConditionsDisplay implements Observer ,DisplayElement{

	private float temperature;
	
	private float humidity;
	
	private Subject weatherData;
	
	
	//注册
	 public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	
	@Override
	public void display() {
		
		System.out.println("当前获取到的变化是:temperature:"+temperature+",humidity:"+humidity+",weatherData:"+weatherData);
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		//接收到的更新数据
		this.humidity = humidity;
		this.temperature = pressure;
		display();
		
	}

}
