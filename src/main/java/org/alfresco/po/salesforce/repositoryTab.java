package org.alfresco.po.salesforce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by p3700509 on 05/09/16.
 */
public class RepositoryTab {

    @FindBy(id="alfresco_layout_AlfTabContainer___2bc69a0a-b2b5-41c2-8195-fe66c893cabc_TABCONTAINER_tablist_alfresco_layout_AlfTabContainer___2bc69a0a-b2b5-41c2-8195-fe66c893cabc_MYFILES")
    private WebElement personalFilesTab;

    @FindBy(id="alfresco_layout_AlfTabContainer___2bc69a0a-b2b5-41c2-8195-fe66c893cabc_TABCONTAINER_tablist_alfresco_layout_AlfTabContainer___2bc69a0a-b2b5-41c2-8195-fe66c893cabc_REPOSITORY")
    private WebElement repositoryTab;

    @FindBy(id="alfresco_layout_AlfTabContainer___2bc69a0a-b2b5-41c2-8195-fe66c893cabc_TABCONTAINER_tablist_alfresco_layout_AlfTabContainer___2bc69a0a-b2b5-41c2-8195-fe66c893cabc_SITES")
    private WebElement sitesTab;

    @FindBy(id="alfresco_layout_AlfTabContainer___2bc69a0a-b2b5-41c2-8195-fe66c893cabc_TABCONTAINER_tablist_alfresco_layout_AlfTabContainer___2bc69a0a-b2b5-41c2-8195-fe66c893cabc_SEARCH'")
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
