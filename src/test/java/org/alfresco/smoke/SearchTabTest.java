package org.alfresco.smoke;

import org.alfresco.base.BaseTest;
import org.alfresco.helper.Utils;
import org.alfresco.po.common.Login;
import org.alfresco.po.salesforce.AlfrescoRepositoryTabList;
import org.alfresco.po.salesforce.SearchTab;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;


/**
 * @author Iulian Aftene
 */
public class SearchTabTest extends BaseTest
{
    SearchTab searchTab = PageFactory.initElements(webDriver, SearchTab.class);

    @BeforeClass
    public void BeforeClass()
    {
        openSalesforceTab(webDriver,"alfrescoRepositoryTab");

        //initialize login page objects
        PageFactory.initElements(webDriver, Login.class).loginToAlfresco();

        AlfrescoRepositoryTabList alfrescoRepositoryTabList = PageFactory.initElements(webDriver, AlfrescoRepositoryTabList.class);
        alfrescoRepositoryTabList.clickOnsearchTab();
    }

    //perform smoke test on search tab - search for string "test"
    @Test
    public void smokeSearchOnRepository()
    {

        searchTab.clickOnSearchInDropDown();
        searchTab.clickOnRepositoryOption();
        searchTab.typeInSearchInput("test");
        searchTab.clickOnSearchButton();
    }

    @Test
    public void smokeSearchOnAllSites()
    {
        searchTab.clickOnSearchInDropDown();
        searchTab.clickAllSitesOption();
        searchTab.typeInSearchInput("test");
        searchTab.clickOnSearchButton();
    }

    @AfterClass
    public void afterClass()
    {
        webDriver.close();
        //webDriver.quit();
    }
}
