package com.design.pattern.strategy;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("我是:FlyNoWay飞行形态");
		
	}
	

}
