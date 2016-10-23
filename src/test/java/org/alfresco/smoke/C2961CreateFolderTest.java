package org.alfresco.smoke;

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
 * Created by p3700471 on 14/09/16.
 */
public class C2961CreateFolderTest {

    private WebDriver webDriver;

    @BeforeClass
    public void beforeClass()
    {
        webDriver = new FirefoxDriver();
        webDriver.get(Utils.GetProperty("salesforcePages.properties","alfrescoRepositoryTab"));

        //initialize login page objects
        PageFactory.initElements(webDriver, Login.class).loginToAlfresco();
    }

    @Test
    public void createFolderTest()
    {
        ToolPanel toolPanel = PageFactory.initElements(webDriver, ToolPanel.class);

        toolPanel.getCreateButton().click();
        toolPanel.getCreateFolderButton().click();

        CreateDialog createDialog = PageFactory.initElements(webDriver, CreateDialog.class);

        createDialog.getNameTextInput().sendKeys("folder_name_test");
        createDialog.getTitleTextInput().sendKeys("folder_title_test");
        createDialog.getDescriptionTextInput().sendKeys("folder_description_test");

        createDialog.getSaveButton().click();
    }

    @AfterClass
    public void afterClass()
    {
        webDriver.close();
        webDriver.quit();
    }
}
