import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFile {
    WebDriver driver;

    {
        driver = new ChromeDriver();
    }
    public void openTestSite()
    {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        System.out.println(driver.findElement(By.xpath("//h1[text()='Test Pages For Automating']")).getText());
    }
}
