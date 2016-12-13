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

    @FindBy(xpath = ".//*[@id='DOCLIB_FILTERS']/div[2]")
    private WebElement documetsCategory;

    @FindBy(xpath = "(.//div[@id='MYFILES']//div[contains(@id,'alfresco_layout_Twister')]//div[contains(@class,'label')])[1]")
    private WebElement libraryCategory;

    @FindBy(xpath = "(.//div[@id='MYFILES']//div[contains(@id,'alfresco_layout_Twister')]//div[contains(@class,'label')])[2]")
    private WebElement categoriesCategory;


    public void clickOnResizeButton()
    {
        resizeButton.click();
    }

    public WebElement getResizeButton()
    {
        return resizeButton;
    }

    public void clickOnDocumetsCategory()
    {
        documetsCategory.click();
    }

    public void clickOnLibraryCategory()
    {
        libraryCategory.click();
    }

    public void clickOngCategoriesCategory()
    {
        categoriesCategory.click();
    }
}
