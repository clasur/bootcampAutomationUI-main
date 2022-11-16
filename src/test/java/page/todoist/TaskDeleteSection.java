package page.todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class TaskDeleteSection {

    public Button deleteTask= new Button(By.xpath("//button[@data-action-hint='task-complete']"));
    public Button deleteConfirmationTask= new Button(By.xpath("//button[@id='id-0k82wz']"));

}
