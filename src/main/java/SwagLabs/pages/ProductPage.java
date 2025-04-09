package SwagLabs.pages;

import Factory.WebDriverFactory;
import Interactions.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static SwagLabs.Utils.WaitUtils.HandleAlert;
import static SwagLabs.Utils.WaitUtils.waitForElementToBeVisible;
import static SwagLabs.pages.HomePage.Products;
import static SwagLabs.pages.HomePage.ProductsPrices;

public class ProductPage {
    private int i =0;
    private int j =0;
    private Button productName = new Button(By.xpath("//h2[@class='name']"));
    private Button productPrice = new Button(By.xpath("//h3[@class='price-container']"));
    private Button AddToCartButton = new Button(By.xpath("//a[text()='Add to cart']"));
   private Button Discription = new Button(By.xpath("//strong"));
    private Button WelcomeText= new Button(By.xpath("//a[normalize-space()='Welcome kareem1234']"));

    public void clickAddToCart() {
        waitForElementToBeVisible(WebDriverFactory.getDriver(),WelcomeText.Locator);
        waitForElementToBeVisible(WebDriverFactory.getDriver(),Discription.Locator);
        Products[i] =  productName.getElement().getText();
        String price = productPrice.getElement().getText();
        price = price.substring(1,price.indexOf(" "));
        ProductsPrices[i] =Integer.parseInt(price);
        i++;
//        System.out.println("=== START ===");
//        System.out.println(ProductsPrices[0]);
//        System.out.println("=== END ===");
        AddToCartButton.click();
        HandleAlert(WebDriverFactory.getDriver());
    }

}

