package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Home {
		WebDriver driver;
		
      @FindBy(xpath="//*[@id=\"MenuContent\"]/a[2]")
     
      WebElement signin;
      
	
      
	public Home(WebDriver driver)
	   {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	public void signin()
	{
		signin.click();
	}
}
