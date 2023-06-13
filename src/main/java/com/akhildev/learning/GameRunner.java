package com.akhildev.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/** 1. Normal way (tightly coupled) **/

//@Component
//public class GameRunner {
//
//	private MarioGame mario;
//	
//	public GameRunner(MarioGame mario) {
//		this.mario = mario;
//	}
//
//	public void run() {
//		mario.up();
//		mario.down();
//		mario.left();
//		mario.right();
//	}
//	
//}


/** 2. Using interface (loosely coupled) **/

//@Component
//public class GameRunner {
//
//	private GameConsoleInterface consoleInterface;
//	
//	public GameRunner(GameConsoleInterface consoleInterface) {
//		this.consoleInterface = consoleInterface;
//	}
//
//	public void run() {
//		consoleInterface.up();
//		consoleInterface.down();
//		consoleInterface.left();
//		consoleInterface.right();
//	}
//	
//}



/**  Method 3 ***/

@Component
public class GameRunner {
	
	@Autowired
	GameConsoleInterface consoleInterface;
	
	public GameRunner(GameConsoleInterface consoleInterface) {
		this.consoleInterface = consoleInterface;
	}

	public void run() {
		consoleInterface.up();
		consoleInterface.down();
		consoleInterface.left();
		consoleInterface.right();
	}
	
}

