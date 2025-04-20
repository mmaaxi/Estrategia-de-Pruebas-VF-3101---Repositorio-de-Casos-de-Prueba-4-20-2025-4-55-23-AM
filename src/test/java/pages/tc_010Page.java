package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_010Page {
    WebDriver driver;

    private By uploadButton = By.id("uploadButton");
    private By progressIndicator = By.id("progressIndicator");
    private By successMessage = By.id("successMessage");
    private By documentList = By.id("documentList");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void initiateDocumentUpload() {
        driver.findElement(uploadButton).click();
    }

    public boolean isProgressIndicatorVisible() {
        return driver.findElement(progressIndicator).isDisplayed();
    }

    public void waitForUploadToComplete() {
        // Implement wait logic such as WebDriverWait until upload is complete
    }

    public boolean isSuccessMessageDisplayed() {
        return driver.findElement(successMessage).isDisplayed();
    }

    public boolean isDocumentListUpdated() {
        // Logic to verify if the document list is updated
        return true; // Placeholder for actual validation
    }
}