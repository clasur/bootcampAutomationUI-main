package page.todoist;

import control.Button;
import org.openqa.selenium.By;

public class MainHome {
    public Button newTask = new Button(By.xpath("//button[@id='quick_add_task_holder']"));
    public Button newProject = new Button(By.xpath("//button[@class='a8af2163 _98cd5c3f _45ffe137 ef4c88db c6a2474f']"));
}
