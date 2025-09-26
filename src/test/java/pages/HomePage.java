package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	 
	private WebDriver driver;

	    private By username = By.id("user-name");
	    private By password = By.id("password");
	    private By loginBtn = By.id("login-button");

	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void login(String user, String pass) {
	        driver.findElement(username).sendKeys(user);
	        driver.findElement(password).sendKeys(pass);
	        driver.findElement(loginBtn).click();
	    }
    
}
