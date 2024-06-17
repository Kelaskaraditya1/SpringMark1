package Examples.Exercise1;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.starkindustries.SpringFrameWorkMark1.Game.GameRunner;
import com.starkindustries.SpringFrameWorkMark1.Game.GamingConsole;
import com.starkindustries.SpringFrameWorkMark1.Game.PacmanGame;
@Configuration
@ComponentScan
public class DependencyInjectionApplication 
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
//		var context = new AnnotationConfigApplicationContext(DependencyInjectionApplication .class);
////		context.getBean(GameRunner.class).run();
////		context.getBean(GamingConsole.class).up();
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		var context = new AnnotationConfigApplicationContext(DependencyInjectionApplication.class);
		System.out.println(context.getBean(BuisnessCalculationService.class).findmax());
		
	}
}
