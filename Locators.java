import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.id("inputUsername")).sendKeys("rahul");
	driver.findElement(By.name("inputPassword")).sendKeys("hello");
	driver.findElement(By.className("signInBtn")).click();
	Thread.sleep(2000);
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	driver.findElement(By.linkText("Forgot your password?")).click();
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("vivek");
	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("vivek@gmail.com");
	driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
	driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("vivek@gmail.com");
	driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
	driver.findElement(By.cssSelector("input[type=text]:nth-child(3)")).sendKeys("vivek@gmail.com");
	driver.findElement(By.xpath("//form/input[3]")).sendKeys("7657564756");
	driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();	
	System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
    driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
	driver.findElement(By.cssSelector("input[type*=pass]")).sendKeys("rahulshettyacademy");
	driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
    
//	
}
}
