import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;


public class CssSelector {

    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://demo.guru99.com/test/newtours/register.php");
//        Thread.sleep(2000);
//
////        Tag and ID - ID is represented by #
//        driver.findElement(By.cssSelector("input#email")).sendKeys("Anselm");

//        WebDriver driver = new ChromeDriver();
//
//        //Tag and class - class is represented by .
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        Thread.sleep(4000);
//        WebElement usernameInput = driver.findElement(By.name("username"));
//        usernameInput.sendKeys("Admin");
//        driver.findElement(By.name("password")).sendKeys("admin123");
//
//
//        //WebElement loginButton = driver.findElement(By.cssSelector("button.orangehrm-login-button"));
//        WebElement loginButton = driver.findElement(By.cssSelector("button.orangehrm-login-button"));
//        loginButton.click();

//        WebDriver driver = new ChromeDriver();
//
////		Tag and class selecting multiple elements driver chooses the first one
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        Thread.sleep(4000);
//
//        WebElement usernameInput = driver.findElement(By.cssSelector("input.oxd-input"));
//
//        usernameInput.sendKeys("Admin");

        WebDriver driver = new ChromeDriver();

//		Tag and Attribute
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(4000);
//        WebElement usernameInput = driver.findElement(By.cssSelector("input[name=password]"));
//        usernameInput.sendKeys("admin123");

        //		$=ends-with
//		^=starts-with
//		*=contains()
//		Tag and Attribute --- * $ ^
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(4000);
//        WebElement usernameInput = driver.findElement(By.cssSelector("input[name*=ser]"));
//        usernameInput.sendKeys("Admin");
//        WebElement usernameInput2 = driver.findElement(By.cssSelector("input[name^=pass]"));
//        usernameInput2.sendKeys("passw123");
//		WebElement usernameInput2 = driver.findElement(By.cssSelector("input[name$=word]"));
//		usernameInput2.sendKeys("passw123");
//		driver.findElement(By.cssSelector("input[name^=pass]")).sendKeys("admin123");
//		driver.findElement(By.cssSelector("input[name$=word]")).sendKeys("admin123");

//		Tag, class and Attribute
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(4000);
        WebElement usernameInput = driver.findElement(By.cssSelector("input.oxd-input[name=password]"));
        usernameInput.sendKeys("Admin");
    }
}