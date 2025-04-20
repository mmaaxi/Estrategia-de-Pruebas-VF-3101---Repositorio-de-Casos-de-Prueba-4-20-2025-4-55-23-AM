package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_001Page {
    WebDriver driver;
    WebDriverWait wait;

    By documentInput = By.id("documentInput");
    By uploadButton = By.id("uploadButton");
    By successNotification = By.id("successNotification");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void selectValidDocument() {
        WebElement uploadElement = driver.findElement(documentInput);
        uploadElement.sendKeys("/path/to/valid/document.pdf");
    }

    public boolean isDocumentFormatAndSizeValid() {
        // Implement logic to verify format and size if required
        return true;
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public boolean isUploadSuccessNotificationDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(successNotification)).isDisplayed();
    }
}