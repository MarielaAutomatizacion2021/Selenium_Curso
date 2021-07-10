package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumUtils
{
    WebDriver driver;

    public void ClickButton(WebElement element)
    {
        element.click();
    }

    public void LimpiarInput(WebElement element)
    {
        element.clear();
    }

    public void LimpiarYLlenarInput(WebElement input, String data)
    {
        LimpiarInput(input);
        input.sendKeys(data);
    }

    public void loading (WebDriver driver, int timeMileseconds) throws Exception
    {
        Thread.sleep(timeMileseconds);
    }

    public void desplazamiento
}
