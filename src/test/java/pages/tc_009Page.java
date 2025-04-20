package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_009Page {
    WebDriver driver;
    WebDriverWait wait;

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void navigateToDocumentUploadPage() {
        driver.get("http://example.com/document-upload");
    }
    
    public void uploadValidDocument() {
        WebElement uploadInput = driver.findElement(By.id("uploadInput"));
        uploadInput.sendKeys("path/to/valid/document.pdf");
        WebElement uploadButton = driver.findElement(By.id("uploadButton"));
        uploadButton.click();
    }
    
    public boolean isDocumentSavedAndSent() {
        WebElement confirmationMessage = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.id("confirmMessage")));
        return confirmationMessage.getText().contains("Document saved and sent");
    }

    public boolean isProcessingConfirmed() {
        WebElement notification = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.id("processingNotification")));
        return notification.getText().contains("Processing confirmed");
    }
}