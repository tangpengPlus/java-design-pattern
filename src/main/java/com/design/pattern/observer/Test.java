package com.design.pattern.observer;

public class Test {

	
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.notifyObserver();
		weatherData.setHumidity(12.12f);
		weatherData.setHumidity(11.12f);
	}
}
