package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class infoUsuarioTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        // Abrindo o Navegador
        System.setProperty("webdriver.chrome.driver","C:\\dev\\drivers\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Navegando
        navegador.get("http://www.juliodelima.com.br/taskit");
    }

    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario() {

        // Clicar no link que possui o texto "Sign in"
        navegador.findElement(By.linkText("Sign in")).click();

        // Identificando o formulário de Login
        WebElement formularioSignInBox = navegador.findElement(By.id("signinbox"));

        // Digitar no campo com name "login" que está dentro do formulário de id "signinbox" o texto "julio0001"
        formularioSignInBox.findElement(By.name("login")).sendKeys("julio0001");

        // Digitar no campo com name "password" que está dentro do formulário de id "signinbox" o texto "123456"
        formularioSignInBox.findElement(By.name("password")).sendKeys("123456");

        // Clicar no link com o texto "SIGN IN"
        navegador.findElement(By.linkText("SIGN IN")).click();

        // Validar que dentro do elemento com class "me" está o texto "Hi, Julio"
        WebElement me = navegador.findElement(By.className("me"));
        String textoNoElementoMe = me.getText();
        assertEquals("Hi, Julio",textoNoElementoMe);
        
    }
    @After
    public void tearDown() {
        // Fechar o navegador
        navegador.quit();
    }
}
