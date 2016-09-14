package org.alfresco.po.salesforce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by p3700509 on 05/09/16.
 */
public class AlfrescoRepositoryTabList {

    @FindBy(xpath=".//span[text()='Personal Files']")
    private WebElement personalFilesTab;

    @FindBy(xpath=".//span[text()='Repository']")
    private WebElement repositoryTab;

    @FindBy(xpath=".//span[text()='Sites']")
    private WebElement sitesTab;

    @FindBy(xpath=".//span[text()='Search']")
    private WebElement searchTab;


    public WebElement getPersonalFilesTab()
    {
       return personalFilesTab;
    }

    public WebElement getRepositoryTab()
    {
        return repositoryTab;
    }

    public WebElement getSitesTab()
    {
        return sitesTab;
    }

    public WebElement getSearchTab()
    {
        return searchTab;
    }

}
