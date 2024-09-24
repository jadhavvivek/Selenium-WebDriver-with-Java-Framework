import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sel_Introduction {
public static void main(String[] args) {
//	System.setProperty("Webdriver.chrome.driver","C:\\Users\\vivek\\OneDrive\\Desktop\\chromedriver.exe");

	WebDriver driver=new EdgeDriver();
	driver.get("https://rahulshettyacademy.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.close();
}
}
