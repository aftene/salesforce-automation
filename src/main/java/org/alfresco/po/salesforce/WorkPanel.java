package org.alfresco.po.salesforce;

import org.alfresco.helper.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by p3700509 on 05/09/16.
 */
public class WorkPanel extends Utils {


    private String createButtonCSSClass = ".alf-create-icon";
    private String createFolderXPath = ".//td[contains(text(), 'Folder')]";
    private String createFolderNameName = "prop_cm_name";
    private String createFolderTitleName = "prop_cm_title";
    private String createFolderDescriptionName = "prop_cm_description";
    private String createFolderDialogCreateButonID = "ALF_CREATE_CONTENT_DIALOG_OK";


    public WebElement getCreateButton() {
        WebElement createButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(createButtonCSSClass)));
        return createButton;
    }

    public WebElement getCreateFolderButton() {
        WebElement createFolderButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(createFolderXPath)));
        return createFolderButton;
    }

    public WebElement getCreateFolderName(){
        WebElement createFolderName = wait.until(ExpectedConditions.presenceOfElementLocated(By.name(createFolderNameName)));
        return createFolderName;
    }

    public WebElement getCreateFolderTitle(){
        WebElement createFolderTile = wait.until(ExpectedConditions.presenceOfElementLocated(By.name(createFolderTitleName)));
        return createFolderTile;
    }

    public WebElement getCreateFolderDescription(){
        WebElement createFolderDescription = wait.until(ExpectedConditions.presenceOfElementLocated(By.name(createFolderDescriptionName)));
        return createFolderDescription;
    }

    public WebElement getCreateFolderDialogCreateButon(){
        WebElement createFolderDialogCreateButon = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(createFolderDialogCreateButonID)));
        return createFolderDialogCreateButon;
    }
}
