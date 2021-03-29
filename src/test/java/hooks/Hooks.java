package hooks;

import driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.bs.A;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class Hooks {
    private DriverFactory driverFactory;
    private HomePage homePage;

    public Hooks(DriverFactory driverFactory){
        this.driverFactory = driverFactory;
    }

    @Before
    public void IntialiseTest(){
        driverFactory.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        homePage = new HomePage(driverFactory.driver);
        homePage.goToHomePage();
    }

    @After
    public void tearDownTest(){
        driverFactory.driver.quit();
    }

}
