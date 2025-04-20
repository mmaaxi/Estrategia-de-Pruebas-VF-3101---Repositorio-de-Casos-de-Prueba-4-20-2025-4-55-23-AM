package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class tc_008Page {

    WebDriver driver;

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void uploadDocument(String name, String date, String author) {
        // Code to upload document and set metadata
        // For example:
        driver.findElement(By.id("uploadButton")).sendKeys("path/to/document");
        driver.findElement(By.id("nameField")).sendKeys(name);
        driver.findElement(By.id("dateField")).sendKeys(date);
        driver.findElement(By.id("authorField")).sendKeys(author);
        driver.findElement(By.id("submitButton")).click();
    }

    public void openMetadataDisplayPage() {
        // Code to navigate to the page displaying metadata
        driver.findElement(By.id("metadataPageLink")).click();
    }

    public String getMetadataName() {
        WebElement nameElement = driver.findElement(By.id("metadataName"));
        return nameElement.getText();
    }

    public String getMetadataDate() {
        WebElement dateElement = driver.findElement(By.id("metadataDate"));
        return dateElement.getText();
    }

    public String getMetadataAuthor() {
        WebElement authorElement = driver.findElement(By.id("metadataAuthor"));
        return authorElement.getText();
    }
}