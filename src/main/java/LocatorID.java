import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class LocatorID {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        Thread.sleep(2000);

        driver.findElement(By.id("email")).sendKeys("Srikant");

        driver.findElement(By.id("userName")).sendKeys("anselm.u.agommuoh@gmail.com");
        Thread.sleep(5000);

        driver.quit();

    }
}