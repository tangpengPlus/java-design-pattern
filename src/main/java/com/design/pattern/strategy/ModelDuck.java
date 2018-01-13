package com.design.pattern.strategy;

public class ModelDuck extends Duck{

	public ModelDuck() {
		quackBehavior = new Quack();
		behavior   = new FlyWithWings();
		
	}
	
	@Override
	void swim() {
		
		
	}

	@Override
	void display() {
		
		System.out.println(" 我是白色的鸭子");
		
	}

}
