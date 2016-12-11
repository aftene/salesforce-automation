package org.alfresco.smoke;

import org.alfresco.base.BaseTest;
import org.alfresco.po.common.Login;
import org.alfresco.po.salesforce.AlfrescoRepositoryTabList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author Iulian Aftene
 */
public class AlfrescoRepositoryTabTest extends BaseTest
{
    @BeforeClass
    public void BeforeClass()
    {
        openSalesforceTab(webDriver,"alfrescoRepositoryTab");

        PageFactory.initElements(webDriver, Login.class).loginToAlfresco();
    }

    @Test
    public void TabTest(){

        AlfrescoRepositoryTabList tabListTest = PageFactory.initElements(webDriver, AlfrescoRepositoryTabList.class);

        tabListTest.clickOnsitesTab();
        tabListTest.clickOnsearchTab();
        tabListTest.clickOnrepositoryTab();
        tabListTest.clickOnPersonalFilesTab();
    }

    @AfterClass
    public void afterClass()
    {
        webDriver.close();
        //webDriver.quit();
    }
}
