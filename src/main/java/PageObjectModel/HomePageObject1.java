
package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject1{
public WebDriver driver;
private By myAccount =By.xpath("//i[@class='fa fa-user']");
private By register = By.xpath("//a[contains(text(),'Register')]");
private By Login = By.xpath("//a[contains(text(),'Login')]");


public HomePageObject1(WebDriver driver2) {
	this.driver=driver2;
	// TODO Auto-generated constructor stub
}
public WebElement clickonMyaccount() {
	return driver.findElement(myAccount);
}
public WebElement clickonregister() {
	return driver.findElement(register);
}
public WebElement clickonLogin() {
	return driver.findElement(Login);
}
}
