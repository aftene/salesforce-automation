package org.alfresco.po.salesforce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by p3700471 on 14/09/16.
 */
public class WorkPanel {

    @FindBy(css = ".alf-create-icon")
    private WebElement createButton;

    @FindBy(xpath = ".//td[contains(text(), 'Folder')]")
    private WebElement createFolderButton;

    @FindBy(id = "ALF_CREATE_CONTENT_DIALOG_OK")
    private WebElement createFolderDialogCreateButon;

    public WebElement getCreateButton() { return createButton; }

    public WebElement getCreateFolderButton() {
        return createFolderButton;
    }


//    public FormDialog openCreateFolderDialog() {
//        createFolderButton.click();
//        return PageFactory.initElements(webDriver, FormDialog.class);
//    }


}
