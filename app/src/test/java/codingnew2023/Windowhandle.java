package codingnew2023;

import java.util.Set;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandle {

    @Test

    void windowhandle() throws InterruptedException, IOException{

        // Launch Chrome
        
        WebDriverManager.chromedriver().setup();;
        WebDriver driver = new ChromeDriver();

        // Navigate to URL

        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        // Click on the "Try it" button

        driver.switchTo().frame(1);

        WebElement button = driver.findElement(By.xpath("//button[text()='Try it']"));

        button.click();

        // Get the URL, Title, and take the screenshot.

        String parent = driver.getWindowHandle();

        Set<String> s   = driver.getWindowHandles();

        Iterator<String> I1= s.iterator();

        while(I1.hasNext())
        {

        String child_window=I1.next();


        if(!parent.equals(child_window))
        {
        driver.switchTo().window(child_window);

        System.out.println(driver.switchTo().window(child_window).getCurrentUrl());

        System.out.println(driver.switchTo().window(child_window).getTitle());

        }

        }

        //screenshot

       TakesScreenshot screenshot = ((TakesScreenshot)driver);
       
        File SrcFile=screenshot.getScreenshotAs(OutputType.FILE);
        
        File DestFile=new File("/Users/dee/Desktop/deepak/sample.jpg");
        
        FileUtils.copyFile(SrcFile, DestFile);
    
        // Close the window

        driver.close();

        // Switch to parent window

        driver.switchTo().window(parent);


    }
    
}

