package ohtu;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Tester {

    public static void main(String[] args) {

        WebDriver driver = new HtmlUnitDriver();
        driver.get("http://localhost:4567");

        System.out.println(driver.getPageSource());

//        oikeaTunnusVaaraSalasana(driver);
        uudenTunnuksenLuominen(driver);
        uloskirjaus(driver);

        driver.quit();
    }

    private static void sleep(int n) {
        try {
            Thread.sleep(n * 1000);
        } catch (Exception e) {
        }
    }

    private static void oikeaTunnusVaaraSalasana(WebDriver driver) {
        WebElement element = driver.findElement(By.linkText("login"));
        element.click();

        System.out.println(driver.getPageSource());

        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("login"));

        sleep(2);
        element.submit();
        sleep(2);

        System.out.println(driver.getPageSource());
    }

    private static void uudenTunnuksenLuominen(WebDriver driver) {
        WebElement element = driver.findElement(By.linkText("register new user"));
        element.click();

        System.out.println(driver.getPageSource());

        Random r = new Random();
        
        element = driver.findElement(By.name("username"));
        element.sendKeys("attaboy" + r.nextInt(10000));
        element = driver.findElement(By.name("password"));
        element.sendKeys("kahdeksan");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("kahdeksan");

        sleep(2);
        element.submit();
        sleep(2);

        System.out.println(driver.getPageSource());
    }
    
    private static void uloskirjaus(WebDriver driver) {     
        WebElement element = driver.findElement(By.linkText("continue to application mainpage"));
        element.click();
        
        System.out.println(driver.getPageSource());
        
        element = driver.findElement(By.linkText("logout"));
        element.click();
        
        System.out.println(driver.getPageSource());
    }
}
