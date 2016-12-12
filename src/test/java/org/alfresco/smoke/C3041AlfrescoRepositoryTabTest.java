package org.alfresco.smoke;

import java.awt.*;
import java.awt.event.InputEvent;

import org.alfresco.base.BaseTest;
import org.alfresco.po.common.Login;
import org.alfresco.po.salesforce.AlfrescoRepositoryTabList;

import org.alfresco.po.salesforce.PersonalFilesTab;
import org.alfresco.po.salesforce.RepositoryTab;
import org.alfresco.po.salesforce.ToolPanel;
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
    public void TabTest() throws InterruptedException, AWTException
    {

        AlfrescoRepositoryTabList tabListTest = PageFactory.initElements(webDriver, AlfrescoRepositoryTabList.class);
        tabListTest.clickOnrepositoryTab();

        RepositoryTab repositoryTab = PageFactory.initElements(webDriver, RepositoryTab.class);

        //ToolPanel toolPanel = PageFactory.initElements(webDriver, ToolPanel.class);

        //toolPanel.clickOnCreateButton();
        //toolPanel.clickOnCreateFileButton();
        repositoryTab.clickOnResizeButton();
        repositoryTab.clickOnResizeButton();

        // start coordinates
        int startX = new Integer(repositoryTab.resizeButton.getLocation().x);
        int startY = new Integer(repositoryTab.resizeButton.getLocation().y);

        // destination dimensions
        int startWidth = new Integer(repositoryTab.resizeButton.getSize().width);
        int startHeight = new Integer(repositoryTab.resizeButton.getSize().height);

        // destination coordinates
        int destinationX = new Integer(repositoryTab.resizeButton.getLocation().x);
        int destinationY = new Integer(repositoryTab.resizeButton.getLocation().y+500);

        // destination dimensions
        int destinationWidth = new Integer(repositoryTab.resizeButton.getSize().width);
        int destinationHeight = new Integer(repositoryTab.resizeButton.getSize().height);

        // work out destination coordinates
        int endX = Math.round(destinationX + (destinationWidth / 2));
        int endY = Math.round(destinationY + (destinationHeight / 2));
        int sX = Math.round(startX + (startWidth / 2));
        int sY = Math.round(startY + (startHeight / 2));


        Thread.sleep(1000);
        Robot robot = new Robot();
        robot.mouseMove(startX+50, startY);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseMove(startX+50, startY+800);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);


    }

    @AfterClass
    public void afterClass()
    {
       // webDriver.close();
    }
}
