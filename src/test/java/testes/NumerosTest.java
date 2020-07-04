package testes;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumerosTest{

    public static WebDriver driver;

    @Test
    public void validarDados() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        ChromeDriver navegador = new ChromeDriver();
        navegador.get("https://www.phptravels.net/login");

        //login com "stphn.campos99@live.com" e senha "123456"
        navegador.findElement(By.name("username")).sendKeys("stphn.campos99@live.com");
        navegador.findElement(By.name("password")).sendKeys("123456");
        navegador.findElements(By.cssSelector(".btn")).get(5).click();
    }

    @Test
    public void validarDadosDaPaginaPrincipal() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        ChromeDriver navegador = new ChromeDriver();
        navegador.get("https://www.phptravels.net/");
        navegador.findElements(By.cssSelector(".btn")).get(3).click();
        driver.findElement(By.cssSelector("ul li:nth-child(3) a.dropdown-item.active.tr")).click();

    }

}
