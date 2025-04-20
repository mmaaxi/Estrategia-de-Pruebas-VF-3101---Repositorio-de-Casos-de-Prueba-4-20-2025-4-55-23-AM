package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_009Page;

public class tc_009Steps {
    tc_009Page documentPage = new tc_009Page();

    @Given("El usuario ha iniciado sesión y está en la página de carga de documentos")
    public void elUsuarioHaIniciadoSesionYEstaEnLaPaginaDeCargaDeDocumentos() {
        documentPage.navigateToDocumentUploadPage();
    }
    
    @When("El usuario carga un documento válido")
    public void elUsuarioCargaUnDocumentoValido() {
        documentPage.uploadValidDocument();
    }
    
    @Then("El documento se guarda y se envía al servicio de procesamiento")
    public void elDocumentoSeGuardaYSeEnviaAlServicioDeProcesamiento() {
        Assert.assertTrue(documentPage.isDocumentSavedAndSent());
    }
    
    @Then("El servicio confirma el procesamiento del documento a través de una notificación o mensaje")
    public void elServicioConfirmaElProcesamientoDelDocumento() {
        Assert.assertTrue(documentPage.isProcessingConfirmed());
    }
}