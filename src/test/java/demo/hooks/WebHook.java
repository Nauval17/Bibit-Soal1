package demo.hooks;

import demo.driver.WebDriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class WebHook {

    @Before(value = "@Web")
    public void initializeBrowser(){
        WebDriverInstance.initialize();
    }

    @After(value = "@Web")
    public void quitBrowser(Scenario scenario){
        if(scenario.isFailed()){
            scenario.attach(((TakesScreenshot)WebDriverInstance.webDriver).
                    getScreenshotAs(OutputType.BYTES),"images/png","Failure Proof");
        }
        WebDriverInstance.quit();
    }
}
