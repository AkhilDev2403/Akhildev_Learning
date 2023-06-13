package com.akhildev.learning;

//@Component
public class MarioGame implements GameConsoleInterface {

	public void up() {
		System.out.println("Mario Up");
	}
	
	public void down() {
		System.out.println("Mario Down");
	}
	
	public void right() {
		System.out.println("Mario Right");
	}
	
	public void left() {
		System.out.println("Mario Left");
	}
	
}
