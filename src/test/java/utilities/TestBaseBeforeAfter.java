package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class TestBaseBeforeAfter {

    protected WebDriver driver;
    protected Actions actions;

    protected String tarih;
    //TestNG framework'unde @Before ve @After notasyonlari yerine @BeforeMethod ve @AfterMethod kullanilir
    //Calisma prensibi JUnit'deki Before, After ile aynidir.
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        actions = new Actions(driver);
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYMMddHHss");
        tarih = date.format(formatter);
    }
    @AfterMethod
    public void tearDown() {
        //driver.quit();
    }
}
