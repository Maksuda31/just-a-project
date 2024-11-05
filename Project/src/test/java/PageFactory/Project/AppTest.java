package PageFactory.Project;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import ObjectRepository.Home;
import ObjectRepository.LogIn;
import Utilities.CrossBrowser;
import Utilities.ExcelData;


public class AppTest 
{
	WebDriver driver;
	String [] data=new String[5];// for excel data
	
	//for reporting //using ExtentReports
	ExtentReports report= new ExtentReports();
	ExtentSparkReporter sparkreport= new ExtentSparkReporter("C:\\Users\\narsi\\eclipse-workspace\\Project\\target\\Report");
	ExtentTest test=report.createTest("Login Application");

	
	
    /**
     * Rigorous Test :-)
     * @throws IOException 
     */
    @Test
    public void application() throws IOException
    {
    report.attachReporter(sparkreport);//for report generation
    CrossBrowser br= new CrossBrowser();
    
    driver=br.browser_initiate();
    Home h=new Home(driver);
    h.signin();
    
    test.log(Status.PASS,"Welcome to the page");//for report
    
    //for excel data
    ExcelData d=new ExcelData();
    data=d.readExcel();
    String user=data[0];
    String pass=data[1];
    
    LogIn l= new LogIn();
//    l.login_credentials();
    test.log(Status.PASS,"Valid Login");//for report
    report.flush();// for report
    }
   
}
