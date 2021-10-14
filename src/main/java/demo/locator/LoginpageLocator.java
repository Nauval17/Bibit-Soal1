package demo.locator;

import org.openqa.selenium.By;

public interface LoginpageLocator {
    By LOGIN_LOGO = By.xpath("//div[@id='loginlogo']");
    By INPUT_USERNAME = By.xpath("//input[@name='username']");
    By INPUT_PASSWORD = By.xpath("//input[@name='password']");
    By LOGIN_BUTTON =By.id("loginbutton");
    By LOGIN_VIA_FACEBOOK = By.xpath("//a[contains(text(),'Facebook')]");
    By LOGIN_VIA_GOOGLE = By.xpath("//div/input[@type='button']");
    By WARNING_MESSAGE = By.xpath("//span[contains(text(),'salah')]");
}
