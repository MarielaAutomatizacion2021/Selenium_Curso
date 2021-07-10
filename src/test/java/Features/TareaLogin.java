package Features;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TareaLogin
{
    private WebDriver driver;

    @Before
    public void SetUp() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/ChromeDriver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
    }

    @Test
    public void Login () throws InterruptedException
    {
        //Este Xpath es absluto, por buenas practicas no se debe utilizar
        WebElement buttonLogin = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a"));
        buttonLogin.click();
        Thread.sleep(3000);


        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350");
        Thread.sleep(2000);

        WebElement InputEmail = driver.findElement(By.xpath("//*[@id='email']"));
        InputEmail.sendKeys("test.0@test.com");

        WebElement InputPassword = driver.findElement(By.xpath("//*[@id='passwd']"));

        InputPassword.sendKeys("test1234");

        WebElement buttonSignIn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span"));
        buttonSignIn.click();
        Thread.sleep(5000);

        /*
        WebElement ThereisError = driver.findElement(By.xpath ("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/p"));
        WebElement PasswordRequired = driver.findElement(By.xpath ("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/ol/li\n"));
        WebElement InvalidPassword = driver.findElement(By.xpath ("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/ol/li\n"));
        WebElement EmailRequired = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/ol/li"));
        WebElement InvalidEmail = driver.findElement(By.xpath ("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/ol/li"));
        */


    }

    @After

    public void tearDown()
    {
        //Cierre de navegador
        driver.quit();
    }
}
