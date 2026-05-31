package com.inheritance;

public class Lapyop extends Computer {
	public void showModel() {
		System.out.println("Mode: intel 5");
	}

	public static void main(String[] args) {
		Lapyop obj=new Lapyop();
		obj.showbrand();
		obj.showModel();
		

	}

}
