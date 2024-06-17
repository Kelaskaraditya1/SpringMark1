package Examples.Exercise1;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class MonoDbDataService implements DataService
{
	@Override
	public int[] retriveData() 
	{
		return new int [] {10,20,30,40,50};
	}
}
