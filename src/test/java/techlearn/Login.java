package techlearn;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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

  @Test
  public void Selenium() {
	  driver.get("https://www.selenium.dev");
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
  }

}
