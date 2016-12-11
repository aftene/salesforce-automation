package org.alfresco.po.share;

import org.alfresco.po.salesforce.SearchTab;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import javax.xml.ws.wsaddressing.W3CEndpointReference;

/**
 * Created by p3700471 on 14/09/16.
 */
public class CreateDialog
{

    @FindBy(name = "prop_cm_name")
    private WebElement nameTextInput;

    @FindBy(name = "prop_cm_title")
    private WebElement titleTextInput;

    @FindBy(name = "prop_cm_description")
    private WebElement descriptionTextInput;

    @FindBy(name = "prop_cm_content")
    private WebElement contentTextInput;

    @FindBy(id = "ALF_CREATE_CONTENT_DIALOG_OK")
    private WebElement saveButton;

    @FindBy(id = "ALF_CREATE_CONTENT_DIALOG_CANCEL_label")
    private WebElement cancelButton;


    public void typeInNameTextInput(String name) { nameTextInput.sendKeys(name); }

    public void tyoeInTitleTextInput(String title) { titleTextInput.sendKeys(title); }

    public void typeInDescriptionTextInput(String description) { descriptionTextInput.sendKeys(description); }

    public void typeInContentTextInput(String contet) { contentTextInput.sendKeys(contet); }

    public void clickOnSaveButton() { saveButton.click(); }

    public void clickOnCancelButton() { cancelButton.click(); }
}
