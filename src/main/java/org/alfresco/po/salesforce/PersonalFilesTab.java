package org.alfresco.po.salesforce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Iulian Aftene
 */
public class PersonalFilesTab
{

    @FindBy(css = "div[class*= 'AlfSideBarContainer__resize-button']")
    private WebElement resizeButton;

    public void clickOnResizeButton()
    {
        resizeButton.click();
    }
}
