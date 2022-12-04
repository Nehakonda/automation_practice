package planet_super_heroes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    private  final String URL = "https://www.planetsuperheroes.com/";

    public WebDriver initBrowser() {
        // Browser Initialization - Start
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        return driver;
    }
}
