package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_003Page {

    WebDriver driver;

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "fileUploadInput")
    WebElement fileUploadInput;

    @FindBy(id = "uploadButton")
    WebElement uploadButton;

    @FindBy(id = "sizeError")
    WebElement sizeError;

    @FindBy(id = "sizeLimitMessage")
    WebElement sizeLimitMessage;

    public void selectLargeDocument() {
        // Logic to set a file path for a large document in the file upload input
    }

    public void attemptUpload() {
        uploadButton.click();
    }

    public void verifySizeErrorDisplayed() {
        if (!sizeError.isDisplayed()) {
            throw new AssertionError("Size error message not displayed");
        }
    }

    public void verifyUploadRejected() {
        // Logic to verify that the upload was rejected
    }

    public void verifyUserInformedOfLimit() {
        if (!sizeLimitMessage.isDisplayed()) {
            throw new AssertionError("Size limit message not displayed");
        }
    }
}