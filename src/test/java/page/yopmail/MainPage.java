package page.yopmail;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class MainPage {
    public TextBox loginEmail = new TextBox(By.xpath("//input[@class='ycptinput' and @name='login']"));
    public Button signUpEmailButton = new Button(By.xpath("//div/button/i"));
    //home
    public Button home = new Button(By.xpath("//a[@target='_top' and @class='hlink bl']"));
}
