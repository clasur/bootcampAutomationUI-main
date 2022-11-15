package page.todoist;

import control.Button;
import org.openqa.selenium.By;

public class MainHome {
    public Button newTask = new Button(By.xpath("//button[@id='quick_add_task_holder']"));
    public Button newProject = new Button(By.xpath("//button[@aria-label='Añadir proyecto']"));
}
