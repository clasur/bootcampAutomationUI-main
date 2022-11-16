package testMain.Todoist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.todoist.*;
import page.todoist.MainPage;
import session.Session;
import util.GetProperties;

public class TestBaseTodoist {

     MainPage mainPage = new MainPage();
     LoginPage loginPage = new LoginPage();
     MainHome mainHome = new MainHome();
     MenuProject menuProject = new MenuProject();
     ProjectCreateSection projectCreateSection = new ProjectCreateSection();
     ProjectDeleteSection projectDeleteSection = new ProjectDeleteSection();
     ProjectUpdateSection projectUpdateSection = new ProjectUpdateSection();
     TaskSectionCreate taskSectionCreate = new TaskSectionCreate();
     TaskSectionUpdate taskSectionUpdate = new TaskSectionUpdate();
     String user = GetProperties.getInstance().getUser();
     String password= GetProperties.getInstance().getPwd();

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
