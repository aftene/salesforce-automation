package org.alfresco.smoke;

import org.alfresco.base.BaseTest;
import org.alfresco.helper.Utils;
import org.alfresco.po.common.Login;
import org.alfresco.po.salesforce.ToolPanel;
import org.alfresco.po.share.CreateDialog;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


/**
 * @author Iulian Aftene
 */
public class CreateFileTest extends BaseTest
{
    @BeforeClass
    public void BeforeClass()
    {
        openSalesforceTab(webDriver,"alfrescoRepositoryTab");

        //initialize login page objects
        PageFactory.initElements(webDriver, Login.class).loginToAlfresco();
    }

    //Open create file dialog, add text to all inputs and click on cancel button
    @Test
    public void createFileTest()
    {
        ToolPanel toolPanel = PageFactory.initElements(webDriver, ToolPanel.class);
        toolPanel.clickOnCreateButton();
        toolPanel.clickOnCreateFileButton();


        CreateDialog createDialog = PageFactory.initElements(webDriver, CreateDialog.class);
        createDialog.typeInNameTextInput("file_name_test");
        createDialog.tyoeInTitleTextInput("file_title_test");
        createDialog.typeInDescriptionTextInput("file_description_test");
        createDialog.typeInContentTextInput("file_content_test");

        createDialog.clickOnCancelButton();
    }

    @AfterClass
    public void afterClass()
    {
        webDriver.close();
        //webDriver.quit();
    }
}
