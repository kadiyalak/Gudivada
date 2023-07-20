package testCases;
import org.testng.annotations.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import pageObjects.BasePage;import pageObjects.SearchPage;import testBase.BaseClass;
//import org.testng.annotations.DataProvider;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import pageObjects.SearchPage2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import testBase.BaseClass;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
public class TC_oo1_SearchProduct extends BaseClass{public static	WebDriver driver;

public  Logger logger;
public ResourceBundle rb;
	@Test	//(groups= {"Regression","Sanity"})
	public void Search_Page () 
	{
		logger= LogManager.getLogger(this.getClass());rb=ResourceBundle.getBundle("config");
		logger.debug("application logs.......");
		logger.info("***Starting Tc_001searchpage***");	driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(rb.getString("appurl"));/*driver.switchTo().newWindow(WindowType.WINDOW);driver.get("appurl2");*/
		driver.manage().window().maximize();driver.manage().deleteAllCookies();
		SearchPage sp=new SearchPage(driver);
		
		sp.buttonClick();sp.columnClick();sp.colorClick();sp.rowClick();sp.notradeClick();sp.labelClick();sp.sinfreeClick();sp.applecareClick();
		sp.addtobagClick();sp.reviewbagclick();String output=sp.bagTotalClick();System.out.println(output);
		String output1=output.replace("Your bag total is $"," ");System.out.println(output1); String output8=output1.replace(","," ");
		System.out.println(output8);String output9=output8.replace(".17.",".17 " ) ; System.out.println(output9);String output2=output9.replaceAll("\\s","");System.out.println(output2);   float output3=Float.parseFloat(output2);System.out.println(output3); driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(rb.getString("appurl2"));/*driver.switchTo().newWindow(WindowType.WINDOW);driver.get("appurl2");*/
		driver.manage().window().maximize();driver.manage().deleteAllCookies();
		SearchPage2  sp1=new SearchPage2(driver);sp1.searchClick("iphone 14 pro 128gb gold");sp1.buttonClick();sp1.ButtonClick1();String output4=sp1.buttonClick2(); System.out.println(output4);String output5=output4.replace("$"," ");System.out.println(output5);String output6=(output5.trim() );System.out.println(output6);float output7=Float.parseFloat(output6);System.out.println(output7);		
	if(output7>(output3)) {System.out.println("apple store price is high");}else if(output7<output3) {System.out.println("amazonprice is low ");}else{System.out.println("both are Equal");}}
	public String captureScreen(String tname) throws IOException{
		
		//SimpleDateFormat DF==new SimpleDateFormat();Date dt=new Date();String timestamp=df.format(df);
		String timestamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot takesscreenshot=(TakesScreenshot) driver;
		File source=takesscreenshot.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timestamp + ".png";	
		try {FileUtils.copyFile(source,new File(destination));
		}catch(Exception e) {e.getMessage();
		}return destination;}}
