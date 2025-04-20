package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_005Page;

public class tc_005Steps {
    private tc_005Page uploadPage = new tc_005Page();

    @Given("el usuario inicia la carga de un documento de gran tamaño")
    public void iniciarCargaDeDocumento() {
        uploadPage.iniciarCarga();
        Assert.assertTrue("El proceso de carga no se inició correctamente", uploadPage.verificarCargaIniciada());
    }

    @When("el usuario interrumpe la conexión a internet durante la carga")
    public void interrumpirConexion() {
        uploadPage.interrumpirConexion();
    }

    @Then("el proceso de carga se cancela y se indica un error de conexión")
    public void validarCancelacionDeCarga() {
        Assert.assertTrue("La carga no se canceló de forma segura", uploadPage.verificarCargaCancelada());
    }
}