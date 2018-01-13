package com.design.pattern.strategy;

public class FlyRocketPowered implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("我是带着火箭在飞");
		
	}

}
