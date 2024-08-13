package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Topic_02_Selenium_Locator {
    WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String osName = System.getProperty("os.name");

    @BeforeClass
    public void beforeClass() {
        if (osName.contains("Windows")) {
            System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
        } else {
            System.setProperty("webdriver.gecko.driver", projectPath + "/browserDrivers/geckodriver");
        }

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/register");

    }
//TestNGg: Orrder testcase the Alphabet(0-9 A-Z)

    @Test
    public void TC_01_ID() {
//HTML element: <tagname attribute_name='atribute_value'..>
        /*<input type="text" data-val="true" data-val-required="First name is required." id="FirstName" name="FirstName">*/

driver.findElement(By.id("FirstName")).sendKeys("Quyen");

    }

    @Test
    public void TC_02_Class() {
driver.findElement(By.className("header-logo"));
    }

    @Test
    public void TC_03_Name() {
driver.findElement(By.name("DateOfBirthDay"));
    }
    public void TC_04_Tagname() {
driver.findElement(By.tagName("input"));
    }
    public void TC_05_LinkText() {
        driver.findElement(By.linkText("Shipping & return"));
    }
    public void TC_06_Partial_LinkText() {
        driver.findElement(By.partialLinkText("vendor account"));
    }
    public void TC_07_Css() {
        driver.findElement(By.cssSelector("input[id='FirstName']"));
    }
    public void TC_08_xpath() {
        driver.findElement(By.cssSelector("//input[@id='FirstName']"));
    }
    @AfterClass
    public void afterClass() {

            driver.quit();
    }
    }
