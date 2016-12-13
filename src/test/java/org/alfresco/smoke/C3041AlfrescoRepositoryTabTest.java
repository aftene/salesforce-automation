package org.alfresco.smoke;

import java.awt.*;
import java.awt.event.InputEvent;

import org.alfresco.base.BaseTest;
import org.alfresco.po.common.Login;
import org.alfresco.po.salesforce.AlfrescoRepositoryTabList;

import org.alfresco.po.salesforce.PersonalFilesTab;
import org.alfresco.po.salesforce.RepositoryTab;
import org.alfresco.po.salesforce.ToolPanel;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author Iulian Aftene
 */
public class C3041AlfrescoRepositoryTabTest extends BaseTest
{
    @BeforeClass
    public void BeforeClass()
    {
        openSalesforceTab(webDriver,"alfrescoRepositoryTab");

        PageFactory.initElements(webDriver, Login.class).loginToAlfresco();
    }

    @Test
    public void AlfrescoReposiotryTabTest() throws InterruptedException, AWTException
    {

        AlfrescoRepositoryTabList tabListTest = PageFactory.initElements(webDriver, AlfrescoRepositoryTabList.class);
        tabListTest.clickOnrepositoryTab();

        RepositoryTab repositoryTab = PageFactory.initElements(webDriver, RepositoryTab.class);

        repositoryTab.clickOnResizeButton();
        repositoryTab.clickOnResizeButton();

        Actions builder = new Actions(webDriver);
        builder.dragAndDropBy(repositoryTab.getResizeButton(), 200, 30).build().perform();
        builder.dragAndDropBy(repositoryTab.getResizeButton(), -200, 30).build().perform();

    }

    @AfterClass
    public void afterClass()
    {
       webDriver.close();
    }
}
