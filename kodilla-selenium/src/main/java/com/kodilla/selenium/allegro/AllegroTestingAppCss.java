package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingAppCss {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.Allegro.pl");

        WebElement categoryCombo = driver.findElement(
                By.xpath(""));
        Select categorySelect = new Select(categoryCombo);
        categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(1);

        WebElement inputField = driver.findElement(By.xpath(""));
        inputField.sendKeys("Mavic mini");
        driver.findElement(By.xpath("")).click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
        List<WebElement> element = driver.findElements(By.className("nazwa_klasy"));
        element.get(0).getText();

    }
}
