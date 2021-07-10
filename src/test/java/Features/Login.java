package Features;

import Common.Config;
import Elements.ElementsLogin;
import Utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class Login
{
    //********INSTANCIAS**********
    ElementsLogin elementsLogin = new ElementsLogin();
    SeleniumUtils Utils = new SeleniumUtils();

    public void miLogin (WebDriver driver) throws InterruptedException
    {
        //SE DA CLICK EN EL BOTÓN SING IN
        Thread.sleep(2000);
        Utils.ClickButton(elementsLogin.ButtonSignin(driver));
        Thread.sleep(2000);

        //SE REALIZA DESPLAZAMIENTO HACIA LA PARTE INFERIOR
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy (0,350)");
        Thread.sleep(2000);
        Utils.loading(driver, 400);

        //SE DA CLIC Y SE LLENA EL INPUT USER
        Utils.ClickButton(elementsLogin.InputUser(driver));
        Utils.LimpiarYLlenarInput(elementsLogin.InputUser(driver), Config.user);
        Thread.sleep(2000);

        //SE DA CLIC Y SE LLENA EL INPUT PASSWORD
        Utils.ClickButton(elementsLogin.InputPassword(driver));
        Utils.LimpiarYLlenarInput(elementsLogin.InputPassword(driver), Config.password);
        Thread.sleep(2000);

        //SE DA CLICK EN EL BOTÓN SINGIN
        WebElement buttonSingnIn = driver.findElement(By.id("SubmitLogin"));
        buttonSingnIn.click();
        Thread.sleep(2000);

    }

    public void LogOut (WebDriver driver)

    {
        // **********NOTA DE ESTUDIO***********
        /* EN CADA CLASE DE FEATURES PODEMOS COLOCAR
        MULTIPLES FUNCIONALIDADES. ES INDISPENSABLES
        CONTAR PRIMERO CON LOS ELEMENTOS WEB. POR EJEMPLO: DENTRO DE
        ESTE METODOS PODEMOS DESARROLLAR EL PASO A PASO
        DE CERRAR SESIÓN
         */
    }
    public void OlvideContraseña (WebDriver driver)
    {

    }

    public void LoginIncorrecto (WebDriver driver)
    {

    }

}
