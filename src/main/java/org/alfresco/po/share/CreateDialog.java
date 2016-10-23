package org.alfresco.po.share;

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


    public WebElement getNameTextInput(){
        return nameTextInput;
    }

    public WebElement getTitleTextInput(){
        return titleTextInput;
    }

    public WebElement getDescriptionTextInput(){
        return descriptionTextInput;
    }

    public WebElement getContentTextInput() { return contentTextInput; }

    public WebElement getSaveButton(){
        return saveButton;
    }

    public WebElement getCancelButton() {
        return cancelButton;
    }
}
