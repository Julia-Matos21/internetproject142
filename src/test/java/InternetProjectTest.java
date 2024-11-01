
    // 1 - bibliotecas / imports

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; // Biblioteca principal do Selenium 
import org.openqa.selenium.chrome.ChromeDriver; // Biblioteca do Chrome Driver


// 2 - classe
public class InternetProjectTest {

// 2.1 - Atributos
private WebDriver driver; // objeto do Selenium

// 2.2 - Funções e Métodos

// Antes do teste 
@BeforeEach
public void iniciar() {
    driver = new ChromeDriver(); // Instanciar o objeto do Selenium como ChromeDriver

}

// Depois do teste 
@AfterEach
public void finalizar() {
    driver.quit(); // destroi o objeto do Selenium 
}

// Teste1
@Test
public void LoginSucesso1() {
    driver.get("https://the-internet.herokuapp.com/login"); // abre o site 
    
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("tomsmith");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
    driver.findElement(By.id("login")).click();

   // driver.findElement(By.id("flash")).("You logged into a secure area!").getText(); // não sei como fazer a mensagem de texto


}
// Teste 2
@Test
public void LoginSemSucesso2() {
driver.get("https://the-internet.herokuapp.com/login"); // abre o site 

driver.findElement(By.id("username")).click();
driver.findElement(By.id("username")).sendKeys("tomsmith");
driver.findElement(By.id("password")).click();
driver.findElement(By.id("password")).sendKeys("SuperSecret");
driver.findElement(By.id("login")).click();
// driver.findElement(By.id("flash")).("Your password is invalid").getText(); // não sei como fazer a mensagem de texto


}

// Teste 3
@Test
public void LoginSemSucesso3() {
driver.get("https://the-internet.herokuapp.com/login"); // abre o site 

driver.findElement(By.id("username")).click();
driver.findElement(By.id("username")).sendKeys("tom");
driver.findElement(By.id("password")).click();
driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
driver.findElement(By.id("login")).click();
// driver.findElement(By.id("flash")).("Your username is invalid").getText(); // não sei como fazer a mensagem de texto

}

// Teste 4
@Test
public void LoginSemSucesso4() {
driver.get("https://the-internet.herokuapp.com/login"); // abre o site 

driver.findElement(By.id("username")).click();
driver.findElement(By.id("username")).sendKeys("tom");
driver.findElement(By.id("password")).click();
driver.findElement(By.id("password")).sendKeys("SuperSecret");
driver.findElement(By.id("login")).click();
// driver.findElement(By.id("flash")).("Your username is invalid").getText(); // não sei como fazer a mensagem de texto

}

// Teste 5
@Test
public void LoginSemSucesso5() {
driver.get("https://the-internet.herokuapp.com/login"); // abre o site 

driver.findElement(By.id("username")).click();
driver.findElement(By.id("username")).sendKeys("Julia");
driver.findElement(By.id("password")).click();
driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
driver.findElement(By.id("login")).click();
// driver.findElement(By.id("flash")).("Your username is invalid").getText(); // não sei como fazer a mensagem de texto


}

// Teste 6
@Test
public void LoginSemSucesso6() {
driver.get("https://the-internet.herokuapp.com/login"); // abre o site 

driver.findElement(By.id("username")).click();
driver.findElement(By.id("username")).sendKeys("Julia");
driver.findElement(By.id("password")).click();
driver.findElement(By.id("password")).sendKeys("Super");
driver.findElement(By.id("login")).click();
// driver.findElement(By.id("flash")).("Your username is invalid").getText(); // não sei como fazer a mensagem de texto
}


// Teste 7
@Test
public void LoginSemSucesso7() {
driver.get("https://the-internet.herokuapp.com/login"); // abre o site 

driver.findElement(By.id("username")).click();
driver.findElement(By.id("username")).sendKeys("Julia");
driver.findElement(By.id("password")).click();
driver.findElement(By.id("password")).sendKeys("JuliaMatos");
driver.findElement(By.id("login")).click();
// driver.findElement(By.id("flash")).("Your username is invalid").getText(); // não sei como fazer a mensagem de texto


}

// Teste 8
@Test
public void LoginSemSucesso8() {
driver.get("https://the-internet.herokuapp.com/login"); // abre o site 

driver.findElement(By.id("username")).click();
driver.findElement(By.id("username")).sendKeys("Jose");
driver.findElement(By.id("password")).click();
driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
driver.findElement(By.id("login")).click();
// driver.findElement(By.id("flash")).("Your username is invalid").getText(); // não sei como fazer a mensagem de texto


}

// Teste 9
@Test
public void LoginEmBranco9() {
driver.get("https://the-internet.herokuapp.com/login"); // abre o site 

driver.findElement(By.id("username")).click();
driver.findElement(By.id("username")).sendKeys("");
driver.findElement(By.id("password")).click();
driver.findElement(By.id("password")).sendKeys("");
driver.findElement(By.id("login")).click();
// driver.findElement(By.id("flash")).("Your username is invalid").getText(); // não sei como fazer a mensagem de texto

}

}