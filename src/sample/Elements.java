package sample;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Elements
{
    protected WebDriver driver;
    public Elements(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    /*public Elements(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, (TimeUnit.SECONDS.toSeconds(10)));
    } */

    @FindBy(how = How.XPATH, using = "//span[text()='Contact us']")
    protected WebElement ContactUsButton;

    /*public void ClickBut(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", ContactUsButton);
        ContactUsButton.click();
    }*/
      /*  [FindsBy(How = How.XPath, Using = "//span[text()='Contact us']")]
    protected readonly IWebElement ContactUsButton;

        [FindsBy(How = How.XPath, Using = "//input[@name='your-name']")]  // //span[contains(@class, 'wpcf7-form-control-wrap your-name')]
    protected readonly IWebElement ContactUsName;

        [FindsBy(How = How.XPath, Using = "//input[@name='your-subject']")]
    protected readonly IWebElement ContactUsSubject;

        [FindsBy(How = How.XPath, Using = "//textarea[@name='your-message']")]
    protected readonly IWebElement ContactUsMessage;

        [FindsBy(How = How.XPath, Using = "//input[@name='your-email']")]
    protected readonly IWebElement ContactUsEmail;

        [FindsBy(How = How.XPath, Using = " //input[@value='Send']")]
    protected readonly IWebElement ContactUsSend;

        [FindsBy(How = How.XPath, Using = "//span[@class='wpcf7-not-valid-tip']")]
    protected readonly IWebElement WrongEmailMessage;

    // [FindsBy(How = How.XPath, Using = "//a[@class='main-link']")]  // //a[contains(text(), 'Company')]
    // protected readonly IWebElement Company;

        [FindsBy(How = How.XPath, Using = "//div[@id='menu']//a[contains(@href, 'https://www.musala.com/company/')]")]
    protected readonly IWebElement Company;

        [FindsBy(How = How.XPath, Using = "//section[@class='company-members']//div[@class='cm-content']//h2")]
    protected readonly IWebElement Leadership;

        [FindsBy(How = How.XPath, Using = "//div[@class='links-buttons']//a[contains(@href, 'https://www.facebook.com/MusalaSoft?fref=ts')]")]
    protected readonly IWebElement FacebookLink;

        [FindsBy(How = How.XPath, Using = "//div[@id='menu']//a[contains(@href, 'https://www.musala.com/careers/')]")]
    protected readonly IWebElement Careers;

        [FindsBy(How = How.XPath, Using = "//section[@class='link_field']/div[@class='link-wrapper']//button[@class='contact-label contact-label-code btn btn-1b']")]
    protected readonly IWebElement OpenPositions;

        [FindsBy(How = How.XPath, Using = "//div[@class='job-filter']//select[@id='get_location']")]
    protected readonly IWebElement LocationFilter;

        [FindsBy(How = How.XPath, Using = "//div[@class='card-container']//h2[text()='Experienced Automation QA Engineer']")]
    protected readonly IWebElement QAEngineer;

        [FindsBy(How = How.XPath, Using = "//input[@class='wpcf7-form-control wpcf7-submit btn-join-us btn-apply']")]
    protected readonly IWebElement Apply;

        [FindsBy(How = How.XPath, Using = "//input[@name='uploadtextfield']")]
    protected readonly IWebElement UploadFile;

        [FindsBy(How = How.XPath, Using = "//div[@class='message-form-content']//div[@class='wpcf7-response-output']")]
    protected readonly IWebElement ErrorMessage;

        [FindsBy(How = How.XPath, Using = "//input[@class='wpcf7-form-control wpcf7-submit btn-cf-submit']")]
    protected readonly IWebElement Send;

        [FindsBy(How = How.XPath, Using = "//div[@class='card-container']//a[@href]")]
    protected readonly IWebElement JobLinks; */
}
