package testcases;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Resources.baseClass;
import com.Resources.commonMethods;
import com.Resources.constants;

import PageObjectModel.HomePageObject1;

import PageObjectModel.RegistrationPageObject;

public class RegisterTestCases extends baseClass {
	public static String randomEmail="";
	@Test   
public void VerifyRegistrationBlankData() throws IOException, InterruptedException {
		Thread.sleep(3000);
		
		HomePageObject1 hpo = new HomePageObject1(driver);
		commonMethods.putExplicitWait(driver,10,hpo.clickonMyaccount());
		hpo.clickonMyaccount().click();
		hpo.clickonregister().click();
		
		
		
	
	RegistrationPageObject pom = new RegistrationPageObject(driver);
	
	pom.Enterfirstname().clear();
	pom.Enterfirstname().sendKeys(constants.firstname);
	pom.Enterfirstname().clear();
	pom.Enterlasttname().sendKeys(constants.Lastname);
	pom.Enterlasttname().clear();
	pom.EnterEmailid().sendKeys("");
	pom.Telephone().sendKeys("");
	pom.password().sendKeys("");
	pom.passwordconfirm().sendKeys("");
	pom.subscribe().click();
	pom.privacyPolicy().click();
	pom.ContinueButton().click();
//	SoftAssert sa = new SoftAssert();
//	String succesurl = "https://naveenautomationlabs.com/opencart/index.php?route=account/success";
//	String firstname = constants.firstnameError;
//	String lastname = constants.lastnameError;
////	WebElement firstnameError = driver.findElement(By.xpath(""));
////	WebElement lastnameError = driver.findElement(By.xpath(""));
//	sa.assertEquals(pom.firstnameerror().getText(),firstname);
//	sa.assertEquals(pom.lastnameerror().getText(),lastname );
//	sa.assertAll();
	commonMethods.handleAssertion(pom.firstnameerror().getText(), constants.firstnameError);
	commonMethods.handleAssertion(pom.lastnameerror().getText(), constants.lastnameError);
}
	
	public String generateRandomemail() {
		return System.currentTimeMillis()+"@gmail.com";
	}
	@Test
	public void verifyRegistrationWithValidData() throws IOException, InterruptedException {
		Thread.sleep(3000);
		randomEmail = generateRandomemail();
		
		HomePageObject1 hpo = new HomePageObject1(driver);
		hpo.clickonMyaccount().click();
		hpo.clickonregister().click();
		
		RegistrationPageObject pom = new RegistrationPageObject(driver);
		commonMethods.putExplicitWait(driver,10,pom.Enterfirstname());
		pom.Enterfirstname().sendKeys(constants.firstname);
		pom.Enterlasttname().sendKeys(constants.Lastname);
		pom.EnterEmailid().sendKeys(randomEmail);
		pom.Telephone().sendKeys(constants.Telephone);
		pom.password().sendKeys(constants.password);
		pom.passwordconfirm().sendKeys(constants.passwordconfirm);
		pom.subscribe().click();
		pom.privacyPolicy().click();
		pom.ContinueButton().click();
		
//		SoftAssert sa = new SoftAssert();
//		String successURL = constants.successURL;
//		sa.assertEquals(driver.getCurrentUrl(),successURL);
//		sa.assertAll();
		
		commonMethods.handleAssertion(driver.getCurrentUrl(),constants.successURL);
	}
}

