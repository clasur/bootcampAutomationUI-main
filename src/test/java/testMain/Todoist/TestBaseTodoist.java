package testMain.Todoist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.todoist.*;
import session.Session;
import util.GetProperties;

public class TestBaseTodoist {
    Login login = new Login();
    MainHome mainHome = new MainHome();
    MainPage mainPage = new MainPage();
    MenuProject menuProject = new MenuProject();
    ProjectCreateSection projectCreateSection = new ProjectCreateSection();
    ProjectUpdateSection projectUpdateSection = new ProjectUpdateSection();
    TaskSectionCreate taskSectionCreate = new TaskSectionCreate();
    TaskSectionUpdate taskSectionUpdate = new TaskSectionUpdate();

    String user= GetProperties.getInstance().getUser();
    String password = GetProperties.getInstance().getPwd();

    @BeforeEach
    public void openBrowser(){
        // todo create property file
        Session.getInstance().getBrowser().get(GetProperties.getInstance().getHost());
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }

}
