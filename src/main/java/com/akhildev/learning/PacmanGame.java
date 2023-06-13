package com.akhildev.learning;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GameConsoleInterface {
	
	public void up() {
		System.out.println("Pacman Up");
	}
	
	public void down() {
		System.out.println("Pacman Down");
	}
	
	public void right() {
		System.out.println("Pacman Right");
	}
	
	public void left() {
		System.out.println("Pacman Left");
	}

}
