package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
    }

    public void FindAndType(String text, By selector){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(selector));
        element.sendKeys(text);
    }

    public void WaitAndClick(By selector){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(selector));
        element.click();
    }
}
