package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.Util;

public class tarjetaPage extends Util {
    @FindBy(linkText = "Generate Card Number") protected WebElement lblnrotargeta;
    @FindBy(css = "#nav > a:nth-child(2)") protected WebElement lblcvvTargeta;
    @FindBy(xpath = "//nav/a[@href='cardnumber.php']")protected WebElement lblexpTargeta;

    public tarjetaPage() {
        PageFactory.initElements(driver,this);
    }

    public void obtenerNroTargeta(){
        wait.until(ExpectedConditions.visibilityOf(lblnrotargeta));
        String texto = lblnrotargeta.getText();
        System.out.println(texto);
    }

    public void obtenercvv(){
        String texto = lblcvvTargeta.getText();
        System.out.println(texto);
    }

    public void obtenerFecha(){
        String texto = lblexpTargeta.getText();
        System.out.println(texto);
    }
}
