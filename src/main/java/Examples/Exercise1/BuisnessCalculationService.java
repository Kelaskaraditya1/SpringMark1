package Examples.Exercise1;
import java.util.Arrays;
import org.springframework.stereotype.Component;
@Component
public class BuisnessCalculationService
{
	public DataService dataService;
	public BuisnessCalculationService(DataService dataService)
	{
		this.dataService=dataService;
	}
	public int findmax()
	{
		return Arrays.stream(dataService.retriveData()).max().orElse(0);
	}

}
