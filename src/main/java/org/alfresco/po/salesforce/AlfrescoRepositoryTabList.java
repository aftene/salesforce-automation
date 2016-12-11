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


    public void clickOnPersonalFilesTab() { personalFilesTab.click(); }

    public void clickOnrepositoryTab() { repositoryTab.click(); }

    public void clickOnsitesTab() { sitesTab.click(); }

    public void clickOnsearchTab() { searchTab.click(); }

}
