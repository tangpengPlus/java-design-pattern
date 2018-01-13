package com.design.pattern.strategy;

public class RedheadDuck extends Duck{
	
	
   /**
    * 
    * 作者:    马行空
    * 创建时间: 2018年1月13日上午11:23:06
    * 描述: 	制定飞行和叫的行为
    * 备注:
    */
   public  RedheadDuck() {
	    quackBehavior = new Quack();
	    behavior = new FlyNoWay();
	    
}

	@Override
	void swim() {
		System.out.println("我是:RedheadDuck 我不会游泳");
		
	}

	@Override
	void display() {
		System.out.println("我是:RedheadDuck 我是白色的");
		
	}

}
