package com.starkindustries.SpringFrameWorkMark1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.starkindustries.SpringFrameWorkMark1.Game.GameRunner;
import com.starkindustries.SpringFrameWorkMark1.Game.GamingConsole;
import com.starkindustries.SpringFrameWorkMark1.Game.PacmanGame;
@Configuration
@ComponentScan("com.starkindustries.SpringFrameWorkMark1.Game")
public class AppGamingBasicMarkTwo 
{
//	@Bean
//	public GamingConsole gamingConsole()
//	{
//		PacmanGame game = new PacmanGame();
//		return game;
//	}
//	@Bean
//	public GameRunner gameRunner(GamingConsole gamingConsole)
//	{
//		return new GameRunner(gamingConsole);
//	}
	public static void main(String[] args)
	{
//		PacmanGame game = new PacmanGame();
//		GameRunner runner = new GameRunner(game);
//		runner.run();
		var context = new AnnotationConfigApplicationContext(AppGamingBasicMarkTwo .class);
		context.getBean(GameRunner.class).run();
//		context.getBean(GamingConsole.class).up();
	}
}
