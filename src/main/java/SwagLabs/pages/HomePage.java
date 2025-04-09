package SwagLabs.pages;

import Factory.WebDriverFactory;
import Interactions.Button;
import Interactions.Element;
import Interactions.Textbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static SwagLabs.Utils.WaitUtils.waitForElementToBeClickable;
import static SwagLabs.Utils.WaitUtils.waitForElementToBeVisible;

public class HomePage {
    //Locaters

    private WebDriver driver ;
    private String CategoryChoosen;
    public static String[] Products = new String[10];
    public static int[] ProductsPrices = new int[10];

    private Button SignUpBUtton = new Button(By.id("signin2"));
    private Button LoginButton= new Button(By.id("login2"));
    private Button HomeButton= new Button(By.xpath("//a[text()='Home ']"));
    private Button CartButton= new Button(By.id("cartur"));
    private Button Phone1= new Button(By.xpath("//a[text()= 'Samsung galaxy s6']"));
    private Button Phone2= new Button(By.xpath("//a[text()= 'Nokia lumia 1520']"));
    private Button Phone3= new Button(By.xpath("//a[text()= 'Nexus 6']"));
    private Button Laptop1= new Button(By.xpath("//a[text()= 'Sony vaio i5']"));
    private Button Laptop2= new Button(By.xpath("//a[text()= 'MacBook air']"));
    private Button Laptop3= new Button(By.xpath("//a[text()= 'MacBook Pro']"));
    private Button Monitor1= new Button(By.xpath("//a[text()= 'Apple monitor 24']"));
    private Button Monitor2= new Button(By.xpath("//a[text()= 'ASUS Full HD']"));
    private Button WelcomeText= new Button(By.xpath("//a[normalize-space()='Welcome kareem1234']"));
    private Textbox usernameTextbox = new Textbox(By.id("loginusername"));
    private Textbox passwordTextbox = new Textbox(By.id("loginpassword"));
    private Button loginButton = new Button(By.xpath("//button[text()='Log in']"));
    private Button PhonesCategory = new Button(By.xpath("//a[text()='Phones']"));
    private Button LaptopsCategory = new Button(By.xpath("//a[text()='Laptops']"));
    private Button MonitorsCategory = new Button(By.xpath("//a[text()='Monitors']"));
    private Button CategoryButton = new Button(By.xpath("//a[text()='CATEGORIES']"));

    //kareem1234
    //1234
    //actions
    public void NavigateTO(String button){
        waitForElementToBeVisible(WebDriverFactory.getDriver(),WelcomeText.Locator);
        switch (button.toLowerCase()) {
            case "signup":
                SignUpBUtton.click();
                break;
            case "login":
                LoginButton.click();
                break;
            case "cart":
                CartButton.click();
                break;
            case "home":
                HomeButton.click();
                break;
            default:
                System.out.println("Invalid button");
        }
    }
    public void Login(String username, String password) {
        LoginButton.click();
        usernameTextbox.setText(username);
        passwordTextbox.setText(password);
        loginButton.click();
    }
    public void ChooseCategory(String category) {
        waitForElementToBeVisible(WebDriverFactory.getDriver(),WelcomeText.Locator);
        CategoryChoosen=category;
        CategoryButton.click();
        switch (category.toLowerCase()) {
            case "phones":
                PhonesCategory.click();
                break;
            case "laptops":
                LaptopsCategory.click();
                break;
            case "monitors":
                MonitorsCategory.click();
                break;
            default:
                System.out.println("Invalid category");
        }
    }
    public void ChooseProduct(String product) {
        waitForElementToBeVisible(WebDriverFactory.getDriver(),WelcomeText.Locator);
        if(CategoryChoosen.equals("phones")) {
            switch (product.toLowerCase()) {
                case "phone1":
                    Phone1.click();
                    break;
                case "phone2":
                    Phone2.click();
                    break;
                case "phone3":
                    Phone3.click();
                    break;
                default:
                    System.out.println("Invalid product");
            }
        }
        else if (CategoryChoosen.equals("laptops")) {
            switch (product.toLowerCase()) {
                    case "laptop1":
                        Laptop1.click();
                        break;
                    case "laptop2":
                        Laptop2.click();
                        break;
                    case "laptop3":
                        Laptop3.click();
                        break;
                    default:
                        System.out.println("Invalid product");
                }
            }
            else if (CategoryChoosen.equals("monitors")) {
                switch (product.toLowerCase()) {
                    case "monitor1":
                        Monitor1.click();
                        break;
                    case "monitor2":
                        Monitor2.click();
                        break;
                    default:
                        System.out.println("Invalid product");
                }
            }

    }



}
