package StepDefinitions;

import Utilities.DriverManager;
import Utilities.HomePageNavigation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class ElementsAttributesExamples {
    DriverManager driverManager= new DriverManager();
    WebDriver driver= DriverManager.getInstance();
    HomePageNavigation homePageNavigation=new HomePageNavigation();

    @When("User clicks on Elements Attributes Examples link")
    public void userClicksOnElementsAttributesExamplesLink() {
        homePageNavigation.goToHomePage();
        homePageNavigation.goToElementAttributesExample();
    }
    @Then("Elements Attributes Examples page should be opened")
    public void elementsAttributesExamplesPageShouldBeOpened() {
        if(driverManager.validatePage("Elements Attributes Examples page should be opened")){
            System.out.println("Page validated");
        }
        else{
            System.out.println("Page not validated");
        };
    }
    @And("User clicks on Add Another Attribute button")
    public void userClicksOnAddAnotherAttributeButton() {
        driver.findElement(By.xpath("//button[text()='Add Another Attribute']")).click();

    }

    @Then("Dynamic attributes should be added")
    public void dynamicAttributesShouldBeAdded() throws InterruptedException {

        //driver.wait(2000);
        WebElement dyAttribute=driver.findElement(By.xpath("//p[@custom-1='value-1']"));
        Assert.assertTrue(dyAttribute.isDisplayed());
       // driver.quit();
    }







}
