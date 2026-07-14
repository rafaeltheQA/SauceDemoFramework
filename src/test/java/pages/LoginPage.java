package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import utilities.FileReadUtilities;

	public class LoginPage
{
		private WebDriver driver;

		private By usernameField = By.id(
            FileReadUtilities.getElementProperty("login_username_id"));

		private By passwordField = By.id(
            FileReadUtilities.getElementProperty("login_password_id"));

		private By loginButton = By.id(
            FileReadUtilities.getElementProperty("login_button_id"));
		
		private By productsTitle = By.className("title");
		
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void login(String username, String password)
    {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }
    
    
    public String getProductsTitle()
    {
    	return driver.findElement(productsTitle).getText();
    }
    public String getErrorMessage()
    {
    	return driver.findElement(
    			By.cssSelector("h3[data-test='error']")
    	).getText();
    }
    
}
