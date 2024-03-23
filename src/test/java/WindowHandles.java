import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandles {
    WebDriver driver;
    String parentHandle;

    @Test
    public void f() {
        String parentHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[@target='_blank']")).click();
        String newwindowHandle = driver.getWindowHandle();
        String title = driver.getTitle();

        System.out.println("New title of the page is: " + title);
        System.out.println("parent handle is     : " + parentHandle);
        System.out.println("New window handle is : " + newwindowHandle);

//	  Set<String> windowHandles = driver.getWindowHandles();
//	// Iterate through window handles and print them
//      for (String handle : windowHandles) {
//          System.out.println("Window Handle: " + handle);
//      }
    }

    @Test(dependsOnMethods = "f")
    public void f2() {

        Set<String> windowHandles = driver.getWindowHandles();
        // Iterate through window handles and print them
        for (String handle : windowHandles) {
            System.out.println("Window Handle: " + handle);
        }

        for (String windowHandle : windowHandles) {

            // Switch to the window
            driver.switchTo().window(windowHandle);

            // Perform actions on the window if needed
            System.out.println("Window Title: " + driver.getTitle());

            // Close the window if it's not the parent window
            if (!windowHandle.equals(parentHandle)) {
                driver.close();
            }
        }
    }

    @BeforeTest
    public void beforeTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }
}