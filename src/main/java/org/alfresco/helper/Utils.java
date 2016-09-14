package org.alfresco.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileReader;
import java.util.Properties;

/**
 * Created by p3700509 on 06/09/16.
 */
public class Utils {

    protected static final String timeout = "50";
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    public static String GetProperty(String propertiesFile ,String propName)
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

    protected void waitForWebElementToDisplay(WebDriver webDriver, WebElement webElement)
    {
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Integer.parseInt(timeout) / 1000);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    private void openSalesforceTab(String tabToOpen){
        driver.get(GetProperty("salesforcePages.properties",tabToOpen));
    }

}
