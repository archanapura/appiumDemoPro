package appiumDemoPro;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

@Listeners(com.appiumDemoPro.Generic.EventNotifier.class)

public class ByjusTest {
	public static ExtentReports extent;
	public static ExtentTest logger;
	@Test
	public void byjusPocTest() throws Throwable
	{ 
		extent=new ExtentReports("./test-output/advance.html");
   	    logger=extent.startTest("byjusPocTest");
   	    int a= 10;
   	    int b=10;
   	    System.out.println(a/b);
   	  //  Assert.assertEquals(10,10*2);
   	// Assert.assertTrue(false);
   	 logger.log(LogStatus.PASS, "Test Case (failTest) Status is passed");
		System.out.println("Application successfully launched");
		 extent.endTest(logger);
		 extent.flush();

		extent.close();
		/*
		ByjusPage class1=PageFactory.initElements(driver, ByjusPage.class);
		//ByjusPage class1 =new ByjusPage();
		class1.waitForPageLoad();
	//	class1.takeScreenShot("home");
		//Click on Allow Button
		class1.clickOnButton(0.64,0.63);	
		class1.waitForPageLoad();
	//	class1.takeScreenShot("skipButton");
		//ClickingOnSkipButton
		class1.clickOnButton(0.09,0.9);
		class1.waitForPageLoad();
		//class1.takeScreenShot("phoneVerification");
		class1.waitForPageLoad();
		//clickOnTextField
		class1.clickOnButton(0.478,0.51);
		class1.waitForPageLoad();
		//EnterPhoneNo
		
		ExcelDataMethod edm=PageFactory.initElements(driver, ExcelDataMethod.class);
		
			String phoneno=edm.getExcelData("sheet1", 0, 0);
		
		class1.enterPhoneNo();
		//ClickOnDoneButton
		class1.clickOnButton(0.92,0.28);
		class1.waitForPageLoad();
		//class1.takeScreenShot("SucessImage");
		class1.OTPverify();
		class1.waitForPageLoad();
		class1.waitForPageLoad();
		//ClickOnFunzone
		class1.clickOnButton(0.848,0.082);
	  class1.takeScreenShot("SelectedFunzone");
		class1.waitForPageLoad();
		class1.waitForPageLoad();
		//ClickOn Proffesor's Challenge
		class1.clickOnButton(0.25,0.675);
       class1.takeScreenShot("SelectedGame");
		class1.waitForPageLoad();
		class1.waitForPageLoad();
		//Click on first answer
		class1.takeScreenShot("FirstQuestion");
		class1.SelectOptions(0.28,0.71);
		class1.waitForPageLoad();
		class1.waitForPageLoad();
		//Click on sec answer
	class1.takeScreenShot("SecondQuestion");
		class1.SelectOptions(0.28,0.71);
		class1.waitForPageLoad();
		class1.waitForPageLoad();
		//Click on third answer	
	class1.takeScreenShot("ThirdQuestion");
		class1.SelectOptions(0.28,0.71);
		class1.waitForPageLoad();
		class1.waitForPageLoad();
		//Click on fourth answer
	class1.takeScreenShot("FourthQuestion");
		class1.SelectOptions(0.28,0.71);
		class1.waitForPageLoad();
		class1.waitForPageLoad();
		//Click on fifth answer
		class1.takeScreenShot("FifthQuestion");
		class1.SelectOptions(0.28,0.71);
		class1.waitForPageLoad();
		class1.waitForPageLoad();
		//ClickOnHOmeButton
		class1.clickOnButton(0.36,0.89);
		class1.waitForPageLoad();
		class1.takeScreenShot("HomeButton");
		class1.waitForPageLoad();*/


	}

}
