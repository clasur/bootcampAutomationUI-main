package page.todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class ProjectCreateSection {
    public TextBox newNameProject = new TextBox(By.xpath("//input[contains(@id,'edit_project_modal_field_name')]"));
    public Button colorProject = new Button(By.xpath("//button[@aria-labelledby='edit_project_modal_field_color_label']"));
    public Button selectColorProject = new Button(By.xpath("//li[@id='dropdown-select-31-option-berry-red']"));
    public Button addProject = new Button(By.xpath("//button[@type='submit']"));

}
