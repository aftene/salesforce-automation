package org.alfresco.po.salesforce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Iulian Aftene
 */

public class SitesTab
{
    @FindBy(css = "tbody[widgetid*='AlfListView']")
    private WebElement sitesTable;

    public List<WebElement> getAllsites()
    {
        List<WebElement> rows = sitesTable.findElements(By.tagName("tr"));
        return rows;
    }

    public void clickOnFirstSite()
    {
        List<WebElement> fistSite = getAllsites().get(0).findElements(By.cssSelector("td span"));
        fistSite.get(1).click();
    }
}
