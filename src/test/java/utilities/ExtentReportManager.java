package utilities;

import testCases.TC_oo1_SearchProduct;

//import org.apache.commons.mail.ImageHtmlEmail;import org.apache.commons.mail.DefaultAuthenticato;
import testBase.BaseClass;
import java.io.IOException;import java .net.URL;
import java.text.SimpleDateFormat;//import org.apache.commons.mail;
import java.util.Date;

import org.testng.ITestContext;
	import org.testng.ITestResult;
	import org.testng.ITestListener;import com.aventstack.extentreports.Status;
	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.reporter.ExtentSparkReporter;
	import com.aventstack.extentreports.reporter.configuration.Theme;
	public class ExtentReportManager implements ITestListener{
	public ExtentSparkReporter sparkReporter;//UI of the report
	public ExtentReports extent;//populate common info on the report

String repName;
	public  ExtentTest test;//creating test case entries in the report and update status of the test methods
	public void onStart(ITestContext context) {
		
		String timestamp=new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new Date());
		repName="Test-Report-" + timestamp + ".html";
		
		sparkReporter =new ExtentSparkReporter("./reports/" + repName);//specific location
	sparkReporter .config().setDocumentTitle("open cart Automation report");//title of report
	sparkReporter.config().setReportName("open cart functional testing");//name of the report
	sparkReporter.config().setTheme(Theme.DARK);
	extent =new ExtentReports();

	extent.attachReporter(sparkReporter);
	extent.setSystemInfo("Application","opencart" );
	extent.setSystemInfo("module","Admin");
	extent.setSystemInfo("submodule", System.getProperty("user.name"));extent.setSystemInfo("environment", "QA");
	extent.setSystemInfo("operatingsystem", System.getProperty("os.name"));
	extent.flush();
	}
	public void onTestSuccess(ITestResult result) {
		
		test=extent.createTest(result.getName());//create a new entry in the report
		
		test.log(Status.PASS, "test case passed is:"+result.getName());extent.flush();
	}
	public void onTestFailure(ITestResult result) {
		

	test=extent.createTest(result.getName());
	test.log(Status.FAIL, "test case failed is:"+result.getName());
		test.log(Status.FAIL, "test case failed is:"+result.getThrowable().getMessage());
		try
		{
			String imgPath=new TC_oo1_SearchProduct().captureScreen(result.getName());
			test.addScreenCaptureFromPath(imgPath);
		}
		catch(IOException e1) {
			e1.printStackTrace();
		}
		extent.flush();
		
	}
	public void onTestSkipped(ITestResult result) {
		
	test=extent.createTest(result.getName());
		
		test.log(Status.SKIP, "test case passed is:"+result.getName());
		
		
	}
	public void onTestFinish(ITestContext context) {
		
		
		extent. flush();
		/*try
		{
			URL url=new URL("file:///"+System.getProperty("user.dir")+"reports"+repName);
			ImageHtmlEmail email=new ImageHtmlEmail();
			email.setDataSourceResolver(new DataSourceUrlResolver(url));
			
			email.setHostName("smtp.googlemail.com");
			email.setSmtpPort(465);
			email.setAuthenticatior(new DefaultAuthenticator("kranthi2694@gmail.com","Dollar70@us"));
			email.setSSLOnConnect(true);
			email.setFrom("kranthi2694@gmail.com");
			email.setSubject("test results");
			
			email.setMsg("please find attached report....");
			email.addTo("kranthi2694@gmail.com");
			email.attach(url,"extent report","please check report...");
			email.send();
			
		}*/
		/*catch(Exception e)
		{
			e.printStackTrace();
		}*/
		
	}

	}