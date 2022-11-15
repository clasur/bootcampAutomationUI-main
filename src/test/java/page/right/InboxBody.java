package page.right;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class InboxBody {

        public TextBox addresseeNew = new TextBox(By.xpath("//input[@id='msgto']"));
        public TextBox subjectNew = new TextBox(By.xpath("//input[@id='msgsubject']"));
        public TextBox messageNew = new TextBox(By.xpath("//div[@id='msgbody']"));
        public Button sendEmail = new Button(By.xpath("//span[text()='Enviar el mensaje']"));
        public Button sendEmailConfirmation = new Button(By.xpath("//div[@id='msgpopmsg']"));

}
