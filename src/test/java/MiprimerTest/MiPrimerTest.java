package MiprimerTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiPrimerTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        //Se coloca la dirección del driver, sea Chrome, mozilla o edge
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/ChromeDriver/chromedriver.exe");

        //Crea la instancia (Abrir ventana) de Chrome
        driver = new ChromeDriver();

        //Maximiza el navegador
        driver.manage().window().maximize();

        //Envia la direccion del sistema al navegador
        driver.get("https://www.amazon.com/");
    }

    @Test
    public void TestAmazon() throws InterruptedException
    {

        WebElement inputBusqueda = driver.findElement(By.id("twotabsearchtextbox"));
        inputBusqueda.click();
        inputBusqueda.sendKeys("Cocina");
        //inputBusqueda.submit();//Es un enter
        WebElement clickLupa = driver.findElement(By.id("nav-search-submit-button"));
        clickLupa.click();
        Thread.sleep(5000); //Espera 5 segundos
    }

    @After

    public void tearDown()
    {
        //Cierre de navegador
        driver.quit();
    }

}
