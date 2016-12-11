package org.alfresco.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.io.FileReader;
import java.util.Properties;

import com.gargoylesoftware.htmlunit.javascript.configuration.WebBrowser;

/**
 * Created by p3700509 on 06/09/16.
 */
public class Utils {

    protected static final String timeout = "50";
    //public WebDriver webDriver;
    protected static WebDriverWait wait;

    public static String getProperty(String propertiesFile ,String propName)
    {
        String returnedProp = null;
        try
        {
            FileReader properties = new FileReader(
                "/Users/p3700509/Documents/salesforce-automation/src/test/resources/" + propertiesFile);
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



}
