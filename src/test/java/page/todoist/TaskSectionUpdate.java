package page.todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class TaskSectionUpdate {

    public TextBox editTask= new TextBox(By.xpath("//div[@data-offset-key='biubn-0-0' and @data-block='true']"));
    public TextBox editNameTask= new TextBox(By.xpath("//div[@data-offset-key='6p2n4-0-0' and @data-block='true']"));
    public TextBox editDescriptionTask= new TextBox(By.xpath("//textarea[contains(text(),'Emergency')]"));
    public TextBox editDateTask= new TextBox(By.xpath("//span[contains(text(),'Fecha de vencimiento')]"));
    public Button saveUpdate= new Button(By.xpath("//span[contains(text(),'Guardar')]"));
    public Button closewindows= new Button(By.xpath("//button[@aria-label='Cerrar ventana']"));


}
/*

EditTask---usamos como  variable la palabra task
choose Task for to update
//div[contains(text(),'task') and @class='markdown_content task_content']

*/