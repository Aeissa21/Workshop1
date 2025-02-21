package paCkage1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workshop1 {
    @Test
    public  void test1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");
        assert driver.getTitle().equals("Google");
        driver.quit();


    }
}
