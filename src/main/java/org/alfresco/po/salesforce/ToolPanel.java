package org.alfresco.po.salesforce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by p3700471 on 14/09/16.
 */
public class ToolPanel
{

    @FindBy(css = ".alf-create-icon")
    private WebElement createButton;

    @FindBy(xpath = ".//td[contains(text(), 'Folder')]")
    private WebElement createFolderButton;

    @FindBy(xpath = ".//td[contains(text(), 'Text Document')]")
    private WebElement createFileButton;


    public void clickOnCreateButton() { createButton.click(); }

    public void clickOnCreateFolderButton() { createFolderButton.click(); }

    public void clickOnCreateFileButton() { createFileButton.click(); }

}
