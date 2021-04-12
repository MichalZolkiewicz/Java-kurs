package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookAccTestingApp {

    public static final String XPATH_COOKIES = "//div[contains(@class, \"9o-r\")]/button[2]";
    public static final String XPATH_NEW_ACC = "//div[contains(@class, \"6ltg\")]/a[1]";
    public static final String XPATH_DAY = "//div[contains(@class, \"58mq _5d\")]/div/span/span/select[1]";
    public static final String XPATH_MONTH = "//div[contains(@class, \"58mq _5d\")]/div/span/span/select[2]";
    public static final String XPATH_YEAR = "//div[contains(@class, \"58mq _5d\")]/div/span/span/select[3]";
    public static final String XPATH_WAIT = "reg_form_box";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        WebElement acceptCookies = driver.findElement(By.xpath(XPATH_COOKIES));
        acceptCookies.click();

        WebElement createAcc = driver.findElement(By.xpath(XPATH_NEW_ACC));
        createAcc.click();

        WebDriverWait webDriverWait = new WebDriverWait(driver, 5);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(XPATH_WAIT)));

        WebElement dayField = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(dayField);
        selectDay.selectByValue("23");

        WebElement monthField = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(monthField);
        selectMonth.selectByIndex(6);

        WebElement yearField = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(yearField);
        selectYear.selectByValue("1991");

    }
}
