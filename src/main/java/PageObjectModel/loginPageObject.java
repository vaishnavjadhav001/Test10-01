package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObject {
	public WebDriver driver;
private By email = By.xpath("//input[@id='input-email']");
private By password = By.xpath("//input[@id='input-password']");
private By Login = By.xpath("//input[@value='Login']");

public loginPageObject(WebDriver driver2) {
	this.driver=driver2;
	// TODO Auto-generated constructor stub
}
public WebElement enteremail() {
	return driver.findElement(email);
}
public WebElement enterpassword() {
	return driver.findElement(password);
}
public WebElement login() {
	return driver.findElement(Login);
}


}
