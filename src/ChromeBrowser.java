import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        //setup the chrome browser
        WebDriver driver = new ChromeDriver();
        //open url
        driver.get(baseUrl);
        // Maximise the Browser
        driver.manage().window().maximize();
        // We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //print the title of page
        String title = driver.getTitle();
        System.out.println(title);
        //print the current url
        System.out.println("Current url :" + driver.getCurrentUrl());
        //print the page source
        System.out.println("Page Source :" + driver.getPageSource());
        //enter email to email field
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("htpatel1993@gmail.com");
        //enter the password to password field
        driver.findElement(By.name("password")).sendKeys("Himanshu1234");
        //close the browser
        driver.close();
        driver.quit();

    }
}
