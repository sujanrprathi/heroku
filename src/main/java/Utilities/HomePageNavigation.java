package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;
import java.util.Objects;

public class HomePageNavigation
{
    DriverManager driverManager=new DriverManager();
    WebDriver driver=DriverManager.getInstance();
    public void goToHomePage()
    {
        if(!Objects.equals(driver.getCurrentUrl(), "https://testpages.herokuapp.com/styled/index.html"))
        {
            try
            {
                driver.findElement(By.xpath("//a[text()='Index']")).click();
            }
            catch(NoSuchElementException e) {
                driver.get("https://testpages.herokuapp.com/styled/index.html");
            }
        }
    }
    public void goToBasicWebPageExample(){
        driverManager.clickLink("Basic Web Page Example");
    }
    public void goToElementAttributesExample(){
        driverManager.clickLink("Element Attributes Examples");
    }
    public void goToLocatorsFindByPlayground() {
        driverManager.clickLink("Locators - Find By Playground Test Page");
    }

        public void goToTableTestPage() {
            driverManager.clickLink("Table Test Page");
        }
    public void goToDynamicTableTestPage() {
        driverManager.clickLink("Dynamic Table Test Page");
    }

    public void goToAlertsJavaScript() {
        driverManager.clickLink("Alerts (JavaScript)");
    }

    public void goToFakeAlerts() {
        driverManager.clickLink("Fake Alerts");
    }

    public void goToFramesTestPage() {
        driverManager.clickLink("Frames Test Page");
    }

    public void goToIframesTestPage() {
        driverManager.clickLink("iFrames Test Page");
    }

    public void goToHtmlFormExample() {
        driverManager.clickLink("HTML Form Example");
    }

    public void goToHtml5ElementFormTestPage() {
        driverManager.clickLink("HTML5 Element Form Test Page");
    }

    public void goToWindowsLinkTestPage() {
        driverManager.clickLink("Windows Link Test Page");
    }

    public void goToAjaxJavaScriptExamples() {
        driverManager.clickLink("Ajax JavaScript Examples");
    }

    public void goToDragAndDropTestPageJavaScript() {
        driverManager.clickLink("Drag And Drop Test Page (JavaScript)");
    }

    public void goToFieldValidationWithJavaScriptExample() {
        driverManager.clickLink("Field Validation With JavaScript Example");
    }

    public void goToKeyClickDisplayTestPage() {
        driverManager.clickLink("Key Click Display Test Page");
    }

    public void goToRedirectJavaScriptTestPage() {
        driverManager.clickLink("Redirect (JavaScript) Test Page");
    }

    public void goToRefreshTestPage() {
        driverManager.clickLink("Refresh Test Page");
    }

    public void goToEventsJavaScript() {
        driverManager.clickLink("Events (JavaScript)");
    }

    public void goToHoverTestPage() {
        driverManager.clickLink("Hover Test Page");
    }

    public void goToUserAgentRedirectPage() {
        driverManager.clickLink("User Agent Redirect Page");
    }

    public void goToCssMediaQueryBasedOnSize() {
        driverManager.clickLink("CSS Media Query Based On Size");
    }

    public void goToExpandingDivviaCss() {
        driverManager.clickLink("Expanding Div via CSS");
    }
    /*
    Dynamic Buttons Challenge 01
    Dynamic Buttons Challenge 02
    Multiple Progress Bars
    XHTTP Message Processing
    File Upload Example Page
    File Downloads
    JavaScript Initiated File Downloads
    Cookies Controlling Page Access
    Click the auto grow button
    Hard to Select Buttons
    Client Server Form Input Validation
    Calculator
    Button Based Calculator
    The Famous Triangle Application
    Canvas Scribble Test Page
    Canvas Drawing with JavaScript Example
    JavaScript Countdown Test Page
    Search
    Alert
    Alerts
    Basic Ajax
    Basic HTML Form
    Basic Web Page
    Bounce
    Calculate
    Find By Playground
    GUI User Interactions
    JavaScript Countdown
    Key Click Display
    Refresh
    Search
    Frames
    Basic Redirect
    Basic Canvas Example
    File Upload Example
    Basic HTML5 Form

     */
}
