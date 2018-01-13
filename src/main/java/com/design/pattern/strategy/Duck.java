package com.design.pattern.strategy;
/**
 * 作者:    马行空
 * 创建时间: 2018年1月13日上午10:43:24
 * 描述: 	鸭子超类
 * 备注:
 */
public abstract class Duck {
	
    QuackBehavior quackBehavior;//鸭子叫的行为
    
    FlyBehavior   behavior;//鸭子飞行行为
	
    abstract void swim();//鸭子游泳
    
    abstract void display();//鸭子外表
    
    
    public void performQuack() {
    	
    	quackBehavior.quack();
    }
    
    public void performFly() {
    	
    	behavior.fly();
    }
    
    
    public void setQuackBehavior(QuackBehavior quackBehavior) {
    	
    	this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior   behavior) {
    	this.behavior = behavior;
    }
    

}
