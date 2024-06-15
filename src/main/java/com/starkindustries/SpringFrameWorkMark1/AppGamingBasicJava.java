package com.starkindustries.SpringFrameWorkMark1;

import com.starkindustries.SpringFrameWorkMark1.Game.ContraGame;
import com.starkindustries.SpringFrameWorkMark1.Game.GameRunner;
import com.starkindustries.SpringFrameWorkMark1.Game.MarioGame;
import com.starkindustries.SpringFrameWorkMark1.Game.PacmanGame;

public class AppGamingBasicJava {
	public static void main(String[] args)
	{
//		var game = new MarioGame();
//		var game = new ContraGame();
		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}
}
