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
public class SearchPage2  extends BasePage{
	public SearchPage2(WebDriver driver) {
		super(driver);
	}

@FindBy(xpath="//input[@id='twotabsearchtextbox']")
WebElement search;
@FindBy(xpath="//input[@id='nav-search-submit-button']")

WebElement  Click;
@FindBy(xpath="//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_3']//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Apple iPhone 14 Pro, 128GB, Gold - Unlocked (Renew')]")
WebElement Click1;
@FindBy(xpath="//span[@class='a-price a-text-price a-size-medium apexPriceToPay']//span[@aria-hidden='true'][normalize-space()='$939.00']")
WebElement Click3;

public void searchClick(String text) {
search.sendKeys(text);}

public void buttonClick()
{
	Click.click();
}
public void ButtonClick1()
{
	Click1.click();
}
public String  buttonClick2() {
	return Click3.getText();
}






}