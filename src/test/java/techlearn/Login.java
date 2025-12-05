package techlearn;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Login {
	WebDriver driver;
  @Test
  public void TechlearnLogin() {
	  driver.get("https://www.techlearn.in/admin");
	  
  }
  
  @Test
  public void Google() {
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("Hello_Selenium");
	  
  }
  
  @Test
  public void Twitter() {
	  driver.get("https://www.x.com");
	  
  }

  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
