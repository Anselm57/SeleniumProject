import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FirstTestNG {

    WebDriver driver;
    @Test
    public void navigateConcepts() {
        String title = driver.getTitle();
        System.out.println("Title of the page is: "+title);
    }

    @Test(dependsOnMethods = "navigateConcepts")
    public void getURL() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='WebTable']")).click();
        Thread.sleep(2000);

        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL is: " + currentURL);
    }

    @BeforeClass
    public void openBrowser() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
    }

    @AfterClass
    public void classBrowser() {
        driver.close();
    }



}
