package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_006Page;

public class tc_006Steps {

    WebDriver driver;
    tc_006Page uploadPage = new tc_006Page(driver);

    @Given("I have selected multiple valid documents")
    public void selectMultipleValidDocuments() {
        uploadPage.openUploadPage();
        boolean isMultipleSelectionSuccessful = uploadPage.selectMultipleDocuments();
        Assert.assertTrue("Failed to select multiple documents", isMultipleSelectionSuccessful);
    }

    @When("I execute the simultaneous upload")
    public void executeSimultaneousUpload() {
        uploadPage.uploadSelectedDocuments();
    }

    @Then("the system accepts the multiple selection")
    public void verifySystemAcceptsMultipleSelection() {
        boolean isAccepted = uploadPage.verifyMultipleSelectionAccepted();
        Assert.assertTrue("System did not accept multiple selection", isAccepted);
    }

    @Then("all documents are uploaded concurrently without interference")
    public void verifyConcurrentUpload() {
        boolean isConcurrentUploadSuccessful = uploadPage.verifyDocumentsUploadedConcurrently();
        Assert.assertTrue("Documents were not uploaded concurrently", isConcurrentUploadSuccessful);
    }
}