package page.todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class ProjectUpdateSection {
    public TextBox updateNameProject= new TextBox(By.xpath("//input[contains(@id,'edit_project_modal_field_name')]"));
    public Button updateColor= new Button(By.xpath("//button[@aria-labelledby='edit_project_modal_field_color_label']"));
    public Button saveUpdate= new Button(By.xpath("///button[@type='submit']"));
}
