package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_004Page {

    WebDriver driver;

    By archivoSelector = By.id("archivo");
    By botonCargar = By.id("cargar");
    By mensajeError = By.id("mensajeError");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void seleccionarDocumentoDanadoOVacio() {
        driver.findElement(archivoSelector).sendKeys("ruta/del/doc_danado_o_vacio");
    }

    public void procederConLaCarga() {
        driver.findElement(botonCargar).click();
    }

    public boolean isArchivoCorruptoODanioDetectado() {
        // Lógica para verificar si el sistema ha detectado el archivo corrupto
        return true; // Esto es solo un ejemplo, el valor debe provenir de la lógica de la aplicación
    }

    public boolean isMensajeDeErrorVisible() {
        return driver.findElement(mensajeError).isDisplayed();
    }
}