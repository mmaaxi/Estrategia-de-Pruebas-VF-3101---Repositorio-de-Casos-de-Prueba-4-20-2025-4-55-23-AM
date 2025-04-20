package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_005Page {
    private WebDriver driver;
    private By uploadButton = By.id("upload-button");
    private By errorMessage = By.id("error-message");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void iniciarCarga() {
        driver.findElement(uploadButton).click();
    }

    public boolean verificarCargaIniciada() {
        // Lógica que verifica si el proceso de carga ha comenzado
        // Podría incluir checar el progreso visual o un indicador de carga
        return true; // Simulación
    }

    public void interrumpirConexion() {
        // Código para simular la interrupción de la conexión a Internet
    }

    public boolean verificarCargaCancelada() {
        // Verificar que la carga se haya cancelado y se muestre un error apropiado
        return driver.findElement(errorMessage).isDisplayed();
    }
}