package page.todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class Login {
    public TextBox userLogin = new TextBox(By.id("//input[@id='element-0']"));
    public TextBox pwdLogin = new TextBox(By.id("//input[@id='element-3']"));
    public Button introLogin = new Button(By.id("//button[contains(@data-gtm-id,'start-email-login')]"));
}
