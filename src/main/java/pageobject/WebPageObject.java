package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static demo.driver.WebDriverInstance.webDriver;

public class WebPageObject {

    WebDriverWait wait = new WebDriverWait(webDriver,15);

    public boolean waitUntilDisplayed(By id){
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(id));
        return element.isDisplayed();
    }
    public boolean waitUntilEnabled(By id){
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(id));
        return element.isEnabled();
    }

    public void openUrl(String url){
        webDriver.get(url);
    }

    public void clickOn(By id){
        waitUntilEnabled(id);
        WebElement button = webDriver.findElement(id);
        button.click();
    }

    public void typeOn(By id, String text){
        waitUntilDisplayed(id);
        WebElement field = webDriver.findElement(id);
        field.clear();
        field.sendKeys(text);
    }

    public boolean checkIfDisplayed(By id){
        WebElement element = webDriver.findElement(id);
        return element.isDisplayed();
    }

    public boolean checkIfEnabled(By id){
        WebElement element = webDriver.findElement(id);
        return element.isEnabled();
    }
    public String checkToast(By id) {
        WebElement toast = webDriver.findElement(id);
        return toast.getAttribute("name");
    }

    public void multipleID(String name, By locator) {
        List<WebElement> filters = webDriver.findElements(locator);
        for (WebElement filter : filters) {
            if (filter.getText().contains(name)) {
                filter.click();
                break;
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean checkElements(By locator) {
        List<WebElement> elements = webDriver.findElements(locator);
        return elements.size() > 0;
    }
}
