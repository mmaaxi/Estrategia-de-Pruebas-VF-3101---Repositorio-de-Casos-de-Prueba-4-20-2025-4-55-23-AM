package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {
    private WebDriver driver;

    private By unsupportedFileInput = By.id("unsupportedFileInput");
    private By uploadButton = By.id("uploadButton");
    private By errorMessage = By.id("errorMessage");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToDocumentUploadPage() {
        driver.get("http://example.com/document-upload");
    }

    public void selectUnsupportedDocument() {
        WebElement fileInput = driver.findElement(unsupportedFileInput);
        fileInput.sendKeys("C:\\path\\to\\unsupportedfile.exe");
    }

    public boolean isFileRejected() {
        return driver.findElements(errorMessage).size() > 0;
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public boolean isErrorMessageDisplayed() {
        WebElement error = driver.findElement(errorMessage);
        return error.isDisplayed() && error.getText().contains("formato no permitido");
    }

    public void attemptToBypassUploadRestriction() {
        // Implementation to attempt bypass of upload restriction
    }

    public boolean isUploadBlocked() {
        // Implementation to verify upload is blocked
        return isFileRejected();
    }
}