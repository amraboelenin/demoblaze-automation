package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {

    private static WebDriver driver;

    // Method to create WebDriver instance
    public static WebDriver getDriver() {
        if (driver == null) {
            // Initialize ChromeDriver (you can add more browsers if needed)
            driver = new ChromeDriver();
        }
        return driver;
    }

    // Method to close WebDriver instance
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
