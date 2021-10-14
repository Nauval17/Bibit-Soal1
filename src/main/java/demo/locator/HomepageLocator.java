package demo.locator;

import org.openqa.selenium.By;

public interface HomepageLocator {
    By TOP_MENU = By.xpath("//div[@class='topmenuchild']");
    By LOGO = By.xpath("//img[@class='logo-big']");
    By HOME_LOGIN = By.xpath("(//a[@class='login-ldn'])[1]");
}
