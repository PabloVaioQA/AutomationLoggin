package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestWikipedia {

    WebDriver driver = new ChromeDriver();


    @Test
    public void testWiki(){
            String driverPath = "C:\\Users\\vaiop\\IdeaProjects\\holaMaven\\src\\utils\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", driverPath);
            driver = new ChromeDriver();

            driver.navigate().to("https://www.wikipedia.org/");

            WebElement searchInput = driver.findElement(By.id("searchInput"));

            searchInput.sendKeys("Globant");

            WebElement lupa = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
            lupa.click();

            WebElement nuevaUrl = driver.findElement(By.className("mw-page-title-main"));

            Assert.assertEquals(nuevaUrl.getText(),"Globant");

            //WebDriverWait wait = new WebDriverWait(driver, 20);

            List<WebElement> listaUrl = driver.findElements(By.tagName("a"));

            for (WebElement link: listaUrl) {
            System.out.println(link.getText());
            }

            driver.close();

    }
    /*
    @Test
    public void testWiki(){
        String driverPath = "/Users/valentinaeugeniadallape/IdeaProjects/prueba/src/utils/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.navigate().to("https://www.wikipedia.org/");
        WebElement searchInput = driver.findElement(By.id("searchInput"));
        searchInput.sendKeys("gato");
        WebElement lupa = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        lupa.click();
        WebElement nuevaUrl = driver.findElement(By.className("mw-page-title-main"));
        Assert.assertEquals("No coinciden",nuevaUrl.getText(),"Gato");
        List<WebElement> listaUrl = driver.findElements(By.tagName("a"));
        for (WebElement link:listaUrl) {
            System.out.println(link.getText());
        }
        driver.close();

    }

    <suite name="Test Globant">

    <parameter name="browser" value="chrome"/>
    <parameter name="url" value="https://www.wikipedia.org/" />

    <test name="Busqueda WikiPedia">
        <parameter name="busqueda" value="Microsoft"/>
        <classes>
            <class name = "ejercicioTest.SearchTest">
                <methods>
                    <include name = "testSearch"/>
                </methods>
            </class>
        </classes>
    </test>
*/


}
