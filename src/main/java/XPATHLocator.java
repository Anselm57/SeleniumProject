import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATHLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
//		Absolute xpath
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(4000);
//        //absolute xpath -> /root node and /
//        WebElement usernameInput = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
//        usernameInput.sendKeys("Admin");

        // relative xpath -- xpath=//tagname[@attribute='value']
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        Thread.sleep(4000);
//        WebElement usernameInput = driver.findElement(By.xpath("//input[@name='username']"));
//        usernameInput.sendKeys("admin123");

        // relative xpath -- contains() with attribute
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        Thread.sleep(4000);
//        WebElement usernameInput = driver.findElement(By.xpath("//input[contains(@name,'sern')]"));
//        usernameInput.sendKeys("admin123");

        // relative xpath -- contains() with text()
//        driver.get("https://demo.guru99.com/test/newtours/register.php");
//        Thread.sleep(4000);
//        String output = driver.findElement(By.xpath("//font[contains(text(),'your account')]")).getText();
//        System.out.println("print output: "+ output);

        //using OR in attribute selector
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        Thread.sleep(4000);
//        WebElement usernameInput = driver.findElement(By.xpath("//input[@class='abc' or @name='password']"));
//        usernameInput.sendKeys("admin123");
//        //using AND in attribute selector
//        WebElement usernameInput1 = driver.findElement(By.xpath("//input[@placeholder='Username' and @name='username']"));
//        usernameInput1.sendKeys("Admin");

        // relative xpath -- Starts-with()
//        driver.get("https://demo.guru99.com/test/newtours/register.php");
//        Thread.sleep(4000);
//        WebElement usernameInput = driver.findElement(By.xpath("//font[starts-with(text(),'To')]"));
//        System.out.println("print output: "+ usernameInput.getText());
//
//        // relative xpath -- text()
////		driver.get("https://demo.guru99.com/test/newtours/register.php");
////		Thread.sleep(4000);
//        WebElement usernameInput1 = driver.findElement(By.xpath("//a[text()='REGISTER']"));
//        System.out.println("print output: "+ usernameInput1.getText());

    }
}
