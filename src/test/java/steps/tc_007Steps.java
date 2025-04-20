package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_007Page;

public class tc_007Steps {

    tc_007Page page = new tc_007Page();

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_está_en_la_página_de_carga_de_documentos() {
        page.navigateToDocumentUploadPage();
    }

    @When("el usuario carga un documento que ya existe en el sistema")
    public void el_usuario_carga_un_documento_que_ya_existe_en_el_sistema() {
        page.uploadDocument("documentoExistente.pdf");
    }

    @Then("el sistema reconoce la duplicación")
    public void el_sistema_reconoce_la_duplicación() {
        Assert.assertTrue(page.isDuplicateDetected());
    }

    @When("el usuario intenta cargar el mismo documento nuevamente")
    public void el_usuario_intenta_cargar_el_mismo_documento_nuevamente() {
        page.uploadDocument("documentoExistente.pdf");
    }

    @Then("se notifica al usuario sobre la duplicidad y se previene la redundancia")
    public void se_notifica_al_usuario_sobre_la_duplicidad_y_se_previene_la_redundancia() {
        Assert.assertTrue(page.isNotificationDisplayed());
    }
}