package testMain.Todoist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.todoist.*;
import page.todoist.MainPageT;
import session.Session;
import util.GetProperties;

public class TestBaseTodoist {

     MainPageT mainPageT = new MainPageT();
     Login login = new Login();
     MainHome mainHome = new MainHome();
     MenuProject menuProject = new MenuProject();
     ProjectCreateSection projectCreateSection = new ProjectCreateSection();
     ProjectUpdateSection projectUpdateSection = new ProjectUpdateSection();
     TaskSectionCreate taskSectionCreate = new TaskSectionCreate();
     TaskSectionUpdate taskSectionUpdate = new TaskSectionUpdate();

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
