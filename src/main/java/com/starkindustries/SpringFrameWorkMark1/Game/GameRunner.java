package com.starkindustries.SpringFrameWorkMark1.Game;
import org.springframework.stereotype.Component;
@Component
public class GameRunner 
{
	public GamingConsole game;
	public GameRunner(GamingConsole game)
	{
		this.game=game;
	}
	public void run()
	{
		System.out.println("Running our 1 st Game");
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
