package test;

import utilities.excelutilsbd;

import java.io.IOException;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import page.Bluedart;

public class Bluedarttest extends Baseclass{
	@Test
	
	public void verifyLogin() throws InterruptedException, IOException
	{
		Bluedart p1=new Bluedart(driver);
		 p1.Signinbtn();

	
		String xl="C:\\Users\\grohi\\OneDrive\\Desktop\\Book3.xlsx";
	String Sheet="Sheet1";
	int rowcount =excelutilsbd.getCount(xl, Sheet);
	for(int i=1;i<=rowcount;i++)
	{
		String Login=excelutilsbd.getCellValue(xl, Sheet, i, 0);
		System.out.println("Login---"+Login);
		String pwd=excelutilsbd.getCellValue(xl, Sheet, i, 1);
		System.out.println("password---"+pwd);
		
		p1.setvalues(Login, pwd);
		
		// p1.Signinbtn();
	
		String expectedurl="https://www.bluedart.com";
		String actualurl=driver.getCurrentUrl();
		if(actualurl.equals(expectedurl))
		{
			System.out.println("pass");
		}
			else
			{
				System.out.println("fail");
	}
	}
	
	p1.logodisplay();
	p1.Radiobutton();
	p1.Waybilltrack(null);
	

	p1.scrolldown();
	p1.Screenshot();
	p1.linkcount();


	}
	}
