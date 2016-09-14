package org.alfresco.po.share;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import javax.xml.ws.wsaddressing.W3CEndpointReference;

/**
 * Created by p3700471 on 14/09/16.
 */
public class FormDialog {

    @FindBy(name = "prop_cm_name")
    private WebElement nameTextInput;

    @FindBy(name = "prop_cm_title")
    private WebElement titleTextInput;

    @FindBy(name = "prop_cm_description")
    private WebElement descriptionTextInput;

    @FindBy(css="button[id$='submit-button']")
    private WebElement saveButton;

    @FindBy(css="button[id$='cancel-button']")
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

    public WebElement getSaveButton(){
        return saveButton;
    }

    public WebElement getCancelButton() {
        return cancelButton;
    }
}
