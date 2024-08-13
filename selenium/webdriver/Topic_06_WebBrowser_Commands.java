package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Topic_06_WebBrowser_Commands {
    WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String osName = System.getProperty("os.name");

    @BeforeClass
    public void beforeClass() {


        driver = new FirefoxDriver();
        // time to wait element
        // version 3
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // Version 4
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

    }
    @Test
    public void TC_01(){
        // Open Url
        driver.get("https://www.facebook.com/?locale=vi_VN");

        // driver.close() many tab then close one tab that webdriverio is running
        // close browser
        driver.quit();
        WebElement emailAddress= driver.findElement(By.id("email"));
        List <WebElement> checkBoxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
        checkBoxes.get(1).click();

    }
    @AfterClass
    public  void afterClass(){

    }

}

