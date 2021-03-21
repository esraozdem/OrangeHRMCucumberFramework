package com.orangehrm.stepdefinitions;

import com.orangehrm.base.ConfigReader;
import com.oranges.pages.HomePage;
import com.oranges.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageSD {

    @Given("I am on OrangeHRM login page")
    public void verifyTitle() {
        Assert.assertEquals("OrangeHRM",LoginPage.verifyTitle());

    }
    @When("I enter Admin into username field on the login page")
    public void enterValidUsername() {
        LoginPage.enterUserName(ConfigReader.getProperty("username"));



    }
    @And("I enter valid password into password field on the login page")
    public void enterValidPassword() {
        LoginPage.enterPassword(ConfigReader.getProperty("password"));

    }


    @And("I click on login button on login page")
    public void clickOnLogin() {
        LoginPage.clickLoginBtn();

    }

    @Then("I see the home page")
    public void verifyHomePageTitle() {
        Assert.assertEquals("OrangeHRM", HomePage.verifyTitle());
    }
    @When("I enter incorrect username into username field on the login page")
    public void enterInvalidUsername(){
        LoginPage.enterUserName(ConfigReader.getProperty("invalidusername"));
    }

    @And("I enter incorrect password into password field on the login page")
    public void enterInvalidPassword(){
        LoginPage.enterPassword(ConfigReader.getProperty("invalidpassword"));
    }

    @Then("I see the error message on the login page")
    public void verifyErrorMessage(){
        Assert.assertEquals("Invalid credentials", LoginPage.getErrorMessage());
    }
}

