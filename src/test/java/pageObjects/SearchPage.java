package pageObjects;
import org.testng.annotations.*;import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import java.time.Duration;
import java.util.List;
//import org.testng.annotations.DataProvider;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SearchPage  extends BasePage{
	public SearchPage(WebDriver driver) {
		super(driver);
	}
@FindBy(xpath="//a[@class='ac-ln-button']")

WebElement Click1;
@FindBy(xpath="//body/div[@id='page']/div[2]/div[5]/div[3]/div[2]/div[2]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/label[1]/span[1]")
WebElement Click2;

@FindBy(xpath="//body/div[@id='page']/div[2]/div[5]/div[3]/div[2]/div[2]/div[1]/div[2]/fieldset[1]/ul[1]/li[2]/label[1]/img[1]")
WebElement Click3;
@FindBy(xpath="//body/div[@id='page']/div[2]/div[5]/div[3]/div[2]/div[2]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/label[1]/span[1]/span[1]")
WebElement Click4;
@FindBy(xpath="//label[@id='noTradeIn_label']")
WebElement Click5;
@FindBy(xpath="//body/div[@id='page']/div[2]/div[5]/div[3]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/label[1]/span[2]")
WebElement Click6;
@FindBy(xpath="//span[contains(text(),'Connect to any carrier later')]")
WebElement Click7;
@FindBy(xpath="//label[@id='applecareplus_58_noapplecare_label']//span[@class='form-selector-title'][normalize-space()='No AppleCare+ coverage']")
WebElement Click8;
@FindBy(xpath="//span[contains(text(),'Add to Bag')]")
WebElement Click9;
@FindBy(xpath="//button[normalize-space()='Review Bag']")
WebElement Click10;
@FindBy(xpath="//h1[normalize-space()='Your bag total is $1,079.17.']")
WebElement Click11;
public void buttonClick() {
Click1.click();}
public void columnClick() {Click2.click();}
public void colorClick() {Click3.click();}
public void rowClick() {Click4.click();}public void notradeClick() {Click5.click();}public void labelClick() {Click6.click();}
public void sinfreeClick() {JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click();", Click7);/*Click7.click();*/}public void applecareClick() {JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click();", Click8);/*Click8.click();*/}public void addtobagClick() {JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click();", Click9);/*Click9.click();*/}
public void reviewbagclick() {Click10.click();}public String  bagTotalClick() {return Click11.getText();}
}
