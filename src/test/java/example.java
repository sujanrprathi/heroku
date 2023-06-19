import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class example {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "C:/Users/Ascendion/IdeaProjects/TestAutomation/src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(50));
        String[] searchResults;
        int resultsSize;

        driver.get("https://www.autozone.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[text()='Batteries']")).click();
        //Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@aria-label='year arrow']"))));
        //driver.wait(1000);
        driver.findElement(By.xpath("//button[@aria-label='year arrow']")).click();
        driver.findElement(By.xpath("//button[text()='2022']")).click();
        //driver.findElement(By.xpath("//button[@aria-label='make arrow']")).click();
        driver.findElement(By.xpath("//button[text()='Acura']")).click();
        //driver.findElement(By.xpath("//button[@aria-label='model arrow']")).click();
        driver.findElement(By.xpath("//button[text()='ILX']")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h2[@id='ymme-title-selected']"))));
        //Thread.sleep(2000);
        searchResults= driver.findElement(By.xpath("//p[contains(text(),'Results')]")).getText().split(" ");
        if (!(searchResults[0] =="0")){
            System.out.println("Results displayed are "+searchResults[2]);
            resultsSize=driver.findElements(By.xpath("//div[@id='shelf-result-list']/ul/li")).size();
            System.out.println(resultsSize);
        }
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//iframe[@title='Jebbit Questionnaire']"))));
        /*driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Jebbit Questionnaire']")));
        System.out.println(driver.getTitle());*/
            driver.findElement(By.xpath("//button[@aria-label='close jebbit questionnaire']")).click();

    }
}
