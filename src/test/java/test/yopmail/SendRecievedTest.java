package test.yopmail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import session.Session;

public class SendRecievedTest extends TestBaseYopmail{
    @Test
    public void verifitySendEmail() throws InterruptedException {
       String userLogin1 ="claudia";
       String userLogin2 ="sirley@yopmail.com";
       String subjectEmail = "Send of Email";
       String messageEmail="Emergency Email";

       mainPage.loginEmail.click();
       mainPage.loginEmail.setText(userLogin1);
       mainPage.signUpEmailButton.click();
       WebElement iframeLeft = Session.getInstance().getBrowser().findElement(By.xpath("//iframe[@id='ifinbox']"));
       WebElement iframeRight = Session.getInstance().getBrowser().findElement(By.xpath("//iframe[@id='ifmail']"));
       WebElement iframePass = Session.getInstance().getBrowser().findElement(By.xpath("//iframe[@id='ifnoinb']"));
       inBox.compose.click();

       Session.getInstance().getBrowser().switchTo().frame(iframeRight);

       inboxBody.addresseeNew.click();
       inboxBody.addresseeNew.setText(userLogin2);
       inboxBody.subjectNew.click();
       inboxBody.subjectNew.setText(subjectEmail);
       inboxBody.messageNew.click();
       inboxBody.messageNew.setText(messageEmail);
       inboxBody.sendEmail.click();
       inboxBody.sendEmailConfirmation.click();

       Session.getInstance().getBrowser().switchTo().defaultContent();

       mainPage.home.click();
       mainPage.loginEmail.click();
       mainPage.loginEmail.cleanSetText(userLogin2);
       mainPage.signUpEmailButton.click();
       inBox.compose.click();

//       Session.getInstance().getBrowser().switchTo().frame(iframePass);
       Session.getInstance().getBrowser().switchTo().frame(iframeLeft);

      // inBox.subjectReceived.click();
       String emailReceived= inBox.subjectReceived.getText();
       System.out.println(emailReceived);
       //Assertions.assertEquals(emailReceived,subjectEmail,"ERROR!,does not arrived the email");

    }
}
