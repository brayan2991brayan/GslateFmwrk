package pageObjectModel.pages.interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public interface IActionHelper {
    void sendKeysToElement(WebElement element, String textToSend);
    WebElement getElement(By elementSelector);
    List<WebElement> getElements(By elementsSelector);
}
