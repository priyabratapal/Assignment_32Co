package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ProductPage {
	private WebDriver driver;

    private By productTitle = By.className("title");
    private By firstAddToCartBtn = By.xpath("(//button[text()='Add to cart'])[1]");
    private By cartIcon = By.className("shopping_cart_link");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.findElement(productTitle).getText();
    }

    public void addFirstProductToCart() {
        driver.findElement(firstAddToCartBtn).click();
    }

    public void goToCart() {
        driver.findElement(cartIcon).click();
    }
}
