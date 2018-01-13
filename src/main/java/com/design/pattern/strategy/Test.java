package com.design.pattern.strategy;

public class Test {

	public static void main(String[] args) {
		Duck duck =new RedheadDuck();
		duck.performQuack();
		duck.performFly();
		duck.setFlyBehavior(new FlyRocketPowered());
		duck.performFly();
		
	}
	
}
 