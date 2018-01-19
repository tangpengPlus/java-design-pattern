package com.design.pattern.decorate;

public class Test {

	
	public static void main(String[] args) {
		//创建蒙迪欧
		Car mengdiou = new  MengdiOu();
		//配置发动机
		mengdiou = new EngineWhip(mengdiou);//配置低配默认发动机
		//车身颜色配置
		mengdiou  = new ColorWhip("坦桑石蓝", 18000, mengdiou);
		//轮胎配置
		mengdiou = new TyreWhip(mengdiou);//默认配置
		System.out.println("蒙迪欧车的配置为\n:"+mengdiou.carName()+"\n"+mengdiou.configure()+"\n"+mengdiou.price());
		
		
	}
}