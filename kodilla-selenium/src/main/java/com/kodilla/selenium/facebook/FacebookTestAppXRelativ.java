package com.kodilla.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestAppXRelativ {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        WebElement yearCombo = driver.findElement(
                By.xpath("//*[@id=\"birthday_wrapper\"]/div/span/span/select[3]")); // według screena z kursu powinien być jeszcze jeden div na spamym początku dlaczego go tu nie ma ?

        Select yearSelect = new Select(yearCombo); // dlaczego wynik jest szary
        yearSelect = new Select(yearCombo);
        yearSelect.selectByIndex(5);
    }
}
