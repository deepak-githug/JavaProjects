package codingnew2023;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkedinPost {

    @Test

    public void linkedinPost() throws InterruptedException{
    
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
        Thread.sleep(5000);
        WebElement username = driver.findElement(By.id("username"));
        username.clear();
        username.sendKeys("deepak.jd0525@gmail.com");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys("");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
        Thread.sleep(3000);

        // WebElement click = driver.findElement(By.xpath("//*[@id='ember166']/li-icon"));

        // click.click();

        // WebDriverWait wait = new WebDriverWait(WebDriver, 50000);
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ember559']/div/div[2]/span/strong"));

        WebElement homeButton = driver.findElement(By.xpath("//header[@id='global-nav']/div/nav/ul/li[1]/a"));

        homeButton.click();


    //     Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
    //    .pollingEvery(Duration.ofSeconds(250))
    //    .ignoring(Exception.class);

    //     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ember559']/div/div[2]/span/strong")));

        WebElement countOfWhoViewedMyProfile = driver.findElement(By.xpath("//span[text()=\"Who's viewed your profile\"]/../../following-sibling::div/span/strong"));
        countOfWhoViewedMyProfile.getText();
        System.out.println(countOfWhoViewedMyProfile);



    }
    
}
