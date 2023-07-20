//package testBase;

package testBase;
import org.testng.annotations.*;//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;
import java.util.List;
//import org.testng.annotations.DataProvider;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.WebElement;//import org.openqa.selenium.firefox;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;import java.io.IOException;import java.util.Date;import java.text.SimpleDateFormat;import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;import java.io.File;import org.openqa.selenium.OutputType;import org.apache.commons.io.FileUtils;
import org. apache. commons. lang3. RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;import java.util.ResourceBundle;
public class BaseClass {
	public static	WebDriver driver;
	
	/*public  Logger logger;
	public ResourceBundle rb;
		
		@BeforeClass//(groups= {"Regression","Sanity",})

	@Parameters("browser")
		public void setUp(String br) {
			logger= LogManager.getLogger(this.getClass());//rb=ResourceBundle.getBundle("config");
			if(br.equals("chrome")) {
				//WebDriverManager.chromedriver().setup();
				rb=ResourceBundle.getBundle("config");
				//logger=LogManager.getLogger(this.getClass());driver.get("https://www.amazon.com");
				/*ChromeOptions options=new ChromeOptions();
				options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});*/
				/*driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get(rb.getString("appurl"));driver.switchTo().newWindow(WindowType.WINDOW);driver.get("appurl2");
				driver.manage().window().maximize();driver.manage().deleteAllCookies();//d////river.navigate().refresh();
				}
			
				else if(br.equals("edge")) {
					//WebDriverManager.edgedriver().setup();
					//logger=LogManager.getLogger(this.getClass());
					
					
					rb=ResourceBundle.getBundle("config");
					EdgeOptions options1=new EdgeOptions();
					options1.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
					driver=new EdgeDriver(options1);
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					driver.get(rb.getString("appurl2"));
					driver.manage().window().maximize();driver.manage().deleteAllCookies();
					}
				
				
				else {
					//WebDriverManager.firefoxdriver().setup();
					//ChromeOptions options=new ChromeOptions();
					//options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});

					driver=new FirefoxDriver();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					driver.get(rb.getString("appurl"));
					driver.manage().window().maximize();
					driver.manage().deleteAllCookies();
				}
}*/public String captureScreen(String tname) throws IOException{
	
	//SimpleDateFormat DF==new SimpleDateFormat();Date dt=new Date();String timestamp=df.format(df);
	String timestamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	TakesScreenshot takesscreenshot=(TakesScreenshot) driver;
	File source=takesscreenshot.getScreenshotAs(OutputType.FILE);
	String destination=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timestamp + ".png";	
	try {FileUtils.copyFile(source,new File(destination));
	}catch(Exception e) {e.getMessage();
	}return destination;}}
