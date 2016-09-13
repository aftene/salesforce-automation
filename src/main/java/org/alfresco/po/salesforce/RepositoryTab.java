package org.alfresco.po.salesforce;

import org.alfresco.helper.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by p3700509 on 05/09/16.
 */
public class RepositoryTab extends Utils{

    @FindBy(id="alfresco_layout_AlfTabContainer___2bc69a0a-b2b5-41c2-8195-fe66c893cabc_TABCONTAINER_tablist_alfresco_layout_AlfTabContainer___2bc69a0a-b2b5-41c2-8195-fe66c893cabc_MYFILES")
    private WebElement personalFilesTab;

    @FindBy(xpath=".//*[@id='alfresco_layout_AlfTabContainer___62595e6e-4210-4d7a-8af8-11dfaf1b3653_TABCONTAINER_tablist_alfresco_layout_AlfTabContainer___62595e6e-4210-4d7a-8af8-11dfaf1b3653_SITES']")
    private WebElement repositoryTab;

    @FindBy(id="alfresco_layout_AlfTabContainer___2bc69a0a-b2b5-41c2-8195-fe66c893cabc_TABCONTAINER_tablist_alfresco_layout_AlfTabContainer___2bc69a0a-b2b5-41c2-8195-fe66c893cabc_SITES")
    private WebElement sitesTab;

    @FindBy(id="alfresco_layout_AlfTabContainer___2bc69a0a-b2b5-41c2-8195-fe66c893cabc_TABCONTAINER_tablist_alfresco_layout_AlfTabContainer___2bc69a0a-b2b5-41c2-8195-fe66c893cabc_SEARCH'")
    private WebElement searchTab;


    @FindBy(xpath = ".//*[@id='content']")
    private WebElement test;

    public WebElement getPersonalFilesTab()
    {
       return personalFilesTab;
    }

    public WebElement getRepositoryTab()
    {
        return repositoryTab;
    }

    public WebElement getTest()
    {
        return test;
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
