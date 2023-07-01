package codingnew2023;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

import io.github.bonigarcia.wdm.WebDriverManager;


@Test
public class HyperlinkCounts {

@Test
        public void hyperlinkCounts() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://in.bookmyshow.com/explore/home/chennai");
        Thread.sleep(3000);
        List<WebElement> count = driver.findElements(By.xpath("//a[@href]"));
        Thread.sleep(3000);
        count.size(); 

        }
    
}
