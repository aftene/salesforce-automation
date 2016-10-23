package org.alfresco.smoke;

import org.alfresco.helper.Utils;
import org.alfresco.po.common.Login;
import org.alfresco.po.salesforce.AlfrescoRepositoryTabList;
import org.alfresco.po.salesforce.SitesTab;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



/**
 * Created by p3700509 on 19/10/16.
 */
public class SitesTabClickOnFirstSite extends Utils
{
    @BeforeClass
    public void BeforeClass()
    {
        openSalesforceTab("alfrescoRepositoryTab");

        //initialize login page objects
        PageFactory.initElements(Utils.webDriver, Login.class).loginToAlfresco();
    }

    @Test
    public void sitesTabTest()
    {
        AlfrescoRepositoryTabList tabs = PageFactory.initElements(webDriver, AlfrescoRepositoryTabList.class);
        tabs.getSitesTab().click();

        SitesTab sitesTab = PageFactory.initElements(webDriver, SitesTab.class);
        sitesTab.clickOnFirstSite();
    }

    @AfterClass
    public void afterClass()
    {
        webDriver.close();
        webDriver.quit();
    }
}
