package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_003Page;
import io.cucumber.java.en.*;

public class tc_003Steps {

    WebDriver driver;
    tc_003Page page;

    public tc_003Steps(WebDriver driver) {
        this.driver = driver;
        page = PageFactory.initElements(driver, tc_003Page.class);
    }

    @Given("A document larger than the maximum allowed size")
    public void givenDocumentExceedingMaxSize() {
        page.selectLargeDocument();
    }

    @When("The user attempts to upload the document")
    public void whenUserAttemptsUpload() {
        page.attemptUpload();
    }

    @Then("The system displays a file size error")
    public void thenSystemDisplaysSizeError() {
        page.verifySizeErrorDisplayed();
    }

    @And("The document upload is rejected")
    public void andUploadIsRejected() {
        page.verifyUploadRejected();
    }

    @And("The user is informed of the size limit")
    public void andUserInformedOfSizeLimit() {
        page.verifyUserInformedOfLimit();
    }
}