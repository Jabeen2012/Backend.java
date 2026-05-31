package com.inheritance;

public class Car extends Vehicle{
        public void speed() {
        	System.out.println("Car is moving with at 70km/hr");
        }
	public static void main(String[] args) {
		Car obj=new Car();
		obj.run();
		obj.speed();
		

	}

}
