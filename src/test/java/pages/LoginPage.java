package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

    private By USERNAME_ENTRY_FIELD = By.cssSelector("div.form-group input#email");
    private By PASSWORD_ENTRY_FIELD = By.cssSelector("div.form-group span input#passwd");
    private By LOGIN_BUTTON = By.cssSelector("p button#SubmitLogin");
    private By SIGN_IN_BUTTON = By.cssSelector("div.header_user_info a");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterAUsernameAndPassword(String username, String password){
        FindAndType(username, USERNAME_ENTRY_FIELD);
        FindAndType(password, PASSWORD_ENTRY_FIELD);
    }

    public void goToLoginPage(){
        WaitAndClick(SIGN_IN_BUTTON);
    }

    public void clickOnSubmitButton(){
        WaitAndClick(SIGN_IN_BUTTON);
    }

    public GetMessageText getMessageText(){
        return new GetMessageText(driver.findElement(By.cssSelector("")));
    }

    public class GetMessageText{
        private WebElement element;

        public GetMessageText(WebElement element){
            this.element = element;
        }

        public String getMessageText(){
            return element.findElement(By.cssSelector("")).getText().trim();
        }
    }


}
