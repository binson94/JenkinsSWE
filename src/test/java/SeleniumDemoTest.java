// Generated by Selenium IDE
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import java.util.*;

public class SeleniumDemoTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        if(driver != null)
            driver.quit();
    }
    public String waitForWindow(int timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Set<String> whNow = driver.getWindowHandles();
        Set<String> whThen = (Set<String>) vars.get("window_handles");
        if (whNow.size() > whThen.size()) {
            whNow.removeAll(whThen);
        }
        return whNow.iterator().next();
    }
    @Test
    public void p1() throws InterruptedException {
        driver.get("https://www.google.co.kr/");
        driver.manage().window().setSize(new Dimension(974, 1032));
        driver.findElement(By.id("APjFqb")).click();
        driver.findElement(By.id("APjFqb")).sendKeys("google translate");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#jZ2SBf > .wM6W7d > span")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("tw-source-text-ta")).click();
        driver.findElement(By.id("tw-source-text-ta")).sendKeys("hello, world!");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".lA8Tgb > svg")).click();
        Thread.sleep(1000);
        driver.close();

        //driver.get("https://www.naver.com/");
        //driver.manage().window().setSize(new Dimension(974, 1032));
        //js.executeScript("window.scrollTo(0,147)");
        //vars.put("window_handles", driver.getWindowHandles());
        //driver.findElement(By.cssSelector(".RightSecond-module__papago_text___VLGlw")).click();
        //vars.put("win2828", waitForWindow(2000));
        //vars.put("root", driver.getWindowHandle());
        //driver.switchTo().window(vars.get("win2828").toString());
        //driver.findElement(By.cssSelector(".btn_switch___x4Tcl")).click();
        //driver.findElement(By.id("txtSource")).click();
        //driver.findElement(By.id("txtSource")).sendKeys("hello, world!");
        //driver.findElement(By.id("btnTranslate")).click();

        //Thread.sleep(1000);
        //driver.close();
        //driver.switchTo().window(vars.get("root").toString());
        //driver.close();
    }
}
