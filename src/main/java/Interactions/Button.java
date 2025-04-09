package Interactions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static SwagLabs.Utils.WaitUtils.waitForElementToBeClickable;

public class Button extends Element {
    // Constructor
    public Button(By Locator) {
        super(Locator);
    }
    public WebElement getElement() {
        return getDriver().findElement(Locator);
    }
    public void click() {
        waitForElementToBeClickable(getDriver() , Locator);
        WebElement element = getDriver().findElement(Locator);
        element.click();
    }
}