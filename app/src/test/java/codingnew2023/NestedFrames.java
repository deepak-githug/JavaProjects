package codingnew2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrames {

    @Test

    public void nestedFrames(){

        
        
        // Navigate to URL

        WebDriverManager.chromedriver().setup();;
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.manage().window().maximize();

        //Navigate to Top Frame

        WebDriver leftFrame = driver.switchTo().frame("frame-top");

          //Navigate to 1st frame
        driver.switchTo().frame("frame-left");
        leftFrame.getTitle();

          //Navigate back to parent and next frame
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-middle");
        leftFrame.getTitle();

        //Navigate back to parent and next frame
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-right");
        leftFrame.getTitle();

        //Navigate back to top parent frame and next frame
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        leftFrame.getTitle();



    }
    
}
