import Utilities.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

public class MyStepdefs {
    String BasicTestPage="Basic Web Page Example";
    WebDriver driver=null;


    @Given("home page is opened")
    public void homePageIsOpened() {

        driver=DriverManager.getInstance();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
    }

    @When("user clicks on Basic Web Page Example")
    public void userClicksOnBasicWebPageExample() {
        driver.findElement(By.xpath("//a[text()='Basic Web Page Example']")).click();
    }

    @Then("basic test page should be opened")
    public void basicTestPageShouldBeOpened() {
        if(Objects.equals(driver.findElement(By.xpath("//h1[text()='Basic Web Page Example']")).getText(), BasicTestPage))
        {
            System.out.println("Basic Test Page is Opened");
            driver.close();
        }
    }
}
