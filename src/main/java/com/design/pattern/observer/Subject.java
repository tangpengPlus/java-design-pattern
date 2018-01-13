package com.design.pattern.observer;

/**
 * 
 * 作者:    马行空
 * 创建时间: 2018年1月13日下午2:11:34
 * 描述:    主题
 * 备注:
 */
public interface Subject {
	 
	 //注册观察者
	 public void registerObserver(Observer o);
	 //移除观察者
	 public void removeObserver(Observer o);
	 //下发通知
	 public void notifyObserver();
	 
	
}
