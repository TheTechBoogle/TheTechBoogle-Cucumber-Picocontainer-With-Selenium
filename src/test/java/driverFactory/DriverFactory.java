package driverFactory;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    public WebDriver driver;

    static{
        ChromeDriverManager.chromedriver().setup();
    }

    public WebDriver getDriver() {
        if(driver == null){
            setDriver();
        }
        return driver;
    }

    public void setDriver() {
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
}
