import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class ImplicitWait {
    WebDriver driver;

    @Test
    public void implicitlyWait() {

        WebElement userNameElement = driver.findElement(By.name("username"));
        userNameElement.sendKeys("Admin");

        WebElement passwordElement = driver.findElement(By.name("password"));
        passwordElement.sendKeys("admin123");
    }


    @BeforeTest
    public void beforeTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
//	  Thread.sleep(2000);
//	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterTest
    public void afterTest() {
    }

}
