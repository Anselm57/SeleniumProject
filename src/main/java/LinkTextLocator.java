import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LinkTextLocator {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        Thread.sleep(2000);

//        WebElement registerLinkWE = driver.findElement(By.linkText("REGISTER"));
//        registerLinkWE.click();

        WebElement registerLinkWE = driver.findElement(By.partialLinkText("EGIST"));
        registerLinkWE.click();


    }
}