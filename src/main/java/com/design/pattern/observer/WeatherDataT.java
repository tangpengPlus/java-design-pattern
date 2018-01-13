package com.design.pattern.observer;

import java.util.Observable;

public class WeatherDataT extends Observable{
	
	private float temperature;
	
	private float humidity;
	
	private float pressure;
	
	public WeatherDataT() {};
	
	
	public void measurementsChanged() {
		
		setChanged();
		notifyObservers();//主动去拉去数据 ，而不是由主题推送数据
	}
	
  public  void setMeasurements(float temperature,float 	humidity,float pressure) {
	  this.humidity = humidity;
	  this.temperature = temperature;
	  this.pressure = pressure;
	  measurementsChanged();
  }


	public float getTemperature() { 
		return temperature;
	}
	
	
	public float getHumidity() {
		return humidity;
	}
	
	
	public float getPressure() {
		return pressure;
	}
  
  

}
