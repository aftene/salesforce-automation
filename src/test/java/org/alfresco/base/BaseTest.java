package org.alfresco.base;

import static org.alfresco.helper.Utils.getProperty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Iulian Aftene
 */
public class BaseTest
{
    public WebDriver webDriver;

    public BaseTest()
    {
        webDriver = new FirefoxDriver();

    }

    public  void openSalesforceTab(WebDriver webDriver, String tabToOpen){
        webDriver.get(getProperty("salesforcePages.properties",tabToOpen));

    }
}
