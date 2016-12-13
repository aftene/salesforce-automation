package org.alfresco.smoke;

import static junit.framework.TestCase.assertNotNull;
import static org.testng.Assert.assertNull;

import org.alfresco.base.BaseTest;
import org.alfresco.po.common.Login;
import org.alfresco.po.salesforce.PersonalFilesTab;
import org.alfresco.po.salesforce.ToolPanel;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author Iulian Aftene
 */
public class C3040PersonalFilesTest extends BaseTest
{
    @BeforeClass
    public void BeforeClass()
    {
        openSalesforceTab(webDriver,"alfrescoRepositoryTab");

        PageFactory.initElements(webDriver, Login.class).loginToAlfresco();
    }

    @Test
    public void personalFilesTabTest()
    {
        PersonalFilesTab personalFilesTab = PageFactory.initElements(webDriver,PersonalFilesTab.class);
        ToolPanel toolPanel = PageFactory.initElements(webDriver,ToolPanel.class);

        personalFilesTab.clickOnResizeButton();
        personalFilesTab.clickOnResizeButton();

        Actions builder = new Actions(webDriver);
        builder.dragAndDropBy(personalFilesTab.getResizeButton(), 200, 30).build().perform();
        builder.dragAndDropBy(personalFilesTab.getResizeButton(), -200, 30).build().perform();

//        assertNotNull(personalFilesTab.getDocumetsCategory());
//        assertNotNull(personalFilesTab.getLibraryCategory());
//        assertNotNull(personalFilesTab.getCategoriesCategory());

        personalFilesTab.clickOnDocumetsCategory();
        personalFilesTab.clickOnLibraryCategory();
        personalFilesTab.clickOngCategoriesCategory();

        toolPanel.clickOnCreateButton();

    }

    @AfterClass
    public void afterClass()
    {
        webDriver.close();
    }

}
