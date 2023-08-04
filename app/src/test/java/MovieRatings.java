import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MovieRatings {


    @Test
        public void Ratings() {
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Task 1: Visit the site
        driver.get("https://www.imdb.com/chart/top");

        // Task 2: Find the highest rated movie
        WebElement highestRatedMovieElement = driver.findElement(By.xpath("(//td[@class='titleColumn'])[1]/a"));
        String highestRatedMovie = highestRatedMovieElement.getText();
        System.out.println("Highest rated movie on IMDb: " + highestRatedMovie);

        // Task 3: Find the number of movies in the table
        List<WebElement> movieElements = driver.findElements(By.xpath("//td[@class='titleColumn']"));
        int numberOfMovies = movieElements.size();
        System.out.println("Number of movies in the table: " + numberOfMovies);

        // Task 4: Find the oldest movie on the list
        WebElement oldestMovieElement = driver.findElement(By.xpath("(//td[@class='titleColumn'])[last()]/a"));
        String oldestMovie = oldestMovieElement.getText();
        System.out.println("Oldest movie on the list: " + oldestMovie);

        // Task 5: Find the most recent movie on the list
        WebElement mostRecentMovieElement = driver.findElement(By.xpath("(//td[@class='titleColumn'])[1]/a"));
        String mostRecentMovie = mostRecentMovieElement.getText();
        System.out.println("Most recent movie on the list: " + mostRecentMovie);

        // Task 6: Find the movie with the most user ratings
        List<WebElement> ratingCountElements = driver.findElements(By.xpath("//td[@class='ratingColumn imdbRating']"));
        int maxRatingCount = -1;
        String movieWithMostRatings = "";

        for (int i = 0; i < ratingCountElements.size(); i++) {
            String ratingCountText = ratingCountElements.get(i).getText();
            int ratingCount = Integer.parseInt(ratingCountText.replace(",", ""));

            if (ratingCount > maxRatingCount) {
                maxRatingCount = ratingCount;
                WebElement movieElement = movieElements.get(i).findElement(By.tagName("a"));
                movieWithMostRatings = movieElement.getText();
            }
        }

        System.out.println("Movie with the most user ratings: " + movieWithMostRatings);

        // Close the browser
        driver.quit();

    }
    
}
    
