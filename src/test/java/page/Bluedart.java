package page;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.ElementScrollBehavior;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import basepkg.Baseclass;

public class Bluedart {

	WebDriver driver;
	
	By Signin=By.xpath("//*[@id=\"keep-open\"]/button/span");

By Loginid=By.name("_com_liferay_login_web_portlet_LoginPortlet_login");
	By psswd=By.xpath("//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_corpassword\"]");
	By Signinbtn=By.xpath("//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_submit\"]");
	By logo1=By.xpath("//*[@id=\"heading\"]/h1/a/img");
	By Radio=By.xpath("//*[@id=\"awbRadioDivTrackDart\"]/input");
	By Waybill=By.xpath("//*[@id=\"awbRadioDivTrackDart\"]/input");
    By Waybilltrack=By.xpath("//*[@id=\"trackingNoTrackDart\"]");
    By Go=By.xpath("//*[@id=\"goBtnTrackDart\"]");
    
	public Bluedart(WebDriver driver)
	{
		this.driver=driver;
	}
	
public void Signinbtn() throws InterruptedException
{

	
	

	driver.findElement(Signin).click();
	
	

}

public void setvalues(String LN,String PWD) throws InterruptedException
{
	//Thread.sleep(2000);

	driver.findElement(Loginid).sendKeys(LN);
	driver.findElement(psswd).sendKeys(PWD);
	driver.findElement(Signinbtn).click();
}
public void logodisplay()
{
	Boolean logo= driver.findElement(logo1).isDisplayed();
	if(logo)
	{
		System.out.println("logo is displayed");
	
	}
	else
	{
		System.out.println("not displayed");
	}
}
public void Radiobutton()
{
	Boolean radio=driver.findElement(Radio).isSelected();
if(radio)
{
System.out.println("radio button is selected");
}
else
{
System.out.println("radio button is not selected");
}
}


public void Waybilltrack(String WT)
{
	driver.findElement(Waybill).click();

driver.findElement(Waybilltrack).click();
driver.findElement(Waybilltrack).sendKeys("32109111683");
driver.findElement(Go).click();	
}
public void scrolldown() 
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));

	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	//js.executeAsyncScript("window.scrollBy(0,document.body.scrollHeight)");
    
}



public void Screenshot() throws IOException
{
	
    
    WebElement button=driver.findElement(logo1);
    File buttonscrnsht=button.getScreenshotAs(OutputType.FILE);
    FileHandler.copy(buttonscrnsht, new File("./Screenshot//buttonscreenshot.png"));
}


public void linkcount()
{

	List<WebElement> li=driver.findElements(By.tagName("a"));
	System.out.println("total no of links="+li.size());
	for(WebElement x:li)
	{
		String link=x.getAttribute("href");
		String linktext=x.getText();
	System.out.println(link+"---"+linktext);	
	}}




}

