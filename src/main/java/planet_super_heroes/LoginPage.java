package planet_super_heroes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage {

    private WebDriver driver;

    @BeforeTest
    public WebDriver initBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.planetsuperheroes.com/");
        driver.manage().window().maximize();
        return driver;
    }

    @Test
    public void verifyLoginTest() {

        //Go to Profile and click
        driver.findElement(By.xpath("//span[text()=\"Profile\"]")).click();

        //Click on Login/Signup
        driver.findElement(By.xpath("//button[text()=\"LOGIN/SIGNUP\"]")).click();

        //Go to Register and click
        driver.findElement(By.xpath("//button[text()=\"Register\"]")).click();

        //Enter Firstname
        driver.findElement(By.name("firstName")).sendKeys("Neha");

        //Enter Lastname
        driver.findElement(By.name("lastName")).sendKeys("Konda");

        //Enter Email
        driver.findElement(By.name("email")).sendKeys("nehakonda214@gmail.com");

        //Enter Mobile No.
        driver.findElement(By.name("mobile")).sendKeys("7779562856");

        //Enter Password
        driver.findElement(By.name("password")).sendKeys("abcdefgh");

        //Re-enter Password
        driver.findElement(By.name("rePassword")).sendKeys("abcdefgh");

        //Click on Create an Account
        driver.findElement(By.xpath("//button[text()=\"CREATE AN ACCOUNT \"]")).click();

    }

    @AfterTest
    public void teardown() {
        driver.close();
    }
}
