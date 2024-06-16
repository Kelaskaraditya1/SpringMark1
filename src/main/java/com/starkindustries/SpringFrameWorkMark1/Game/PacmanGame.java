package com.starkindustries.SpringFrameWorkMark1.Game;
import org.springframework.stereotype.Component;
@Component
public class PacmanGame implements GamingConsole
{
	public void up()
	{
		System.out.println("Jump or Standup");
	}
	public void down()
	{
		System.out.println("Sit Down");
	}
	public void left()
	{
		System.out.println("Move Ahead");
	}
	public void right()
	{
		System.out.println("baju hat bsdk");
	}

}
