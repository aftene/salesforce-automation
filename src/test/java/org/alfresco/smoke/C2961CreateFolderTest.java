package org.alfresco.smoke;

import org.alfresco.base.BaseTest;
import org.alfresco.helper.Utils;
import org.alfresco.po.common.Login;
import org.alfresco.po.salesforce.ToolPanel;
import org.alfresco.po.share.CreateDialog;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author Iulian Aftene
 */
public class C2961CreateFolderTest extends BaseTest
{

    //WebDriver webDriver = new FirefoxDriver();

    @BeforeClass
    public void BeforeClass()
    {
        openSalesforceTab(webDriver,"alfrescoRepositoryTab");

        //initialize login page objects
        PageFactory.initElements(webDriver, Login.class).loginToAlfresco();
    }

    @Test
    public void createFolderTest()
    {
        ToolPanel toolPanel = PageFactory.initElements(webDriver, ToolPanel.class);

        toolPanel.clickOnCreateButton();
        toolPanel.clickOnCreateFolderButton();

        CreateDialog createDialog = PageFactory.initElements(webDriver, CreateDialog.class);

        createDialog.typeInNameTextInput("folder_name_test");
        createDialog.tyoeInTitleTextInput("folder_title_test");
        createDialog.typeInDescriptionTextInput("folder_description_test");

        createDialog.clickOnSaveButton();
    }

    @AfterClass
    public void afterClass()
    {
        webDriver.close();
        //webDriver.quit();
    }
}
