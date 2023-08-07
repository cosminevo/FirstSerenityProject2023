package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccountPage extends PageObject {

    @FindBy(css = ".hello strong")
    private WebElementFacade welcomeTextParagraph;

    public void verifyLoggedIn(String userName) {
        welcomeTextParagraph.shouldContainOnlyText("Hello, " + userName + "!");
    }

    public boolean isUserLoggedIn(String userName) {
        return welcomeTextParagraph.containsOnlyText("Hello, " + userName + "!");
    }

    public String getUserLoggedInMessage() {
        return welcomeTextParagraph.getText();
    }
}
