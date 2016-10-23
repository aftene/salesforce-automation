package org.alfresco.smoke;

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
 * Created by p3700509 on 16/10/16.
 */
public class CreateFileTest
{
    private WebDriver webDriver;

    @BeforeClass
    public void BeforeClass()
    {
        webDriver = new FirefoxDriver();
        webDriver.get(Utils.GetProperty("salesforcePages.properties","alfrescoRepositoryTab"));

        //initialize login page objects
        PageFactory.initElements(webDriver, Login.class).loginToAlfresco();
    }

    //Open create file dialog, add text to all inputs and click on cancel button
    @Test
    public void createFileTest()
    {
        ToolPanel toolPanel = PageFactory.initElements(webDriver, ToolPanel.class);
        toolPanel.getCreateButton().click();
        toolPanel.getCreateFileButton().click();


        CreateDialog createDialog = PageFactory.initElements(webDriver, CreateDialog.class);
        createDialog.getNameTextInput().sendKeys("file_name_test");
        createDialog.getTitleTextInput().sendKeys("file_title_test");
        createDialog.getDescriptionTextInput().sendKeys("file_description_test");
        createDialog.getContentTextInput().sendKeys("file_content_test");

        createDialog.getCancelButton().click();
    }

    @AfterClass
    public void afterClass()
    {
        webDriver.close();
        webDriver.quit();
    }
}
