package com.design.pattern.strategy;

public class Squack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("我是Squack叫");
		
	}

}
