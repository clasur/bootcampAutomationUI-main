package page.todoist;

import control.Button;
import control.CheckBox;
import control.Label;
import org.openqa.selenium.By;

public class MenuProject {

    public Button moreActionProject = new Button(By.xpath("//button[contains(text(),'de opciones del proyecto')]"));
    public CheckBox editProject = new CheckBox(By.xpath("//div[text()='Editar proyecto']"));
    public CheckBox deleteProject = new CheckBox(By.xpath("//div[contains(text(),'Eliminar proyecto')]"));

    public MenuProject(){}

    public void clickOnProject(String nameProject){
        Label projectCreated = new Label(By.xpath("//a/span[contains(text(),'"+nameProject+"']"));
        projectCreated.click();
    }

    public boolean isProjectDisplayedInList(String nameProject){
        Label projectCreated = new Label(By.xpath("//a/span[contains(text(),'"+nameProject+"']"));
        return projectCreated.isControlDisplayed();
    }

}
