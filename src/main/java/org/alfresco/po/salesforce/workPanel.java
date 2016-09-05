package org.alfresco.po.salesforce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by p3700509 on 05/09/16.
 */
public class workPanel {

    @FindBy(xpath = ".//*[@id='alfresco_documentlibrary_AlfCreateContentMenuBarPopup___bc8b2097-6ec6-4953-8f74-80c567f6d1f8_text']")
    private WebElement createButton;

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
