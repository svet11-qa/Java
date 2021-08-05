package sample;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Tests{

WebDriver driver;

    @Before
    public void Setup(){
        Browser browser = new Browser();
        driver = browser.GetDriver();
    }

    @Test
    public void Test(){
       driver.get("https://www.musala.com/");
       //ContactUsButton.click();
       new Methods(driver).ContactUs();
       //new Elements(driver).ClickBut();
    }
}
