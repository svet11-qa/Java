package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {

    private WebDriver driver;
    public Browser()
    {
        driver = SetupBrowser();
    }

    protected WebDriver SetupBrowser()
    {
        var chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);
        //driver.get("https://www.musala.com/");
        return driver;
    }

    public WebDriver GetDriver()
    {
      return driver;
    }

    public void GoToURL(){
        driver.get("https://www.musala.com/");
    }

    /*  public static void main(String[] args)
    {
        System.setProperty("webdriver.driver.chrome","C:\\Users\\Jiker\\IdeaProjects\\untitled\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.get("https://www.google.com/");
    } */
}
