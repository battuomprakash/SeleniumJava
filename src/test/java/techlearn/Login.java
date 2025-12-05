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
  public void Facebook() {
	  driver.get("https://www.facebook.com");
	  
  }

  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
