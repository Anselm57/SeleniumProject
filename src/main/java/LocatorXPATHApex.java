import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXPATHApex {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(4000);
        WebElement usernameInput = driver.findElement(By.name("username"));
        usernameInput.sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        WebElement loginButton = driver.findElement(By.className("orangehrm-login-button"));
        loginButton.click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[text()='PIM']//parent::a")).click();
//xpath - preceding
        //form[@class='oxd-form']/div/div/div[3]/preceding::div

        //xpath - following
        //form[@class='oxd-form']/div/div/div[3]/following::div

        // xpath - Ancestor
        //form[@class='oxd-form']/div/div/div[3]/ancestor::div

        //xpath - Parent
        //form[@class='oxd-form']/div/div/div[3]/parent::div

        //zpath - preceding-sibling
        //form[@class='oxd-form']/div/div/div[3]/preceding-sibling::div

        //xpath - following-sibling

        //form[@class='oxd-form']/div/div/div[3]/following-sibling:🗂️
    }
}