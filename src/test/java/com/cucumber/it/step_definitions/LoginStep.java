package com.cucumber.it.step_definitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import static com.cucumber.it.drivers.DriverSetup.getDriver;
import com.cucumber.it.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	LoginPage loginPage = new LoginPage();
	    @Given("User should be on the login screen")
	    public void userShouldBeOnTheLoginScreen() {
	        loginPage.loadAWebPage(loginPage.loginPageURL);
	    }

    @When("User enter valid username and password")
    public void userEnterValidUsernameAndPassword() {
//      loginPage.doLogin("standard_user", "secret_sauce");
        loginPage.writeOnAElement(loginPage.emailInputBox, "standard_user");
        loginPage.writeOnAElement(loginPage.passwordInputBox, "secret_sauce");
    }

    @And("User click on the login button")
    public void userClickOnTheLoginButton() {
        loginPage.clickOnElement(loginPage.loginButton);
    }

    
    @Then("User should be navigate to the inventory page")
    public void userShouldBeNavigateToTheInventoryPage() {
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
    }

    
    @But("User shouldn't be on the login page")
    public void userShouldnTBeOnTheLoginPage() {
        Assert.assertFalse(getDriver().getCurrentUrl() == loginPage.loginPageURL);
    }

    @When("User enter {string} on the username filed")
    public void userEnterOnTheUsernameFiled(String arg0) {
        loginPage.writeOnAElement(loginPage.emailInputBox, arg0);
    }

    @And("User enter {string} on the password filed")
    public void userEnterOnThePasswordFiled(String arg0) {
        loginPage.writeOnAElement(loginPage.passwordInputBox, arg0);
    }

    @Then("User should see {string} error message")
    public void userShouldSeeErrorMessage(String arg0) {
        Assert.assertEquals(loginPage.getElementText(loginPage.errorMsg), arg0);
    }
    
	@Then("User can see the correct placeholder")
	public void userCanSeeTheCorrectPlaceholder() throws Throwable {
		loginPage.getElement(loginPage.emailInputBox).clear();
		Assert.assertEquals(loginPage.getElement(loginPage.emailInputBox).getAttribute("placeholder"), loginPage.loginPagePlaceholder);
	}


}
