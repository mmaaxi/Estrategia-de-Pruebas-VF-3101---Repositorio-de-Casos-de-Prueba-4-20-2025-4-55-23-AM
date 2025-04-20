package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_002Page;

public class tc_002Steps {
    tc_002Page page = new tc_002Page();

    @Given("El usuario está en la página de carga de documentos")
    public void el_usuario_esta_en_la_pagina_de_carga_de_documentos() {
        page.navigateToDocumentUploadPage();
    }

    @When("El usuario selecciona un documento con formato no soportado")
    public void el_usuario_selecciona_un_documento_con_formato_no_soportado() {
        page.selectUnsupportedDocument();
    }

    @Then("El sistema rechaza el archivo")
    public void el_sistema_rechaza_el_archivo() {
        Assert.assertTrue(page.isFileRejected());
    }

    @Given("Un documento con formato no soportado ha sido seleccionado")
    public void un_documento_con_formato_no_soportado_ha_sido_seleccionado() {
        page.selectUnsupportedDocument();
    }

    @When("El usuario hace clic en 'Cargar documento'")
    public void el_usuario_hace_clic_en_cargar_documento() {
        page.clickUploadButton();
    }

    @Then("Se muestra un mensaje de error indicando formato no permitido")
    public void se_muestra_un_mensaje_de_error_indicando_formato_no_permitido() {
        Assert.assertTrue(page.isErrorMessageDisplayed());
    }

    @When("El usuario intenta forzar la carga del documento")
    public void el_usuario_intenta_forzar_la_carga_del_documento() {
        page.attemptToBypassUploadRestriction();
    }

    @Then("El sistema bloquea la acción y no realiza la carga")
    public void el_sistema_bloquea_la_accion_y_no_realiza_la_carga() {
        Assert.assertTrue(page.isUploadBlocked());
    }
}