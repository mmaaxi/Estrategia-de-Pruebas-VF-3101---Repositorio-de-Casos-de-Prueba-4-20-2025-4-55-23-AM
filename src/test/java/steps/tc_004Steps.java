package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_004Page;
import static org.junit.Assert.assertTrue;

public class tc_004Steps {

    tc_004Page page = new tc_004Page();

    @Given("el usuario ha seleccionado un documento dañada o vacío")
    public void seleccionarDocumentoDanadoOVacio() {
        page.seleccionarDocumentoDanadoOVacio();
    }

    @When("el usuario procede con la carga")
    public void procederConLaCarga() {
        page.procederConLaCarga();
    }

    @Then("el sistema detecta la corrupción o ausencia de contenido")
    public void verificarDeteccionDeArchivoCorrupto() {
        assertTrue(page.isArchivoCorruptoODanioDetectado());
    }

    @Then("el sistema muestra un mensaje de error de archivo corrupto o vacío")
    public void verificarMensajeDeError() {
        assertTrue(page.isMensajeDeErrorVisible());
    }
}