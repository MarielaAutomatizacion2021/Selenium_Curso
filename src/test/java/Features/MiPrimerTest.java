package Features;

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
    /*
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
    }*/

    @Test
    public void UsoXpath () throws InterruptedException
    {
        //Este Xpath es absluto, por buenas practicas no se debe utilizar
        /*WebElement buttonCompra = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[3]/div[2]/span[2]"));
        buttonCompra.click();
        Thread.sleep(5000);*/

        //Utilizando Xpath con tag (spam, img, button, input, select) y un atributo
        /*WebElement buttonCompras = driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
        buttonCompras.click();
        Thread.sleep(5000);*/
        //Utilizando Xpath por contains usando "*", el asterisco se puede reemplazar por el tag o tipo de elemento
        /*WebElement cuentasListas = driver.findElement(By.xpath("//*[contains(text(),'Cuenta y Listas')]"));
        cuentasListas.click();
        Thread.sleep(5000);*/

        //Uso de xpath con multiples atributos
        /*WebElement InputBusqueda = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @class='nav-input nav-progressive-attribute']"));
        InputBusqueda.click();
        InputBusqueda.clear();
        InputBusqueda.sendKeys("Maletas");
        InputBusqueda.submit();
        Thread.sleep(5000);*/

        //Uso de Xpath con multiple relación de atributo y tag
        WebElement InputBusqueda = driver.findElement(By.xpath("//div/input[@id='twotabsearchtextbox' and @class='nav-input nav-progressive-attribute']"));
        InputBusqueda.click();
        InputBusqueda.clear();
        InputBusqueda.sendKeys("Maletas");
        InputBusqueda.submit();
        Thread.sleep(5000);

    }

    @After

    public void tearDown()
    {
        //Cierre de navegador
        driver.quit();
    }

}
