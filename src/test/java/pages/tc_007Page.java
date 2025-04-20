package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_007Page {
    WebDriver driver;

    By uploadButton = By.id("uploadButton");
    By notificationMessage = By.id("notificationMessage");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToDocumentUploadPage() {
        driver.get("https://example.com/document-upload");
    }

    public void uploadDocument(String fileName) {
        WebElement uploadElement = driver.findElement(uploadButton);
        uploadElement.sendKeys("/path/to/" + fileName);
    }

    public boolean isDuplicateDetected() {
        // Implement logic to verify that the system has detected duplicate documents
        return driver.findElement(notificationMessage).isDisplayed();
    }

    public boolean isNotificationDisplayed() {
        WebElement notification = driver.findElement(notificationMessage);
        return notification.isDisplayed() && notification.getText().contains("duplicidad");
    }
}