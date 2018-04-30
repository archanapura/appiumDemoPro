package demp;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
 
public class VerifyTitle 
{
 
ExtentReports report;
ExtentTest logger; 
WebDriver driver;
 
 
@Test
public void verifyBlogTitle()
{
report=new ExtentReports("C:\\Users\\TYSS\\Desktop\\byjus_backup\\appiumDemoPro\\test-output\\advance.html");
 
logger=report.startTest("VerifyBlogTitle");
 System.setProperty("webdriver.chrome.driver","C:\\Users\\TYSS\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
driver=new ChromeDriver();
 
driver.manage().window().maximize();
 
logger.log(LogStatus.INFO, "Browser started ");
 
driver.get("http://www.learn-automation.com");
 
logger.log(LogStatus.INFO, "Application is up and running");
 
String title=driver.getTitle();
 
Assert.assertTrue(title.contains("Google")); 
 
logger.log(LogStatus.PASS, "Title verified");
}
 
 
@AfterMethod
public void tearDown(ITestResult result) throws IOException
{
if(result.getStatus()==ITestResult.FAILURE)
{
 
String screenshot_path=Utility.captureScreenShot(driver);
String image= logger.addScreenCapture(screenshot_path);
logger.log(LogStatus.FAIL, "Title verification", image);
 
 
}
 
report.endTest(logger);
report.flush();
 
//driver.get("C:\\Report\\LearnAutomation.html");
}
}