package codingnew2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageUrl {
    @Test
    public void imageUrl(){

    // Navigate to bookmyshow

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://in.bookmyshow.com/explore/home/chennai");

    // Find the count of images for recommended movies
        WebElement images = driver.findElement(By.xpath("//div[@id='sdk-AD_HOME_CAROUSEL']/../following-sibling::div/div/div/div/div/div/div/div/div/div/a"));

        System.out.println(images.getSize());



    // Print the URLs
        System.out.println(images);
    // Print the name of the 2nd movie under premiere

        WebElement secondMovieName = driver.findElement(By.xpath("//div[contains(@class, 'lkiZOG')]/div[2]/a/div/div[3]/div/div"));
        
        System.out.println(secondMovieName);

    // Print the language of the 2nd movie under premiere

        WebElement secondMovieLang = driver.findElement(By.xpath("//div[contains(@class, 'lkiZOG')]/div[2]/a/div/div[3]/div/div"));
        
        System.out.println(secondMovieLang);



    }
    
}
