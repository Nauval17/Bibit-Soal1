package demo.pages;

import demo.locator.LoginpageLocator;
import pageobject.WebPageObject;

public class LoginPage implements LoginpageLocator {
    WebPageObject pageObject = new WebPageObject();

    public boolean isOnLoginPage(){
        return pageObject.waitUntilDisplayed(LOGIN_LOGO);
    }

    public void inputUsername(String username){
        pageObject.typeOn(INPUT_USERNAME,username);
    }

    public void inputPassword(String password) {
        pageObject.typeOn(INPUT_PASSWORD,password);
    }

    public void confirmLogin(){
        pageObject.clickOn(LOGIN_BUTTON);
    }

    public void skipAvatar(){
        pageObject.waitUntilEnabled(SKIP_BUTTON);
        pageObject.clickOn(SKIP_BUTTON);
    }

    public boolean isOnDashboard(){
        return pageObject.waitUntilDisplayed(DASHBOARD_LOGO);
    }

    public boolean warningMessage(){
        return pageObject.waitUntilDisplayed(WARNING_MESSAGE);
    }
}
