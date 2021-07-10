package Common;

import Elements.ElementsLogin;
import Features.Login;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class BaseTest
{
   //******INSTANCIAS******
    public static WebDriver driver = null;
    Login login = new Login();

    @Before
    public void Login () throws Exception
    {
        //CREAR  DRIVER
        driver = Config.navegadorFirefox();

        //MAXIMIZA VENTANA
        driver.manage().window().maximize();

        //LA FUNCIÓN "driver.get", NOS SIRVE PARA MANDAR LA URL AL NAVEGADOR
        driver.get(Config.URL_UAT);
        login.miLogin(driver);

        //*****IMPLICIT WAIT*******
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //*****EXPLICIT WAIT*******
        //Explicits: WebDriverWait y Thread.Sleep();
        //WebDriverWait wait = new WebDriverWait(driver, 5);
        //wait.until(ExpectedConditions.presenceOfElementLocated(elementsLogin.byButtonSignin));

        //******FLUENT WAIT********
        /*Wait<WebDriver> Fwaint = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(10))
                .ignoring(NoSuchElementException.class);
        WebElement btnSigin = Fwaint.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(elementsLogin.byButtonSignin);
            }
        });

        Assert.assertTrue(driver.findElement(elementsLogin.byButtonSignin).isDisplayed());*/

        //POR MEDIO DEL OBJETO "login", MANDAMOS TRAER (INSTANCIAMOS) EL PROCESO DE INICIAR SESIÓN
        login.miLogin(driver);
        }

    @After
    public void tearDown()
    {
        //LA FUNCIÓN "driver.quit", NOS SIRVE PARA CERRAR EL NAVEGADOR
        driver.quit();
    }

}

