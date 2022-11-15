package page.todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class TaskSectionCreate {

    public TextBox addTask= new TextBox(By.xpath("//span[contains(text(),'Añadir tarea')]"));
    public TextBox nameTask= new TextBox(By.xpath("//div[@data-offset-key='6p2n4-0-0' and @data-block='true']"));
    public TextBox descriptionTask= new TextBox(By.xpath("//textarea[@aria-invalid='false']"));
    public TextBox dateTask= new TextBox(By.xpath("//span[contains(text(),'Fecha de vencimiento')]"));
    public Button todayTask= new Button(By.xpath("//button[@data-track='scheduler|date_shortcut_today']"));
    public Button selectProject= new Button(By.xpath("//button[@aria-label='Selecciona un proyecto']"));
    public TextBox projectSelected= new TextBox(By.xpath("//div[contains(text(),'Bandeja de entrada')]"));
    public Button addTaskT= new Button(By.xpath("//span[contains(text(),'Añadir tarea')]"));

}

