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
    protected WebDriverWait wait;

    public Elements(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, (TimeUnit.SECONDS.toSeconds(10)));
    }
    /*public Elements(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, (TimeUnit.SECONDS.toSeconds(10)));
    } */

    @FindBy(how = How.XPATH, using = "//span[text()='Contact us']")
    protected WebElement ContactUsButton;


    @FindBy(how = How.XPATH, using = "//input[@name='your-name']") // //span[contains(@class, 'wpcf7-form-control-wrap your-name')]
    protected WebElement ContactUsName;

    @FindBy(how = How.XPATH, using = "//input[@name='your-subject']")
    protected WebElement ContactUsSubject;

    @FindBy(how = How.XPATH, using = "//textarea[@name='your-message']")
    protected WebElement ContactUsMessage;

    @FindBy(how = How.XPATH, using = "//input[@name='your-email']")
    protected WebElement ContactUsEmail;

    @FindBy(how = How.XPATH, using = " //input[@value='Send']")
    protected WebElement ContactUsSend;

    @FindBy(how = How.XPATH, using = "//span[@class='wpcf7-not-valid-tip']")
    protected WebElement WrongEmailMessage;

    // @FindBy(how = How.XPATH, using = "//a[@class='main-link']") // //a[contains(text(), 'Company')]
    // protected WebElement Company;

    @FindBy(how = How.XPATH, using = "//div[@id='menu']//a[contains(@href, 'https://www.musala.com/company/')]")
    protected WebElement Company;

    @FindBy(how = How.XPATH, using = "//section[@class='company-members']//div[@class='cm-content']//h2")
    protected WebElement Leadership;

    @FindBy(how = How.XPATH, using = "//div[@class='links-buttons']//a[contains(@href, 'https://www.facebook.com/MusalaSoft?fref=ts')]")
    protected WebElement FacebookLink;

    @FindBy(how = How.XPATH, using = "//div[@id='menu']//a[contains(@href, 'https://www.musala.com/careers/')]")
    protected WebElement Careers;

    @FindBy(how = How.XPATH, using = "//section[@class='link_field']/div[@class='link-wrapper']//button[@class='contact-label contact-label-code btn btn-1b']")
    protected WebElement OpenPositions;

    @FindBy(how = How.XPATH, using = "//div[@class='job-filter']//select[@id='get_location']")
    protected WebElement LocationFilter;

    @FindBy(how = How.XPATH, using = "//div[@class='card-container']//h2[text()='Experienced Automation QA Engineer']")
    protected WebElement QAEngineer;

    @FindBy(how = How.XPATH, using = "//input[@class='wpcf7-form-control wpcf7-submit btn-join-us btn-apply']")
    protected WebElement Apply;

    @FindBy(how = How.XPATH, using = "//input[@name='uploadtextfield']")
    protected WebElement UploadFile;

    @FindBy(how = How.XPATH, using = "//div[@class='message-form-content']//div[@class='wpcf7-response-output']")
    protected WebElement ErrorMessage;

    @FindBy(how = How.XPATH, using = "//input[@class='wpcf7-form-control wpcf7-submit btn-cf-submit']")
    protected WebElement Send;

    @FindBy(how = How.XPATH, using = "//div[@class='card-container']//a[@href]")
    protected WebElement JobLinks;
}
