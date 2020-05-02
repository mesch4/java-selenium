package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class delInfoUsuarioTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        // Abrindo o Navegador
        System.setProperty("webdriver.chrome.driver", "C:\\dev\\drivers\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Navegando
        navegador.get("http://www.juliodelima.com.br/taskit");
    }

    @After
    public void tearDown() {
        // Fechar o navegador
        // navegador.quit();
    }
}
