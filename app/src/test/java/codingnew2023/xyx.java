package codingnew2023;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xyx {

    @Test

    void xyz() throws InterruptedException{

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        Thread.sleep(2000);
        
        WebElement username = driver.findElement(By.id("user-name"));

        username.clear();

        username.click();

        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));

        password.clear();

        password.click();

        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));       
        
        loginButton.click();

        Thread.sleep(3000);

        List<WebElement> productsName = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));

        productsName.size();

        for(WebElement webelement : productsName){

            String text = webelement.getText();

            System.out.println(text);


        }

    }

    
}
