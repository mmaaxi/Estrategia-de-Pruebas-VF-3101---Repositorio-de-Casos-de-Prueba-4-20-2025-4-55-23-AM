package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;
import pages.tc_008Page;

public class tc_008Steps {

    tc_008Page page = new tc_008Page();

    @Given("^I have uploaded a document with metadata name 'My Document', date '2023-10-01', and author 'John Doe'$")
    public void uploadDocumentWithMetadata() {
        page.uploadDocument("My Document", "2023-10-01", "John Doe");
    }

    @When("^I check the metadata on the UI$")
    public void checkMetadataOnUI() {
        page.openMetadataDisplayPage();
    }

    @Then("^I should see the metadata name 'My Document', date '2023-10-01', and author 'John Doe' correctly displayed$")
    public void verifyMetadataDisplay() {
        assertEquals("My Document", page.getMetadataName());
        assertEquals("2023-10-01", page.getMetadataDate());
        assertEquals("John Doe", page.getMetadataAuthor());
    }
}