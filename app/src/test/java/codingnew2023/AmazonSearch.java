package codingnew2023;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AmazonSearch {

    @Test

    public void search() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        // driver.switchTo().alert().dismiss();
        driver.findElement(By.id("APjFqb")).sendKeys("amazon");
        Thread.sleep(2000);
        // driver.findElement(By.className("M6CB1c rr4y5c")).click();
        WebElement searchIcon = driver.findElement(By.xpath("//div[@jsname='VlcLAe']/center/input[1]"));
        searchIcon.click();
        Thread.sleep(5000);
        boolean textDisplayed1 = driver.findElement(By.xpath("//span[contains(text(), 'Amazon.in')]")).isDisplayed();
        System.out.println(textDisplayed1);
        boolean textDisplayed2 = driver.findElement(By.xpath("//*[contains(text(), 'Amazon.com')]")).isDisplayed();
        System.out.println(textDisplayed2);

    }

}
