package ru.yandex.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPageScooter {
    private WebDriver driver;

    private By buttonUp = By.cssSelector(".Header_Nav__AGCXC .Button_Button__ra12g");
    private By buttonDown = By.cssSelector(".Home_FinishButton__1_cWm .Button_Button__ra12g");

    private By name = By.xpath(".//div[@class='Order_Form__17u6u']/div[1]/input");
    private By surname = By.xpath(".//div[@class='Order_Form__17u6u']/div[2]/input");
    private By address = By.xpath(".//div[@class='Order_Form__17u6u']/div[3]/input");
    private By metrostation = By.cssSelector(".select-search__value .select-search__input");
    private By metrostation1 = By.xpath(".//div[@class='select-search__select']/ul/li/button/div[2]");
    private By telephone = By.xpath(".//div[@class='Order_Form__17u6u']/div[5]/input");
    private By next = By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM");

    public OrderPageScooter(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonUp() {
        driver.findElement(buttonUp).click();
    }

    public void clickButtonDown() {
        driver.findElement(buttonDown).click();
    }

    public void sendLoginFirstVersion() {
        driver.findElement(name).sendKeys("Иван");
        driver.findElement(surname).sendKeys("Иванов");
        driver.findElement(address).sendKeys("Иванова 9");
        driver.findElement(metrostation).click();
        driver.findElement(metrostation1).click();
        driver.findElement(telephone).sendKeys("+79131002233");
        driver.findElement(next).click();
    }

    public void sendLoginSecondVersion() {
        driver.findElement(name).sendKeys("Дмитрий");
        driver.findElement(surname).sendKeys("Ионов");
        driver.findElement(address).sendKeys("Саратова 12");
        driver.findElement(metrostation).click();
        driver.findElement(metrostation1).click();
        driver.findElement(telephone).sendKeys("+79131002210");
        driver.findElement(next).click();
    }
}