package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='stripes--1469519570']")
    WebElement username;
    
    @FindBy(xpath="//input[@name='password']")
    WebElement password;
    
    @FindBy(xpath="//input[@name='signon']")
    WebElement SignOn;
    
    @FindBy(xpath="//a[normalize-space()='Register Now!']")
    WebElement register;
    
    
	
    public void setusername(String email) {
    	username.sendKeys(email);
    }
    
    public void setpassword(String pass) {
    	password.sendKeys(pass);
    }
    
    public void clicksignon() {
    	SignOn.click();
    }
    public void register() {
    	register.click();
    }
    
	
	
	}