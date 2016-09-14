package org.alfresco.po.salesforce;

import org.alfresco.helper.Utils;
import org.alfresco.po.share.FormDialog;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by p3700471 on 14/09/16.
 */
public class WorkPanelPO {

    @FindBy(css = ".alf-create-icon")
    private WebElement createButton;

    @FindBy(xpath = ".//td[contains(text(), 'Folder')]")
    private WebElement createFolderButton;

    @FindBy(id = "ALF_CREATE_CONTENT_DIALOG_OK")
    private WebElement createFolderDialogCreateButon;

    public FormDialog formDialog;

    public WebDriver webDriver;


    public WorkPanelPO(WebDriver webDriver) {

        this.webDriver = webDriver;

        PageFactory.initElements(webDriver, this);
    }

    public WebElement getCreateButton() {
        return createButton;
    }

    public WebElement getCreateFolderButton() {
        return createFolderButton;
    }

    public FormDialog openCreateFolderDialog() {
        createFolderButton.click();
        return PageFactory.initElements(webDriver, FormDialog.class);
    }

}
