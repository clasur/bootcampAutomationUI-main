package testMain.Todoist;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Date;

public class CrudProjectTest extends TestBaseTodoist{
    @Test

    public void verifityTestProject(){

        String projCreated = "NEwMOJIX";
        String projUpdated = "UPDATEMOJIX";

        String taskCreated = "TEST";
        String descriptionTask="DECRIPTION"
        String taskUpdated = "TESTUPDATE";

        //LOGIN
        mainPage.startLogin.click();
        loginPage.userLogin.setText(user);
        loginPage.pwdLogin.setText(password);
        loginPage.introLogin.click();
        //Assertion.assert.true();

  // CRUD PROJECT
        //Create Project
        mainHome.newProject.click();
        projectCreateSection.newNameProject.setText(projCreated);
        projectCreateSection.colorProject.click();
        projectCreateSection.selectColorProject.click();
        projectCreateSection.addProject.click();
        //Assertions.assertTrue();

        //Update Project
        //menuProject.clickOnProject(projCreated);
        menuProject.moreActionProject.click();
        menuProject.editProject.click();
        projectUpdateSection.updateNameProject.cleanSetText(projUpdated);
        projectUpdateSection.updateColor.click();
        projectUpdateSection.saveUpdate.click();
        //Assertion.assertTrue();

        //Delete Project
        //menuProject.clickOnProject(projUpdated);
        menuProject.moreActionProject.click();
        menuProject.deleteProject.click();
        projectDeleteSection.deleteProject.click();
        //Assertion.assertTrue();

    //CRUD TASK
        //CreateProject
        mainHome.newTask.click();
        taskSectionCreate.nameTask.setText(taskCreated);
        taskSectionCreate.descriptionTask.setText(descriptionTask);
        taskSectionCreate.dateTask.click();
        taskSectionCreate.todayTask.click();
        taskSectionCreate.selectProject.click();
        taskSectionCreate.projectSelected.click();
        taskSectionCreate.addTask.click();
        //Assertions.assertTrue();

        //Update Project
        //Assertion.assertTrue();

        //Delete Project

        //Assertion.assertTrue();

    }



}
