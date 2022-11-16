package page.todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginPage {
    public TextBox userLogin = new TextBox(By.id("element-0"));
    public TextBox pwdLogin = new TextBox(By.id("element-3"));
    public Button introLogin = new Button(By.xpath("//button[contains(@data-gtm-id,'start-email-login')]"));


}
