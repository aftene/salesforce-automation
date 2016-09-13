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

    protected String timeout = "50";
    protected WebDriver driver;
    protected WebDriverWait wait;

    public String GetProperty(String propertiesFile ,String propName)
    {
        String returnedProp = null;
        try {
            FileReader properties = new FileReader("/Users/p3700509/Desktop/AutomationProjects/salesforce-automation/src/test/resources/" + propertiesFile);
            Properties property = new Properties();
            property.load(properties);
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
