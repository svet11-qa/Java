package sample;

import org.junit.After;
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
    public void TestCaseOne(){
       driver.get("https://www.musala.com/");
       new Methods(driver).ContactUs();
    }

    @Test
    public void TestCaseTwo() throws Exception {
        driver.get("https://www.musala.com/");
        new Methods(driver).CompanyTest();
    }

    @Test
    public void TestCaseThree() throws  Exception{
        driver.get("https://www.musala.com/");
        new Methods(driver).JoinUs();
    }

    @Test
    public void TestCaseFour(){
        driver.get("https://www.musala.com/");
        new Methods(driver).GetPositions();
    }

    @After
    public void TearDown(){
        driver.quit();
    }
}
