package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	
	public WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.bluedart.com");
		
	
	
}}
