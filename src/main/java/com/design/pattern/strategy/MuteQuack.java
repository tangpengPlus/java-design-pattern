package com.design.pattern.strategy;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("我是:MuteQuack叫");
		
	}

}
