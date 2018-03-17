package in.connect2tech.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyPOM {

	WebDriver driver;
	
	
	MyPOM(WebDriver d){
		driver = d;
	}
	
	public void sendKeyToEmail(String email){
		WebElement we1 =driver.findElement(By.id("email"));
		we1.sendKeys(email);
	}
	
	public void sendKeyToPassword(String pass){
		WebElement we2 =driver.findElement(By.id("pass"));
		we2.sendKeys(pass);
	}
	
	public void clickLogin(){
		WebElement we3 =driver.findElement(By.id("loginbutton"));
		we3.click();
	}
	
	public void login(String email, String password){
		sendKeyToEmail(email);
		sendKeyToPassword(password);
		clickLogin();
	}
	
	
}
