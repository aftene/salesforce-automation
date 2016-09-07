package org.alfresco.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileReader;
import java.util.Properties;

/**
 * Created by p3700509 on 06/09/16.
 */
public class Utils {

    public static WebDriver driver;
    protected static WebDriverWait wait;

    public String GetProperty(String propName)
    {
        String returnedProp = null;
        try {
            FileReader propertiesFile = new FileReader("/Users/p3700471/Documents/Salesforce/salesforce-automation/src/test/resources/credentials.properties");
            Properties property = new Properties();
            property.load(propertiesFile);
            returnedProp = property.getProperty(propName);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return returnedProp;
    }

    protected void TypeText(WebElement webElement, String text)
    {
        webElement.clear();
        webElement.sendKeys(text);
    }





}
