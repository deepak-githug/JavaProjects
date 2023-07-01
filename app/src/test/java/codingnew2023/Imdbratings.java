package codingnew2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Imdbratings {

    public void imdbRatings(){

        // Launch Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Navigate to the URL
        driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");

        // Click on the Sort by dropdown and select imdb rating

        WebElement sortByOption = driver.findElement(By.xpath("//select[@id='lister-sort-by-options']"));
        sortByOption.click();
        // Print the name of the highest rated movie
        // Print the count of all the movies(getSize)
        // Click on the Sort by dropdown and select Released date
        // Print the oldest move
        // Print the most recent move
        // Click on the Sort by dropdown and select your rating
        // Print the movie that has the most user ratings


    }
    
}
