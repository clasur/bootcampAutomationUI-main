package testMain.Todoist;

public class CrudTaskTest extends TestBaseTodoist{
    public void verifityTestProject(){
        String taskCreated = "TEST";
        String taskUpdated = "TEST";

        mainPage.startLogin.click();
        loginPage.userLogin.setText(user);
        loginPage.pwdLogin.setText(password);
        loginPage.introLogin.click();
        //Assertion.assert.true();

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


    }
