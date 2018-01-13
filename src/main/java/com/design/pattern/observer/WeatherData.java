package com.design.pattern.observer;

import java.util.ArrayList;
//主题实现
public class WeatherData implements Subject{

	private ArrayList<Observer> observers;//观察者集合
	
	private float temprature;
	
	private float humidity;
	
	private float pressure;
	
	
	public WeatherData() {
	
		observers = new ArrayList<>();
	}
	
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
	   int i = observers.indexOf(o);
	   if(i >0) {
		   observers.remove(i);
	   }
		
	}

	@Override
	public void notifyObserver() {
		for(int i = 0; i < observers.size(); i++) {
			Observer observer = observers.get(i);
			observer.update(temprature,humidity,pressure);
		}
		
	}


	public ArrayList<Observer> getObservers() {
		return observers;
	}


	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}


	public float getTemprature() {
		return temprature;
	}


	public void setTemprature(float temprature) {
		this.temprature = temprature;
	}


	public float getHumidity() {
		return humidity;
	}


	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}


	public float getPressure() {
		return pressure;
	}


	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

}
