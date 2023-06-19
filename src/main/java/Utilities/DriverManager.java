package Utilities;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class DriverManager {
    private static WebDriver driver;
    String pageLinkHeading;
    int counter = 0;

    //private DriverManager(){}
    public static WebDriver getInstance() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    public void clickLink(String linkName) {
        driver.findElement(By.xpath("//a[text()='"+linkName+"']")).click();
    }

    public boolean validatePage(String pageToValidate) {
        String[] checkLink1;
        String[] checkLink2;
        String[] checkLink3= new String[10];
        pageLinkHeading = driver.findElement(By.xpath("//h1")).getText();
        boolean b;

        checkLink1= pageToValidate.split(" ");
        checkLink2=pageLinkHeading.split(" ");

        for (String s : checkLink1) {
            for (int j = 0; j < checkLink2.length; j++) {
                if (Objects.equals(s, checkLink2[j])) {
                    checkLink3[j] = s;
                    System.out.println(checkLink3[j]);
                }
            }
        }
            if(checkLink3.length>2){
                System.out.println(checkLink3);
                b=true;
            }
            else {
                b=false;
            }
        return b;
    }
    }

