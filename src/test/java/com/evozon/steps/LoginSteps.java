package com.evozon.steps;

import com.evozon.pages.AccountPage;
import com.evozon.pages.HomePage;
import com.evozon.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class LoginSteps extends ScenarioSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;

    @Step
    public void navigateToHomepage(){
        homePage.open();
    }

    @Step
    public void navigateToLoginPage(){
        navigateToHomepage();
        homePage.clickAccountLink();
        homePage.clickLoginLink();
    }

    @Step
    public void enterEmailAddress(String email){
        loginPage.setEmailField(email);
    }

    @Step
    public void enterPassword(String pass){
        loginPage.setPassField(pass);
    }

    @Step
    public void clickLogin(){
        loginPage.clickLoginButton();

    }

    @Step
    public void verifyUserIsLoggedIn(String userName){
//        accountPage.verifyLoggedIn(userName);
        Assert.assertTrue(accountPage.isUserLoggedIn(userName));
    }
}
