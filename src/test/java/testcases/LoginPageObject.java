package testcases;



import java.io.IOException;

import org.testng.annotations.Test;

import com.Resources.baseClass;
import com.Resources.constants;

import PageObjectModel.HomePageObject1;
import PageObjectModel.loginPageObject;


public class LoginPageObject extends baseClass{
	@Test
public void InvalidLoginTest() throws IOException, InterruptedException {
		Thread.sleep(3000);
	
//	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
	HomePageObject1 hpo = new HomePageObject1(driver);
	hpo.clickonMyaccount().click();
	hpo.clickonLogin().click();
	
	loginPageObject lop = new loginPageObject(driver);
	lop.enteremail().sendKeys(RegisterTestCases.randomEmail);
	lop.enterpassword().sendKeys(constants.password);
	lop.login().click();
	
	
	
}
}
