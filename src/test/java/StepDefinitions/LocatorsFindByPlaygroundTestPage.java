package StepDefinitions;

import Utilities.DriverManager;
import Utilities.HomePageNavigation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LocatorsFindByPlaygroundTestPage {
    HomePageNavigation homepage=new HomePageNavigation();
    DriverManager driverManager=new DriverManager();
    //WebDriver driver=DriverManager.getInstance();
    @Given("User clicks on Locators- Find By Playground Test Page")
    public void userClicksOnLocatorsFindByPlaygroundTestPage() {
        homepage.goToHomePage();
        homepage.goToLocatorsFindByPlayground();
        if(driverManager.validatePage("Locators Find By Playground Test Page"))
        {
            System.out.println("Page validated");
        }
        else {
            System.out.println("Page not validated");
        };
    }

    @When("User clicks on a particular jump to link")
    public void userClicksOnAParticularJumpToLink() {
        driverManager.clickLink("jump to para 0\n" +
                "                    ");
    }

    @Then("The corresponding paragraph text should be displayed")
    public void theCorrespondingParagraphTextShouldBeDisplayed() {
    }
}
