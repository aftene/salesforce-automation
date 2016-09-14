package org.alfresco.smoke;

import org.alfresco.helper.Utils;
import org.alfresco.po.common.LoginPO;
import org.alfresco.po.salesforce.WorkPanelPO;
import org.alfresco.po.share.FormDialog;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by p3700471 on 14/09/16.
 */
public class CreateFolderTest {

    private WebDriver webDriver;

    @BeforeClass
    public void beforeClass()
    {
        webDriver = new FirefoxDriver();
        webDriver.get(Utils.GetProperty("salesforcePages.properties","alfrescoRepositoryTab"));

        //initialize login page objects
        LoginPO loginPage = PageFactory.initElements(webDriver, LoginPO.class);

        loginPage.enterUserName();
        loginPage.enterPassword();
        loginPage.clickLoginButton();
    }

    @Test
    public void createFolderTest()
    {
        WorkPanelPO workPanelPO = new WorkPanelPO(webDriver);

        workPanelPO.getCreateButton().click();
        FormDialog formDialog = workPanelPO.openCreateFolderDialog();

        formDialog.getDescriptionTextInput().sendKeys("folder_name_test");
        formDialog.getNameTextInput().sendKeys("folder_name_test");
        formDialog.getTitleTextInput().sendKeys("folder_title_test");
        formDialog.getDescriptionTextInput().sendKeys("folder_description_test");

        formDialog.getSaveButton().click();
    }

    @AfterClass
    public void afterClass()
    {
        webDriver.close();
        webDriver.quit();
    }
}
