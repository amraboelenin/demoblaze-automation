package SwagLabs.pages;

import Factory.WebDriverFactory;
import Interactions.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;

import static SwagLabs.Utils.WaitUtils.waitForElementToBeVisible;
import static SwagLabs.pages.HomePage.ProductsPrices;

public class CartPage {
    //Locators
    private WebDriver driver;

        private Button TotalPriceButton = new Button(By.id("totalp"));
        private Button PlaceOrderButton = new Button(By.xpath("//button[@class='btn btn-success']"));
        public int ActualPrice(){
            waitForElementToBeVisible(WebDriverFactory.getDriver(),TotalPriceButton.Locator);
            String Total_String = TotalPriceButton.getElement().getText();
            return Integer.parseInt(Total_String);

        }
        public int expectedPrice(){
            return Arrays.stream(ProductsPrices).sum();
        }
        public void ClickPlaceOrderButton() {
            PlaceOrderButton.click();
    }
}
