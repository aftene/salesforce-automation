package org.alfresco.po.salesforce;

import org.alfresco.helper.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Iulian Aftene
 */
public class SearchTab
{
    @FindBy(css = "input[name='searchTerm']")
    private WebElement searchInput;

    @FindBy(id = "uniqName_1_4")
    private WebElement searchButton;

    @FindBy(id = "FCTSRCH_SCOPE_SELECTION_MENU_text")
    private WebElement searchInDropDown;

    @FindBy(id = "FCTSRCH_SET_ALL_SITES_SCOPE_text")
    private WebElement allSitesOption;

    @FindBy(id = "FCTSRCH_SET_REPO_SCOPE_text")
    private WebElement repositoryOption;


    public void clickOnSearchInDropDown()
    {
        searchInDropDown.click();
    }

    public void clickAllSitesOption()
    {
        allSitesOption.click();
    }

    public void clickOnRepositoryOption()
    {
        repositoryOption.click();
    }

    public void clickOnSearchButton()
    {
        searchButton.click();
    }

    public void typeInSearchInput(String textToSearch)
    {
        searchInput.clear();
        searchInput.sendKeys(textToSearch);
    }


}
