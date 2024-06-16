package com.starkindustries.SpringFrameWorkMark1.Game;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class MarioGame implements GamingConsole
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
		System.out.println("Jaldi chal bsdk");
	}

}
