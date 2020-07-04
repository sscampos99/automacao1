package testes;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWEBTest {
    @Test
    public void testValidarDados() {
        //preparação
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

    }


}
