package com.javatraining1.abstracts;

abstract class Bike {
	
	abstract void run();
}
class Mahindra extends Bike{
		
	void run(){
		
		System.out.println("Bike is Running");
	}


	public static void main(String[] args) {
		Bike obj = new Mahindra();
		obj.run();
	}

	}