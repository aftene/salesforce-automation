package org.alfresco.po.salesforce;

import org.alfresco.helper.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by p3700509 on 05/09/16.
 */
public class WorkPanel extends Utils {


    private String createButtonCSSClass = ".alf-create-icon";
    //@FindBy(xpath = ".//*[@id='alfresco_documentlibrary_AlfCreateContentMenuBarPopup___bc8b2097-6ec6-4953-8f74-80c567f6d1f8_text']")
    private WebElement createButton=wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(createButtonCSSClass)));

    @FindBy(xpath = ".//*[@id='alfresco_documentlibrary_AlfCreateContentMenuItem___453dacb6-5ae9-4be6-8025-bf0534241d12_text']")
    private WebElement createFolderButton;

    public WebElement getCreateButton()
    {
        return createButton;
    }

    public WebElement getCreateFolderButton()
    {
        return createFolderButton;
    }
}
