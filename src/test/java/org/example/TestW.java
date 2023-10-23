package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



import java.util.List;


public class TestW {
    WebDriver driver2 = new ChromeDriver();

    SoftAssert softAssert = new SoftAssert();


    @Test
    public void testWiki(){

        //Navegador Goggle Chrome driver
        String driverPath = "C:\\Users\\vaiop\\IdeaProjects\\holaMaven\\src\\utils\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        //driver2 = new ChromeDriver();

        //Navegador Firefox driver
        driver2 = new FirefoxDriver();


        driver2.navigate().to("https://www.saucedemo.com/v1/");

        WebElement userName = driver2.findElement(By.id("user-name"));
        userName.isDisplayed();
        userName.isEnabled();
        userName.sendKeys("standard_user");

        WebElement password = driver2.findElement(By.id("password"));
        password.isDisplayed();
        password.isEnabled();
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver2.findElement(By.id("login-button"));
        loginButton.isDisplayed();
        loginButton.isEnabled();
        loginButton.click();


        WebElement nuevaPage = driver2.findElement(By.className("product_label"));
        Assert.assertEquals(nuevaPage.getText(),"Products");

        driver2.close();
    }
    /*
    @Test
    public void testWiki(){

        String driverPath = "C:\\Users\\vaiop\\IdeaProjects\\holaMaven\\src\\utils\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver2 = new ChromeDriver();
        //driver2 = new FirefoxDriver();


        driver2.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement userName = driver2.findElement(By.cssSelector("oxd-input[name=\"username\"]"));

        userName.isDisplayed();
        userName.isEnabled();
        userName.sendKeys("Admin");

        WebElement password = driver2.findElement(By.xpath(".oxd-input[type=\"password\"]"));

        password.isDisplayed();
        password.isEnabled();
        password.sendKeys("admin123");

        WebElement loginButton = driver2.findElement(By.cssSelector(".button[type=\"submit\"]"));

        loginButton.isDisplayed();
        loginButton.isEnabled();
        loginButton.click();



    }
*/

}
