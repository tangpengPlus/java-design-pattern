package com.design.pattern.singleton;

public class Test {

	
	public static void main(String[] args) {
		
		DubSingleton.getInstance().setName("1233123");
		
		for (int i = 0; i < 500000; i++) {
			
			Thread thread = new Thread(new Runnable() {
				@Override
				public void run() {
					DubSingleton.getInstance().setName("asdsdqweqwe1233123"+"阿杜123123\n");
					System.out.println(DubSingleton.getInstance().getName());
				}
			});
			thread.start();
			System.out.println(thread.getName());
		}
		
		
		
	}
}
