package page.left;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class Inbox {
    public Button compose = new Button(By.xpath("//button[@id='newmail']"));
    //Assert
    public TextBox subjectReceived = new TextBox(By.xpath("//div/button/div[2]"));



}
