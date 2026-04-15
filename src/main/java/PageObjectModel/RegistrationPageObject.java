package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPageObject {
public WebDriver driver;
private By firstname = By.xpath("//input[@id='input-firstname']");
private By Lastname = By.xpath("//input[@id='input-lastname']");
private By mail = By.xpath("//input[@id='input-email']");
private By Telephone = By.xpath("//input[@id='input-telephone']");
private By password = By.xpath("//input[@id='input-password']");
private By passwordconfirm = By.xpath("//input[@id='input-confirm']");
private By subscribe = By.xpath("(//input[@name='newsletter'])[2]");
private By privacyPolicy = By.xpath("//input[@name='agree']");
private By ContinueButton = By.xpath("//input[@value='Continue']");
private By firstnameerror = By.xpath("(//div[@class='text-danger'])[1]");
private By lastnameerror = By.xpath("(//div[@class='text-danger'])[2]");



public RegistrationPageObject(WebDriver driver2) {
	this.driver=driver2;
	// TODO Auto-generated constructor stub
}

public WebElement Enterfirstname() {
	return driver.findElement(firstname);
}
public WebElement Enterlasttname() {
	return driver.findElement(Lastname);
}
public WebElement EnterEmailid() {
	return driver.findElement(mail);
}
public WebElement Telephone() {
	return driver.findElement(Telephone);
}
public WebElement password() {
	return driver.findElement(password);
}
public WebElement passwordconfirm() {
	return driver.findElement(passwordconfirm);
}
public WebElement subscribe() {
	return driver.findElement(subscribe);
}
public WebElement privacyPolicy() {
	return driver.findElement(privacyPolicy);
}
public WebElement ContinueButton() {
	return driver.findElement(ContinueButton);
}
public WebElement firstnameerror() {
	return driver.findElement(firstnameerror);
}public WebElement lastnameerror() {
	return driver.findElement(lastnameerror);
}

}
