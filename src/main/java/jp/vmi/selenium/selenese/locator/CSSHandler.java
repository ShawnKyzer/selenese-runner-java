package jp.vmi.selenium.selenese.locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class CSSHandler implements LocatorHandler {

    @Override
    public String locatorType() {
        return "css";
    }

    @Override
    public List<WebElement> handle(WebDriver driver, String arg) {
        return driver.findElements(By.cssSelector(arg));
    }
}
