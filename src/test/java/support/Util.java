package support;

import definitions.hooks;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class Util extends hooks {
    public static WebDriverWait wait;

    public Util() {
        wait = new WebDriverWait(driver,30);
    }

    public void ventanaActiva(){
        Set<String> identificadores = driver.getWindowHandles();
        for (String identificador:identificadores){
            driver.switchTo().window(identificador);
        }
    }

    public void ventanaInicial(){
        driver.close();
        driver.switchTo().window("");
    }
}
