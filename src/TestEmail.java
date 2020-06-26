import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestEmail {

	@Test()
	public void gmailSignIn() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Thisara\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		
		//open google web site
		driver.get("https://www.google.com");
		
		//maximize window size
		driver.manage().window().maximize();
		
		//Search for GMAIL web site and click on appropriate result
		WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys(new String[] {"GMAIL"});
		element.submit();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h3[text()='E-mail - Sign in - Google Accounts']")).click();
		
		//Enter user name and password 
		driver.findElement(By.id("identifierId")).sendKeys("mmyfirstname56@gmail.com",Keys.ENTER);
	    Thread.sleep(3000);
	    driver.findElement(By.name("password")).sendKeys("superpassword1");
	    
	    //click on sign in button
	    driver.findElement(By.id("passwordNext")).click();
	  	  
	}
 
}
