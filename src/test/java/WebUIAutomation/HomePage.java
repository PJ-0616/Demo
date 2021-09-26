package WebUIAutomation;

import java.io.IOException;

import org.testng.annotations.Test;

public class HomePage extends base{
	
	@Test
	public void basePageNavigation() throws IOException
	{
		driver = InitializeDriver();
		driver.get("https://www.amazon.in/");
		
	}

}
