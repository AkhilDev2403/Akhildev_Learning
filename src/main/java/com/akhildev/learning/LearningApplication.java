package com.akhildev.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.akhildev.learning.controller.web.MyWebController;

@SpringBootApplication
public class LearningApplication {

	public static void main(String[] args) {
		
		/** 1. Normal way to call the games (tightly coupled) **/
		
//		MarioGame game = new MarioGame();
//		GameRunner runner = new GameRunner(game);
//		runner.run();
		
		
		/** 2. Using interface (loosely coupled) **/
		
		
		/* now using the interface you can simply switch whichever game u want.
		/* To make the interface much easier just call the interface class and create new with the corresponding game class u want */

		
//		GameConsoleInterface consoleInterface = new PacmanGame();   //1    /** u can simply change the by changing here **/
//		GameRunner runner = new GameRunner(consoleInterface);       //2 
//		runner.run();
		

		/** first we need the implementation of the GameInterfaceConsole i.e Pacman (1). after that we pass that game as a "CONSTRUCTOR ARGUMENT"
		 * and then create GameRunner class.(2) 	To create a GameRunner class you need an instance of GameInterface.. i.e game. GameRunner class has a dependency i.e interface.
		 * Therefore GameInterface.. implementation is a dependency of GameRunner class. So in here we've just written 2 lines of codes to create objects and mange their dependencies. In real world we've to crate n number of classes and dependencies.
		 * Instead of manually creating the objects and managing the objects we can give this responsibility to spring. **/
		
		
		
		/* Method 3 */
		
		/** So we would want spring to handle these 2 lines (instance of the Mario() and the instance of GameRunner()
		 * So to tell spring to create these instances let's go to the Mario class and annotate it with @Component also in GameRunner
		 * However the GameRunner has a dependency. So we can use @Autowire the GameInterfaceConsole in GameRunner.
		 * In short we were wanted our spring to create the component for the Mario and the GameRunner also Autowire the Mario into the GameRunner.
		 * So spring manages no of components like these. Spring manages all these something called APPLICATION_CONTEXT.
		 * So now launch the application_context. "SpringApplication.run(CouplingApplication.class, args);" this is the line creating the App_cont.
		 * So use this and assign it to a local var. SO it manages all the beans.
		 * And we already created the @Component for those 2 lines. now we don't require that. So commenting.
		 * Now to get a specific bean from the context, you can call it like context. **/

		/** Any instance of any component that spring creates is called a bean.
		 * We're saying to spring that to create an instance of the component called Mario. i.e called a bean.
		 * So what bean do we want, we need instance of the GameRunner class. and assign to a loc var **/
		
//		ConfigurableApplicationContext context
//		 =  SpringApplication.run(LearningApplication.class, args);
//		GameRunner runner = context.getBean(GameRunner.class);
//		runner.run();

		/** So what happens if I comment the @Component on mario. it will throw an error, which indicate that it doesn't have the instance or
		 * spring can't create an instance for the class. you should've to add component then only spring could create an instance for that (Mario, contra or pacman)
		 * When spring tries to create an instance of the GameRunner, it's sees that it needs the implementation of the GameInterfaceConsole.
		 * If you give all the 3 games the @Component it's also an error. So you can only run a single class game at the time. but u should mention the @Component on the particular class.**/

	
//		
//		ConfigurableApplicationContext context 
//		 = SpringApplication.run(LearningApplication.class, args);
//		
//		GameRunner runner = context.getBean(GameRunner.class);
//		runner.run();
		
		
		/** Using spring framework **/
		
		
		ConfigurableApplicationContext context 
		 = SpringApplication.run(LearningApplication.class, args);
		
		
		System.out.println("How you doin ?");
		MyWebController controller =  context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
	}

}
