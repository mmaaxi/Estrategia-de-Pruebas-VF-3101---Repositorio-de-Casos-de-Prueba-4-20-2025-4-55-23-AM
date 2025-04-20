package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {
    tc_010Page uploadPage = new tc_010Page();

    @Given("I start uploading a document")
    public void startUploadingADocument() {
        uploadPage.initiateDocumentUpload();
    }

    @Then("the interface should show progress indicators")
    public void interfaceShouldShowProgressIndicators() {
        Assert.assertTrue(uploadPage.isProgressIndicatorVisible());
    }

    @When("the upload is completed")
    public void uploadIsCompleted() {
        uploadPage.waitForUploadToComplete();
    }

    @Then("a success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        Assert.assertTrue(uploadPage.isSuccessMessageDisplayed());
    }

    @Then("the list of uploaded documents should be updated")
    public void listOfUploadedDocumentsShouldBeUpdated() {
        Assert.assertTrue(uploadPage.isDocumentListUpdated());
    }
}