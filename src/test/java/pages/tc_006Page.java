package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class tc_006Page {

    WebDriver driver;

    By uploadInput = By.id("uploadFileInput");
    By uploadButton = By.id("uploadButton");
    By confirmationMessage = By.id("confirmationMessage");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openUploadPage() {
        driver.get("https://example.com/upload");
    }

    public boolean selectMultipleDocuments() {
        WebElement uploadElement = driver.findElement(uploadInput);
        uploadElement.sendKeys("path/to/document1,path/to/document2");
        return uploadElement.getAttribute("value").contains("document1") && uploadElement.getAttribute("value").contains("document2");
    }

    public void uploadSelectedDocuments() {
        WebElement uploadBtn = driver.findElement(uploadButton);
        uploadBtn.click();
    }

    public boolean verifyMultipleSelectionAccepted() {
        WebElement uploadElement = driver.findElement(uploadInput);
        return uploadElement.getAttribute("value").split(",").length > 1;
    }

    public boolean verifyDocumentsUploadedConcurrently() {
        List<WebElement> messages = driver.findElements(confirmationMessage);
        return messages.stream().allMatch(element -> element.getText().equals("Upload successful"));
    }
}