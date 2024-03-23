import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class LocatorName {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        Thread.sleep(2000);

        driver.findElement(By.id("email")).sendKeys("Srikant@busyqa.com");
        driver.findElement(By.name("password")).sendKeys("Srikant");
        driver.findElement(By.name("confirmPassword")).sendKeys("Srikant");


    }
}