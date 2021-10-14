package demo.pages;

import demo.locator.HomepageLocator;
import pageobject.WebPageObject;

public class Homepage implements HomepageLocator {
    WebPageObject pageObject = new WebPageObject();

    public void openPage(String url){
        pageObject.openUrl(url);
    }

    public boolean isOnPage(){
        return pageObject.checkIfDisplayed(LOGO);
    }

    public boolean topMenu(){
        return pageObject.checkIfDisplayed(TOP_MENU);
    }
}
