package org.alfresco.po.salesforce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Iulian Aftene
 */
public class RepositoryTab
{
    @FindBy(css = "#REPOSITORY div[class*= 'AlfSideBarContainer__resize-button']")
    public WebElement resizeButton;

    public WebElement getResizeButton()
    {
        return resizeButton;
    }

    public void clickOnResizeButton()
    {
        resizeButton.click();
    }
}
