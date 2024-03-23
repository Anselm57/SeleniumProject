import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Scanner;

public class LoginTestCases {

    WebDriver driver;

    public void userInputMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Browser Name: ");
        String browserName = sc.nextLine();
        sc.close();

        if (browserName.equals("safari")) {
            driver = new SafariDriver();
        }else if(browserName.equals("edge")) {
            driver = new EdgeDriver();
        }else if (browserName.equals("firefox")) {
            driver = new FirefoxDriver();
        }else {
            driver = new ChromeDriver();
        }
    }

    public void initialActions() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
//        To maximize browser
        driver.manage().window().fullscreen();
    }

//    This is the first test case for the wrong username and wrong password (here I replaced the password with user123 instead of admin123)
    public void testCaseOne() throws InterruptedException {
        userInputMethod();
        initialActions();

//		try to enter username and password
        WebElement usernameInput = driver.findElement(By.name("username"));
        usernameInput.sendKeys("user");

        driver.findElement(By.name("password")).sendKeys("user123");

        WebElement loginButton = driver.findElement(By.className("orangehrm-login-button"));
        loginButton.click();

        Thread.sleep(5000);
        driver.quit();
    }

    //    This is the second test case for the correct username and wrong password
    public void testCaseTwo() throws InterruptedException {
        userInputMethod();
        initialActions();

//		try to enter username and password
        WebElement usernameInput = driver.findElement(By.name("username"));
        usernameInput.sendKeys("Admin");

        driver.findElement(By.name("password")).sendKeys("user123");

        WebElement loginButton = driver.findElement(By.className("orangehrm-login-button"));
        loginButton.click();

        Thread.sleep(5000);
        driver.quit();
    }

    //    This is the third test case for the wrong username and correct password
    public void testCaseThree() throws InterruptedException {
        userInputMethod();
        initialActions();

//		try to enter username and password
        WebElement usernameInput = driver.findElement(By.name("username"));
        usernameInput.sendKeys("user");

        driver.findElement(By.name("password")).sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.className("orangehrm-login-button"));
        loginButton.click();

        Thread.sleep(5000);
        driver.quit();
    }

    //    This is the fourth test case for the correct username and correct password
    public void testCaseFour() throws InterruptedException {
        userInputMethod();
        initialActions();

//		try to enter username and password
        WebElement usernameInput = driver.findElement(By.name("username"));
        usernameInput.sendKeys("Admin");

        driver.findElement(By.name("password")).sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.className("orangehrm-login-button"));
        loginButton.click();

        Thread.sleep(5000);
        driver.quit();
    }

}
