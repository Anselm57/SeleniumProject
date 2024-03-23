import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableHandling {
    WebDriver driver;

//    Validating web elements in the table
    @Test
    public void f() {
        //identify the table:

        WebElement tableEle = driver.findElement(By.xpath("//table[@id='table2']"));


        // Find all rows in the table
        List<WebElement> rows = tableEle.findElements(By.tagName("tr"));

        // Print the number of rows in the table
        System.out.println("Number of rows in the table: " + rows.size());



        // After finding rows in the table
        for (int i = 1; i < rows.size(); i++) {
            WebElement row = rows.get(i);
            // Find all columns in the row
            List<WebElement> columns = row.findElements(By.tagName("td"));
//            System.out.print("No. of columns are: "+columns.size() + "\t");
            // Iterate through columns and print data
            for (WebElement column : columns) {
                System.out.print(column.getText() + "\t");
            }
            System.out.println(); // Move to the next row
        }

        //validate last Names:

        String[] lastNames = {"Smith", "Bach", "Doe", "Conway"};

//        validate first names:
        String[] firstNames = {"John", "Frank", "Jason", "Tim"};

//        validate emails:
        String[] emails = {"jsmith@gmail.com", "fbach@yahoo.com", "jdoe@hotmail.com", "tconway@earthlink.net"};

//        validate due:
        String[] due = {"$50.00", "$51.00", "$100.00", "$50.00"};

        // After finding rows in the table
        for (int i = 1; i < rows.size(); i++) {
            WebElement row = rows.get(i);
            // Find all columns in the row
            List<WebElement> columns = row.findElements(By.tagName("td"));
//            System.out.print("No. of columns are: "+columns.size() + "\t");
            // Iterate through columns and print data

            WebElement column = columns.get(0);
            WebElement column2 = columns.get(1);
            WebElement column3 = columns.get(2);
            WebElement column4 = columns.get(3);
            String tableLName = column.getText();
            String tableFName = column2.getText();
            String tableEmail = column3.getText();
            String tableDue = column4.getText();
            System.out.println("Lastname from array is: "+ lastNames[i-1] + " -> Lastname from table is: "+tableLName);
            System.out.println("First name from array is: "+ firstNames[i-1] + " -> First name from table is: "+tableFName);
            System.out.println("Email from array is: "+ emails[i-1] + " -> Email from table is: " + tableEmail);
            System.out.println("Due from array is: " + due[i-1] + " -> Due from table is: " + tableDue);

            Assert.assertEquals(tableLName, lastNames[i-1]);


        }
        System.out.println(); // Move to the next row
    }

//    Getting the link http://www.frank.com and the title of the web page

    @Test(dependsOnMethods = "f")
    public void link() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        String link = driver.findElement(By.xpath("//td[@class='web-site'][normalize-space()='http://www.frank.com']")).getText();
        driver.get(link);
        String title = driver.getTitle();
        System.out.println("Title of the page is: " + title);

    }

    @BeforeTest
    public void beforeTest() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tables");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @AfterTest
    public void afterTest() {
    }

}

