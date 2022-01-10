package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
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
        driver.findElement(By.xpath("//*[@class=\"_9f0v0 _jkrtd mj7a_0 mh36_16 mvrt_16 mg9e_16 mpof_ki m389_6m munh_56 m3h2_56 myre_zn myre_8v_s m7f5_5x_s mjru_vb _90605_OPWNL\"]/button")).click();

//        WebElement categoryCombo = driver.findElement(
//                By.xpath(""));
//        Select categorySelect = new Select(categoryCombo);
//        categorySelect = new Select(categoryCombo);
//        categorySelect.selectByIndex(1);
//
//        WebElement inputField = driver.findElement(By.xpath(""));
//        inputField.sendKeys("Mavic mini");
//        driver.findElement(By.xpath("")).click();
//        WebDriverWait wait = new WebDriverWait(driver, 20);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
//        List<WebElement> element = driver.findElements(By.className("nazwa_klasy"));
//        element.get(0).getText();

    }
}
