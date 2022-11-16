package page.todoist;

import control.Button;
import org.openqa.selenium.By;

public class ProjectDeleteSection {

    public Button deleteProject = new Button(By.xpath("//span[contains(text(),\"Eliminar\")]"));

}
