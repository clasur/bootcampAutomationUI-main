package test.yopmail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.left.Inbox;
import page.right.InboxBody;
import page.yopmail.MainPage;
import session.Session;
import util.GetProperties;
import util.GetPropertiesYopmail;

public class TestBaseYopmail {

    MainPage mainPage = new MainPage();
    Inbox inBox = new Inbox();
    InboxBody inboxBody = new InboxBody();

    @BeforeEach
    public void openBrowser(){
        // todo create property file
        Session.getInstance().getBrowser().get(GetPropertiesYopmail.getInstance().getHost());
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }
}
