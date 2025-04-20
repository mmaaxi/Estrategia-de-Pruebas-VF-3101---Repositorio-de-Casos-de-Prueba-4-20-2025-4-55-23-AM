package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_001Page;

public class tc_001Steps {
    tc_001Page page = new tc_001Page();

    @Given("El usuario selecciona un documento válido con formato PDF o DOCX")
    public void el_usuario_selecciona_un_documento_válido_con_formato_pdf_o_docx() {
        page.selectValidDocument();
        Assert.assertTrue("Formato y tamaño del archivo no es válido", page.isDocumentFormatAndSizeValid());
    }

    @When("El usuario hace clic en el botón 'Cargar documento'")
    public void el_usuario_hace_clic_en_el_botón_cargar_documento() {
        page.clickUploadButton();
    }

    @Then("El sistema muestra una notificación de carga exitosa")
    public void el_sistema_muestra_una_notificación_de_carga_exitosa() {
        Assert.assertTrue("No se muestra mensaje de carga exitosa", page.isUploadSuccessNotificationDisplayed());
    }
}